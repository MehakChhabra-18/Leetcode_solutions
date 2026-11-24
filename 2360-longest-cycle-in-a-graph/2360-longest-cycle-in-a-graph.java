class Solution {
    public int longestCycle(int[] edges) {
        int n=edges.length;
        boolean[] visited=new boolean[n];
        int ans=-1;
        for(int i=0;i<n;i++)
        {
            if(visited[i]) continue;
            ArrayList<Integer> path=new ArrayList<>();
            int curr=i;
            while(curr!=-1 && !visited[curr])
            {
                visited[curr]=true;
                path.add(curr);
                curr=edges[curr];
            }

            int index=path.indexOf(curr);
            if(index!=-1)
            {
                int length=0;
                for(int j=index;j<path.size();j++)
                {
                    length+=1;
                }

                ans=Math.max(ans,length);
            }
        }

        return ans;
    }
}