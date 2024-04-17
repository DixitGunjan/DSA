package org.leetcode.problems;

import org.cn.linkedlist.Node;
//TODO::Complete
public class MaximumTwinSumOfLL {

    public static int twinSum(Node<Integer> head) {

        int length = 0;
        Node<Integer> temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        for (int i = 0; i < length; i++) {
            for(int j =0;j<length;j++){
                if(j== length-1-i){

                }
            }
        }
        return 0;
    }
}
