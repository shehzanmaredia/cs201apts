import java.util.ArrayList;

public class MaxLeaves {
    ArrayList<Integer> fin = new ArrayList<Integer>();

    public int[] gather(TreeNode tree) {
 int height1 = height(tree);
count(tree, height1-1);
        int[] ret = new int[fin.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = (int)fin.get(i);
        }
        return ret;
    }


   public void count(TreeNode tree, int coun)
   {
       if (tree == null)
       {
           return;
       }
       if (coun == 0 && tree.left == null && tree.right ==  null)
       {
           fin.add(tree.info);
       }

       count(tree.left, coun - 1);
       count(tree.right, coun - 1);

   }

    public int height(TreeNode tree) {
        if (tree == null) return 0;
        return 1 + Math.max(height(tree.left), height(tree.right));
    }

}


