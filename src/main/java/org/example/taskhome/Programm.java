package org.example.taskhome;

import java.util.ArrayList;
import java.util.Arrays;

public class Programm {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(new ArrayList<>(Arrays.asList(1,2,3))));
        Calculator calculator2 = new Calculator();
        System.out.println(calculator2.multi(new ArrayList<>(Arrays.asList(2,2,2))));
        Calculator calculator3 = new Calculator();
        System.out.println(calculator3.division(new ArrayList<>(Arrays.asList(2,2.2)),100));
        Calculator calculator4 = new Calculator();
        System.out.println(calculator4.binary(new ArrayList<>(Arrays.asList(36.5))));
    }
}
