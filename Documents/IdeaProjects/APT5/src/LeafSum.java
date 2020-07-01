public class LeafSum {

    public int sum(TreeNode t) {
        // Base Case: If node is null, return 0
        if (t == null) {
            return 0;
        }
        // Base Case: if left, right branches are null (node is a leaf), return value of node
        if (t.left == null && t.right == null) {
            return t.info;
        }

        return sum(t.left) + sum(t.right); // Recursively call left and right branches
    }
}