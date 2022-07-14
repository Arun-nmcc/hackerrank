import java.util.Scanner;

public class SubarrayDivision {
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
        for (int i=0;i<n-m+1;i++){
            int sum=0;
            for (int k=i;k<m+i;k++){
                sum+=arr[k];

            }if (sum==d){
                count++;
            }

        }
        System.out.println(count);
    }
}
