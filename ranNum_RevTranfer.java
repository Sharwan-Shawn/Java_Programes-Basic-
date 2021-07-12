import java.util.Random;

public class ranNum_RevTranfer{
        public static void main(String[] ar) {
            int i, j, a[] = new int[5], b[] = new int[5];
            Random r = new Random();
            for (i = 0; i < 5; i++) {
                a[i] = r.nextInt(23);
                System.out.println("value of a[" + i + "] is : " + a[i]);
            }
            for (i = 4, j = 0; j < 5 && i >= 0; j++, i--) {
                b[j] = a[i];
                System.out.println("value of b[" + j + "] is : " + b[j]);
            }
        }
}