package org.cn.SSSPP.djikstraalgo;

import java.util.ArrayList;
import java.util.List;

public class GraphWeightedNodeUse {
    public static void main(String[] args) {
        List<GraphWeightedNode> nodeList = new ArrayList<>();
        nodeList.add(new GraphWeightedNode("A", 0));
        nodeList.add(new GraphWeightedNode("B", 1));
        nodeList.add(new GraphWeightedNode("C", 2));
        nodeList.add(new GraphWeightedNode("D", 3));
        nodeList.add(new GraphWeightedNode("E", 4));
        nodeList.add(new GraphWeightedNode("F", 5));
        nodeList.add(new GraphWeightedNode("G", 6));

        WeightedGraph graph = new WeightedGraph(nodeList);

        graph.addDirectedWeightedEdge(0, 1, 2);
        graph.addDirectedWeightedEdge(0, 2, 5);
        graph.addDirectedWeightedEdge(1, 3, 1);
        graph.addDirectedWeightedEdge(1, 4, 3);
        graph.addDirectedWeightedEdge(2, 5, 8);
        graph.addDirectedWeightedEdge(3, 4, 4);
        graph.addDirectedWeightedEdge(4, 6, 9);
        graph.addDirectedWeightedEdge(5, 6, 7);


        graph.dijkstra(nodeList.get(0));
    }
}
