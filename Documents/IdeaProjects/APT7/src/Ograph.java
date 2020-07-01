import java.util.*;

public class Ograph {
    HashMap<String, HashSet<String>> map = new HashMap<String, HashSet<String>>();
    public int[] components(String[] data) {
        // write code here
        ArrayList<Integer> ret = new ArrayList<Integer>();
        //creates map

        for(int q = 0; q<data.length; q++)
        {
            HashSet<String> temp1 = new HashSet<String>();
            String[] y = data[q].split(" ");
            for (String a : y)
            {
                temp1.add(a);
            }
            map.put(Integer.toString(q), temp1);
        }

        Queue<String> visit = new LinkedList<>();
        int b = 0;
        for(String x : data)
        {
            visit.add(Integer.toString(b));
            b++;
        }
        while(visit.size()!=0)
        {
                HashSet temp = bfs(visit.remove());
                ret.add(temp.size());
                visit.removeAll(temp);
        }




        Collections.sort(ret);
        //put into int array
        int[] ret1 = new int[ret.size()];
        for(int i = 0; i<ret.size(); i++)
        {
            ret1[i] = ret.get(i);
        }
        return ret1;
    }
    private HashSet bfs(String x)
    {
        HashSet<String> visited = new HashSet<String>();
        Stack<String> pq = new Stack<String>();
        visited.add(x);
        pq.push(x);
        while(pq.size()>0)
        {
            String value = pq.pop();
            for(String cont : map.get(value))
            {
                if(!visited.contains(cont))
                {
                    visited.add(cont);
                    pq.push(cont);
                }
            }
        }
        return visited;
    }
}