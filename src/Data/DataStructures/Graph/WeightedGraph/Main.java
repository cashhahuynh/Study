package Data.DataStructures.Graph.WeightedGraph;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String [] arg) {

        List<Edge> edges = Arrays.asList(new Edge(1,4,3), new Edge(4,2,5), new Edge(2,5,10), new Edge(5,1,6), new Edge(3,2,9), new Edge(1,5,1), new Edge(3,5,2));

        Graph graph = new Graph(edges);

        Graph.printGraph(graph);

    }

}
