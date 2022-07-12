import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
//        long max= Long.MIN_VALUE;
//        long min =Long.MAX_VALUE;
//        System.out.println(Long.MIN_VALUE);
//        System.out.println(Long.MAX_VALUE);
        Scanner scan=new Scanner(System.in);
        long arr[]=new long[5];

        long max=Long.MIN_VALUE;
        long min=Long.MAX_VALUE;
        for (int i=0;i<5;i++){
            arr[i]=scan.nextLong();

        }
        for (int i=0;i<5;i++){
            long sum=0;
            for(int j=0; j<5;j++){
                if (i==j){
                    continue;

                }sum+=arr[j];
            }
            max=Math.max(sum,max);
            min=Math.min(sum,min);

        }
        System.out.println(min+" "+max);
    }
}
