package Data.DataStructures.Graph.WeightedGraph;

public class Node {

    int value, weight;

    public Node(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return this.value + " (" + this.weight + ") ";
    }

}
