package com.sda.demo.zadanie3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Second implements DummyLoggerI {
    @Override
    public void sayHello() {
        log.info("hello from second");
    }

}
