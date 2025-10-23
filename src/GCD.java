class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // Check if concatenated strings are equal or not, if not return ""
        if (!(str1 + str2).equals(str2 + str1))
            return "";
        // If strings are equal than return the
        // substring from 0 to gcd of size(str1), size(str2)
        int gcd = gcd(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }

    //euclidian algorithm with recursion
    //The Euclidean algorithm is based on the principle that
    // the GCD of two numbers a and b is the same as the GCD of b and a % b
    // (the remainder when a is divided by b). This process
    // is repeated until the remainder is zero, at which point the divisor is the GCD.
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);

    }
}