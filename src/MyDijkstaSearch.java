import java.util.*;

class MyDijkstraSearch extends Search {
    public MyDijkstraSearch(MyWeightedGraph graph) {
        super(graph);
    }

    public void dijkstra(MyVertex source) {
        PriorityQueue<MyVertex> queue = new PriorityQueue<>(Comparator.comparingInt(MyVertex::getDistance));
        source.setDistance(0);
        queue.offer(source);

        while (!queue.isEmpty()) {
            MyVertex vertex = queue.poll();
            System.out.print(vertex.getId() + " ");

            List<MyVertex> neighbors = graph.getNeighbors(vertex);
            for (MyVertex neighbor : neighbors) {
                int newDistance = vertex.getDistance() + neighbor.getWeight();
                if (newDistance < neighbor.getDistance()) {
                    queue.remove(neighbor);
                    neighbor.setDistance(newDistance);
                    queue.offer(neighbor);
                }
            }
        }
    }
}
