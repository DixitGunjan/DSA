package org.cn.graph.adjacencymatrix_bfs_dfs;

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


    /**
     * 1. create Queue
     * 2. Add head to queue
     * 3. if queue is not empty then loop over
     * 4. get head of queue and set it to visited
     * 5. get All its neighbours
     * 6. traverse through all neoghbiurs and add to queue who are not visited and make that neighbour visited
     *
     * @param node
     */
    public void bfsTraversal(GraphNode node) {
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            GraphNode front = queue.poll();
            front.isVisited = true;
            System.out.println(front.name + " ");
            List<GraphNode> neighbours = getNeighbours(front);
            for (GraphNode neighbour : neighbours) {
                if (!neighbour.isVisited) {
                    queue.add(neighbour);
                    neighbour.isVisited = true;
                }
            }
        }
    }

    /**
     * Method to loop over tree nodes
     */
    public void bfs() {
        for (GraphNode node : nodeList) {
            if (!node.isVisited) {
                bfsTraversal(node);
            }
        }
    }

    public void dfsTraversal(GraphNode node) {
        Stack<GraphNode> stack = new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()) {
            GraphNode front = stack.pop();
            front.isVisited = true;
            System.out.println(front.name + " ");
            List<GraphNode> neighbours = getNeighbours(front);
            for (GraphNode neighbour : neighbours) {
                if (!neighbour.isVisited) {
                    stack.push(neighbour);
                    neighbour.isVisited = true;
                }
            }
        }
    }

    /**
     * Method to loop over tree nodes
     */
    public void dfs() {
        for (GraphNode node : nodeList) {
            if (!node.isVisited) {
                dfsTraversal(node);
            }
        }
    }
}
