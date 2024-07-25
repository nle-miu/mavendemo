package edu.miu.cs.cs425;

import edu.miu.cs.cs425.model.Customer;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Customer cust1 = new Customer(1, "Thinh Le", LocalDate.of(1999, 01, 01));
        System.out.println(cust1.toString());
    }
}