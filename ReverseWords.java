public class ReverseWords {
    public static void main(String[] args) {
        String input1 = "the sky is blue";
        String input2 = "this is ib";

        System.out.println(reverseWords(input1)); // Output: "blue is sky the"
        System.out.println(reverseWords(input2)); // Output: "ib is this"
    }

    public static String reverseWords(String A) {
        if (A == null || A.isEmpty()) {
            return A;
        }

        // Split the input string by spaces
        String[] words = A.split("\\s+");

        // Reverse the array of words
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" "); // Add a space between words
            }
        }

        return reversed.toString();
    }
}
