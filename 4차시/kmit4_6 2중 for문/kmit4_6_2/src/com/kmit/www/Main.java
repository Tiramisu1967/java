package com.kmit.www;

public class Main {
    public static void main(String[] args){
        for(int i=0; i<5; i++){
            System.out.println();
            for(int j=0; j<5;j++) {
                if (i == 0 || i == 2 || i == 4) {
                    if (j == 0) {
                        System.out.print("");
                    } else System.out.print("*");

                }
            }System.out.print("*");
        }


    }
}