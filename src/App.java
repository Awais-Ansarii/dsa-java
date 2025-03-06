public class App {
    public static void main(String[] args)  {

        int arr[] = {1, 7, 12, 3, 2, 11, 7};
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
