package org.cn.graph.adjacencylist_bfs_dfs;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {

    public String name;
    public int index;
    boolean isVisited;
    public List<GraphNode> neighbours;

    public GraphNode(String name, int index) {
        this.name = name;
        this.index = index;
        this.isVisited = false;
        this.neighbours = new ArrayList<>();
    }

}
