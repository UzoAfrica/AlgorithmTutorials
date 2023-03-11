package org.example;

import java.util.HashSet;

public class DuplicateElement {
    public static void main(String[] args) {
        String[] arr= {"J", "Java", "C", "C++", "Java"};

//        boolean flag= false;
//        for(int i=0; i< arr.length; i++)
//        {
//            for(int j= i+1; j<arr.length; j++)
//            {
//                if(arr[i] == arr[j])
//                {
//                    System.out.println("Duplicate element is "+ arr[i]);
//                    flag= true;
//                }
//            }
//        }
//        if(flag== false)
//        {
//            System.out.println("Duplicate Element is not found");
//        }

        HashSet<String> lang= new HashSet();
        boolean flag=false;
        for(String l:arr)
        {
            if(lang.add(l)==false)
            {
                System.out.println("Duplicate element is "+ l);
                flag=true;
            }
        }if(flag== false)
        {
            System.out.println("Duplicate element is not found");
        }
    }
}
