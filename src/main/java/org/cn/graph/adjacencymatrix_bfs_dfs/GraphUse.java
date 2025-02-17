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
        listNode.add(new GraphNode("F", 5));
        listNode.add(new GraphNode("G", 6));
        listNode.add(new GraphNode("H", 7));

        /*Graph g = new Graph(listNode);
        g.addUndirectedEdge(0, 1);
        g.addUndirectedEdge(0, 2);
        g.addUndirectedEdge(0, 3);
        g.addUndirectedEdge(1, 4);
        g.addUndirectedEdge(2, 3);
        g.addUndirectedEdge(3, 4);

        System.out.println(g);*/

        // g.bfs();
        // g.dfs();

       //topological sort
        Graph g2 = new Graph(listNode);
        g2.addDirectedEdge(0, 2);
        g2.addDirectedEdge(2, 4);
        g2.addDirectedEdge(4, 7);
        g2.addDirectedEdge(4, 5);
        g2.addDirectedEdge(5, 6);
        g2.addDirectedEdge(1, 2);
        g2.addDirectedEdge(1, 3);
        g2.addDirectedEdge(3, 5);

        System.out.println(g2);
        g2.topological();
    }
}
