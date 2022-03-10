package com.metanit;
//import java.util.Scanner;

public class Function_call {

    public static double someFunction(double x){
        return Math.pow(x, 3.0) - Math.pow(x, 2.5) + x - 1.0;
    }

    public static void main(String[] args){
        double answer = someFunction(0.5);
        answer = Math.round(answer * 0.001);
        System.out.println(answer);
        /*double first = 0.0, second = 0.0;
        if (answer >= 0.0){
            second = second + 1;
            while (answer > second){
                first = first + 1;
                second = second + 1;
            }
            while ((second - first) != 0.001) {
                if (answer < second) {
                    second = second - (second - first) / 2;
                } else {
                    first = first + (second - first) / 2;
                }
            }
            System.out.println(second);
        } else {
            first = first - 1;
            while (answer < first) {
                first = first - 1;
                second = second - 1;
            }
            while ((second - first) != 0.001) {
                if (answer < second) {
                    second = second - (second - first) / 2;
                } else {
                    first = first + (second - first) / 2;
                }
            }
            System.out.println(first);
        }*/

    }
}
