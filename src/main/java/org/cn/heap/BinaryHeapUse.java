package org.cn.heap;

public class BinaryHeapUse {
    public static void main(String[] args) {
        BinaryHeap heap = new BinaryHeap(5);
        heap.insert(10, "MIN");
        heap.insert(5, "MIN");
        heap.insert(15, "MIN");
        heap.insert(1, "MIn");

        heap.levelOrderTraversal();
    }
}
