import java.util.*;

class MyWeightedGraph {
    private final List<List<MyVertex>> adjacencyList;

    public MyWeightedGraph(int numberOfVertices) {
        this.adjacencyList = new ArrayList<>(numberOfVertices);

        for (int i = 0; i < numberOfVertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(MyVertex source, MyVertex destination, int weight) {
        adjacencyList.get(source.getId()).add(destination);
        adjacencyList.get(destination.getId()).add(source);
    }

    public List<MyVertex> getNeighbors(MyVertex vertex) {
        return adjacencyList.get(vertex.getId());
    }
}
