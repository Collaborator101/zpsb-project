package org.example.lab02;

import org.example.lab02.base.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        var customer1 = new Customer();
        customer1.firstName = "Jan";
        customer1.lastName = "Kowalski";
        customer1.birthYear = 1990;
        var address1 = new Address();
        address1.street = "Kochanowskiego";
        address1.number = "17/15";
        address1.city = "Szczecin";
        address1.code = "70-004";
        customer1.address = address1;

        var customer2 = new Customer();
        customer2.firstName = "Piotr";
        customer2.lastName = "Nowak";
        customer2.birthYear = 1995;
        var address2 = new Address();
        address2.street = "Jana Pawła II";
        address2.number = "17/15";
        address2.city = "Koszalin";
        address2.code = "71-004";
        customer2.address = address2;

        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {
            lista.add(i * i);
        }

        int x = Integer.parseInt("13");
        System.out.println(x);


        for (int v : lista) {
            System.out.println(v);
        }

/*
        System.out.println("Podaj parametr: ");
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        scanner.close();

        System.out.println(new Factorial(p));
*/

    }
}
