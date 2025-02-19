package org.cn.minimumsopanningtree.kruskla;

import org.cn.minimumsopanningtree.DisjointSet;
import org.cn.minimumsopanningtree.GraphWeightedNode;
import org.cn.minimumsopanningtree.UndirectedEdge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Kruskal {
    List<GraphWeightedNode> nodeList;
    List<UndirectedEdge> edgeList = new ArrayList<>();

    public Kruskal(List<GraphWeightedNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void addWeightedUndirectedEdge(int i, int j, int weight) {

        UndirectedEdge edge = new UndirectedEdge(nodeList.get(i), nodeList.get(j), weight);
        GraphWeightedNode node1 = edge.first;
        GraphWeightedNode node2 = edge.second;

        node1.weight.put(node2, weight);
        node2.weight.put(node1, weight);
        node1.neighbours.add(node2);
        node2.neighbours.add(node1);
        edgeList.add(edge);
    }

    /**
     * Algo -
     * Add all nodes to set(for ech node make a set)
     * Compare all vetexes in non-increasing order
     * Calculate cost for each Vertices - get nodes and check if they exist in same set if not then creater union and update cost
     */
    void kruskal() {
        DisjointSet.makeSet(nodeList);
        Comparator<UndirectedEdge> comparator = new Comparator<UndirectedEdge>() {
            @Override
            public int compare(UndirectedEdge o1, UndirectedEdge o2) {
                return o1.weight - o2.weight;
            }
        };
        Collections.sort(edgeList, comparator);

        int cost = 0;

        for (UndirectedEdge edge : edgeList) {
            GraphWeightedNode first = edge.first;
            GraphWeightedNode second = edge.second;

            if (!DisjointSet.findSet(first).equals(DisjointSet.findSet(second))) {
                DisjointSet.union(first, second);
                cost += edge.weight;
            }
        }
        System.out.println("Total Cost - " + cost);
    }
}
