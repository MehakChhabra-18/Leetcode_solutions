class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int totalGas=0;
        int totalCost=0;
        int totalFuel=0;
        int start=0;
        for(int i=0;i<n;i++)
        {
            totalGas+=gas[i];
            totalCost+=cost[i];
            totalFuel+=gas[i]-cost[i];
            if(totalFuel<0)
            {
                start=i+1;
                totalFuel=0;
            }
        }

        if(totalGas<totalCost)
        {
            return -1;
        }

        return start;
        
    }
}