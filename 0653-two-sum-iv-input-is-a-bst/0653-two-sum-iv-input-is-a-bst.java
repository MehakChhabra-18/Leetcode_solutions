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
    public void inorder(TreeNode root,List<Integer> ans)
    {
        if(root==null) return;
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
    }
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> ans=new ArrayList<>();
        inorder(root,ans);
        int i=0,j=ans.size()-1;
        while(i<j)
        {
            if(ans.get(i)+ans.get(j)==k) return true;
            if(ans.get(i)+ans.get(j)>k) j--;
            else i++;
        }

        return false;
    }
}