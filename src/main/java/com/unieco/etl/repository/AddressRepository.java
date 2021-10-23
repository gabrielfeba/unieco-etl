package com.unieco.etl.repository;

import com.unieco.etl.entity.AddressEntity;
import com.unieco.etl.entity.PersonEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddressRepository extends MongoRepository<AddressEntity, String> {

}
