package org.cn.graph.adjacencymatrix;

import java.util.List;

public class GraphUsingAdjacencyMatrix {

    List<GraphNode> nodeList;   //creating nodeList with nodes as graphNode
    int[][] adjacencyMatrix;  //creating adjacency matrix

    public GraphUsingAdjacencyMatrix(List<GraphNode> nodeList) {
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
}
