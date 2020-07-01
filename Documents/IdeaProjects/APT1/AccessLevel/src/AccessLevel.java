public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
        String right = "";
        for (int index : rights)
        {
            if (index >= minPermission) {
                right += "A";
            }
            else
            {
                right += "D";
            }
        }
        return right;

    }
}


