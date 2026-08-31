class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0;
        int digits = String.valueOf(n).length();
        while (n > 0) {
            int ld = n % 10;

            if (digits % 2 == 0)
                sum -= ld;
            else
                sum += ld;

            n = n / 10;
            digits--;
        }

        return sum;
    }
}