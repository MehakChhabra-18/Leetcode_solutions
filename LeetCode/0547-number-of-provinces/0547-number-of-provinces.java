class Solution {
    class DSU {
        private int[] parent;
        private int[] size;

        DSU(int n) {
            parent = new int[n];
            size = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }

        int findParent(int a) {
            if (parent[a] == a) {
                return a;
            }

            return parent[a] = findParent(parent[a]);
        }

        int union(int a, int b) {
            int parentA = findParent(a);
            int parentB = findParent(b);

            if (parentA == parentB)
                return 0;

            int sizeA = size[parentA];
            int sizeB = size[parentB];

            if (sizeA > sizeB) 
            {
                parent[parentB] = parentA;
                size[parentA] += sizeB;
            } 
            
            else 
            {
                parent[parentA] = parentB;
                size[parentB] += sizeA;
            }

            return 1;
        }

    }

    public int findCircleNum(int[][] isConnected) {
        int provinces=isConnected.length;
        int n=isConnected.length;
        DSU obj = new DSU(n);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(isConnected[i][j]==1)
                {
                    if(obj.union(i,j)==1)
                    {
                        provinces--;
                    }
                }
            }
        }

        return provinces;
    }
}