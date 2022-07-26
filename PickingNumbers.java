import java.util.*;

public class PickingNumbers
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int n = readIn.nextInt();
        int[] arr = new int[100];
        for(int ii = 0; ii < n; ii++)
            arr[scan.nextInt()]++;

        int out = Integer.MIN_VALUE;
        for(int ii = 0; ii < arr.length - 1; ii++){
            //System.out.println(out);
            out = arr[ii] + arr[ii + 1] > out ? arr[ii] + arr[ii + 1] : out;
        }
        System.out.println(arr.length);
    }
}
