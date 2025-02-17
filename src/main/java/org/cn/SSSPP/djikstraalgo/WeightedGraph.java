package org.cn.SSSPP.djikstraalgo;

import org.cn.SSSPP.bfsgraph.adjacencymatrix.GraphNode;

import java.util.List;
import java.util.PriorityQueue;

public class WeightedGraph {
    List<GraphWeightedNode> nodeList;

    public WeightedGraph(List<GraphWeightedNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void addDirectedWeightedEdge(int i, int j, int weight) {
        GraphWeightedNode first = nodeList.get(i);
        GraphWeightedNode second = nodeList.get(j);
        first.neighbours.add(second);
        first.weight.put(second, weight);
    }

    /**
     * Based on shortest cost between node.
     * 1. Create priority queue
     * 2.set source node distance as 0 as we will start cost from here
     * 3. Enqueue complete Node list in it
     * 4. while loop on non empty condition
     * 5. get first node
     * 6. get neighbours of that node
     * 7. check if neighbour's distance is greater than (currNode distance + weight of edge) - case when its set to infinity in beginning
     * 8. set neighbours distance wd calculated distance
     * 9. make neighbiurs parent currnode
     * 10. refresh the queue by removing the neighbour and again adding it back
     *
     * @param node
     */
    public void dijkstra(GraphWeightedNode node) {
        PriorityQueue<GraphWeightedNode> queue = new PriorityQueue<>();
        node.distance = 0;
        queue.addAll(nodeList);
        while (!queue.isEmpty()) {
            GraphWeightedNode currNode = queue.remove();

            for (GraphWeightedNode neighbour : currNode.neighbours) {
                if (queue.contains(neighbour)) {
                    if (neighbour.distance > currNode.distance + currNode.weight.get(neighbour)) {
                        neighbour.distance = currNode.distance + currNode.weight.get(neighbour);
                        neighbour.parent = currNode;
                        queue.remove(neighbour);
                        queue.add(neighbour);
                    }
                }
            }
        }
        for (GraphWeightedNode nodeToCheck : nodeList) {
            System.out.println("Node - " + nodeToCheck + ", distance - " + nodeToCheck.distance + ", path - ");
            pathPrint(nodeToCheck);
            System.out.println();
        }
    }

    public void pathPrint(GraphWeightedNode node) {
        if (node.parent != null) {
            pathPrint(node.parent);
        }
        System.out.println(node.name);
    }
}
