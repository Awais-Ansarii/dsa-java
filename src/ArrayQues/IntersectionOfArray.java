package ArrayQues;

public class IntersectionOfArray {

    // find common elements in two arrays
    // arrays are sorted
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3};
        int arr2[] = {3, 5};

        intersectionArr(arr1, arr2);
    }

    public static void intersectionArr(int arr1[], int arr2[]){

        for(int i=0; i<arr1.length; i++){
            int element = arr1[i];
            for(int j=0; j<arr2.length; j++){
                if(element < arr2[j]){
                    break;
                };
                if(element == arr2[j]){
                    System.out.println(element);
                    arr2[j] = Integer.MIN_VALUE;
                    break;
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
