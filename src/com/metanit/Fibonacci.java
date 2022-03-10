package com.metanit;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int first = 1, second = 1;
        int promezhutok, vvod;
        System.out.println("Impute number");
        vvod = in.nextInt();
        while (vvod >= second) {
            if (vvod != second) {
                promezhutok = first + second;
                first = second;
                second = promezhutok;
            } else {
                System.out.println("This is Fibonacci's number");
                break;
            }
        }
        if (vvod < second){
            System.out.println("This isn't Fibonacci's number");
        }
    }
}
