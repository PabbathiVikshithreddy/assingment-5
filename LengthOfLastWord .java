public class LengthOfLastWord {
    public static void main(String[] args) {
        String input1 = "Hello World";
        String input2 = "  SomeSpacesHere ";

        System.out.println(lengthOfLastWord(input1)); // Output: 5
        System.out.println(lengthOfLastWord(input2)); // Output: 5
    }

    public static int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int length = 0;
        boolean wordStarted = false;

        // Traverse the string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);

            if (Character.isLetter(currentChar)) {
                // Non-space character found
                wordStarted = true;
                length++;
            } else if (wordStarted) {
                // Space encountered after the last word
                break;
            }
        }

        return length;
    }
}
