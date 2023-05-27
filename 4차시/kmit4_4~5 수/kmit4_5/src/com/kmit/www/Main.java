package com.kmit.www;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("두 자연수를 입력하시오: \t");
        int sum = 0;
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a <= b) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        } else {
            for (int i = b; i <= a; i++) {
                sum += i;
            }
        }

        System.out.print("합계: " + sum);
    }
}

