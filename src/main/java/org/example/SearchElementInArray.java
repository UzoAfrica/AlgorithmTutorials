package org.example;

public class SearchElementInArray {
    public static void main(String[] args) {
        int[] arr = {30,20,40,50,100};
        int search_el= 10;
        boolean flag = false;
        for (int i=0; i< arr.length; i++ )
        {
            if(search_el==arr[i])
            {
                System.out.println("Element found at "+ arr[i]);
                flag=true;
            }
        }
       if(flag== false)
        System.out.println("Element is not found");
    }
}
