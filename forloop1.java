import java.util.Scanner;
//Total of N
public class forloop1 {
    public static void main(String []ar){
        int a,b=0, i=1;
        Scanner s = new Scanner(System.in);
        System .out.println("Give your Input");
        a=s.nextInt();
        for(;i<=a;i++)
        {
            System.out.println(""+i);
            b=b+i;
        }
        System.out.println("Total of N : "+b);
    }
}
