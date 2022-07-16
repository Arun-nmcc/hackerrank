import java.util.Scanner;

public class DrawingBook {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt()/2;
        int p= scan.nextInt()/2;
        int back=n-p;
        System.out.println(Math.min(back,p));






    }

}
