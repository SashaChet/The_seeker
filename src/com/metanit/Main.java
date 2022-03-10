package com.metanit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int nachalo = 0;
        int konets = 2_147_483_647;
        int otvet = 0;

        System.out.println("Choose a non-negative number");
        while (otvet == 0) {
            System.out.println("""
                    Are you choose?
                    0 - no
                    1 - yes""");
            otvet = in.nextInt();
        }

        for (int i = 0; i < 31; i++){
            System.out.println("Is your number " + (nachalo + (konets - nachalo) / 2) + " ?");
            System.out.println("""
                    0 - no
                    1 - yes""");
            otvet = in.nextInt();
            if (otvet == 0) {
                if (i == 30){
                    System.out.println("You are win. I didn't guess right :(");
                    break;
                }
                System.out.println("""
                        Is your number more or less?
                        0 - less
                        1 - more""");
                otvet = in.nextInt();
                if (otvet == 0){
                    konets = konets - (konets - nachalo) / 2;
                } else {
                    nachalo = nachalo + (konets - nachalo) / 2;
                }
            } else {
                System.out.println("You are lose. I guessed right :)");
                break;
            }
        }

    }
}
