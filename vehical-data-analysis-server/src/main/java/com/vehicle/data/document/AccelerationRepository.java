package com.vehicle.data.document;

import org.springframework.data.mongodb.repository.MongoRepository;

import javax.transaction.Transactional;

@Transactional
public interface AccelerationRepository extends MongoRepository<Acceleration, Long> {
}
