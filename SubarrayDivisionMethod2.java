import java.util.Scanner;

public class SubarrayDivisionMethod2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();

        }
        int d= scan.nextInt();
        int m= scan.nextInt();
        int count=0;
        int sum=0;
        for(int i=0;i<m;i++){
            sum+=arr[i];
        }
        if (sum==d){
            count++;
        }
      //  System.out.println(count);
        for (int i=m;i<n;i++){
            sum+=arr[i];
            sum=sum-arr[i-m];
            if (sum==d){
                count++;
            }
        }
        System.out.println(count);

}
}
