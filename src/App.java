public class App {
    public static void main(String[] args)  {

        int arr[] = {1, 7, 12, 3, 2, 11, 7};
        printArr(arr);

        SelectionSort(arr);
        
    }


    public static void SelectionSort(int arr[]){
        for(int i=0; i<arr.length - 1; i++){
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]  < arr[minIndex]){
                    minIndex = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        printArr(arr);
        return;
    }

    public static void printArr(int arr[]){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        return;
    }
}
