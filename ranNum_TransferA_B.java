import java.util.Random;

public class ranNum_TransferA_B {
    public static void main(String[]ar){
        int i,a[]=new int[5],b[]=new int[5];
        Random r = new Random();
        for (i=0;i<5;i++){
            a[i]=r.nextInt(9);
            System.out.println("value of a["+i+"] is : "+a[i]);
        }
        for (i=0;i<5;i++){
            b[i]=a[i];
            System.out.println("value of b["+i+"] is : "+b[i]);
        }

    }
}
