package com.company;

import java.util.Scanner;

public class pract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        int startIndex = 0;
        int endIndex = 0;
        int replace = 0;



        //display
        for(int i =0 ; i<n ; i++)
            System.out.print(arr[i]+" ");
        System.out.println("");

        while(t-->0){

            startIndex = sc.nextInt();
            endIndex = sc.nextInt();
            replace = sc.nextInt();
            //logic
            for(int i =startIndex ; i<=endIndex ; i++)
                arr[i] = arr[i] + replace ;

            //display
            for(int i =0 ; i<n ; i++)
                System.out.print(arr[i]+" ");
            System.out.println("");

        }



    }
}
