package com.unieco.etl.service;


import com.unieco.etl.client.UniEcoServiceApi;
import com.unieco.etl.client.model.*;
import com.unieco.etl.entity.AddressEntity;
import com.unieco.etl.entity.PersonEntity;
import com.unieco.etl.entity.WorkerEntity;
import com.unieco.etl.repository.AddressRepository;
import com.unieco.etl.repository.PersonRepository;
import com.unieco.etl.repository.WorkerRepository;
import com.unieco.etl.service.mapper.EtlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EtlService {

    @Autowired
    private WorkerRepository workerRepository;

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private UniEcoServiceApi uniEcoServiceApi;

    @Autowired
    private EtlMapper etlMapper;

    public void execute() {
        List<PersonEntity> all = personRepository.findAll();
        all.forEach(this::extractByUser);
    }

    private void extractByUser(PersonEntity personEntity) {
        Optional<WorkerEntity> workerOp = workerRepository.findByIdUser(personEntity.getId());
        UserInput userInput = etlMapper.entityToModel(personEntity);
        User user = uniEcoServiceApi.putUser(userInput);
        workerOp.ifPresent(workerEntity -> extractByWorker(workerEntity, user.getId()));
    }

    private void extractByWorker(WorkerEntity workerEntity, Long userApiId) {
        Optional<AddressEntity> addressEntity = addressRepository.findByIdWorker(workerEntity.getId());
        EnterpriseInput enterpriseInput = etlMapper.entityToModel(workerEntity);
        enterpriseInput.setUserId(userApiId);
        Enterprise enterprise = uniEcoServiceApi.putEnterprise(enterpriseInput);
        if(addressEntity.isPresent()) {
            AddressInput addressInput = etlMapper.entityToModel(addressEntity.get());
            addressInput.setEnterpriseId(enterprise.getId());
            uniEcoServiceApi.putAddress(addressInput);
        }

    }
}
