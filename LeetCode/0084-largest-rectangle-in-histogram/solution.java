class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int maxArea=0;
        int n=heights.length;
        for(int i=0;i<=n;i++)
        {
            int height=(i==n)?0:heights[i];
            while(!st.isEmpty() && height<heights[st.peek()])
            {
                int h1=heights[st.pop()];
                int width=st.isEmpty()?i:i-st.peek()-1;
                maxArea=Math.max(maxArea,h1*width);
            }
            st.push(i);
        }
        return maxArea;
        
    }
}
