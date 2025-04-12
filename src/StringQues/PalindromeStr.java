package StringQues;

public class PalindromeStr {
    public static void main(String[] args) {
        String str = "madame";
        System.out.println();
        System.out.println(str);
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str){

        str = str.toLowerCase();

        int s = 0;
        int e = str.length()-1;
       

        while(s <= e){
            if(str.charAt(s) != str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        System.out.println();
        return true;
    }


}
