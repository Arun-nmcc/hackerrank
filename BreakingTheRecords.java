import java.util.Scanner;

public class BreakingTheRecords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int maxCount=0;
        int minCount=0;
        int a[]=new int[n];
        for (int i = 0;i<n; i++){
            a[i]= scan.nextInt();
            if (a[i]>max){
                max=a[i];
                maxCount++;
            }if(a[i]<min){
                min=a[i];
                minCount++;
            }
        }
        maxCount--;
        minCount--;
        System.out.println(maxCount+" "+minCount);
    }
}
