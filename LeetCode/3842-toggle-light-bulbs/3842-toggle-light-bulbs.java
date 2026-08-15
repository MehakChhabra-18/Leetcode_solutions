class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        HashSet<Integer> set=new HashSet<>();
        for(int x:bulbs)
        {
            if(set.contains(x))
            {
                set.remove(x);
            }
            else
            {
                set.add(x);
            }
        }

        ArrayList<Integer> list=new ArrayList<>();
        for(int x:set)
        {
            list.add(x);
        }
        
        Collections.sort(list);
        return list;
    }
}