class Solution {
    public boolean isPrime(int n)
    {
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0) return false;
        }

        return true;
    }
    public int sumOfPrimesInRange(int n) {
        int temp=n;
        int reverse=0;
        while(n>0)
        {
            int ld=n%10;
            reverse=reverse*10+ld;
            n=n/10;
        }

        int sum=0;
        for(int i=Math.min(temp,reverse);i<=Math.max(temp,reverse);i++)
        {
            if(isPrime(i)) sum+=i;
        }

        return sum;
    }
}