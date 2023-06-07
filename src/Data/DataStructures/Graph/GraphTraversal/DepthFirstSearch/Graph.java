package Data.DataStructures.Graph.GraphTraversal.DepthFirstSearch;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

    private static int Vertices;

    private static LinkedList<Integer> list[];

    public Graph(int countV) {
        Vertices = countV;
        list = new LinkedList[countV];

        for (int i = 0; i < countV; i++) {
            list[i] = new LinkedList<>();
        }
    }

    public static void addNewEdge(int v, int w) {
        list[v].add(w);
    }

    public static void traversalDFS(int v, boolean visited[]) {
        //vertex has been visited and it's printing visited vertex
        visited[v] = true;
        System.out.print(v+" ");

        Iterator<Integer> i = list[v].listIterator();

        while(i.hasNext()) {
            int n = i.next();

            //use recursion if vertex hasn't been visited, otherwise do nothiing
            if(!visited[n]) {
                traversalDFS(n, visited);
            }
        }

    }

    //parameter is the lowest vertex
    public static void DFS(int v) {
        boolean visited[] = new boolean[Vertices];
        traversalDFS(v, visited);
    }

}
