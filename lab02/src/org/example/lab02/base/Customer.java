package org.example.lab02.base;

public class Customer extends Person {
    public Address address;

    @Override
    public String toString() {
        return super.toString() + " " + "Customer{" +
                "address=" + address +
                '}';
    }
}
