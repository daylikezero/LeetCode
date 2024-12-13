class Solution {
    public String mergeAlternately(String word1, String word2) {
        // 1. String -> StringBuffer
        StringBuffer result = new StringBuffer();
        int word1Length = word1.length();
        int word2Length = word2.length();
        int max = Math.max(word1Length, word2Length);
        // 2. word 의 길이와 현재 index 비교
        for (int i = 0; i < max; i++) {
            if (i < word1Length) {
                result.append(word1.charAt(i));
            }
            if (i < word2Length) {
                result.append(word2.charAt(i));
            }
        }
        return result.toString();
    }
}