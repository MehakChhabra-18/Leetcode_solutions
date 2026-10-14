class MedianFinder {
    ArrayList<Integer> list;
    public MedianFinder() {
       list=new ArrayList<>();
    }
    
    public void addNum(int num) {
        int i=0;
        if(list.size()==0)
        {
            list.add(num);
        }

        else
        {
            while(i<list.size() && list.get(i)<num)
            {
                i++;
            }

            list.add(i,num);
        }
    }
    
    public double findMedian() {
       if(list.size()%2==1)
       {
            return (double)list.get(list.size()/2);
       }

           return (double)(list.get(list.size()/2-1)+list.get(list.size()/2))/2;
       
    
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */