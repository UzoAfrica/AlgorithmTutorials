package org.example.abctech;

import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {

        //Reverse a string
//        String x= "too hot to hoot";
////        x=x.replace(" ", "");
//        char []y = x.toCharArray();
//        int size = y.length;
//        char a[] = new char[size];
//
//        int i=0;
//        int count = 0;
//        while(i!=size)
//        {
//            a[size-1-i]= y[i];
//            count ++;
//            i++;
//        }
//        System.out.println(a);
//        System.out.println(y);

        //Palindrome
        String x= "too hot to hoot";
        x=x.replace(" ", "");
        char []y = x.toCharArray();
        int size = y.length;
        char a[] = new char[size];

        int i=0;
        while(i!=size)
        {
            a[size-1-i]= y[i];
            i++;
        }

        i=0;
        while (i!=size)
        {
            if(a[i]!=y[i])
            {
                System.out.println("It is not a Palindrome");
                System.exit(0);
            }
            else {
                ++i;
            }
        }

        System.out.println("It is a Palindrome");
    }
}
