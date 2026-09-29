class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        ArrayList<Character> list=new ArrayList<>(map.keySet());
        Collections.sort(list,(e1,e2)->
        {
            return map.get(e2)-map.get(e1);
        });

        StringBuilder ans=new StringBuilder();
        for(char c:list)
        {
            for(int i=0;i<map.get(c);i++)
            {
                ans.append(c);
            }
        }

        return ans.toString();
    }
}