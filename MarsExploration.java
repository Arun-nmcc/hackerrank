import java.util.Scanner;

public class MarsExploration {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String s=scan.nextLine();
        int count=0;
        for(int i = 0; i<s.length();i+=3){
            if(s.charAt(i)!='s'){
                count++;
            } if(s.charAt(i+1)!='o'){
                count++;
            } if(s.charAt(i+2)!='s'){
                count++;
            }

        }
    }
}
