import java.util.*;

public class Internet {
    int count = 0;
    Map<String, HashSet<String>> myGraph = new HashMap<>();
    public Set<String> breadth(String start, String avoid){
        Set<String> visited = new TreeSet<>();
        Queue<String> qu = new LinkedList<>();
        visited.add(start);
        qu.add(start);
        while (qu.size() > 0){
            String v = qu.remove();
            for (String adj : myGraph.get(v)){ /
                if (!adj.equals(avoid) && !visited.contains(adj)){
                    visited.add(adj);
                    qu.add(adj);
                }
            }
        }
        return visited;
    }
    public int articulationPoints(String[] routers) {
        for (int k = 0; k < routers.length; k++) {
            String vertex = "" + k;
            myGraph.put(vertex, new HashSet<String>());
            String adj = routers[k];
            String[] arr = adj.split(" ");
            for (String v : arr) {
                myGraph.get(vertex).add(v);
            }
        }
        for (int k = 0; k < routers.length; k ++){
            String vertex = "" + k;
            String start = "0";
            if (k == 0) start = "1";
            Set<String> set = breadth(start, vertex);
            if (set.size() != routers.length - 1) count ++;
        }
        return count;
    }
}