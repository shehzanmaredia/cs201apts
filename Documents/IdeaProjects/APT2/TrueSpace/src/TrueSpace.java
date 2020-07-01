/*public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
        // fill in code here
        long total = 1;
        long cluster = (long)clusterSize;
        for (int x : sizes)
        {
            if (x!=0)
            {
                int x1 = (int)Math.ceil(x%clusterSize);
                long diff = (long)x/cluster;
                long diff1 = (long)x1 + diff;
                total += (total * (long)diff1);
            }
        }
        return total;
    }
}
*/

public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
        long totalSize = 0;
        long totalCount = 0;

        for (int size : sizes) {
            if (size == 0) {
                continue;
            }

            if (size == clusterSize) {
                totalCount++;
            }
            if (size % clusterSize != 0) {
                totalCount++;
            }
            if (size > clusterSize) {
                int divisions = size / clusterSize;
                totalCount = totalCount + divisions;
            }
        }
        totalSize = totalCount * clusterSize;
        return totalSize;
    }
}