package org.cn.SSSPP.bfsgraph.adjacencymatrix;

import java.util.*;

public class Graph {

    List<GraphNode> nodeList;   //creating nodeList with nodes as graphNode
    int[][] adjacencyMatrix;  //creating adjacency matrix

    public Graph(List<GraphNode> nodeList) {
        this.nodeList = nodeList;
        this.adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
    }

    public void addUndirectedEdge(int i, int j) {
        adjacencyMatrix[i][j] = 1;    //setting Edge bw nodes
        adjacencyMatrix[j][i] = 1;    //setting with reverse also as undirected graph

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0; j < adjacencyMatrix.length; j++) {
                sb.append(adjacencyMatrix[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    //getneighbours

    List<GraphNode> getNeighbours(GraphNode node) {
        List<GraphNode> neighbours = new ArrayList<>();
        int nodeIndex = node.index;
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            if (adjacencyMatrix[nodeIndex][i] == 1) {
                neighbours.add(nodeList.get(i));
            }
        }
        return neighbours;
    }


    public void pathPrint(GraphNode node) {
        if (node.parent != null) {
            pathPrint(node.parent);
        }
        System.out.println(node.name);
    }

    /**
     * Getting all available paths from one node to other
     * 1. Create a queue
     * 2. add given node in queue
     * 3. check if queue is empty
     * 4. poll front of queue
     * 5. make it visited
     * 6. print path of parent from that node
     * 7. Get neighbours of that node
     * 8. if neighbour is not visited add it to queue
     * 9. make neighbour visited and set current node as parent of that node
     *
     * @param node
     */
    public void BFSForSSSPP(GraphNode node) {
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNode currNode = queue.poll();
            currNode.isVisited = true;
            System.out.println("Printing Path for " + currNode.name);
            pathPrint(currNode);
            System.out.println();
            for (GraphNode neighbour : getNeighbours(currNode)) {
                if (!neighbour.isVisited) {
                    queue.add(neighbour);
                    neighbour.isVisited = true;
                    neighbour.parent = currNode;
                }
            }
        }
    }
}
