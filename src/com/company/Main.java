package com.company;

import java.util.Scanner;

public class Main {
    static int n=1;
    static boolean flag;
    public static int proverka(String [] array,  String x, String y)
    {
        if(x.equals(y)==true) {
            if (array.length - n - 1 == n||array.length-n-1==n+1) {
                flag = true;
                return 0;
            }
            n++;
            proverka(array, array[n], array[array.length - n - 1]);
        }
        else {
            flag=false;
            return 0;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String [] arr = s.split("");
        proverka(arr, arr[0], arr[arr.length-1]);
        System.out.println(flag);
    }
}

