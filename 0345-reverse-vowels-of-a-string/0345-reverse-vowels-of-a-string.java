class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        StringBuffer reverse = new StringBuffer(s).reverse();
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < reverse.length(); i++) {
            if(vowels.contains(String.valueOf(reverse.charAt(i)))) {
                result.append(reverse.charAt(i));
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if(vowels.contains(String.valueOf(s.charAt(i)))) {
                result.append(result.charAt(0));
                result.deleteCharAt(0);
            } else {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}