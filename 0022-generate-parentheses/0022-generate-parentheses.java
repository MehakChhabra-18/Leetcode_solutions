class Solution {
    public void solve(int n,int open,int close,ArrayList<String> list,String ans)
    {
        if(ans.length()==2*n)
        {
            list.add(ans);
            return;
        }

        if(open<n)
        {
            solve(n,open+1,close,list,ans+"(");
        }
        if(close<open)
        {
            solve(n,open,close+1,list,ans+")");
        }
    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list=new ArrayList<>();
        solve(n,0,0,list,"");
        return list;
    }
}