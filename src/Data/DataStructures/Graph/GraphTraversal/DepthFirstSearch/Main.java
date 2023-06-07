package Data.DataStructures.Graph.GraphTraversal.DepthFirstSearch;

public class Main {

    public static void main(String[] arg) {

        Graph graph = new Graph(10);

        graph.addNewEdge(1, 2);
        graph.addNewEdge(2, 3);
        graph.addNewEdge(3, 4);
        graph.addNewEdge(4,5);
        graph.addNewEdge(5,7);
        graph.addNewEdge(1,3);
        graph.addNewEdge(1,5);
        graph.addNewEdge(5,5);
        graph.addNewEdge(2,6);
        graph.addNewEdge(3,7);

        System.out.println("Depth-first traversal of graph is: ");
        graph.DFS(1);

    }

}
