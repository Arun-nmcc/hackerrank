import java.util.Scanner;

public class BillDivision {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]= new int[n];
        int reject= scan.nextInt();
        int sum=0;
        for (int i=0;i<n;i++){
            arr[i]= scan.nextInt();
            if(arr[i]==arr[reject]){
                continue;
            }
            sum+=arr[i];


        }
        int paid= scan.nextInt();
       int share=sum/2;
        System.out.println(sum);
        if (paid==share){
            System.out.println("");
        }
        else if (paid<share) {

        }
        else {
            System.out.println(paid-share);
        }

    }
}
//4 1
//        3 10 2 9
//        12