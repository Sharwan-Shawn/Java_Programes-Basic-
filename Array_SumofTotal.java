import java.util.Scanner;

public class Array_SumofTotal {
    public static void main(String []ar ){
        int i,b=0,a[]=new int[10];

        for(i=0;i<10;i++) {
            Scanner s = new Scanner(System.in);
            a[i] = s.nextInt();
        }


            for (i=0; i < 10; i++) {
                System.out.println(a[i]);
                b = b + a[i];

        }
        System.out.println("Sum of array : "+b);

    }
}
