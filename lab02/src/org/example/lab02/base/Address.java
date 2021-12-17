package org.example.lab02.base;

public class Address {
    public String street;
    public String number;
    public String city;
    public String code;

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", city='" + city + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
