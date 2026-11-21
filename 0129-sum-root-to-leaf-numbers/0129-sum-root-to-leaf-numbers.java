/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumNumbers(TreeNode root) {
        List<String> ans=new ArrayList<>();
        dfs(root,"",ans);
        int sum=0;
        for(String s:ans)
        {
            sum+=Integer.valueOf(s);
        }

        return sum;
    }

    public void dfs(TreeNode root,String path,List<String> ans)
    {
        if(root==null) return;
        if(root.left==null && root.right==null)
        {
            ans.add(path+root.val);
            return;
        }

        dfs(root.left,path+root.val,ans);
        dfs(root.right,path+root.val,ans);
    }
}