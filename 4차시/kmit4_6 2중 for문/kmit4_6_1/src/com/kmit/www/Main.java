package com.kmit.www;

public class Main {
    public static void main(String[] args){
        for(int i=0; i<5; i++){
            System.out.println();
            for(int j=4; j>=i;j--){
                System.out.print("*");
            }
        }

    }
}