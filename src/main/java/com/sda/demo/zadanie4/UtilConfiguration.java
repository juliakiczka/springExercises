package com.sda.demo.zadanie4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UtilConfiguration {
    @Bean
    public DummyLogger4 dummyLogger4() {
        return new DummyLogger4();
    }

    @Bean
    public ListUtil listUtility() {
        return new ListUtil();
    }

    @Bean(name = "stringUtility")
    public StringUtil stringUtil() {
        return new StringUtil();
    }
}
