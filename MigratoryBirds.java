import java.util.Scanner;

public class MigratoryBirds {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in) ;
        int a=scan.nextInt();
        int arr[]= new int[a];
        int total=Integer.MIN_VALUE;
        int out=0;

        int count[]=new int[a+1];
        for(int i = 0;i<a;i++){
            arr[i]= scan.nextInt();
        }
        for(int i=0;i<a+1;i++){
            count[i]=0;
        }
        for(int i=0;i<a;i++){
            count[arr[i]]++;

        }for (int i=1;i<a+1;i++){
            if (count[i]>total){
                total=count[i];
                out=i;

            }
        }
        System.out.println(out);
    }
}
