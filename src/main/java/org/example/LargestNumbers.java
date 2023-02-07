package org.example;

import java.util.Scanner;

public class LargestNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a= sc.nextInt();
        System.out.println("Enter second number: ");
        int b= sc.nextInt();
        System.out.println("Enter third number: ");
        int c= sc.nextInt();
//    if(a>b&&a>c){
//        System.out.println(a + " is the greatest");
//    }else if (b>a&&b>c){
//        System.out.println(b + " is the greatest");
//        }
//        System.out.println(c + " is the greatest");

        int largest1= a>b?a:b;
        int largest2= c>largest1?c:largest1;
        System.out.println(largest2+ "is the largest number100");
    }
}
