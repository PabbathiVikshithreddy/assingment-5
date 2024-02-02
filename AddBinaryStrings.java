public class AddBinaryStrings {
    public static void main(String[] args) {
        String a = "100";
        String b = "11";

        String result = addBinary(a, b);
        System.out.println(result); // Output: "111"
    }

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;

        // Traverse the binary strings from right to left
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0 || carry > 0; i--, j--) {
            int digitA = (i >= 0) ? Character.getNumericValue(a.charAt(i)) : 0;
            int digitB = (j >= 0) ? Character.getNumericValue(b.charAt(j)) : 0;

            int sum = digitA + digitB + carry;
            result.insert(0, sum % 2); // Insert the current bit at the beginning
            carry = sum / 2; // Update carry for the next iteration
        }

        return result.toString();
    }
}
