class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for (int element : candies) {
            max = Integer.max(max, element);
        }
        for (int candy : candies) {
            if (candy + extraCandies >= max) result.add(true);
            else result.add(false);
        }
        return result;
    }
}