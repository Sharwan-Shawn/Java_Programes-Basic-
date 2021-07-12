import java.util.Random;

public class randomNumber_to_array {
    public static void main(String[]ar) {
        int a[] = new int[5], i;
        Random r = new Random();
        for (i = 0; i < 5; i++) {
            a[i] = r.nextInt(100);
            System.out.println(a[i]);
        }
    }
}
