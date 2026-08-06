class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] candy = new int[num_people];
        int give = 1;

        while (candies > 0) {
            for (int i = 0; i < num_people && candies > 0; i++) {

                if (candies >= give) {
                    candy[i] += give;
                    candies -= give;
                } 
                else {
                    candy[i] += candies;
                    candies = 0;
                }

                give++;
            }
        }

        return candy;
    }
}