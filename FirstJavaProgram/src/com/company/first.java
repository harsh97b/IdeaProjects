package com.company;

import java.util.Scanner;



/*
public class first {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("The value of n: ");
        int n = sc.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        //enter your code here
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
*/
/*
Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];
        int target = 0;
        int value = 0;

        for( int i=0 ; i<n ; i++)
            arr[i] = sc.nextInt();
        //display(arr);
        while(q-->0){
            int check = sc.nextInt();
            //System.out.println("check: "+check  );
            if( check == 1){
                target = sc.nextInt();
                value = sc.nextInt();
                arr[target-1] = value;
                //System.out.println("here in 1     target-1:  "+ (target -1) + "  value: "+value);
                //display(arr);
            }
            else if(check == 2){
                value = sc.nextInt();
                //System.out.println("Inside 2    value: "+value);
                for( int i=0 ; i<n ; i++){
                    if(arr[i] > value){
                        arr[i] = value;
                        //System.out.println("here in 2     arr["+i+"]: "+value);
                        //display(arr);
                    }
                }
            }
        }
        display(arr);

        static void display(int[] arr){
        System.out.println("");
        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
*/