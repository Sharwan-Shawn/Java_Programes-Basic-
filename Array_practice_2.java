import java.util.Scanner;

public class Array_practice_2 {
    public static void main(String [] ar){
        int i,a[]=new int[5];
        Scanner s = new Scanner(System.in);
        for (i=0;i<5;i++){
            System.out.println("Enter "+i+" index value");
            a[i]=s.nextInt();
        }
        for (i=0;i<5;i++){
            System.out.println(a[i]);
        }
    }
}
