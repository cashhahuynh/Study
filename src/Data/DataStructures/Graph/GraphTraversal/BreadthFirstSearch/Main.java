package Data.DataStructures.Graph.GraphTraversal.BreadthFirstSearch;

public class Main {

    public static void main(String [] arg) {

        Graph graph = new Graph(10);

        graph.addNewEdge(2, 5);
        graph.addNewEdge(3, 5);
        graph.addNewEdge(1, 2);
        graph.addNewEdge(2, 4);
        graph.addNewEdge(4, 1);
        graph.addNewEdge(6, 2);
        graph.addNewEdge(5, 6);
        graph.addNewEdge(1, 6);
        graph.addNewEdge(6, 3);
        graph.addNewEdge(3, 1);
        graph.addNewEdge(7, 3);
        graph.addNewEdge(3, 7);
        graph.addNewEdge(7, 5);

        System.out.println("Breadth-first traversal sequence is: ");
        graph.traversalBFS(2);

    }

}
