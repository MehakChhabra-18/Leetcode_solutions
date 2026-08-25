class Solution {
    public int maxPoints(int[][] points) {
        if(points.length<=2) return points.length;
        int n=points.length;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            HashMap<Double,Integer> map=new HashMap<>();
            for(int j=i+1;j<n;j++)
            {
                int dx=points[j][0]-points[i][0];
                int dy=points[j][1]-points[i][1];
                double slope;
                if (dy == 0) slope = 0.0;
                else if(dx==0) slope=Double.POSITIVE_INFINITY;
                else slope=(double)dy/dx;
                map.put(slope,map.getOrDefault(slope,0)+1);
                ans = Math.max(ans,map.get(slope) + 1);
            }
        }
        return ans;
    }
}