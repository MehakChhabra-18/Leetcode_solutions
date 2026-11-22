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

 //key idea- inorder traversal store it in a arraylist and then reconstruct bst
class Solution {
    ArrayList<Integer> list=new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        inorder(root,list);
        return constructBST(0,list.size()-1);
    }

    public TreeNode constructBST(int left,int right)
    {
        if(left>right) return null;
        int mid=(left)+(right-left)/2;
        TreeNode root=new TreeNode(list.get(mid));
        root.left=constructBST(left,mid-1);
        root.right=constructBST(mid+1,right);
        return root;
    }

    public void inorder(TreeNode root,ArrayList<Integer> list)
    {
        if(root==null) return;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
}