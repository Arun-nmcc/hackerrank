import java.util.Scanner;

public class BeautifulDaysATheMovies {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int s=scan.nextInt();
        int e=scan.nextInt();
        int k=scan.nextInt();
        int count=0;

        for(int i=s;i<=e;i++) {
            int reverse=reverse(i);

            if(Math.abs(reverse-i)%k==0){
                count++;
            }


        }
        System.out.println(count);
    }
    static int reverse(int i){
        int digit;
        int reverse=0;

        while (i!=0){
            digit=i%10;
            reverse=reverse*10+digit;
            i=i/10;

        }

        return reverse;
    }
}
