package org.example;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word: ");

        String str = sc.next();


        //SOLUTION 2
        String org_str = str;
        String lev = " ";
        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            lev = lev + str.charAt(i);
        }


        if (org_str.equals(str)) {
            System.out.println(org_str + " is a palindrome");
        } else {
            System.out.println(org_str + " is not a palindrome");
        }
    }

        //SOLUTION 1
        //String org_str= str;
//         StringBuffer sb= new StringBuffer(str);
//         StringBuffer rev = sb.reverse();
//        System.out.println(rev);

//        if(org_str.equals(str)){
//            System.out.println(org_str + " is a palindrome");
//        }else{
//            System.out.println(org_str + " is not a palindrome");
//        }
    //}

}
