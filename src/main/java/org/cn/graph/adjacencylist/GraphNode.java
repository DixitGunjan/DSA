package org.cn.graph.adjacencylist;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {

    public String name;
    public int index;

    public List<GraphNode> neighbours;

    public GraphNode(String name, int index) {
        this.name = name;
        this.index = index;
        this.neighbours = new ArrayList<>();
    }

}
