public class rev_string {
    public static void main(String[]ar){
        String str="Tenet";
        String rev="";

        //Approach 1:
        for (int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }

        //Apporach 2:
        char a[]=str.toCharArray();
        for (int i=a.length-1;i>=0;i--){
            rev+=a[i];
        }
         System.out.println(rev);

        //Apporach 3:
        StringBuffer s = new StringBuffer(str);
        System.out.println(s.reverse());

    }
}
