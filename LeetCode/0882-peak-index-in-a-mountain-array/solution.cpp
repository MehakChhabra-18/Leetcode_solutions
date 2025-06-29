class Solution {
public:
    int peakIndexInMountainArray(vector<int>& arr) {

        int max =arr[0];
        int max_index = 0;
        int size = arr.size();
        for(int i=0;i<size;i++)
        {
            if(arr[i] >max)
            {
                max =arr[i];
                max_index =i;
            }
        }
        return max_index;
        
    }
};
