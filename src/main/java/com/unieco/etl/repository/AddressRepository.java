package com.unieco.etl.repository;

import com.unieco.etl.entity.AddressEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends MongoRepository<AddressEntity, String> {

}
