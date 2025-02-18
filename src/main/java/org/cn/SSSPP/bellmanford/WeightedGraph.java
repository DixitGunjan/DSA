package org.cn.SSSPP.bellmanford;

import java.util.List;
import java.util.PriorityQueue;

public class WeightedGraph {
    List<GraphWeightedNode> nodeList;

    public WeightedGraph(List<GraphWeightedNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void addDirectedWeightedEdge(int i, int j, int weight) {
        GraphWeightedNode first = nodeList.get(i);
        GraphWeightedNode second = nodeList.get(j);
        first.neighbours.add(second);
        first.weight.put(second, weight);
    }

    public void pathPrint(GraphWeightedNode node) {
        if (node.parent != null) {
            pathPrint(node.parent);
        }
        System.out.println(node.name);
    }

    /**
     * Negative cycle would be there if node distance will change
     * 1. iteration - to update the distance 1st loop is to run non every node
     * 2. iteration  - to check cycle
     *
     * @param sourceNode
     */
    public void bellmanFord(GraphWeightedNode sourceNode) {
        sourceNode.distance = 0;
        for (int i = 0; i < nodeList.size(); i++) {
            for (GraphWeightedNode currNode : nodeList) {
                for (GraphWeightedNode neighbour : currNode.neighbours) {
                    if (neighbour.distance > currNode.distance + currNode.weight.get(neighbour)) {
                        neighbour.distance = currNode.distance + currNode.weight.get(neighbour);
                        neighbour.parent = currNode;
                    }
                }
            }
        }
        System.out.println("Checking for negative Cycle");
        for (GraphWeightedNode currNode : nodeList) {
            for (GraphWeightedNode neighbour : currNode.neighbours) {
                if (neighbour.distance > currNode.distance + currNode.weight.get(neighbour)) {
                    System.out.println("Negative Cycle Found for Node" + neighbour.name);
                    System.out.println("Old Cost " + neighbour.distance);
                    return;
                }
            }
        }
        System.out.println("Negative Cycle Not Found -");
        for (GraphWeightedNode nodeToCheck : nodeList) {
            System.out.println("Node - " + nodeToCheck + ", distance - " + nodeToCheck.distance + ", path - ");
            pathPrint(nodeToCheck);
            System.out.println();
        }
    }
}
