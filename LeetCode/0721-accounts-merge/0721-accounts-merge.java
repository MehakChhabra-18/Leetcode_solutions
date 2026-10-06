class Solution {
    class DSU {
        int[] parent;
        int[] size;

        DSU(int n) {
            parent = new int[n];
            size = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }

        public void union(int a, int b) {
            int parentA = findParent(a);
            int parentB = findParent(b);
            if (parentA == parentB) {
                return;
            }
            if (size[parentA] >= size[parentB]) {
                parent[parentB] = parentA;
                size[parentA] += size[parentB];
            } else {
                parent[parentA] = parentB;
                size[parentB] += size[parentA];
            }
        }

        public int findParent(int a) {
            if (parent[a] == a) {
                return a;
            }

            return parent[a] = findParent(parent[a]);
        }
    }

    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        int n = accounts.size();
        DSU obj = new DSU(n);
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            List<String> account = accounts.get(i);
            for (int j = 1; j < account.size(); j++) {
                String email = account.get(j);
                if (map.containsKey(email)) {
                    obj.union(i, map.get(email));
                } else {
                    map.put(email, i);
                }
            }
        }

        HashMap<Integer, ArrayList<String>> ans = new HashMap<>();
        for (String email : map.keySet()) {
            int account = map.get(email);
            int root = obj.findParent(account);
            ans.putIfAbsent(root, new ArrayList<>());
            ans.get(root).add(email);
        }

        List<List<String>> finalAns = new ArrayList<>();

        for (int root : ans.keySet()) {
            List<String> emails = ans.get(root);
            Collections.sort(emails);
            List<String> account = new ArrayList<>();
            account.add(accounts.get(root).get(0));
            account.addAll(emails);
            finalAns.add(account);
        }

        return finalAns;

    }
}