import java.util.Scanner;

public class Palindrome_int {
    public static void main(String[]ar){
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int onum=a;

        int rev=0;
        while(a>0){
            rev=rev*10+a%10;
            a=a/10;
        }
        if (rev==onum)
            System.out.println(rev+" is palindrome");
        else {
            System.out.println(rev+" is not palindrome");
        }
    }
}
