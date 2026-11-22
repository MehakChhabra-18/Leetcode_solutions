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
        ArrayList<Integer> ans=new ArrayList<>();
        while(!q.isEmpty())
        {
            int size=q.size();
            int sum=0;
            for(int i=0;i<size;i++)
            {
                TreeNode curr=q.poll();
                sum+=curr.val;
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            ans.add(sum);
        }

        q.add(root);
        root.val=0;
        int level=0;
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode curr=q.poll();
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
                    curr.left.val=ans.get(level+1)-siblingSum;
                    q.add(curr.left);
                }
                if(curr.right!=null)
                {
                    curr.right.val=ans.get(level+1)-siblingSum;
                    q.add(curr.right);
                }
            }
            level++;
        }
        return root;
    }
    
}