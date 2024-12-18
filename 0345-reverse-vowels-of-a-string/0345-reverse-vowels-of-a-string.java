class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        StringBuffer reverse = new StringBuffer(s).reverse();
        StringBuffer reverseVowels = new StringBuffer();
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < reverse.length(); i++) {
            if(vowels.contains(String.valueOf(reverse.charAt(i)))) {
                reverseVowels.append(reverse.charAt(i));
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if(vowels.contains(String.valueOf(s.charAt(i)))) {
                result.append(reverseVowels.charAt(0));
                reverseVowels.deleteCharAt(0);
            } else {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}