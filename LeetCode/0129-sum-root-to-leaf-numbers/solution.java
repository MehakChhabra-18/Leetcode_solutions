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
        ArrayList<Integer> list=new ArrayList<>();
        int num=0;
        sum(root,num,list);
        int size=list.size();
        int sum=0;
        for(int i=0;i<size;i++)
        {
            sum+=list.get(i);
        }
        return sum;
    }

    public void sum(TreeNode root,int num,ArrayList<Integer> list)
    {
        if(root==null) return;
        if(root.left==null && root.right==null)
        {
            list.add(num*10+root.val);
            return;
        }
        sum(root.left,num*10+root.val,list);
        sum(root.right,num*10+root.val,list);
    }
}
