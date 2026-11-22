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
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        return build(preorder,postorder,0,preorder.length-1,0,postorder.length-1);
    }

    public TreeNode build(int[] preorder,int[] postorder,int preStart,int preEnd,int postStart,int postEnd)
    {
        if(preStart>preEnd) return null;
        int val=preorder[preStart];
        TreeNode root=new TreeNode(val);
        if(preStart==preEnd) return root;
        int leftRoot=preorder[preStart+1];
        int idx=postStart;
        while(postorder[idx]!=leftRoot)
        {
            idx++;
        }

        int leftSize=idx-postStart+1;
        root.left=build(preorder,postorder,preStart+1,preStart+leftSize,postStart,idx);
        root.right=build(preorder,postorder,preStart+leftSize+1,preEnd,idx+1,postEnd-1);
        return root;
    }
}