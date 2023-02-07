package org.example;

public class CountEvenAbndOddDigit {
    public static void main(String[] args) {
        int num= 1234567;
        int even_num= 0;
        int odd_num= 0;

        while(num>0){
            int rem = num%10;
            if(rem%2==0){
                even_num++;
            }else{
                odd_num++;
            }
            num=num/10;

        }
        System.out.println("Even Number: " + even_num);
        System.out.println("Even Number: " + odd_num);
    }
}
