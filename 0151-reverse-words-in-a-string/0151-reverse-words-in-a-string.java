class Solution {
    public String reverseWords(String s) {

        List<String> words = Arrays.asList(s.trim().split("\\s+"));

        // Reverse the list of words
        Collections.reverse(words);

        // Join the words back together with a single space
        return String.join(" ", words);
    }
        
}