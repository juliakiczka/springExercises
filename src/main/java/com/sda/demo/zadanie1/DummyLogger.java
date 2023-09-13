package com.sda.demo.zadanie1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DummyLogger implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        log.info("Hello from zadanie1.");
    }

    public void sayHello() {
        log.info("hello from DummyLogger");
    }
}
