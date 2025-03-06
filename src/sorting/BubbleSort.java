package sorting;

public class BubbleSort {
    public static void main(String[] args)  {

        int arr[] = {1, 7, 12, 3, 2, 11, 7};
        printArr(arr);

        BS(arr);
        
    }

    public static void BS(int arr[]){
        for(int i=1; i<arr.length; i++){
            // for round 1 to (n-1)
            // for(int j=0; j<arr.length -1; j++){
            for(int j=0; j<arr.length -i; j++){
                    if(arr[j] > arr[j+1]){
                        //swap
                        int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
                    }
            }
        }
        printArr(arr);

        return ;
    }
    public static void printArr(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        return;
    }
}



/*
 * //swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
 * 
 */