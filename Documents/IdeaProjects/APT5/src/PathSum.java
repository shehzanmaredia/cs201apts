public class PathSum {

    public int hasPath(int target, TreeNode tree)
    {

        if(tree == null) {
            if (target == 0) {
                return 1;

            } else {
                return 0;
            }
        }

        int leftpath = hasPath( target - tree.info, tree.left);
        int rightpath = hasPath(target - tree.info, tree.right);
        if(leftpath==1 || rightpath==1)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

}
