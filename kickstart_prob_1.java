import java.util.Scanner;

public class kickstart_prob_1 {
    public static void main(String[]ar){
        Scanner in =new Scanner(System.in);
        int t=in.nextInt();
        for (int i =1;i<=t;i++){
            String a=in.nextLine();
            int len=a.length()-1;
            char b=a.charAt(len);
            if (b=='y'||b=='Y'){
                System.out.println("Case #"+t+": "+a+" is ruled by nobody.");
            }
            else if (b=='A'||b=='a'||b=='E'||b=='e'||b=='I'||b=='i'||b=='O'||b=='o'||b=='U'||b=='u'){
                System.out.println("Case #"+t+": "+a+" is ruled by Alice.");
            }
            else{
                System.out.println("Case #"+t+": "+a+" is ruled by Bob.");
            }
        }
    }
}