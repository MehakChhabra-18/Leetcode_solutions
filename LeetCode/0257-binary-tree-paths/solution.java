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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> ans=new ArrayList<>();
        treePath(root,"",ans);
        return ans;
    }

    public void treePath(TreeNode root,String path,ArrayList<String> ans)
    {
        if(root==null) return;
        if(root.left==null && root.right==null)
        {
            ans.add(path+root.val);
            return;
        }

        treePath(root.left,path+root.val+"->",ans);
        treePath(root.right,path+root.val+"->",ans);
    
    }
}
