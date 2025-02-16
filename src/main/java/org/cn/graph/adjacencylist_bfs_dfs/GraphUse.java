package org.cn.graph.adjacencylist_bfs_dfs;

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

        Graph g = new Graph(listNode);

        g.addUndirectEdge(0, 1);
        g.addUndirectEdge(0, 2);
        g.addUndirectEdge(0, 3);
        g.addUndirectEdge(1, 4);
        g.addUndirectEdge(2, 3);
        g.addUndirectEdge(3, 4);

        g.print();
//comment either one
        g.bfs();
        System.out.println();
        g.dfs();
    }
}
