package org.cn.minimumsopanningtree;

import java.util.List;

public class DisjointSet {
    private List<GraphWeightedNode> nodeList;

    public static void makeSet(List<GraphWeightedNode> nodeList) {
        for (GraphWeightedNode node : nodeList) {
            DisjointSet set = new DisjointSet();
            set.nodeList.add(node);
            node.set = set;
        }
    }

    public static DisjointSet findSet(GraphWeightedNode node) {
        return node.set;
    }

    public static DisjointSet union(GraphWeightedNode node1, GraphWeightedNode node2) {
        if (node1.set.equals(node2.set)) return null;
        else {
            DisjointSet set1 = node1.set;
            DisjointSet set2 = node2.set;

            if (set1.nodeList.size() > set2.nodeList.size()) {
                List<GraphWeightedNode> nodeSet2 = set2.nodeList;
                for (GraphWeightedNode node : nodeSet2) {
                    node.set = set1;
                    set1.nodeList.add(node);
                }
                return set1;
            } else {
                List<GraphWeightedNode> nodeSet1 = set1.nodeList;
                for (GraphWeightedNode node : nodeSet1) {
                    node.set = set2;
                    set2.nodeList.add(node);
                }
                return set2;
            }
        }
    }

    public void printAllNodesOfSet() {
        System.out.println("Printing all nodes of set -");
        for (GraphWeightedNode node : nodeList) {
            System.out.print(node);
        }
        System.out.println();
    }
}
