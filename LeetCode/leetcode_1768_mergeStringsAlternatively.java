package LeetCode;

public class leetcode_1768_mergeStringsAlternatively {
    public String mergeAlternately(String word1, String word2) {
        
        StringBuilder sb = new StringBuilder();
        int len1 = word1.length();
        int len2 = word2.length();
        int min = Math.min(len1, len2);

        // Alternate characters for the overlapping part
        for (int i = 0; i < min; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        // Append the rest of the longer string, if any
        if (len1 > len2) {
            sb.append(word1.substring(min));
        } else if (len2 > len1) {
            sb.append(word2.substring(min));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        leetcode_1768_mergeStringsAlternatively obj = new leetcode_1768_mergeStringsAlternatively();
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(obj.mergeAlternately(word1, word2)); // Expected: "apbqcr"

        word1 = "ab";
        word2 = "pqrs";
        System.out.println(obj.mergeAlternately(word1, word2)); // Expected: "apbqrs"

        word1 = "abcd";
        word2 = "pq";
        System.out.println(obj.mergeAlternately(word1, word2)); // Expected: "apbqcd"
    }
}