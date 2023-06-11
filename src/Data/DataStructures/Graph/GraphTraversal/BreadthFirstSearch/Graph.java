package Data.DataStructures.Graph.GraphTraversal.BreadthFirstSearch;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

    private static int vertices;
    private static LinkedList<Integer> list[];

    public Graph(int countV) {
        vertices = countV;
        list = new LinkedList[countV];

        for (int i = 0; i < countV; i++) {
            list[i] = new LinkedList<>();
        }
    }

    public static void addNewEdge(int v, int w) {
        list[v].add(w);
    }

    public static void traversalBFS(int rNode) {
        boolean visitedNode[] = new boolean[vertices];
        LinkedList<Integer> list = new LinkedList<>();

        visitedNode[rNode] = true;
        list.add(rNode);

        //checks if list isn't empty
        while (list.size() != 0) {
            //poll() method retrieves and removes the head of the list
            rNode = list.poll();
            System.out.print(rNode + " ");

            Iterator<Integer> i = Graph.list[rNode].listIterator();

            while (i.hasNext()) {
                int n = i.next();

                if(!visitedNode[n]) {
                    visitedNode[n] = true;
                    list.add(n);
                }
            }
        }
    }

}
