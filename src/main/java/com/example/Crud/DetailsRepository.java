package com.example.Crud;

import org.apache.logging.log4j.util.Strings;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailsRepository extends MongoRepository<Details, Strings> {
}
