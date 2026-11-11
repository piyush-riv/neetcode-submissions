class Solution {
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }
    
    private int height(TreeNode node) {
        if (node == null) return 0;
        
        int left = height(node.left);
        if (left == -1) return -1;          // left subtree unbalanced
        
        int right = height(node.right);
        if (right == -1) return -1;         // right subtree unbalanced
        
        if (Math.abs(left - right) > 1) {
            return -1;                      // current node breaks balance
        }
        
        return 1 + Math.max(left, right);   // return actual height
    }
}