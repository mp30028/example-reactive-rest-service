package com.zonesoft.examples.reactive_service.events;

import org.springframework.context.ApplicationEvent;

import com.zonesoft.examples.reactive_service.entities.Profile;

public class ProfileDeletedEvent extends ApplicationEvent {
	private static final long serialVersionUID = -5553044228124038070L;

	public ProfileDeletedEvent(Profile source) {
        super(source);
    }
}
