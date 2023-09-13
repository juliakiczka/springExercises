package com.sda.demo.zadanie2;

import com.sda.demo.zadanie1.DummyLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerWithSetterInjection implements CommandLineRunner {

    private DummyLogger dummyLogger;

    @Override
    public void run(final String... args) throws Exception {
        dummyLogger.sayHello();
    }

    @Autowired
    public void setDummyLogger(final DummyLogger dummyLogger) {
        this.dummyLogger = dummyLogger;
    }
}