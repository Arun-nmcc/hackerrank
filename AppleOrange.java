import java.util.Scanner;

public class AppleOrange {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int sPoint= scan.nextInt();
        int ePoint=scan.nextInt();
        int tree1=scan.nextInt();
        int tree2=scan.nextInt();
        int furit1Count=scan.nextInt();
        int furit2Count=scan.nextInt();
        int appleInHouse=0;
        int orangeInHouse=0;
        int arr1[]=new int[furit1Count];
        int arr2[]=new int[furit2Count];
        for(int i = 0; i<furit1Count;i++){
            arr1[i]=scan.nextInt();
            arr1[i]+=tree1;
            if (arr1[i]>=sPoint&&arr1[i]<=ePoint){
                appleInHouse++;
            }

        }
        for(int i = 0; i<furit2Count;i++){
            arr2[i]=scan.nextInt();
            arr2[i]+=tree2;
            if (arr2[i]>=sPoint&&arr2[i]<=ePoint){
                orangeInHouse++;
            }

        }



    }
}
