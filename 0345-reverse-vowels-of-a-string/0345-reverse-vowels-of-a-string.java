class Solution {
    public String reverseVowels(String s) {
        
    char[] chars = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int start = 0;
        int end = s.length() - 1;
        
        while(start < end) {
            while(start < end && !vowels.contains(chars[start] + "")) {
                start++;
            }
            
            while(start < end && !vowels.contains(chars[end] + "")) {
                end--;
            }
            
            // Swap
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;
        }
        return new String(chars);
    }
}