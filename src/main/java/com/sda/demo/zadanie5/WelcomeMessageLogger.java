package com.sda.demo.zadanie5;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import static java.lang.Boolean.TRUE;

@Component
@Slf4j
public class WelcomeMessageLogger implements CommandLineRunner {

    private final String text;
    private final Boolean shouldLog;
//@Value wstrzykuje wartości dla pól text i shouldLog.
// W przypadku text, pobierana jest wartość z konfiguracji aplikacji o kluczu pl.sdacademy.welcome.text.value i jeśli nie ma takiego klucza, używana jest wartość domyślna "none".
// Natomiast shouldLog pobiera wartość z konfiguracji aplikacji o kluczu pl.sdacademy.welcome.text.enabled.

    public WelcomeMessageLogger(@Value("${pl.sdacademy.welcome.text.value:none}") final String text,
                                @Value("${pl.sdacademy.welcome.text.enabled}") final Boolean shouldLog) {
        this.text = text;
        this.shouldLog = shouldLog;
    }

    @Override
    public void run(final String... args) throws Exception {
        if (TRUE.equals(shouldLog)) {
            log.info(text);
        }
    }
}