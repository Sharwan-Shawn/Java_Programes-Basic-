import java.util.Scanner;
public class total_of_Even {
    public static void main(String []ar){
        int i=1,n,a=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Give your Input");
        n=s.nextInt();
        while (i<=n)
        {
            System.out.println(i);
            if(i%2==0) {
                a = a + i;
            }
                i++;
        }
        System.out.println("Total of Even Numbers : "+a);
    }
}