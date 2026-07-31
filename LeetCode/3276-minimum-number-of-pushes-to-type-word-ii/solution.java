class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer> map=new HashMap<>();
        int totalCost=0;
        for(char c:word.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        ArrayList<Integer> list=new ArrayList<>();
        for(int f:map.values())
        {
            list.add(f);
        }

        Collections.sort(list,Collections.reverseOrder());

        for(int i=0;i<list.size();i++)
        {
            totalCost+=list.get(i)*(i/8+1);
        }

        return totalCost;
        
    }
}
