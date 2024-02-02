import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String input1 = "XIV";
        String input2 = "XX";

        System.out.println(romanToInt(input1)); // Output: 14
        System.out.println(romanToInt(input2)); // Output: 20
    }

    public static int romanToInt(String A) {
        if (A == null || A.isEmpty()) {
            return 0;
        }

        // Create a map for Roman numerals and their corresponding values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        // Traverse the Roman numeral string from right to left
        for (int i = A.length() - 1; i >= 0; i--) {
            char currentChar = A.charAt(i);
            int currentValue = romanMap.get(currentChar);

            if (currentValue < prevValue) {
                // If the current value is less than the previous value, subtract it
                result -= currentValue;
            } else {
                // Otherwise, add it to the result
                result += currentValue;
            }

            // Update the previous value for the next iteration
            prevValue = currentValue;
        }

        return result;
    }
}

