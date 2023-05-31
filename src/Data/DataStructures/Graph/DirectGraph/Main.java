package Data.DataStructures.Graph.DirectGraph;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main (String[] arg) {

        //list of edges
        List<Edge> edges = Arrays.asList(new Edge(0,1), new Edge(1, 2), new Edge(2,4),new Edge(4, 1), new Edge(3, 2), new Edge(2, 5), new Edge(3, 4), new Edge(5, 4), new Edge(1, 1));

        //graph object that takes list of edges as parameter
        Graph graph = new Graph(edges);

        Graph.showGraph(graph);

    }

}
