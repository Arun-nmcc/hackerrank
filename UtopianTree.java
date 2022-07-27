import java.util.Scanner;

public class UtopianTree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();


        for (int i = 0; i < n; i++){
            int height = 1;
            int a = scan.nextInt();
            for (int j = 1; j <= a; j++){
                if (j%2 == 0){
                    height++;
                }else {
                    height *= 2;
                }
            }
            System.out.println(height);
           }

    }
}
