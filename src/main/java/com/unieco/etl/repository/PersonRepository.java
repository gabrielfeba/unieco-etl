package com.unieco.etl.repository;

import com.unieco.etl.entity.PersonEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends MongoRepository<PersonEntity, String> {

}
