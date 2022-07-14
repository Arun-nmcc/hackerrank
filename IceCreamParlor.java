import java.util.Scanner;

public class IceCreamParlor {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for (int i=0; i<n;i++){

           int out=scan.nextInt();
           int a=scan.nextInt();
           int arr[]=new int[a];

           for(int j=0;j<a;j++){
               arr[j]= scan.nextInt();

           }
           int flag=0;
            for(int j=0;j<a;j++){
                if (flag==1){
                    break;
                }
                for(int k=0;k<a;k++){
                    int sum=0;
                    if(j==k){
                        continue;
                    }
                    sum=arr[j]+arr[k];
                   // System.out.println(sum);
                    if(sum==out){
                        if(j<k){
                        System.out.println(j+1+" "+(k+1));
                    }
                        else {
                            System.out.println(k+1+" "+(j+1));

                        }flag=1;
                    }



                }
            }

        }
    }
}
