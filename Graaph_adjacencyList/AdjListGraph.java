import java.util.*;

public class AdjListGraph {

    public static class GraphNode {
        public String name;
        public int index;
        public boolean isVisited = false;

        public ArrayList<GraphNode> neighbors = new ArrayList<GraphNode>();

        public GraphNode(String name, int index) {
            this.name = name;
            this.index = index;
        }
    }

    public static class Graph {


        ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

        public Graph(ArrayList<GraphNode> nodeList){
            this.nodeList = nodeList;
        }

        public void addUndirectedEdge(int i , int j){
            GraphNode first = nodeList.get(i);
            GraphNode second = nodeList.get(j);
            first.neighbors.add(second);
            second.neighbors.add(first);

        }


        // For printing Graph to the console
        public String toString() {
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < nodeList.size(); i++) {
                s.append(nodeList.get(i).name + ": ");
                for (int j = 0; j < nodeList.get(i).neighbors.size(); j++) {
                    if (j == nodeList.get(i).neighbors.size() - 1) {
                        s.append((nodeList.get(i).neighbors.get(j).name));
                    } else {
                        s.append((nodeList.get(i).neighbors.get(j).name) + " -> ");
                    }
                }
                s.append("\n");
            }
            return s.toString();
        }

        public void bfsVisit(GraphNode node){
            LinkedList<GraphNode> queue = new LinkedList<GraphNode>();
            queue.add(node);
            while (!queue.isEmpty()) {
                GraphNode currentNode = queue.remove();
                currentNode.isVisited = true;
                System.out.print(currentNode.name + " ");
                for(GraphNode neighbor : currentNode.neighbors){
                    if(!neighbor.isVisited){
                        queue.add(neighbor);
                        neighbor.isVisited = true;
                    }
                }
            }

        }

        public void bfs(){
            for(GraphNode node : nodeList){
                if(node.isVisited == false){
                    bfsVisit(node);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
        nodeList.add(new GraphNode("A", 0));
        nodeList.add(new GraphNode("B", 1));
        nodeList.add(new GraphNode("C", 2));
        nodeList.add(new GraphNode("D", 3));
        nodeList.add(new GraphNode("E", 4));

        Graph g = new Graph(nodeList);
        g.addUndirectedEdge(0, 1);
        g.addUndirectedEdge(0, 2);
        g.addUndirectedEdge(0, 3);
        g.addUndirectedEdge(1, 4);
        g.addUndirectedEdge(2, 3);
        g.addUndirectedEdge(3, 4);

        System.out.println(g.toString());
        g.bfs();
    }
}
