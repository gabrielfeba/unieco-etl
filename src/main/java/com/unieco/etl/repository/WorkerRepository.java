package com.unieco.etl.repository;

import com.unieco.etl.entity.WorkerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WorkerRepository extends MongoRepository<WorkerEntity, String> {

    Optional<WorkerEntity> findByIdUser(String idUser);

}
