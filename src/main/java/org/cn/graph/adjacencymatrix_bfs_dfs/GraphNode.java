package org.cn.graph.adjacencymatrix_bfs_dfs;

public class GraphNode {
    public String name;
    public int index;
    public boolean isVisited;

    public GraphNode(String name, int index) {
        this.name = name;
        this.index = index;
        this.isVisited = false;
    }
}
