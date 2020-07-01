public class LevelCount
{

    public int count(TreeNode t, int level){

        if(t ==null|| level<0)
        {
            return 0;
        }
        else if(level == 0)
        {
            return 1;
        }
        return count(t.right, level-1) + count(t.left, level -1);

    }
}
