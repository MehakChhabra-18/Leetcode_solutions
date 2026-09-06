class Solution {
    public int addDigits(int num) {
        int temp=num;
        int sum=0;
        while(temp>0)
        {
            int ld=temp%10;
            sum+=ld;
            temp/=10;
        }

        if(sum<10) return sum;
        return addDigits(sum);

    }
}