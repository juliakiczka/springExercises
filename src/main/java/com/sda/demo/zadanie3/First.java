package com.sda.demo.zadanie3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary// jest to główny bean
@Component// komponent (bean)
@Slf4j
public class First implements DummyLoggerI {
    @Override
    public void sayHello() {
        log.info("hello from first");
    }
}
