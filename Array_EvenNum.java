import java.util.Scanner;

public class Array_EvenNum {
    public static void main(String []ar){
        int k=0,j=0,i,a[] = new int[5];
        Scanner s = new Scanner(System.in);
        for (i=0;i<5;i++){
            System.out.println("Give your input");
            a[i]=s.nextInt();
        }

        for (i=0;i<5; i++)
        {
                if (a[i]%2==0){
                    k++;
                    j=j+a[i];
                }
        }

        System.out.println("Number of Even numbers: "+k);
        System.out.println("Total of Even number: "+j);
        
        /*for (j=0,i=0;i<5;i++){

            if (a[i]%2==0){
                j=j+a[i];
            }
        }*/
    }
}
