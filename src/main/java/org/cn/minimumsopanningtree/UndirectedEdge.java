package org.cn.minimumsopanningtree;

public class UndirectedEdge {
    public GraphWeightedNode first;
    public GraphWeightedNode second;
    public int weight;

    public UndirectedEdge(GraphWeightedNode first, GraphWeightedNode second, int weight) {
        this.first = first;
        this.second = second;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Edge (" + this.first + "," + this.second + "), weight - " + this.weight;
    }
}
