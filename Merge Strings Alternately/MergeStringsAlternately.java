class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder newWord = new StringBuilder();
        int minimum = Math.min(word1.length(), word2.length());
        for(int i = 0; i < minimum; i++){
            newWord.append(word1.charAt(i));
            newWord.append(word2.charAt(i));
        }
        newWord.append(word1.substring(minimum));
        newWord.append(word2.substring(minimum));

        return newWord.toString();
    }
}