package com.sda.demo.zadanie3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FirstAndSecondBean implements CommandLineRunner {
    private final List<DummyLoggerI> loggers;

    public FirstAndSecondBean(final List<DummyLoggerI> loggers) {
        this.loggers = loggers;
    }

    @Override
    public void run(String... args) throws Exception {
        loggers.forEach(DummyLoggerI::sayHello);
    }
}
