class Solution {
    public int maxPoints(int[][] points) {
        if(points.length<=2) return points.length;
        int ans=0;
        int n=points.length;
        for(int i=0;i<n;i++)
        {
            HashMap<Double,Integer> map=new HashMap<>();
            int duplicate=0;
            int currentMax=0;
            for(int j=i+1;j<n;j++)
            {
                int dx=points[j][0]-points[i][0];
                int dy=points[j][1]-points[i][1];
                if(dx==0 && dy==0) duplicate++;
                double slope;
                if(dy==0) slope=0.0;
                else if(dx==0) slope=Double.MAX_VALUE;
                else slope=(double)dy/dx;
                map.put(slope,map.getOrDefault(slope,0)+1);
            }

            for(int count:map.values())
            {
                currentMax=Math.max(currentMax,count);
            }

            ans=Math.max(ans,currentMax+duplicate+1);
        }
        return ans;
    }
}