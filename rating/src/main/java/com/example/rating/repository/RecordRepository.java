package com.example.rating.repository;

import com.example.rating.model.SDRecord;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecordRepository extends MongoRepository<SDRecord, String> {

}
