package org.cn.SSSPP.bfsgraph.adjacencymatrix;

public class GraphNode {
    public String name;
    public int index;
    public boolean isVisited;
    public GraphNode parent;

    public GraphNode(String name, int index) {
        this.name = name;
        this.index = index;
        this.isVisited = false;
    }
}
