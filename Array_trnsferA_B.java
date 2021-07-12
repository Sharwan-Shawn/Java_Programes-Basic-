import java.util.Scanner;

public class Array_trnsferA_B {
    public static void main(String []ar){
        int i,a[]=new int[2],b[]=new int[2];
        Scanner s=new Scanner(System.in);
        for (i=0;i<2;i++){
            a[i]=s.nextInt();
        }

        for (i=0;i<2;i++){

            b[i]=a[i];
        }

        for (i=0;i<2;i++) {
            System.out.println("The value of B ["+i+"] is "+b[i]);
        }
    }
}
