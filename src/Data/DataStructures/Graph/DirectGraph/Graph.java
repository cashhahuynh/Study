package Data.DataStructures.Graph.DirectGraph;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    List <List<Integer>> list = new ArrayList<>();

    //constructor makes graph
    public Graph(List<Edge> edges) {

        int n = 0;

        //will use max as iterator variable for "for" loop
        for (Edge e : edges) {
            n = Integer.max(n, Integer.max(e.s, e.d));
        }

        //reserves space for list
        for (int i = 0; i <= n; i++) {
            list.add(i, new ArrayList<>());
        }

        //adds node to graph
        for (Edge current : edges) {
            list.get(current.s).add(current.d);
        }

    }

    public static void showGraph(Graph graph) {

        int s = 0;
        int n = graph.list.size();

        while (s < n) {
            for (int d : graph.list.get(s)) {
                System.out.printf("List for graph with source %d is: ", s);
                System.out.println(s + " ━> " + d + "\n");
            }
            s++;
        }

    }

}
