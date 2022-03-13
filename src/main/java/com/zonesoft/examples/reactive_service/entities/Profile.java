package com.zonesoft.examples.reactive_service.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Profile {

    @Id
    private String id;
    private String email;

	public Profile(String id, String email) {
		this.id = id;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public String getId() {
		return id;
	}
}
