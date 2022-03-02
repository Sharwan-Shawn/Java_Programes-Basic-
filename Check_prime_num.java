import java.util.Scanner;

public class Check_prime_num {
    public static void main(String[] ar) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = 0;
     if (num>1){
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
    }
        if (count == 2) {
            System.out.println(num + " is Prime Number");
        } else {
            System.out.println(num + " is not Prime Number");
        }
    }
}