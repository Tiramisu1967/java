package com.kmit.www;

import java.util.Scanner;
public class Three {
    public static void main(String[] args) {
        System.out.println("이름, 도시, 나이, 체중, 독신 여부를" + "빈칸으로 분리하여 입력하세요");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next(); //문자열 읽기
        System.out.println("이름은 " + name + ",");

        String city = scanner.next();
        System.out.println("도시는 " + city + ", ");

        int age = scanner.nextInt(); // 나이 int 입력
        System.out.println("나이는 " + age + "살, ");

        double weingt = scanner.nextDouble();
        System.out.println("체중은 " + weingt + "kg, ");
        boolean single = scanner.nextBoolean();
        System.out.println("독신 여부는 " + single + "입니다.");
        scanner.close(); //scanner 닫기

    }
}
