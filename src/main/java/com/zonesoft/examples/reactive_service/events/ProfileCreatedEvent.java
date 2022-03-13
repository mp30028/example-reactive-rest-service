package com.zonesoft.examples.reactive_service.events;

import org.springframework.context.ApplicationEvent;

import com.zonesoft.examples.reactive_service.entities.Profile;

public class ProfileCreatedEvent extends ApplicationEvent {

	private static final long serialVersionUID = 7121033441429890681L;

	public ProfileCreatedEvent(Profile source) {
        super(source);
    }
}
