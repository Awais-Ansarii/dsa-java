package ArrayQues;
import java.util.Arrays;
public class UniqueOccurence {
     public static void main(String[] args)  {

        int arr[] = {1, 7, 3,3,7};
        printArr(arr);
        // uniqueOccurence1(arr);
        uniqueOccurence2(arr);

        
        
    }
// brute-force method
     public static void uniqueOccurence1(int arr[]){
        Arrays.sort(arr);
             printArr(arr);
        int size = arr.length;
        int tempArr[] = new int[size]; 
        int unqueCount = 0;

        int i=0;
        while(i<size){
            int current = arr[i];
            int count = 0;

            while(i<size && arr[i]==current){
                count++;
                i++;
            }
            tempArr[unqueCount] = count;
            unqueCount++;
        }

        System.out.println(unqueCount);
        printArr(tempArr);

        for(int j=0; j<unqueCount-1; j++){
            for(int k=j+1; k<unqueCount; k++){
                if(tempArr[j] == tempArr[k]){
                    System.out.println("false");
                    return;
                }
            }
        }
        System.out.println("true");
        return;
     }
     

     //using Array count
public static void uniqueOccurence2(int arr[]){
    Arrays.sort(arr);
    // if we consider constarin -- -1000 to 1000
    int tempArr[] = new int[2001];

    for(int i : arr){
        tempArr[i+1000]++;
    }

    


    for(int i=0; i<tempArr.length -1; i++){
        if(tempArr[i] != 0 && tempArr[i] == tempArr[i+1]){
            System.out.println("false");
            return;
        }
    }
    System.out.println("true");
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
