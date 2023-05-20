package com.kmit.www;

import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        System.out.print("점수를 입력하시오(0~100): ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a >= 0 && a <= 100) {
            if (a > 90) {
                System.out.println("시험 점수는 " + a + "이고, 등급은 A입니다.");
            } else if (a >= 80) {
                System.out.println("시험 점수는 " + a + "이고, 등급은 B입니다.");
            } else if (a >= 70) {
                System.out.println("시험 점수는 " + a + "이고, 등급은 C입니다.");
            } else if (a >= 60) {
                System.out.println("시험 점수는 " + a + "이고, 등급은 D입니다.");
            } else {
                System.out.println("시험 점수는 " + a + "이고, 등급은 F입니다.");
            }
        } else {
            System.out.println("유효하지 않은 점수입니다.");
        }
    }
}
