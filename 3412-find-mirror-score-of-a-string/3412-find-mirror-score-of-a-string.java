class Solution {
    public long calculateScore(String s) {
        long score=0;
        HashMap<Character,Stack<Integer>> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            char mirror=(char)('z'-(ch-'a'));
            if(map.containsKey(mirror) && !map.get(mirror).isEmpty())
            {
                int j=map.get(mirror).pop();
                score+=i-j;
            }
            else
            {
                if(!map.containsKey(ch))
                {
                    map.put(ch,new Stack<>());
                }
                map.get(ch).push(i);
            }
            
        }
        return score;
    }
}