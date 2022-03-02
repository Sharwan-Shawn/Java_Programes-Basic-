import java.util.HashSet;

public class Duplicate_in_array {
    public static void main(String[]ar){
        int arr[]={12,22,33,44,55,12};
        boolean flag=false;
        //Approach 1
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j])
                    System.out.println("Duplicate found: "+arr[i]);
                    flag=true;
            }
        }
        //Approach 2
       HashSet <Integer> dup=new HashSet();
        for (Integer i:arr){
            if(dup.add(i)==false)
                System.out.println("Duplicate found: "+i);
                flag=true;
        }


        if (flag==false)
            System.out.println("Duplicate is not found");
    }
}
