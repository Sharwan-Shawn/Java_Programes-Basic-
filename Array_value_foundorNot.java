import java.util.Scanner;

public class Array_value_foundorNot {
    public static void main(String[]ar) {
        int i, b = 0, j, f = 0, a[] = new int[5];
        Scanner s = new Scanner(System.in);
        for (i = 0; i < 5; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Which value you need to find ");
        j = s.nextInt();

        for (i = 0; i < 5; i++) {
            if (j == a[i]) {
                f = 1;
                b = i+1;
            }
        }
        if (f == 1){
            System.out.println("Value Found");
            System.out.println("The value found at "+b+" position" );
    }
        else{
            System.out.println("Value Not Found");
    }


    }
}