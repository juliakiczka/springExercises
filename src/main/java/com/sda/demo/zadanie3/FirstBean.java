package com.sda.demo.zadanie3;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FirstBean  implements CommandLineRunner {
    private final DummyLoggerI dummyLoggerI;
    @Override
    public void run(String... args) throws Exception {
        dummyLoggerI.sayHello();
    }
}
