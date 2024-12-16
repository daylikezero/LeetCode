class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int greatestCandies = 0;
        for (int j : candies) {
            if (j > greatestCandies) {
                greatestCandies = j;
            }
        }
        for (int candy : candies) {
            if(candy + extraCandies >= greatestCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}