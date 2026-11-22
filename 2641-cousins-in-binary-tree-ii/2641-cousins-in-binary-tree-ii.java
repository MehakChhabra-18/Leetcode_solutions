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
    public TreeNode replaceValueInTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        root.val=0;
        while(!q.isEmpty())
        {
            int size=q.size();
            List<TreeNode>list=new ArrayList<>();
            int total=0;
            for(int i=0;i<size;i++)
            {
                TreeNode curr=q.poll();
                list.add(curr);
                if(curr.left!=null)
                {
                    total+=curr.left.val;
                }
                if(curr.right!=null)
                {
                    total+=curr.right.val;
                }
            }

            for(TreeNode curr:list)
            {
                int siblingSum=0;
                if(curr.left!=null)
                {
                    siblingSum+=curr.left.val;
                }
                if(curr.right!=null)
                {
                    siblingSum+=curr.right.val;
                }

                if(curr.left!=null)
                {
                    curr.left.val=total-siblingSum;
                    q.add(curr.left);
                }
                if(curr.right!=null)
                {
                    curr.right.val=total-siblingSum;
                    q.add(curr.right);
                }
            }
        }
           return root;
}
}