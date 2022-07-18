import java.util.Scanner;

public class CatsAndAMouse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        for (int i = 0; i < n; i++){
            int cat1= scan.nextInt();
            int cat2= scan.nextInt();
            int mouse= scan.nextInt();
            cat1=Math.abs(cat1-mouse);
            cat2=Math.abs(cat2-mouse);
            if(cat1<cat2){
                System.out.println("Cat A");
            } else if (cat2<cat1) {
                System.out.println("Cat B");

            }else {
                System.out.println("Mouse C");
            }
        }
    }
}
