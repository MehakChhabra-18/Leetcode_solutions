class Solution {
    public int findMinFibonacciNumbers(int k) {
        int a=0,b=1;
        ArrayList<Integer> fib=new ArrayList<>();
        fib.add(a);
        fib.add(b);
        while(true)
        {
            int c=a+b;
            if(c>k) break;
            fib.add(c);
            a=b;
            b=c;
        }

        int count=0;
        for(int i=fib.size()-1;i>=0 && k>0;i--)
        {
            if(fib.get(i)<=k)
            {
                k-=fib.get(i);
                count++;
            }
        }

        return count;
        
    }
}