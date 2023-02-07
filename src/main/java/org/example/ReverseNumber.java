package org.example;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {


        //HOW TO REVERSE A NUMBER
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num= sc.nextInt();

//SOLUTION 1
//        StringBuffer sb = new StringBuffer(String.valueOf(num));
//        StringBuffer rev = sb.reverse();
//        System.out.println(rev);

//SOLUTION 2
//    int paul =0;
//    while(num!=0){
//        paul= paul*10 + num%10;
//        num=num/10;
//        }
//
//        System.out.println(paul);

        //SOLUTION 3;
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        StringBuilder rev= sb.reverse();
        System.out.println(rev);






//        int a=20, b=10;
//        System.out.println("Before swapping value is swap " + a + " " + " " + b);
//
////        int t = a;
////        a=b;
////        b=t;
//
//        int t = a+b;
//            a= t - b;
//            b= t- a;
//        System.out.println("After swapping value is swap " + a + " " + " " + b);
    }
}
