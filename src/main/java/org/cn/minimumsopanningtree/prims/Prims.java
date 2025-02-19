package org.cn.minimumsopanningtree.prims;

import org.cn.minimumsopanningtree.GraphWeightedNode;
import org.cn.minimumsopanningtree.UndirectedEdge;

import java.util.List;
import java.util.PriorityQueue;

public class Prims {

    public List<GraphWeightedNode> nodeList;

    public Prims(List<GraphWeightedNode> nodeList) {
        this.nodeList = nodeList;
    }

    /**
     * Algo
     * 1. get Source node(it can be any node in nodeList, toi be sent from main)
     * 2. Set all nodes in nodeLiast to infinity
     * 3. set sourcenode to zero
     * 4. create priority queue and all all nodes to pq
     * 5. get al neighbours of ciurr node and check if queue contains neighbour
     * 6. check if neighbour.distance > currNode.weightMap.get() distance if yes then pls reset the distance and update aprent
     * 7. loop for printing
     *
     * @param node
     */
    public void prims(GraphWeightedNode node) {
        for (GraphWeightedNode node1 : nodeList) {
            node1.distance = Integer.MAX_VALUE;
        }

        node.distance = 0;

        PriorityQueue<GraphWeightedNode> queue = new PriorityQueue<>();
        queue.addAll(nodeList);

        while (!queue.isEmpty()) {
            GraphWeightedNode currNode = queue.remove();

            for (GraphWeightedNode neighbour : currNode.neighbours) {
                if (queue.contains(neighbour)) {
                    if (neighbour.distance > currNode.weight.get(neighbour)) {
                        neighbour.distance = currNode.weight.get(neighbour);
                        neighbour.parent = currNode;
                        queue.remove(neighbour);
                        queue.add(neighbour);
                    }
                }
            }
        }
        int cost = 0;
        for (GraphWeightedNode node1 : nodeList) {
            System.out.println("Node " + node1 + ", OParent - " + node1.parent);
            cost += node1.distance;
        }
        System.out.println("cost -" + cost);

    }

    public void addWeightedUndirectedEdge(int i, int j, int weight) {
        GraphWeightedNode node1 = nodeList.get(i);
        GraphWeightedNode node2 = nodeList.get(j);

        node1.weight.put(node2, weight);
        node2.weight.put(node1, weight);
        node1.neighbours.add(node2);
        node2.neighbours.add(node1);
    }
}
