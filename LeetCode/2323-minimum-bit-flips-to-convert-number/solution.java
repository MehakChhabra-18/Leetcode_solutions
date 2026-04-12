class Solution {
    public int minBitFlips(int start, int goal) {
        return Long.bitCount(start^goal);
        
    }
}
