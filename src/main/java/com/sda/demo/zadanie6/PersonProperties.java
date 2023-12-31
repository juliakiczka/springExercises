package com.sda.demo.zadanie6;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Map;

//@ConfigurationProperties oznacza, że właściwości konfiguracyjne dla tej klasy będą miały prefiks "pl.sdacademy.zad6".
//Oznacza to, że właściwości będą szukane w pliku application.properties pod nazwami takimi jak pl.sdacademy.zad6.email,
@ConfigurationProperties(prefix = "pl.sdacademy.zad6")
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
//@Validated - adnotacja, która włącza proces walidacji właściwości klasy przy użyciu Hibernate Validator.
@Validated
public class PersonProperties {

    @NotNull(message = "email cannot be null")
    @Email(message = "incorrect email format")
    private String email;

    private String firstName;

    @NotNull(message = "age is mandatory")
    @Min(value = 18)
    private Integer age;

    @NotNull(message = "last name has to be provided")
    @Length(min = 3, max = 20)
    private String lastName;

    private String address;

    @NotEmpty(message = "values cannot be empty")
    private List<String> values;

    @NotEmpty(message = "custom attributes cannot be empty")
    private Map<String, String> customAttributes;

    @AssertTrue(message = "address is invalid")
    public boolean isAddressValid() {
        return address != null && address.split(" ").length == 2;
    }
}