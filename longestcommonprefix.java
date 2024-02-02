public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] input1 = {"abcdefgh", "aefghijk", "abcefgh"};
        String[] input2 = {"abab", "ab", "abcd"};

        System.out.println(longestCommonPrefix(input1)); // Output: "a"
        System.out.println(longestCommonPrefix(input2)); // Output: "ab"
    }

    public static String longestCommonPrefix(String[] A) {
        if (A == null || A.length == 0) {
            return "";
        }

        // Take the first string as a reference
        String reference = A[0];
        int referenceLength = reference.length();

        // Iterate through each character of the reference string
        for (int i = 0; i < referenceLength; i++) {
            char currentChar = reference.charAt(i);

            // Check if the current character matches in all strings
            for (int j = 1; j < A.length; j++) {
                if (i >= A[j].length() || A[j].charAt(i) != currentChar) {
                    // Mismatch found, return the prefix up to this point
                    return reference.substring(0, i);
                }
            }
        }

        // All strings match completely, return the entire reference string
        return reference;
    }
}
