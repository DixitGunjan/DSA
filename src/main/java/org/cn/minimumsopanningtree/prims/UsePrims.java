package org.cn.minimumsopanningtree.prims;

import org.cn.minimumsopanningtree.GraphWeightedNode;

import java.util.ArrayList;
import java.util.List;

public class UsePrims {
    public static void main(String[] args) {
        List<GraphWeightedNode> nodeList = new ArrayList<>();
        nodeList.add(new GraphWeightedNode("A", 0));
        nodeList.add(new GraphWeightedNode("B", 1));
        nodeList.add(new GraphWeightedNode("C", 2));
        nodeList.add(new GraphWeightedNode("D", 3));
        nodeList.add(new GraphWeightedNode("E", 4));

        Prims prims = new Prims(nodeList);
        prims.addWeightedUndirectedEdge(0, 1, 5);
        prims.addWeightedUndirectedEdge(0, 2, 13);
        prims.addWeightedUndirectedEdge(0, 4, 15);
        prims.addWeightedUndirectedEdge(1, 2, 10);
        prims.addWeightedUndirectedEdge(1, 3, 8);
        prims.addWeightedUndirectedEdge(2, 3, 6);
        prims.addWeightedUndirectedEdge(2, 4, 20);

        prims.prims(nodeList.get(0));
    }
}
