package org.cn.SSSPP.bfsgraph.adjacencylist;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Graph {

    List<GraphNode> nodeList;

    public Graph(List<GraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void addUndirectEdge(int i, int j) {
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);

        first.neighbours.add(second);
        second.neighbours.add(first);
    }


    public void print() {
        for (GraphNode node : nodeList) {
            System.out.print(node.name + " --> ");
            for (GraphNode graphNode : node.neighbours) {
                System.out.print(graphNode.name + " --> ");
            }
            System.out.println();
        }
    }


    /**
     * topological Sort
     */
    public void addDirectedEdge(int i, int j) {
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);
        first.neighbours.add(second);
    }

    public void pathPrint(GraphNode node) {
        if (node.parent != null) {
            pathPrint(node.parent);
        }
        System.out.println(node.name);
    }

    /**
     * Getting all available paths from one node to other
     * 1. Create a queue
     * 2. add given node in queue
     * 3. check if queue is empty
     * 4. poll front of queue
     * 5. make it visited
     * 6. print path of parent from that node
     * 7. Get neighbours of that node
     * 8. if neighbour is not visited add it to queue
     * 9. make neighbour visited and set current node as parent of that node
     *
     * @param node
     */
    public void BFSForSSSPP(GraphNode node) {
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNode currNode = queue.poll();
            currNode.isVisited = true;
            System.out.println("Printing Path for " + currNode.name);
            pathPrint(currNode);
            System.out.println();
            for (GraphNode neighbour : currNode.neighbours) {
                if (!neighbour.isVisited) {
                    queue.add(neighbour);
                    neighbour.isVisited = true;
                    neighbour.parent = currNode;
                }
            }
        }
    }
}
