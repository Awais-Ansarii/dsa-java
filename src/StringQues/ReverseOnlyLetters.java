package StringQues;

public class ReverseOnlyLetters {


    // Question: https://leetcode.com/problems/reverse-only-letters/
    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj"; 
        System.out.println(s);
        System.out.println("bol");
        System.out.println(reverseOnlyLetters(s));
    }


    public static String reverseOnlyLetters(String s) {

        // Ascii range of a-z => 97-122
        // Ascii range of A-Z => 65-90

        // crack how to chech is each char is english letter of not
        char[] arr = s.toCharArray();
        int i=0; 
        int e = s.length()-1;
       while(i< e){
        if( (arr[i] >= 97 && arr[i] <= 122) || (arr[i] >= 65 && arr[i] <= 90) ){
            char temp = arr[i];
            arr[i] = arr[e];
            arr[e] = temp;
            i++;
            e--;
        }
       
           else if(!Character.isLetter(arr[i])) {
               i++;
           }
           else{
               e--;
           }
       }
       
        return new String(arr);
    }
}
