class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] str = s.split(" ");
        int start = 0;
        int end = str.length - 1;
        while (start < end) {
            String temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
        for (String string : str) {
            if(!string.isEmpty()){
                sb.append(string).append(" ");
            }
        }
        return sb.toString().trim();
    }
}