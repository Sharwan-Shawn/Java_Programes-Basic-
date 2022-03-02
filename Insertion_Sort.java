public class Insertion_Sort {
    public static void main(String[]ar){
        int []arr={2,45,66,1,5,78,9};
        int j,temp;
        for (int i=1;i<arr.length;i++){
            temp=arr[i];
            j=i-1;

            while(j>=0&&arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        for(int i:arr){
            System.out.println(i);
        }
    }
}
