package Dmo02;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int a = scanner.nextInt();
        System.out.println("请输入一个整数");
        int b = scanner.nextInt();
        System.out.println("请输入一个整数");
        int c = scanner.nextInt();
        int temp=(a>b?a:b);
        int max=(temp>c?temp:c);
        System.out.println(max);


    }
}
