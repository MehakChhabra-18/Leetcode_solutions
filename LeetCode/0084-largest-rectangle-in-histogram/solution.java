class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int maxArea=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<=n;i++)
        {
            int height = (i==n)? 0 : heights[i];
            while(!st.isEmpty() && height<heights[st.peek()])
            {
                int ht= heights[st.pop()];
                int width=st.isEmpty()?i:i-st.peek()-1;
                maxArea=Math.max(maxArea,ht*width);
            }
            st.push(i);
        }
        return maxArea;

    }
}
