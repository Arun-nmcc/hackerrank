import java.util.Scanner;

public class ArraysDS {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]= new int[n];
        int temp;
        for (int i=0;i<n;i++){
            arr[i]= scan.nextInt();
        }
        for (int i=0, j=arr.length-1;i<n/2;i++,j--) {

temp=arr[i];
arr[j]=temp;
arr[i]=arr[j];
        }
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
