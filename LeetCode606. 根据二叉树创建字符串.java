class Solution {
    public String tree2str(TreeNode t) {
        StringBuilder stringBuilder = new StringBuilder();
        doTree2str(t, stringBuilder);
        return stringBuilder.toString();
    }

    private void doTree2str(TreeNode t, StringBuilder stringBuilder) {
        if (t != null) {
            stringBuilder.append(t.val);
            if (t.left != null|| t.right!=null){
                stringBuilder.append('(');
                doTree2str(t.left, stringBuilder);
                stringBuilder.append(')');
                if (t.right!=null){
                    stringBuilder.append('(');
                    doTree2str(t.right, stringBuilder);
                    stringBuilder.append(')');
                }
            }
        }
    }
}