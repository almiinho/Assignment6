public class Main {
    public static void main(String[] args) {
        MyWeightedGraph graph = new MyWeightedGraph(5);
        MyVertex vertex0 = new MyVertex(0);
        MyVertex vertex1 = new MyVertex(1);
        MyVertex vertex2 = new MyVertex(2);
        MyVertex vertex3 = new MyVertex(3);
        MyVertex vertex4 = new MyVertex(4);

        graph.addEdge(vertex0, vertex1, 2);
        graph.addEdge(vertex0, vertex2, 6);
        graph.addEdge(vertex1, vertex3, 5);
        graph.addEdge(vertex2, vertex3, 12);
        graph.addEdge(vertex2, vertex4, 8);
        graph.addEdge(vertex3, vertex4, 10);

        MyBFS BFS = new MyBFS(graph);
        MyDijkstraSearch dijkstra = new MyDijkstraSearch(graph);

        System.out.println("BFS traversal:");
        BFS.BFS(vertex0);

        System.out.println("\nDijkstra's Algorithm:");
        dijkstra.dijkstra(vertex4);
    }
}