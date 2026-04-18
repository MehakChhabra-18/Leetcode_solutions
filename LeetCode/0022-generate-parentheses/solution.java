class Solution {
    public static void generate(int n,int open,int close,List<String> res,String ans)
    {
        if(ans.length()==2*n)
        {
            res.add(ans);
            return;
        }
         
        if(open<n)
        {
             generate(n,open+1,close,res,ans+"(");
        }
        if(close<open)
        {
            generate(n,open,close+1,res,ans+")");
        }

    }
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        generate(n,0,0,res,"");
        return res;
    }
}
