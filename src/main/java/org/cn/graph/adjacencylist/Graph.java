package org.cn.graph.adjacencylist;

import java.util.Iterator;
import java.util.List;

public class Graph {

    List<GraphNode> nodeList;

    public Graph(List<GraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void addUndirectEdge(int i, int j) {
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);

        first.neighbours.add(second);
        second.neighbours.add(first);
    }


    public void print() {
        for (GraphNode node : nodeList) {
            System.out.print(node.name + " --> ");
            for (GraphNode graphNode : node.neighbours) {
                System.out.print(graphNode.name + " --> ");
            }
            System.out.println();
        }
    }

}
