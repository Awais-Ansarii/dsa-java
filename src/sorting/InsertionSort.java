package sorting;

public class InsertionSort {
    // like cards game

    public static void main(String[] args)  {

        int arr[] = {1, 7, 12, 3, 2, 11};
        printArr(arr);

        IS(arr);
        
    }

    public static void IS(int arr[]){
        for(int i=1; i<arr.length ; i++){
            int j=i-1;
            int temp =arr[i];

            for(; j>=0; j--){
                    if(arr[j] > temp ){
                        //shift
                        arr[j+1] = arr[j];

                    }
                    else{
                        break;
                    }
            }

            arr[j+1] = temp;
        }
        printArr(arr);
    }
     public static void printArr(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        return;
    }
}
