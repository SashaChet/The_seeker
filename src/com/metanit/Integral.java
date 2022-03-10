package com.metanit;
import java.util.Scanner;

public class Integral {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b;
        System.out.println("The function is 'x^4 + x^2 + x - 7'");
        System.out.println("Enter function boundaries(from a to b)");
        System.out.println("Enter a");
        a = in.nextInt();
        System.out.println("Enter b");
        b = in.nextInt();
        a = (a*a*a*a*a) / 5 + (a*a*a) / 3 + (a*a) / 2 - 7 * a;
        b = (b*b*b*b*b) / 5 + (b*b*b) / 3 + (b*b) / 2 - 7 * b;
        System.out.println("Area under the graph = " + (b - a));
    }
}
