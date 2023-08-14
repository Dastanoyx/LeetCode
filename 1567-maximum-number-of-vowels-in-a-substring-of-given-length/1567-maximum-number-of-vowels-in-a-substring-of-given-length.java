class Solution {
    public int maxVowels(String s, int k) {
        
        int maxCount = 0;
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

       int count = 0;
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                count++;
            }
        }
        maxCount = count;

        for (int i = k; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i - k))) {
                count--;
            }
            if (vowels.contains(s.charAt(i))) {
                count++;
            }
            maxCount = Math.max(maxCount, count);
        }
        
        return maxCount;
    }
}