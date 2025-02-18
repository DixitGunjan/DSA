package org.cn.APSPP.floyedwarshall;

import java.util.List;

public class WeightedGraph {
    List<GraphWeightedNode> nodeList;

    public WeightedGraph(List<GraphWeightedNode> nodeList) {
        this.nodeList = nodeList;
    }

    void floyedWarshall() {
        int size = nodeList.size();
        int[][] V = new int[size][size];

        //initializing the vertices matrix
        for (int i = 0; i < size; i++) {
            GraphWeightedNode first = nodeList.get(i);
            for (int j = 0; j < size; j++) {
                GraphWeightedNode second = nodeList.get(j);
                if (i == j) {   //same node
                    V[i][j] = 0;
                } else if (first.weight.containsKey(second)) {  //if direct link
                    V[i][j] = first.weight.get(second);   // setting distance of direct link in matrix

                } else {  //might have link via a node but no direct edge
                    V[i][j] = Integer.MAX_VALUE / 10;
                }
            }
        }
        //actual algo
        for (int k = 0; k < size; k++) {  //via node
            for (int i = 0; i < size; i++) {  //initial node(i and j) to get values from matrix
                for (int j = 0; j < size; j++) { //second node
                    if (V[i][j] > V[i][k] + V[k][j]) {  //vertices is there via a node
                        V[i][j] = V[i][k] + V[k][j];
                    }
                }
            }
        }

        //printing distance matrix for each node
        for (int i = 0; i < size; i++) {
            System.out.print("Printing distance list for node - " + nodeList.get(i) + " - ");
            for (int j = 0; j < size; j++) {
                System.out.print(V[i][j] + " ");
            }
            System.out.println();
        }
    }
}
