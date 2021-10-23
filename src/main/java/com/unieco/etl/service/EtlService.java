package com.unieco.etl.service;


import com.unieco.etl.entity.WorkerEntity;
import com.unieco.etl.repository.AddressRepository;
import com.unieco.etl.repository.PersonRepository;
import com.unieco.etl.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EtlService {

    @Autowired
    private WorkerRepository workerRepository;

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private AddressRepository addressRepository;
    
}
