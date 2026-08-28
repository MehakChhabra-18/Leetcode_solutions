class Solution {
    public int secondHighest(String s) {
        HashSet<Integer> set=new HashSet<>();
        for(char c:s.toCharArray())
        {
            if(Character.isDigit(c)) 
            {
                set.add(c-'0');
            }
        }

        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        if(list.size() < 2) return -1;
        return list.get(list.size() - 2);
    }
}