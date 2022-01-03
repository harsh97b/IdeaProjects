package com.company;
import java.util.Arrays;
import java.util.*;
public class Main {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long count = 0;
        //long value = 0;
        for(int i = 1 ; i<=n ; i++){
            System.out.println("i: "+i);
            count +=calc(i,k);
            if(count>998244353)
                count = count%998244353;
            for(int j=2; (j*k)<=i ; j++){
                count +=calc(i,j*k);
                count--;
                if(count>998244353)
                    count = count%998244353;
            }
            System.out.println("                              count:"+count);
        }
        System.out.println(count);
    }
    static long calc(int i, int k){
        long count=0;
        if(k<=i){
            count += (i-k+2);
            System.out.println("      "+k+"<="+i+"    cases: "+(i-k+2));
        }
        else {
            count++;
            System.out.println("      "+k+">"+i + "    cases: " + 1);
        }

        return count;
    }
/*
5 2
1 0
2 00, 11
3 000, 011, 110
4 0000, 0011, 0110, 1100, 1111
5 00000, 00011, 00110, 01100, 11000, 11110, 01111

*
* */
}





