public class rec_Integer {
    public static void main(String[] ar) {
        int num = 1234;
        //1. Approach
        int rev = 0;
/*
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(rev);*/

        //2. Apporach
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        System.out.println(sb.reverse());

        //3. Apporach
        StringBuilder s = new StringBuilder();
        s.append(num);
        System.out.println(s.reverse());
    }
}