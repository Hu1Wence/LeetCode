import java.util.Scanner;

public class Test1 {
    static class TreeNode {
        public char val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(char val) {
            this.val = val;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String line = scanner.next();
            TreeNode root = treeBuild(line);
            inOrder(root);
            System.out.println();
        }
    }

    static int index = 0;
    public static TreeNode treeBuild(String line) {
        index = 0;
        return creatPreTree(line);
    }

    public static TreeNode creatPreTree(String line) {
        char c = line.charAt(index);
        if (c == '#') {
            return null;
        }

        TreeNode root = new TreeNode(c);
        index++;
        root.left = creatPreTree(line);
        index++;
        root.right = creatPreTree(line);
        return root;
    }

    public static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);
    }
}
