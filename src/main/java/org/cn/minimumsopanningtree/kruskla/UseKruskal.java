package org.cn.minimumsopanningtree.kruskla;

import org.cn.minimumsopanningtree.GraphWeightedNode;

import java.util.ArrayList;
import java.util.List;

public class UseKruskal {
    public static void main(String[] args) {
        List<GraphWeightedNode> nodeList = new ArrayList<>();
        nodeList.add(new GraphWeightedNode("A", 0));
        nodeList.add(new GraphWeightedNode("B", 1));
        nodeList.add(new GraphWeightedNode("C", 2));
        nodeList.add(new GraphWeightedNode("D", 3));
        nodeList.add(new GraphWeightedNode("E", 4));

        Kruskal kruskal = new Kruskal(nodeList);
        kruskal.addWeightedUndirectedEdge(0, 1, 5);
        kruskal.addWeightedUndirectedEdge(0, 2, 13);
        kruskal.addWeightedUndirectedEdge(0, 4, 15);
        kruskal.addWeightedUndirectedEdge(1, 2, 10);
        kruskal.addWeightedUndirectedEdge(1, 3, 8);
        kruskal.addWeightedUndirectedEdge(2, 3, 6);
        kruskal.addWeightedUndirectedEdge(2, 4, 20);

        kruskal.kruskal();
    }
}
