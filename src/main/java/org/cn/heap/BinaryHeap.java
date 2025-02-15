package org.cn.heap;

/**
 * arr= [ -, 1,2,3,4,5,6] first index we keep empty
 * left child at 2x position
 * right child at 2x+1 position
 */
public class BinaryHeap {

    int[] binaryHeapArray;
    int sizeOfTree;

    public BinaryHeap(int size) {
        binaryHeapArray = new int[size + 1];
        this.sizeOfTree = 0;
    }

    public Integer getPeek() {
        if (sizeOfTree == 0) {
            return null;
        } else return binaryHeapArray[1];     //first variable is peek
    }

    public int getSize() {
        return sizeOfTree;
    }

    public void levelOrderTraversal() {
        for (int i = 1; i <= sizeOfTree; i++) {
            System.out.println(binaryHeapArray[i]);
        }
    }


    //Heapifying methods

    public void heapifyBottomToTop(int index, String type) {
        int parent = index / 2;     //because child nodes are present at 2x and 2x+1 index

        if (index <= 1) return;

        if (type.equalsIgnoreCase("MIN")) {
            if (binaryHeapArray[index] < binaryHeapArray[parent]) {
                int temp = binaryHeapArray[index];
                binaryHeapArray[index] = binaryHeapArray[parent];
                binaryHeapArray[parent] = temp;
            }
        } else if (type.equalsIgnoreCase("MAX")) {
            if (binaryHeapArray[index] > binaryHeapArray[parent]) {
                int temp = binaryHeapArray[index];
                binaryHeapArray[index] = binaryHeapArray[parent];
                binaryHeapArray[parent] = temp;
            }
        }

        heapifyBottomToTop(parent, type);
    }

    public void insert(int value, String type) {
        sizeOfTree++;
        binaryHeapArray[sizeOfTree] = value;
        heapifyBottomToTop(sizeOfTree, type);

    }

    /**
     * check if left child is there otherwise return
     * check wchich type of heap(min/max)
     * check if(only left child or both childs available)
     *
     * @param index
     * @param type
     */
    public void heapifyTopToBottom(int index, String type) {
        int leftChildIndex = 2 * index;
        int rightChildIndex = 2 * index + 1;
        int swapChild = 0;
        if (sizeOfTree < leftChildIndex) {  //No left child
            return;
        }

        if (type.equalsIgnoreCase("MAX")) {
            if (sizeOfTree == leftChildIndex) {       //only left child is there
                if (binaryHeapArray[index] < binaryHeapArray[leftChildIndex]) {
                    int temp = binaryHeapArray[index];
                    binaryHeapArray[index] = binaryHeapArray[leftChildIndex];
                    binaryHeapArray[leftChildIndex] = temp;
                }
                return;
            } else {     //both children are there so comparing which one is bigger
                if (binaryHeapArray[leftChildIndex] > binaryHeapArray[rightChildIndex]) {
                    swapChild = leftChildIndex;
                } else {
                    swapChild = rightChildIndex;
                }
                //swapping bigger child with root as root has less value
                if (binaryHeapArray[index] < binaryHeapArray[swapChild]) {
                    int temp = binaryHeapArray[index];
                    binaryHeapArray[index] = binaryHeapArray[swapChild];
                    binaryHeapArray[swapChild] = temp;
                }
            }
        } else if (type.equalsIgnoreCase("MIN")) {
            if (sizeOfTree == leftChildIndex) { //only left child
                if (binaryHeapArray[index] > binaryHeapArray[leftChildIndex]) {
                    int temp = binaryHeapArray[index];
                    binaryHeapArray[index] = binaryHeapArray[leftChildIndex];
                    binaryHeapArray[leftChildIndex] = temp;
                }
                return;
            } else { //both childs and chcking which is bighger and which is smaller
                if (binaryHeapArray[leftChildIndex] < binaryHeapArray[rightChildIndex]) {
                    swapChild = leftChildIndex;
                } else {
                    swapChild = rightChildIndex;
                }
                //checking and swapping if root is bigger than child
                if (binaryHeapArray[index] > binaryHeapArray[swapChild]) {
                    int temp = binaryHeapArray[index];
                    binaryHeapArray[index] = binaryHeapArray[swapChild];
                    binaryHeapArray[swapChild] = temp;
                }
            }

        }

        heapifyTopToBottom(swapChild, type);
    }


    public int extractedHeadofHeap(String type) {
        if (sizeOfTree == 0) {
            return -1;
        } else {
            int extractedValue = binaryHeapArray[1];  //extraction root
            binaryHeapArray[1] = binaryHeapArray[sizeOfTree]; //replacing root with last lement
            sizeOfTree--; //deleting last element
            heapifyTopToBottom(1, type); //heapifying
            return extractedValue;
        }
    }

}
