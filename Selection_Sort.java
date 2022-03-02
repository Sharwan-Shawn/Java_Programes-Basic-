public class Selection_Sort {
   /* public static void main(String[]ar) {
        int[] arr = {2, 45, 66, 1, 5, 78, 9};
        int minivalueindex;

        for (int i=0;i<arr.length-1;i++){
            minivalueindex=i;
            for (int j=i+1;j<arr.length;j++){
                    if (arr[minivalueindex]>arr[j]){
                        minivalueindex=j;

                    int temp=arr[minivalueindex];
                    arr[minivalueindex]=arr[i];
                    arr[i]=temp;
            }

        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }*/

        public static void main(String[] ar)
        {
            int[] arr = { 45, 66, 1, 5, 78, 9};
            int small;
            for (int i = 0; i <arr.length - 1; i++)
            {
                small = i;
                for (int j = i + 1; j < arr.length; j++)
                {
                    //if current position is less than previous smallest
                    if (arr[j] < arr[small])
                    {
                        small = j;

                        //swap values
                        int temp = arr[i];
                        arr[i] = arr[small];
                        arr[small] = temp;
                    }
                }
            }
            for(int i:arr){
                System.out.print(i+" ");
            }
        }

    }
