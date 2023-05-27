package com.kmit.www;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        for(int i=1; i<10; i++){
            System.out.print(i+"단\t");
            for(int j=1; j<10; j++){
                System.out.print(i + "*" + j + "=" + i*j );
                System.out.print("\t");


            }
            System.out.println();
        }

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("\n"+n+"단\n");
        for(int Q=1; Q<10; Q++){
            System.out.print(n + "+" + Q + "=" + n*Q);
            System.out.println();
        }
    }
}
