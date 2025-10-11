class Solution {
    public boolean isHappy(int n) {
        if (n == 1 || n == 7) return true;  // 1 & 7 are the only single-digit happy numbers
        if (n < 10) return false;           // any other single-digit number is not happy
        
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return isHappy(sum);  // check again with the new sum
    }
}

