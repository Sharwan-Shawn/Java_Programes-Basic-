import java.util.Scanner;

public class Array_RevTransferA_B {
    public static void main(String []ar){
        int i,j,a[]=new int[4], b[] = new int[4];
        Scanner s = new Scanner(System.in);
        for (i=0;i<4;i++){
            a[i]=s.nextInt();
        }
        /*for (i=0;i<4;i++) {

            System.out.println("The value of a [" + i + "] is " + a[i]);
        }*/

        for (i=3,j=0;j<4 && i>=0;i--,j++){
            b[j]=a[i];
        }
        for (j=0;j<4;j++) {

            System.out.println("The value of B [" + j + "] is " + b[j]);
        }
    }
}
