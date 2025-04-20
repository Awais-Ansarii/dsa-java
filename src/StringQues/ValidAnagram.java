package StringQues;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        boolean ans = isVA("arman", "owais");
        // System.out.println(ans);
    }
    public class ValidAnagramOptimized {
       
    
        public static boolean isAnagram(String s, String t) {
            // First, check if the lengths are equal
            if (s.length() != t.length()) return false;
    
            // Only lowercase letters assumed, so we need only 26 slots
            int[] freq = new int[26];
    
            // Count characters in the first string
            for (int i = 0; i < s.length(); i++) {
                freq[s.charAt(i) - 'a']++;
            }
    
            // Subtract characters in the second string
            for (int i = 0; i < t.length(); i++) {
                freq[t.charAt(i) - 'a']--;
            }
    
            // If all counts are zero, they're anagrams
            for (int count : freq) {
                if (count != 0) return false;
            }
    
            return true;
        }
    }


    
    


    public static boolean isAnagram(String s, String t) {

        int freq[] = new int[256];

        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)]++;
        }

            for(int i=0; i<t.length(); i++){
                freq[t.charAt(i)]--;
            }

                for(int i=0; i<freq.length; i++){
                    if(freq[i] != 0)
                        return false;
                }
                return true;
    
         
        // Convert string to char array
        // char[] chars1 = s.toCharArray();
        // char[] chars2 = t.toCharArray();
        
        // Sort the char array
        // Arrays.sort(chars1);
        // Arrays.sort(chars2);


        // Convert back to string
        // String sortedStr = new String(chars1);
        // String sortedStr2 = new String(chars2);
        //  System.out.println("Sorted string:1 " + sortedStr);
        //  System.out.println("Sorted string:2 " + sortedStr2);

        //  if(sortedStr.equals(sortedStr2))
        //      return true;
        //  else
        //      return false;
        
    }

    public static boolean isVA(String s1, String s2) {
        int len1=s1.length();
        int len2=s2.length();

        if(len1!=len2){
            return false;
        }

        int alphabets[] = new int[26];

        //count the number of occurrences of each character in s1

        for(int i=0; i<len1; i++){
            // System.out.println("s1.chatAt(i)  == "+ s1.charAt(i));
            // System.out.println("(s1.charAt(i) - 'a')  == " + (s1.charAt(i) - 'a'));
            alphabets[s1.charAt(i) - 'a']++;
        }


        for(int i=0; i<len2; i++){
            // System.out.println("s2.chatAt(i)  == "+ s2.charAt(i));
            // System.out.println("(s2.charAt(i) - 'a')  == " + (s2.charAt(i) - 'a'));
            alphabets[s2.charAt(i) - 'a']--;
        }

        for(int i : alphabets){
            if(i != 0){
                return false;
            }
        }
        

        return true;
    }

}