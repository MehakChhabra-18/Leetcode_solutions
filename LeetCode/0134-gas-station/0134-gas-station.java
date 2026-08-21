class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int total_fuel = 0;
        int total_gas = 0;
        int total_cost = 0;
        for (int i=0;i<gas.length;i++){
            total_gas += gas[i];
            total_cost += cost[i];
            total_fuel += gas[i] - cost[i];
            if (total_fuel<0){
                start = i+1;
                total_fuel = 0;
            }
        }
        if (total_gas<total_cost){
            return -1;
        }

        return start;
        
    }
}