package com.sda.demo.zadanie7;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class PairsController {
    @GetMapping("/api/pairs/{name}")
    public NamedPairs getPair(@PathVariable String name) {
        return NamedPairs
                .builder()
                .name(name)
                .pairs(Map.of())
                .build();
    }

}
