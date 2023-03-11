package org.example;

public class MaxAndMinValue {
    public static void main(String[] args) {
        int[] a= {70,40, 30, 190, 60};
        int max = a[0];


        for(int i=1; i<a.length; i++){
            if (a[i]>max)
            {
                max= a[i];
            }
        }
        int min = a[0];

        for(int i=1;  i<a.length; i++)
        {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("The maximum number is " + max  + " The minimum number is " + min);
    }
}
