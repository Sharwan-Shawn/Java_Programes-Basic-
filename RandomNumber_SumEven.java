//Sum of even number
//Count of even number
import java.util.Random;

public class RandomNumber_SumEven {
    public static void main(String[] ar) {
        int i,sum=0,b=0, a[] = new int[5];
        Random r = new Random();
        for (i = 0; i < 5; i++) {
            a[i] = r.nextInt(50);
            System.out.println(a[i]);
        }
        for (i = 0; i < 5; i++) {
            if (a[i]%2==0){
                sum=sum+a[i];
                b++;
            }
        }
        System.out.println("Count of even number : "+b);
        System.out.println("Sum of even number : "+sum);
    }
}
