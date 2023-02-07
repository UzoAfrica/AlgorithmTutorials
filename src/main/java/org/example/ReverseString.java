package org.example;

public class ReverseString {
    public static void main(String[] args) {
        String str= "ABCD";
        String rev= " ";

        //SOLUTION 3 Using StringBuffer
        StringBuffer sb = new StringBuffer(str);
        StringBuffer re = sb.reverse();
        System.out.println(re);

        //SOLUTION 2 using character array
//        char a[]= str.toCharArray();
//        int len= a.length;
//        for(int i=len-1; i>=0;i--){
//            rev= rev+a[i];
//        }
//        System.out.println(rev);


        //SOLUTION 1 using String concatenation operator
//        int len= str.length();
//
//         for(int i=len-1; i>= 0; i--){
//             rev = rev+str.charAt(i);
//         }
//        System.out.println(rev);


    }
}
