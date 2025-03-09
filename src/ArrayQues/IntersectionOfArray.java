package ArrayQues;

public class IntersectionOfArray {

    // find common elements in two arrays
    // arrays are sorted
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 5 , 5};
        int arr2[] = {3, 5, 5};

        intersectionArr(arr1, arr2);
    }

    public static void intersectionArr(int arr1[], int arr2[]){

        int n = arr1.length;
        int m = arr2.length;
        int  i=0;
        int  j=0;

        while(i<n && j<m){
            if(arr1[i] == arr2[j]){
                System.out.print(" "+arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]){
                i++;
            }
            else{
                j++;
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
