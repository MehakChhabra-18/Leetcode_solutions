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
    public List<Double> averageOfLevels(TreeNode root) {
        if(root==null) return new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        List<Double> ans=new ArrayList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            ArrayList<Double> temp=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode curr=q.poll();
                temp.add((double)curr.val);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }

            int n=temp.size();
            double sum=0;
            for(int i=0;i<n;i++)
            {
                sum+=temp.get(i);
            }

            double avg=sum/n;
            ans.add(avg);
        }

        return ans;
        
    }
}