
import java.util.Scanner;
public class TwoD_array_EvenCount {
        public static void main(String[]ar) {
            int i,j,b=0,c=0,a[][] = new int[3][3];
            Scanner s = new Scanner(System.in);
            for (i=0;i<3;i++){
                for (j=0;j<3;j++){
                    System.out.print("Enter the value");
                    a[i][j]= s.nextInt();
                }
            }
            for (i=0;i<3;i++) {
                for (j = 0; j < 3; j++) {
                    if (a[i][j] % 2 == 0) {
                        b=b+a[i][j];
                        c++;
                    }
                }
            }
            System.out.println("Sum of 2d array's even number : "+b);
            System.out.println("Count of even number : "+c);
        }
}
