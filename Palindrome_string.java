public class Palindrome_string
{
    public static void main(String[]ar){
        String s="MADAM";
        String os=s;

        String rev="";
        for (int i=s.length()-1;i>=0;i--) {
            rev += s.charAt(i);
        }
        if (rev.equals(os)){
            System.out.println(rev+" palindrome");
        }
        else {
            System.out.println(rev+" Not palindrome");
        }
    }
}
