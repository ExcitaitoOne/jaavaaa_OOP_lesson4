package org.example.taskhome;

import java.util.ArrayList;


public class Calculator {
    public Double sum (ArrayList<? extends Number> item){
        double sum = 0;
        for (Number i:item) {
            sum += i.doubleValue();
        }
        return sum;
    }
    public Double multi(ArrayList<? extends Number> item){
        double sum = 1;
        for (Number i:item) {
            sum = sum * i.doubleValue();
        }
        return sum;
    }
    public Double division(ArrayList<? extends Number> item, double sum){
        for (Number i:item) {
            sum = sum / i.doubleValue();
        }
        return sum;
    }
    public Integer binary(ArrayList<? extends Number> item){
        Integer sum = 0;
        for (Number i:item) {
            if(i instanceof Integer) {
                sum = Integer.valueOf(Integer.toBinaryString((Integer) i));
            }else
            if(i instanceof Double){
               sum = Integer.valueOf(Integer.toBinaryString(i.intValue()));
            }
        }
        return sum;
    }
}
