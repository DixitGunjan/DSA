package org.cn.graph.adjacencylist_bfs_dfs;

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

    public void bfsTraversal(GraphNode node) {
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            GraphNode front = queue.poll();
            front.isVisited = true;
            System.out.println(front.name + " ");
            List<GraphNode> neighbours = node.neighbours;
            for (GraphNode neighbour : neighbours) {
                if (!neighbour.isVisited) {
                    queue.add(neighbour);
                    neighbour.isVisited = true;
                }
            }
        }
    }

    public void bfs() {
        for (GraphNode node : nodeList) {
            if (!node.isVisited) {
                bfsTraversal(node);
            }
        }
    }

    public void dfsTraversal(GraphNode node) {
        Stack<GraphNode> stack = new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()) {
            GraphNode front = stack.pop();
            front.isVisited = true;
            System.out.println(front.name + " ");
            List<GraphNode> neighbours = node.neighbours;
            for (GraphNode neighbour : neighbours) {
                if (!neighbour.isVisited) {
                    stack.push(neighbour);
                    neighbour.isVisited = true;
                }
            }
        }
    }

    public void dfs() {
        for (GraphNode node : nodeList) {
            if (!node.isVisited) {
                dfsTraversal(node);
            }
        }
    }
}
