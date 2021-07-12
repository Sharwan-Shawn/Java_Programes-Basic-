class swap{
    int a,b,temp;
    swap(){
        a=10;
        b=20;
    }
    void swapping(){
        temp=a;
        a=b;
        b=temp;
    }
    void display() {
        System.out.println(a);
        System.out.println(b);
    }
}
public class objclass_1 {
    public static void main(String[]ar){
        swap s = new swap();
        s.swapping();
        s.display();

    }
}
