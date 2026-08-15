class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> pq=new PriorityQueue<>((a,b)-> {
            if(a.length()!=b.length())
            {
                return b.length()-a.length();
            }

            return b.compareTo(a);
        });
        for(String s:nums)
        {
            pq.add(s);
        }

        for(int i=1;i<k;i++)
        {
            pq.poll();
        }

        return pq.peek();
    }
}