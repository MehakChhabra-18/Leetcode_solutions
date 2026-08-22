class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0,product=1;
        int temp=n;
        while(temp>0)
        {
            int ld=temp%10;
            sum+=ld;
            product*=ld;
            temp=temp/10;
        }

        int total=sum+product;
        if(n%total==0)
        {
            return true;
        }

        return false;
    }
}