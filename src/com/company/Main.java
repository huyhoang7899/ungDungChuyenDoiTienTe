package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập USD : ");
        usd = scanner.nextDouble();
        double result = usd * 23000;
        System.out.println("VND : " + result);
    }
}
