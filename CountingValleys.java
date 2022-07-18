import java.util.Scanner;

public class CountingValleys {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        String lvl=scan.next();
        int count=0;
        int height=0;

        for (int i = 0; i < n; i++){
            if(lvl.charAt(i)== 'U'){
                height++;


            }else {
                height--;
            }
            if(height==0&&lvl.charAt(i)=='U'){
                count++;
            }

        }
        System.out.println(count);
    }
}
