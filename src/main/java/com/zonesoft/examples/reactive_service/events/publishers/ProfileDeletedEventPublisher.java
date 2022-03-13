package com.zonesoft.examples.reactive_service.events.publishers;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

import com.zonesoft.examples.reactive_service.events.ProfileDeletedEvent;

import reactor.core.publisher.FluxSink;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Consumer;

@Component
public class ProfileDeletedEventPublisher implements
    ApplicationListener<ProfileDeletedEvent>,
    Consumer<FluxSink<ProfileDeletedEvent>> {

    private final Executor executor;
    private final BlockingQueue<ProfileDeletedEvent> queue =
        new LinkedBlockingQueue<>();

    ProfileDeletedEventPublisher(Executor executor) {
        this.executor = executor;
    }


    @Override
    public void onApplicationEvent(ProfileDeletedEvent event) {
        this.queue.offer(event);
    }

     @Override
    public void accept(FluxSink<ProfileDeletedEvent> sink) {
        this.executor.execute(() -> {
            while (true)
                try {
                	ProfileDeletedEvent event = queue.take();
                    sink.next(event);
                }
                catch (InterruptedException e) {
                    ReflectionUtils.rethrowRuntimeException(e);
                }
        });
    }
}
