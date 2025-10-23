//Given an array of integers arr, return true if the number
// of occurrences of each value in the array is unique or false otherwise.
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> freq = new HashMap<>();
        for (int x: arr) {
            freq.put(x, freq.getOrDefault(x,0)+1);
        }
        Set<Integer> seen = new HashSet<>(freq.values());
        return seen.size() == freq.size();

    }