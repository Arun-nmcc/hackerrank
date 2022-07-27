import java.util.Scanner;

public class AngryProfessor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int caseCount = scan.nextInt();
        for (int i = 0; i < caseCount; i++){
            int numberOfStudent = scan.nextInt();
            int needStudent = scan.nextInt();
            int onTime = 0;
            int[ ] arr = new int[numberOfStudent];
            for (int j = 0; j < numberOfStudent; j++){

                arr[j] = scan.nextInt();
                if (arr[j] <= 0){
                    onTime++;
                }
            }
            if (onTime >= needStudent){
                System.out.println("NO");
            }else {
                System.out.println("YES");
            }
        }
    }
}
