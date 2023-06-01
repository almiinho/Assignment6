import java.util.*;

class MyBFS extends Search {
    public MyBFS(MyWeightedGraph graph) {
        super(graph);
    }

    public void BFS(MyVertex source) {
        Queue<MyVertex> queue = new LinkedList<>();
        queue.add(source);
        source.setVisited(true);

        while (!queue.isEmpty()) {
            MyVertex vertex = queue.poll();
            System.out.print(vertex.getId() + " ");

            List<MyVertex> neighbors = graph.getNeighbors(vertex);
            for (MyVertex neighbor : neighbors) {
                if (!neighbor.isVisited()) {
                    queue.add(neighbor);
                    neighbor.setVisited(true);
                }
            }
        }
    }
}
