import java.util.Scanner;

public class PDFViewer {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int max = -1;
        int count=0;
        int index = 0;

        int[] arr = new int[26];
        for (int i = 0; i < 26; i++){
            arr[i] = scan.nextInt();

        }
        String str = scan.next();
        for ( int i = 0; i < str.length(); i++){
            max = Math.max( arr[ (int)str.charAt(i)-97],max );


        }

        System.out.println( max*str.length());
    }
}
