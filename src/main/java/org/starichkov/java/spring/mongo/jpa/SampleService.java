package org.starichkov.java.spring.mongo.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Vadim Starichkov
 * @since 09.01.2018 11:45
 */
@Service
public class SampleService {
    private SampleRepository sampleRepository;

    @Autowired
    public void setSampleRepository(SampleRepository sampleRepository) {
        this.sampleRepository = sampleRepository;
    }

    public void save(Sample sample) {
        sampleRepository.save(sample);
    }

    public Sample get(Long id) {
        return sampleRepository.findById(id);
    }
}
