package org.cn.SSSPP.djikstraalgo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphWeightedNode implements Comparable<GraphWeightedNode> {

    public String name;
    public List<GraphWeightedNode> neighbours;
    public Map<GraphWeightedNode, Integer> weight;
    public int index;
    public boolean isVisited;
    public GraphWeightedNode parent;
    public int distance;

    public GraphWeightedNode(String name, int index) {
        this.name = name;
        this.index = index;
        this.distance = Integer.MAX_VALUE;
        this.isVisited = false;
        this.neighbours = new ArrayList<>();
        this.weight = new HashMap<>();
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(GraphWeightedNode o) {
        return this.distance - o.distance;
    }
}
