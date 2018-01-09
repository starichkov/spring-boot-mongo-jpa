package org.starichkov.java.spring.mongo.jpa;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Vadim Starichkov
 * @since 09.01.2018 11:55
 */
public interface SampleRepository extends MongoRepository<Sample, Long> {
    Sample findById(Long id);
}
