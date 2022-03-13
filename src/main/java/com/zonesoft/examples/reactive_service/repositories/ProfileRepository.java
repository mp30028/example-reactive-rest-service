package com.zonesoft.examples.reactive_service.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.zonesoft.examples.reactive_service.entities.Profile;

public interface ProfileRepository extends ReactiveMongoRepository<Profile, String> {
}
