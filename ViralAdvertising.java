import java.util.Scanner;

public class ViralAdvertising {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = scan.nextInt();
        int shared =  5;
        int liked = 0;
        int count = 0;
        for (int i = 0; i < days; i++){
            liked = shared/2 *3;
            count += liked;
            shared = liked * 3;

        }
        System.out.println(count);
    }
}
