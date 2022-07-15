import java.util.Scanner;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int j= scan.nextInt();
        int count=0;
        int arr[]=new int[n];
        for (int i=0; i<n;i++){
            arr[i]= scan.nextInt();
        }
       for (int i=0;i<n;i++){
           for(int k=0;k<n;k++){
               if(i==k){
                   continue;
               }
               if(i<k && (arr[i]+arr[k])%j == 0){
                   count++;

               }
           }
       }
        System.out.println(count);
    }

}
