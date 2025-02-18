package org.cn.APSPP.floyedwarshall;

import java.util.ArrayList;
import java.util.List;

public class GraphWeightedNodeUse {
    public static void main(String[] args) {
        List<GraphWeightedNode> nodeList = new ArrayList<>();
        nodeList.add(new GraphWeightedNode("A", 0));
        nodeList.add(new GraphWeightedNode("B", 1));
        nodeList.add(new GraphWeightedNode("C", 2));
        nodeList.add(new GraphWeightedNode("D", 3));

        WeightedGraph graph = new WeightedGraph(nodeList);

        graph.addDirectedWeightedEdge(0, 1, 8);
        graph.addDirectedWeightedEdge(0, 3, 1);
        graph.addDirectedWeightedEdge(1, 2, 1);
        graph.addDirectedWeightedEdge(2, 0, 4);
        graph.addDirectedWeightedEdge(3, 1, 2);
        graph.addDirectedWeightedEdge(3, 2, 9);

        graph.floyedWarshall();

    }
}
