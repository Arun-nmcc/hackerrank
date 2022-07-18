import java.util.Scanner;

public class ElectronicsShop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int budget=scan.nextInt();
        int keyNo= scan.nextInt();
        int usbNO= scan.nextInt();
        int total=-1;
        int count=0;
        int keyModel[]=new int[keyNo];
        int usbModel[]=new int[usbNO];
        for (int i=0; i < keyNo; i++){
            keyModel[i]= scan.nextInt();
        }  for (int i=0; i < usbNO; i++){
            usbModel[i]= scan.nextInt();
        }
        for (int i = 0; i < keyNo; i++){
            for (int j = 0; j < usbNO; j++){

                count=(keyModel[i]+usbModel[j]);
                if(count>budget){
                    continue;
                }
                total=Math.max(count, total);
            }

        }System.out.println(total);

    }
}

