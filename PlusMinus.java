import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        float positive=0;
        float negative=0;
        float zero=0;
        Scanner scan= new Scanner(System.in) ;
        int a=scan.nextInt();
        int arr[]= new int[a];
        for(int i = 0;i<a;i++){
            arr[i]= scan.nextInt();
        }
        for(int i = 0; i<a; i++){
            if(arr[i]>0){
                 positive ++;

            }
            else if(arr[i]<0){
                negative++;
            }else if(arr[i]==0){
                zero++;


            }
        }
        DecimalFormat df= new DecimalFormat("0.000000");
        System.out.println(df.format(positive/a));
        System.out.println(df.format(negative/a));
        System.out.println(df.format(zero/a));
    }
}
