public class TreeTighten {
    public TreeNode tighten(TreeNode t)
    {
        if (t==null) return null;
        if(t.left==null && t.right==null)
        {
            return t;
        }
        if (t.left!= null&&t.right !=null)
        {
            t.left = tighten(t.left);
            t.right = tighten(t.right);
            return t;
        }
        if (t.left!= null)
        {
            t= tighten(t.left);
            return tighten(t);
        }
        if(t.right!= null)
        {

            t= tighten(t.right);
            return tighten(t);
        }
        t=null;
        return t;



    }
}
