import java.util.Scanner;

public class FindDigits {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int caseCount = scan.nextInt();
        for (int i = 0; i < caseCount; i++){
            int digit = scan.nextInt();
            int reverse = digit;
            int divisior = 0;
            int temp = 0;
            int count = 0;
            while(reverse != 0){
                temp = reverse/10;
                divisior = reverse%10;
                reverse = temp;
                if (divisior == 0){
                    continue;
                }
                if(digit%divisior == 0){
                    count++;
                }

            }
            System.out.println(count);
        }
    }
}
