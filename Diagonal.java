import java.util.Scanner;

public class Diagonal {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int a=scan.nextInt();
      int[][] arr=new int[a][a];
      for(int i=0;i<a;i++){
          for( int j=0;j<a;j++){
              arr[i][j]= scan.nextInt();


          }
      }
      int leftDiagonal=0;
      for(int i=0;i<a;i++){
          leftDiagonal+= arr[i][i];
          //System.out.println(leftDiagonal);
      }
      int rightDiagonal=0;
        for(int i=0;i<a;i++){
            rightDiagonal+=arr[i][a-1-i];                            //i+j=n-1  //then j=n-1-i
          //  System.out.println(rightDiagonal+"");
        }
        System.out.println( Math.abs(leftDiagonal-rightDiagonal));

    }
}
