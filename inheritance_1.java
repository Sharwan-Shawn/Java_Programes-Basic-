class sum{
    int a,b,c;
    void addition(){
        c=a+b;
    }
}
class addsub extends sum{
    void sub(){
        c=a-b;
    }
}
public class inheritance_1 {
    public static void main (String[]ar){
        addsub o = new addsub();
        o.a=10;
        o.b=20;
        o.addition();
        System.out.println("addition "+o.c);
        o.sub();
        System.out.println("sub "+o.c);
    }

}
