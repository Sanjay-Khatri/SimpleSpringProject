package com.simple.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private int id;
    private String name;
    private Address address;

    private class Address {

        private int houseNo;
        private String Address;
    }
}
