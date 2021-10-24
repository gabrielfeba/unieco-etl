package com.unieco.etl.repository;

import com.unieco.etl.entity.AddressEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AddressRepository extends MongoRepository<AddressEntity, String> {

    Optional<AddressEntity> findByIdWorker(String idWorker);
}
