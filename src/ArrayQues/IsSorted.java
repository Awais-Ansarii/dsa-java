package ArrayQues;

public class IsSorted {

    public static void main(String[] args) {
        int arr[] = {7,1,2,3,4,5};
        printArr(arr);
        boolean sorted = checkSorted(arr);
        System.out.println(sorted);
    }


    public static boolean checkSorted(int arr[]){

        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }


        return true;
    }

    //  print array fn
    public static void printArr(int arr[]){
        System.out.println();
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        return;
    }
    
}
