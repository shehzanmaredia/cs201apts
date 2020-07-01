
public class HeightLabel {
    public TreeNode rewire(TreeNode t) {
        if (t == null) { return null; }
        int a = calculateH(t);
        t.info = a;
        if (t.left != null || t.right != null){
            rewire(t.left);
            rewire(t.right);
        }
        return t;
    }

    private int calculateH(TreeNode t)
    {
        if(t==null) { return 0;
        }
        return 1 + Math.max(calculateH(t.left),calculateH(t.right));
    }
}