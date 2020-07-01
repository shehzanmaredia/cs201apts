import java.util.*;

public class AllPaths {

    private ArrayList<String> pathList = new ArrayList<String>();

    public String[] paths(TreeNode t) {

        if (t != null)
        {

            if (t.left == null && t.right == null) {
                pathList.add(Integer.toString(t.info));
            }

            else {
                findPaths(t, "");



            }
        }


        Collections.sort(pathList);
        return pathList.toArray(new String[0]);
    }

    public void findPaths(TreeNode t, String s) {


        if (t.left == null && t.right == null) {
            pathList.add(s + Integer.toString(t.info));
        }

        if (t.left != null || t.right != null)
        {
            s = s + Integer.toString(t.info) + "->";
        }

        if (t.left != null)

            {
            findPaths(t.left, s);

        }
        if (t.right != null) {
            findPaths(t.right, s);

        }
    }
}