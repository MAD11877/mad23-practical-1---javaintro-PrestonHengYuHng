import java.util.Scanner;
import java.util.*;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner scanner = new Scanner(System.in);
        
        // prompt the user for the number of integers to be entered
        int n = scanner.nextInt();
        
        // ask for the n integers
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // calculate the mode
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int number : numbers) {
            if (countMap.containsKey(number)) {
                countMap.put(number, countMap.get(number) + 1);
            } 
            else {
                countMap.put(number, 1);
            }
        }
        int maxCount = 0;
        int mode = 0;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int count = entry.getValue();
            if (count > maxCount) {
                maxCount = count;
                mode = entry.getKey();
            }
        }
        
        // print out the mode
        System.out.println(mode);
    
  }
}
