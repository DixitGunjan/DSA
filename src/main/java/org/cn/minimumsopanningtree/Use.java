package org.cn.minimumsopanningtree;

import java.util.ArrayList;
import java.util.List;

public class Use {
    public static void main(String[] args) {
        List<GraphWeightedNode> nodeList = new ArrayList<>();
        nodeList.add(new GraphWeightedNode("A", 0));
        nodeList.add(new GraphWeightedNode("B", 1));
        nodeList.add(new GraphWeightedNode("C", 2));
        nodeList.add(new GraphWeightedNode("D", 3));

        DisjointSet.makeSet(nodeList);
        GraphWeightedNode firstNode = nodeList.get(0);
        GraphWeightedNode secondNode = nodeList.get(1);
        DisjointSet output = DisjointSet.findSet(secondNode);
        output.printAllNodesOfSet();

        DisjointSet unionOutput = DisjointSet.union(firstNode, secondNode);
        unionOutput.printAllNodesOfSet();

    }
}
