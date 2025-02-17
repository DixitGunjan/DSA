package org.cn.SSSPP.bfsgraph.adjacencylist;

import java.util.ArrayList;
import java.util.List;

public class GraphUse {
    public static void main(String[] args) {
        List<GraphNode> listNode = new ArrayList<>();
        listNode.add(new GraphNode("A", 0));
        listNode.add(new GraphNode("B", 1));
        listNode.add(new GraphNode("C", 2));
        listNode.add(new GraphNode("D", 3));
        listNode.add(new GraphNode("E", 4));
        listNode.add(new GraphNode("F", 5));
        listNode.add(new GraphNode("G", 6));


        Graph g = new Graph(listNode);
        g.addUndirectEdge(0, 1);
        g.addUndirectEdge(0, 2);
        g.addUndirectEdge(1, 3);
        g.addUndirectEdge(1, 6);
        g.addUndirectEdge(2, 3);
        g.addUndirectEdge(2, 4);
        g.addUndirectEdge(3, 5);
        g.addUndirectEdge(4, 5);
        g.addUndirectEdge(5, 6);

        g.BFSForSSSPP(listNode.get(0));


    }
}
