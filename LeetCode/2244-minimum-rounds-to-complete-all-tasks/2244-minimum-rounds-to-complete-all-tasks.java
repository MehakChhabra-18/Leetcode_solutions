class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:tasks)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }

        int rounds=0;
        for(int task:map.values())
        {
            if(task==1) return -1;
            rounds+=task/3;
            if(task%3!=0) rounds++;
        }

        return rounds;
    }
}