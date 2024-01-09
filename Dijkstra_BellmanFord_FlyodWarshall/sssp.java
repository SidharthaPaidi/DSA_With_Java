import java.util.*;

public class sssp {
    public static class WeightedNode implements Comparable<WeightedNode> {
        public String name;
        public ArrayList<WeightedNode> neighbors = new ArrayList<WeightedNode>();
        public HashMap<WeightedNode, Integer> weightMap = new HashMap<>();
        public boolean isVisited = false;
        public WeightedNode parent;
        public int distance;
        public int index;

        public WeightedNode(String name, int index) {
            this.name = name;
            distance = Integer.MAX_VALUE;
            this.index = index;
        }

        @Override
        public String toString() {
            return name;
        }

        @Override
        public int compareTo(WeightedNode o) {
            return this.distance - o.distance;
        }

    }

    public static class WeightedGraph {
        ArrayList<WeightedNode> nodeList = new ArrayList<WeightedNode>();

        public WeightedGraph(ArrayList<WeightedNode> nodeList) {
            this.nodeList = nodeList;
        }

        void dijkstra(WeightedNode node) {
            PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
            node.distance = 0;
            queue.addAll(nodeList);
            while (!queue.isEmpty()) {
                WeightedNode currentNode = queue.remove();
                for (WeightedNode neighbor : currentNode.neighbors) {
                    if (queue.contains(neighbor)) {
                        if (neighbor.distance > currentNode.distance + currentNode.weightMap.get(neighbor)) {
                            neighbor.distance = (currentNode.distance + currentNode.weightMap.get(neighbor));
                            neighbor.parent = currentNode;
                            queue.remove(neighbor);
                            queue.add(neighbor);
                        }
                    }
                }
            }

            for (WeightedNode nodeToCheck : nodeList) {
                System.out.print("Node " + nodeToCheck + ", distance: " + nodeToCheck.distance + ", Path: ");
                pathPrint(nodeToCheck);
                System.out.println();
            }
        }

        public static void pathPrint(WeightedNode node) {
            if (node.parent != null) {
                pathPrint(node.parent);
            }
            System.out.print(node.name + " ");
        }

        public void addWeightedEdge(int i, int j, int d) {
            WeightedNode first = nodeList.get(i);
            WeightedNode second = nodeList.get(j);
            first.neighbors.add(second);
            first.weightMap.put(second, d);
        }

        // Bellman Ford Algorithm
        void bellmanFord(WeightedNode sourceNode) {
            sourceNode.distance = 0;
            for (int i = 0; i < nodeList.size(); i++) {
                for (WeightedNode currentNode : nodeList) {
                    for (WeightedNode neighbor : currentNode.neighbors) {
                        if (neighbor.distance > currentNode.distance + currentNode.weightMap.get(neighbor)) {
                            neighbor.distance = (currentNode.distance + currentNode.weightMap.get(neighbor));
                            neighbor.parent = currentNode;
                        }
                    }
                }
            }
            System.out.println("Checking for Negative Cycle..");
            for (WeightedNode currentNode : nodeList) {
                for (WeightedNode neighbor : currentNode.neighbors) {
                    if (neighbor.distance > currentNode.distance + currentNode.weightMap.get(neighbor)) {
                        System.out.println("Negative cycle found: \n");
                        System.out.println("Vertex name: " + neighbor.name);
                        System.out.println("Old cost: " + neighbor.distance);
                        int newDistance = currentNode.distance + currentNode.weightMap.get(neighbor);
                        System.out.println("new cost: " + newDistance);
                        return;
                    }
                }
            }
            System.out.println("Negative Cycle not found");

            for (WeightedNode nodeToCheck : nodeList) {
                System.out.print("Node " + nodeToCheck + ", distance: " + nodeToCheck.distance + ", Path: ");
                pathPrint(nodeToCheck);
                System.out.println();
            }

        }

        // flyod warshall algorithm
        void flyodwarshall() {
            int size = nodeList.size();
            int[][] v = new int[size][size];
            for (int i = 0; i < size; i++) {
                WeightedNode first = nodeList.get(i);
                for (int j = 0; j < size; j++) {
                    WeightedNode second = nodeList.get(j);
                    if (i == j) {
                        v[i][j] = 0;
                    } else if (first.weightMap.containsKey(second)) {
                        v[i][j] = first.weightMap.get(second);
                    } else {
                        v[i][j] = Integer.MAX_VALUE / 10;
                    }
                }
            }
            // Floyd Warshall's Algorithm
            for (int k = 0; k < nodeList.size(); k++) {
                for (int i = 0; i < nodeList.size(); i++) {
                    for (int j = 0; j < nodeList.size(); j++) {
                        if (v[i][j] > v[i][k] + v[k][j]) { // if update possible, then update path
                            v[i][j] = v[i][k] + v[k][j]; // this will keep a track on path
                        }
                    }
                }
            } // end of loop

            // Print table of node with minimum distance and shortest path from each source
            for (int i = 0; i < size; i++) {
                System.out.print("Printing distance list for node "+nodeList.get(i)+": ");
                for (int j = 0; j < size; j++) {
                    System.out.print(v[i][j]+" ");
                }
                System.out.println();
            }

        }
    }

    public static void main(String[] args) {
        ArrayList<WeightedNode> nodeList = new ArrayList<>();
        nodeList.add(new WeightedNode("A", 0));
        nodeList.add(new WeightedNode("B", 1));
        nodeList.add(new WeightedNode("C", 2));
        nodeList.add(new WeightedNode("D", 3));
        WeightedGraph newGraph = new WeightedGraph(nodeList);
        newGraph.addWeightedEdge(0, 3, 1);
        newGraph.addWeightedEdge(0, 1, 8);
        newGraph.addWeightedEdge(1, 2, 1);
        newGraph.addWeightedEdge(2, 0, 4);
        newGraph.addWeightedEdge(3, 1, 2);
        newGraph.addWeightedEdge(3, 2, 9);
        System.out.println("Printing Flyod Warshall Algorithm from source A");
        newGraph.flyodwarshall();
    }

}
