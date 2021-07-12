import java.util.Scanner;

public class Print_Odd {
    public static void main(String [] ar){
        int i=1,n;
        Scanner s = new Scanner(System.in);
        System.out.println("Give your Input");
        n=s.nextInt();
        while (i<=n)
        {
            if(i%2==0) {
                System.out.println("This is Even");
            }
            else {
                System.out.println(i);
            }
            i++;
        }

    }
}
