class Solution {
    public String mergeAlternately(String word1, String word2) {
        String result = "";
        int word1Length = word1.length();
        int word2Length = word2.length();
        int max = Math.max(word1Length, word2Length);
        if (word1Length > word2Length) {
            for (int i = word2Length; i < word1Length; i++) {
                word2 += " ";
            }
        } else if (word1Length < word2Length) {
            for (int i = word1Length; i < word2Length; i++) {
                word1 += " ";
            }
        }
        for (int i = 0; i < max; i++) {
            result += word1.charAt(i);
            result += word2.charAt(i);
        }
        result = result.replaceAll(" ", "");
        return result;
    }
}