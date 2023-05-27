package com.kmit.www;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("input : ");
        int n = scanner.nextInt();
        char a = 'A';

        for(int i=0; i<n; i++) {
            System.out.println();
            for(int j=0; j<n; j++){
                System.out.print(a);
                a = (char) (a+1);
                if(a >= 'Z'){
                    a='A';
                }

            }
        }

    }

}
