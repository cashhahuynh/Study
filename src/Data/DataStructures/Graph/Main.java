package Data.DataStructures.Graph;

public class Main {

    public static void main(String [] arg) {

        String cash = "Cash", jesus = "Jesus", cole = "Cole",
                zach = "Zach", keanu = "Keanu", dylan = "Dylan",
                becky = "Becky", jenny = "Jenny";

        Graph graph = new Graph();

        graph.addNewEdge(cash, cole, true);
        graph.addNewEdge(cash, jesus, true);

        graph.addNewEdge(becky, jenny, true);

        graph.addNewEdge(jesus, dylan, true);

        graph.addNewEdge(cole, jesus, true);
        graph.addNewEdge(cole, zach, true);

        //destination (jesus) is profiled to source (zach), and not vice versa b/c it's not bidirectional
        graph.addNewEdge(zach, jesus, false);
        graph.addNewEdge(zach, keanu, true);
        graph.addNewEdge(zach, dylan, true);

        graph.addNewEdge(dylan, keanu, true);
        graph.addNewEdge(dylan, jenny, true);

        System.out.println("List of the graph:\n" + graph.toString());
        graph.countVertices();
        graph.countEdges(true);

        graph.containsEdge(jesus, zach);
        graph.containsEdge(zach, jesus);

        graph.containsVertex(cash);
        graph.containsVertex("Alex");

    }

}
