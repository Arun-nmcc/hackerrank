import java.util.Scanner;

public class JumpingontheCloudsRevisited {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int jump = scan.nextInt();
        int[] arr = new int[n];
        int energy = 100;
        for (int i = 0; i < n; i++){
            arr[i]  = scan.nextInt();
        }
        int i = 0;
        while(i < n){

            energy--;
            if (arr[i] == 1)
                energy -= 2;
            i += jump;

        }
        System.out.println(energy);
    }
}
