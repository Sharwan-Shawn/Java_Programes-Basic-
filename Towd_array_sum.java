import java.util.Scanner;

public class Towd_array_sum {
    public static void main(String[]ar) {
        int i,j,b=0,a[][] = new int[3][3];
        Scanner s = new Scanner(System.in);
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                System.out.print("Enter the value");
                a[i][j]=s.nextInt();
                b=b+a[i][j];
            }
        }
        System.out.println("Sum of 2D array is " +b);
    }
}
