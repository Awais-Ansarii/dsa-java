package ArrayQues;

public class Sort01 {
    public static void main(String[] args){

        int arr[] = {0, 2 , 1, 0, 0, 2, 1};
        printArr(arr);

        sort012(arr);
        return;
    }
    public static void sort01(int arr[]){
        int i=0;
        int j = arr.length - 1;
        while (i<=j) {
            if(arr[i] == 0){
                i++;
            }
            else if(arr[j] == 1){
                j--;
            }
            else if(arr[i] != 0 && arr[j] != 1){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            
        }
        printArr(arr);
        return;
    }
     
    public static void sort012(int arr[]){
        System.out.println("inside");
        int z = 0;
        int s= 0;
        int e = arr.length - 1;
        while(s<e){
            System.out.println("in while");
            if(arr[s] == 0){
                int temp = arr[s];
                arr[s] = arr[z];
                arr[z] = temp;
                s++;
                z++;
            }
             if(arr[s]==2){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                e--;
            }
            
            if(arr[s] == 1){
                s++;
              
                
            }
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
