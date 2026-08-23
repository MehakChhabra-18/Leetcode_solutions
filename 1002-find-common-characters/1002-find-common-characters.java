class Solution {
    public List<String> commonChars(String[] words) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:words[0].toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(int i=1;i<words.length;i++)
        {
            HashMap<Character,Integer> freq=new HashMap<>();
            for(char c:words[i].toCharArray())
            {
                freq.put(c,freq.getOrDefault(c,0)+1);
            }

            for(char ch:new ArrayList<>(map.keySet()))
            {
                if(freq.containsKey(ch))
                {
                    map.put(ch,Math.min(map.get(ch),freq.get(ch)));
                }
                else
                {
                    map.remove(ch);
                }
            }
        }

        List<String> ans = new ArrayList<>();

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            char ch = entry.getKey();
            int count = entry.getValue();

            while (count-- > 0) {
                ans.add(String.valueOf(ch));
            }
        }

        return ans;
        
    }
}