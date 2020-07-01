public class CirclesCountry {
    public int leastBorders(int[] x, int[] y, int[] r,
                            int x1, int y1, int x2, int y2) {

        int count = 0;
        for (int i =0; i < x.length; i++)
        {
            double d = Math.pow((x1 - x[i]), 2) + Math.pow((y1 - y[i]), 2);
            double dist = Math.pow((x2 - x[i]), 2) + Math.pow((y2 - y[i]), 2);
            if (d <= (r[i]*r[i]) ^ dist <= (r[i]*r[i])) {
                count++;
            }
        }
        return count;
    }
}
