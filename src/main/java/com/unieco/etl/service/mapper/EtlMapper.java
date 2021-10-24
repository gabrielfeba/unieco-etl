package com.unieco.etl.service.mapper;

import com.unieco.etl.client.model.AddressInput;
import com.unieco.etl.client.model.EnterpriseInput;
import com.unieco.etl.client.model.UserInput;
import com.unieco.etl.entity.AddressEntity;
import com.unieco.etl.entity.PersonEntity;
import com.unieco.etl.entity.WorkerEntity;
import org.springframework.stereotype.Component;

@Component
public class EtlMapper {

    public AddressInput entityToModel(AddressEntity addressEntity) {
        AddressInput addressInput = new AddressInput();
        addressInput.setActiveFlag(addressEntity.getActive().equals("true") ? "1" : "0");
        addressInput.setCity(addressEntity.getCity());
        addressInput.setComplement(addressEntity.getComplement());
        addressInput.setNumber(addressEntity.getNumber());
        addressInput.setPostalCode(addressEntity.getCep());
        addressInput.setState(addressEntity.getState());
        addressInput.setStreet(addressEntity.getStreet());
        return addressInput;

    }

    public UserInput entityToModel(PersonEntity personEntity) {
        UserInput user = new UserInput();
        user.setBirthDate(personEntity.getBirthDate());
        user.setEmail(personEntity.getEmail());
        user.setName(personEntity.getName());
        user.setPassword(personEntity.getPassword());
        user.setPhoneDescription(personEntity.getCellNumber());
        user.setUserName(personEntity.getUsername());
        user.setUserType(personEntity.getTypeUser());
        return user;
    }

    public EnterpriseInput entityToModel(WorkerEntity workerEntity) {
        EnterpriseInput enterpriseInput = new EnterpriseInput();
        enterpriseInput.setActive(workerEntity.getActive().equals("true") ? "1" : "0");
        enterpriseInput.setDocument(workerEntity.getCpfCnpj());
        enterpriseInput.setDocument(workerEntity.getSocialReason());
        enterpriseInput.setDocumentTypeCode(workerEntity.getCpfCnpj());
        enterpriseInput.setEmail(workerEntity.getEmailCorp());
        enterpriseInput.setFacebookUrl(workerEntity.getFacebook());
        enterpriseInput.setImageUrl(workerEntity.getImage());
        enterpriseInput.setInstagram(workerEntity.getInstagram());
        enterpriseInput.setOffice(workerEntity.getOffice());
        enterpriseInput.setSiteUrl(workerEntity.getSite());
        enterpriseInput.setSummary(workerEntity.getDescription());
        enterpriseInput.setWhatsapp(workerEntity.getWhatsappNumber());
        return enterpriseInput;

    }
}
