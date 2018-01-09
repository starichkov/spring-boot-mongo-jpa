package org.starichkov.java.spring.mongo.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMongoJpaApplication implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootMongoJpaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMongoJpaApplication.class, args);
    }

    private SampleService sampleService;

    @Autowired
    public void setSampleService(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @Override
    public void run(String... strings) throws Exception {
        Sample sample = new Sample(1L, "Sample #1");
        sampleService.save(sample);

        LOGGER.info(sample.toString());

        Sample sample1 = sampleService.get(1L);
        LOGGER.info(sample1.toString());
    }
}
