class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }

        boolean result = false;
        if (s.val == t.val) {
            result = isSameTree(s, t);
        }
        if (!result) {
            result = isSubtree(s.left, t);
        }
        if (!result) {
            result = isSubtree(s.right, t);
        }
        return result;
    }


}