package hashmapQues;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class NumOfRabbits {
    // Question: 
    // https://leetcode.com/problems/rabbits-in-forest/description


    public static void main(String[] args) {
            int answers[] = {1,1,2};
            System.out.println(numRabbits(answers));
            System.out.println(numRabbitsOptimized(answers));
    }


    //brut-force solution
    public static int numRabbits(int[] answers) {
        // Sort the array to group same answers together
        Arrays.sort(answers);
        
        int total = 0;
        int i = 0;
        
        while (i < answers.length) {
            int count = 1; // count how many same answers
            int answer = answers[i];
            
            // count how many rabbits gave the same answer
            while (i + 1 < answers.length && answers[i + 1] == answer) {
                count++;
                i++;
            }

            // group size = answer + 1
            // how many full groups needed? (count + groupSize - 1) / groupSize gives ceiling
            int groupSize = answer + 1;
            int groupsNeeded = (count + groupSize - 1) / groupSize;
            total += groupsNeeded * groupSize;
            
            i++;
        }
        
        return total;
    }


    //hashmap solution
     public static int numRabbitsOptimized(int[] answers) {
        // Create a HashMap to store how many times each answer appears
        Map<Integer, Integer> mpp = new HashMap<>();

        // Count the frequency of each answer
        for (int i : answers)
            mpp.put(i, mpp.getOrDefault(i, 0) + 1);

        int total = 0;

        // Go through each unique answer and its count
        for (Map.Entry<Integer, Integer> p : mpp.entrySet()) {
            int answer = p.getKey();       // This is the rabbit's answer (e.g., 2 means 3 rabbits of that color)
            int count = p.getValue();      // How many rabbits gave this same answer

            // Group the rabbits based on how many can fit in a group
            // (answer + 1) is the size of one group (including the rabbit itself)
            // (count / group size) rounded up gives how many such groups are needed
            // Then we multiply by group size to get total rabbits needed for those groups
            total += Math.ceil((double)count / (answer + 1)) * (answer + 1);
        }

        return total;
    }
}
