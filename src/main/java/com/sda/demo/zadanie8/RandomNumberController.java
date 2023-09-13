package com.sda.demo.zadanie8;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RandomNumberController {
    private final RandomBooleanProvider RandomBooleanProvider;

    @RequestMapping("/api/random-boolean")
    public Boolean showFirstNumber() {
        return RandomBooleanProvider.getValue();
    }
}
