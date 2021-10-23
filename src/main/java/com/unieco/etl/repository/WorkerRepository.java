package com.unieco.etl.repository;

import com.unieco.etl.entity.WorkerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WorkerRepository extends MongoRepository<WorkerEntity, String> {

}
