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
static int depthX,depthY,parentX,parentY;
    public boolean isCousins(TreeNode root, int x, int y) {
        
        dfs(root,x,y,0);
        //
        return (depthX == depthY) && (parentX != parentY);
    }
    private void dfs(TreeNode root, int x,int y,int depth){
        if(root == null) return;
        //did we find x or y?
        if(root.val == x){
            depthX = depth;
        }
        else if(root.val == y){
            depthY = depth;
        }
        //did we find parent of x or y?
        if(root.left != null){
            if(root.left.val == x) parentX = root.val;
            else if(root.left.val == y) parentY = root.val;
        }
        if(root.right != null){
            if(root.right.val == x) parentX = root.val;
            else if(root.right.val == y) parentY = root.val;
        }
        dfs(root.left,x,y,depth+1);
        dfs(root.right,x,y,depth+1);
    }
}
