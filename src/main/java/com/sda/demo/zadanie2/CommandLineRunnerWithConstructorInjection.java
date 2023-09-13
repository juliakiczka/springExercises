package com.sda.demo.zadanie2;

import com.sda.demo.zadanie1.DummyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor//generuje konstruktor dla klasy, który wstrzykuje zależności na podstawie pól oznaczonych jako final
public class CommandLineRunnerWithConstructorInjection implements CommandLineRunner {

    private final DummyLogger dummyLogger;


    @Override
    public void run(final String... args) throws Exception {
        dummyLogger.sayHello();
    }
}