import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FindPath {
    ArrayList<String> paths = new ArrayList<String>();
    public String path(TreeNode root, int target) {
        // write code here
        String x = "";
        allPaths(root, target, x);
        Collections.sort(paths);
        Collections.sort(paths, Comparator.comparing(String::length));
        if(paths.size()==0)
        {
            return "nopath";
        }
        return paths.get(0);
    }
    private void allPaths(TreeNode root, int target, String s)
    {
       if(root == null)
       {
           return;
       }
        if(root.info==target)
        {
            paths.add(s);
        }
        allPaths(root.left, target, s+"0");
        allPaths(root.right, target, s+"1");
    }
}