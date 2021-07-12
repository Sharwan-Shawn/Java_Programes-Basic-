import java.util.Random;

public class sum_of_randomNumber {

        public static void main(String[]ar){
        int a[] = new int[5],sum=0, i;
        Random r = new Random();
        for (i = 0; i < 5; i++) {
            a[i] = r.nextInt(100);
            System.out.println(a[i]);
            sum = sum+a[i];

        }
            System.out.println("sum of Array: " +sum);

    }
}