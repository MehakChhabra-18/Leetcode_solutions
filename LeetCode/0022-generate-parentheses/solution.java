class Solution {
    public static void solve(int n,int open,int close,String str,List<String> result)
    {
        if(str.length()==2*n)
        {
            result.add(str);
            return ;
        }
        if(open<n)
        {
            solve(n,open+1,close,str+"(",result);
        }
        if(close<open)
        {
            solve(n,open,close+1,str+")",result);
        }
    }
     
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        solve(n,0,0,"",result);
        return result;
    }
}
