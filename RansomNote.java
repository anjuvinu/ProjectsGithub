public class RansomNote {
//leetcode 383
//Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
//Each letter in magazine can only be used once in ransomNote.

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] letterFrequency = new int[26];
       // Count the frequency of each letter in the magazine
        for(int i=0;i<magazine.length();i++){
                char currentChar = magazine.charAt(i);
                int charIndex = currentChar - 'a';
                letterFrequency[charIndex]++;

        }
//check if ransom Note can be constructed from Magazine
        for(int i=0;i<ransomNote.length();i++){
                char currentChar = ransomNote.charAt(i);
                int charIndex = currentChar - 'a';
                // Decrement the count for this letter and check if it goes negative
                letterFrequency[charIndex]--;
                if(letterFrequency[charIndex]<0){
                    return false;
                }

        }

        return true;
    }
}