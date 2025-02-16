package org.cn.graph.adjacencymatrix_bfs_dfs;

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
        g.addUndirectedEdge(0, 1);
        g.addUndirectedEdge(0, 2);
        g.addUndirectedEdge(0, 3);
        g.addUndirectedEdge(1, 4);
        g.addUndirectedEdge(2, 3);
        g.addUndirectedEdge(3, 4);

        System.out.println(g);

       // g.bfs();
        g.dfs();
    }
}
