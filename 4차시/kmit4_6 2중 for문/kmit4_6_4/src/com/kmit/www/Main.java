package com.kmit.www;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력 : ");
        int n = scanner.nextInt();
        System.out.println();

        for(int i=1; i<=n; i++){
            System.out.println();
            for(int j=1; j<=(n+i); j++)
                if (j<=(n-i+1)) {
                    System.out.print(" ");
                } else System.out.print("*");

        }

    }
}
