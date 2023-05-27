package com.kmit.www;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 다섯개 입력하시오.");
        int sum=0;

        for(int i=0; i<5; i++){
            int n= scanner.nextInt();

            if(n<=0)
                continue;
            else
                sum += n;

        }
        System.out.println("양수의 합은"+sum);

        //1~n까지 짝수 출력
        System.out.println("\n\n정수를 입력하시오");
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("입력 : ");
        int n =scanner.nextInt();
        for(int Q=1; Q<(n+1); Q++){
            if((Q%2)==1)
                continue;
            else
                System.out.println(Q);

        }



        scanner.close();

    }

}
