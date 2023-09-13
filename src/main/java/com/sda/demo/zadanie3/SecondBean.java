package com.sda.demo.zadanie3;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SecondBean implements CommandLineRunner {
    private final DummyLoggerI dummyLoggerI;
//Adnotacja @Qualifier jest używana w Springu, gdy istnieje więcej niż jedna implementacja danego typu komponentu
    public SecondBean(@Qualifier("second") DummyLoggerI dummyLoggerI) {
        this.dummyLoggerI = dummyLoggerI;
    }

    @Override
    public void run(String... args) throws Exception {
        dummyLoggerI.sayHello();
    }
}
