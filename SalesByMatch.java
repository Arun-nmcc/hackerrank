import java.util.Scanner;

public class SalesByMatch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        int ans=0;
        int count[]=new int[101];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();

        }
        for (int i=0;i<=100;i++) {
            count[i]=0;
        }
        for (int i=0;i<n;i++){
            count[arr[i]]++;
        }
        for (int i=1;i<101;i++){
            if(count[i]>=2){
              ans+=  count[i]/2;
            }
        }
        System.out.println(ans);
    }
}
