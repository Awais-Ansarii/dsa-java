public class Test {
    public static void main(String[] args){
        int arr[] = {1,2,3};
        printArr(arr);

    }



    public static void printArr(int arr[]){
        System.out.println();
        for(int i : arr){

            System.out.print(i + " ");
        }
        System.out.println();
        return;
    }
}
