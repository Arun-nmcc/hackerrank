import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    public static void main(String[] args) {
        long sum=0;
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
      long[] arry=new long[a];
      for(int i=0;i<a;i++){
          arry[i]=scan.nextLong();
              sum =  (sum+arry[i]);
      }
        System.out.println(sum);
    }
    


    }


