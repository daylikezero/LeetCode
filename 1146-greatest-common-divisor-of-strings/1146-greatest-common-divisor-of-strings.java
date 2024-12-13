class Solution {
    public String gcdOfStrings(String str1, String str2) {
         if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcdVal = getGcd(str1.length(), str2.length());
        return str2.substring(0, gcdVal); // 0~최대 공약수까지의 문자열
    }

    // 문자열의 최대공약수 구하기
    // 최대공약수는 각 문자열의 접두사여야 하므로 모든 접두사를 시도
    // 접두사를 구하는 방법 : 유클리드 호제법
    // 1. 큰 수(num1) 에서 작은 수(num2)를 나눈다.
    // 2. 나머지(num1 % num2)가 0이 아니라면 나머지와 작은 수(num2)로 1번부터 다시 시작
    // 3. 1~2의 과정을 반복해서 나머지가 0 이라면 그 수가 최대 공약수
    public static int getGcd(int maxLength, int minLength) {
        if (minLength == 0) return maxLength;
        else return getGcd(minLength, maxLength % minLength);
    }
}