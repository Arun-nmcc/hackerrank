import java.util.Scanner;

public class GradingStudents {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n =scan.nextInt();
        int[] arr = new int[n];
//        for (int i=0;i<n;i++) {
//            arr[i] = scan.nextInt();
//        }
        for (int i=0;i<n;i++) {
            arr[i] = scan.nextInt();
            //for (int j=0;j<n;j++){
                if (arr[i]>=38&&arr[i]%5>2){
                  //  System.out.println(arr[i]);
                    arr[i]+=5-arr[i]%5;



            }
            System.out.println(arr[i]);

        }


    }
}
