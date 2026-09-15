class Solution {
    public int mirrorFrequency(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        //ArrayList<Integer> list=new ArrayList<>();
        int sum = 0;
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        char mirror;
        for (char c : map.keySet()) {
            if (Character.isLetter(c)) {
                mirror = (char) ('z' - (c - 'a'));
            }

            else {
                mirror = (char) ('9' - (c - '0'));
            }
            if (!map.containsKey(mirror)) {
                sum += map.get(c);
            } else {
                sum += Math.abs(map.get(c) - map.get(mirror));
                map.put(mirror, 0);
                map.put(c, 0);
            }
           
        }

        // int sum=0;
        // for(int i=0;i<list.size();i++)
        // {
        //     sum+=list.get(i);
        // }

        return sum;

    }
}