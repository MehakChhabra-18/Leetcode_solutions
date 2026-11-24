class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        {
            graph.add(new ArrayList<>());
        }

        int[] indegree=new int[numCourses];
        for(int[] edge:prerequisites)
        {
            int from=edge[0];
            int to=edge[1];
            graph.get(to).add(from);
            indegree[from]++;
        }

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
            }
        }

        int count=0;
        while(!q.isEmpty())
        {
            int node=q.poll();
            count++;
            for(int neighbour:graph.get(node))
            {
                indegree[neighbour]--;
                if(indegree[neighbour]==0)
                {
                    q.add(neighbour);
                }
            }
        }

        return count==numCourses;
    }
}