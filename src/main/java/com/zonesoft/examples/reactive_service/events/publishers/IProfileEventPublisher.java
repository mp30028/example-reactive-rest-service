package com.zonesoft.examples.reactive_service.events.publishers;

import java.util.function.Consumer;

import org.springframework.context.ApplicationListener;

import com.zonesoft.examples.reactive_service.events.ProfileDeletedEvent;

import reactor.core.publisher.FluxSink;

public interface IProfileEventPublisher extends ApplicationListener<ProfileDeletedEvent>,Consumer<FluxSink<ProfileDeletedEvent>>{};