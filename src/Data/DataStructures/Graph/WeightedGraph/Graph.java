package Data.DataStructures.Graph.WeightedGraph;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    List<List<Node>> list = new ArrayList<>();

    public Graph(List<Edge> edges) {

        int n = 0;

        for (Edge e : edges) {
            n = Integer.max(n, Integer.max(e.s, e.d));
        }

        for (int i = 0; i <= n; i++) {
            list.add(i, new ArrayList<>());
        }

        for (Edge e : edges) {
            //adds a node object with destination and weight
            list.get(e.s).add(new Node(e.d, e.w));
        }

    }

    public static void printGraph(Graph graph) {

        int src = 0;
        int n = graph.list.size();

        while (src < n) {

            System.out.printf("List for the graph with source %d is: ", src);
            for (Node edge : graph.list.get(src)) {
                //formatting reads edge (node object) as a string which invokes overridden toString method
                System.out.printf("%d --> %s", src, edge);
            }
            System.out.println();
            src++;
        }

    }

}
