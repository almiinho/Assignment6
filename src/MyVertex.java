public class MyVertex {
    private final int id;
    private boolean visited;
    private int distance;
    private int weight;

    public MyVertex(int id) {
        this.id = id;
        this.visited = false;
        this.distance = Integer.MAX_VALUE;
        this.weight = 0;
    }

    public int getId() {
        return id;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
