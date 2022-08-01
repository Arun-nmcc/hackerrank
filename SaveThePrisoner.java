import java.util.Scanner;

public class SaveThePrisoner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        for (int i = 0; i < count; i++){

            int prisoners = scan.nextInt();
            int sweets = scan.nextInt();
            int start = scan.nextInt();

            int r = sweets % prisoners;

            if ((r +start -1)%prisoners == 0){

                System.out.println(prisoners);
            }else {
                System.out.println((r +start -1)%prisoners );
            }
        }
    }
}
