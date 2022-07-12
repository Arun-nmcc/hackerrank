import java.util.Scanner;

public class StairCase {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int n= scan.nextInt();
        for(int row = n; row>=1; row--){
            //System.out.println(row);
            for(int col = 1; col<row; col++){
                System.out.print(" ");
            }
            for(int k=n;k>=row;k--){
                System.out.print("#");

            }
            System.out.println();
        }

        }
    }

