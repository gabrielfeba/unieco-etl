package com.unieco.etl.repository;

import com.unieco.etl.entity.PersonEntity;
import com.unieco.etl.entity.WorkerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<PersonEntity, String> {

}
