package ArrayQues;





public class PairSum {

    // find common elements in two arrays
    // arrays are sorted
    public static void main(String[] args) {
        int arr[] = {2,-3,3,3,-2};
       

        pairSum(arr, 0);
    }

   public static void pairSum(int arr[], int k){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j] == k){
                    System.out.println(arr[i]+"-"+arr[j] );
                }
            }
        }
        return;
   }
    
    //  print array fn
     public static void printArr(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        return;
    }

}