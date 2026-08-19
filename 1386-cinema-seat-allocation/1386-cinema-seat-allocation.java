class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer,Set<Integer>> map=new HashMap<>();
        for(int i=0;i<reservedSeats.length;i++)
        {
            map.putIfAbsent(reservedSeats[i][0],new HashSet<>());
            map.get(reservedSeats[i][0]).add(reservedSeats[i][1]);
        }

        int ans=(n-map.size())*2;
        for(Map.Entry<Integer,Set<Integer>> entry: map.entrySet())
        {
            Set<Integer> seats=entry.getValue();
            boolean left=true;
            boolean right=true;
            boolean mid=true;
            for(int i=2;i<=5;i++)
            {
                if(seats.contains(i))
                {
                    left=false;
                    break;
                }
            }

            for(int i=4;i<=7;i++)
            {
                if(seats.contains(i))
                {
                    mid=false;
                    break;
                }
            }

            for(int i=6;i<=9;i++)
            {
                if(seats.contains(i))
                {
                    right=false;
                    break;
                }
            }

            if(left && right) ans+=2;
            else if(left || right || mid) ans+=1;

        }

        return ans;
    }
}