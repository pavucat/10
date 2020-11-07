package com.company;

import java.util.Scanner;

/*public class Main {
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
}*/
//////////////
public class Main {
     int s=0;
     int S;
     int counter=0;
     int cnt=0;
     boolean flag=true;
     boolean flag1=true;
    boolean flag2=true;
    public int perevorot(int N)
    {
        if(flag1==true) {
            S = N;
            flag1=false;
        }
      if(N/10!=0&&flag==true) {
          counter++;
          perevorot(N / 10);
      }
      else
          flag=false;
     //System.out.println(counter);

        if(S>0&&flag2==true) {
         s+=(S%10)*Math.pow(10, counter);
         counter--;
         cnt++;
         S/=10;
         if(S<10) {
             s += S;
             flag2=false;
         }
         perevorot(S);
     }
        else
            flag2=false;
        System.out.println(cnt);
     return s;
     }
     Main()
     {
         Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         n=perevorot(n);
         System.out.println(n);
     }
    public static void main(String[] args) {
        new Main();
    }
}
