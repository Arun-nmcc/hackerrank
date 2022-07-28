import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int d1 = scan.nextInt();
        int m1 = scan.nextInt();
        int y1 = scan.nextInt();
        int d2 = scan.nextInt();
        int m2 = scan.nextInt();
        int y2 = scan.nextInt();
        int fine = 0;
        if (d1 > d2 && y2 == y1 && m1 == m2){
            fine = 15 * (d1 - d2);
        } else if ( y2 < y1 ) {

            fine = 10000;
        } else if (y2 == y1 && m1 >m2) {
            fine = 500 * (m1 - m2);

        }
        System.out.println(fine);
    }
}
