package org.leetcode.problems.strings;

import java.util.Stack;
//todo: complete karo
public class ReverseWordsOfAString {

    public static String reverseWord(String str){

        String[] strArray = str.split(" ");
        Stack<String> stack = new Stack<>();

        for(String s : strArray){
            stack.push(s.trim());
        }

        StringBuilder resultString = new StringBuilder();
        while(!stack.isEmpty()){
            resultString.append(stack.pop() + " ");
        }
        return resultString.toString().trim();
    }

    public static void main(String[] args) {
        String str = "a good   example";
        System.out.println(reverseWord(str));
    }
}
