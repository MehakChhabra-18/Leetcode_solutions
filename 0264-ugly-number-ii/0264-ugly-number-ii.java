class Solution {
    public int nthUglyNumber(int n) {

        int[] ugly = new int[n];

        ugly[0] = 1;

        int p2 = 0;
        int p3 = 0;
        int p5 = 0;

        for(int i = 1; i < n; i++) {

            int x = ugly[p2] * 2;
            int y = ugly[p3] * 3;
            int z = ugly[p5] * 5;

            int min = Math.min(x, Math.min(y, z));

            ugly[i] = min;

            if(min == x) {
                p2++;
            }

            if(min == y) {
                p3++;
            }

            if(min == z) {
                p5++;
            }
        }

        return ugly[n - 1];
    }
}