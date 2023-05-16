package com.kmit.www;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("정수를 입력하시오");
        Scanner scanner = new Scanner(System.in);

        int time = scanner.nextInt();
        int hour = time / 3600;
        int minute = (time - 3600*hour) / 60;
        int second = time % 60;

        System.out.println(+time + "초는 " + hour + "시간 " + minute + "초입니다");

    }
}
