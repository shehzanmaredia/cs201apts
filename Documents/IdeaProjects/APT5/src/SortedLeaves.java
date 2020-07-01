import java.util.*;

public class SortedLeaves {



    public String[] values(TreeNode tree) {



        ArrayList<Integer> infos = intValues(tree);
        ArrayList<String> letters = new ArrayList<String>();

        Collections.sort(infos);
        for (int val : infos) {
                        char lett = (char) val;
            letters.add(Character.toString(lett));


        }

        return letters.toArray(new String[0]);
    }

    public ArrayList<Integer> intValues(TreeNode tree) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        if (tree == null) {


            return arr;

        }

        if (tree.left != null) {

            arr.addAll(intValues(tree.left));



        }
        if (tree.right != null) {
            arr.addAll(intValues(tree.right));



        }

        if (tree.left == null && tree.right == null) {
            arr.add(tree.info);



        }

        return arr;



    }
}