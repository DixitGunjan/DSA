package org.leetcode.problems.strings;

import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        String directory = "/.../a/../b/c/../d/./";
        System.out.println(simplifiedPath(directory));
    }

    private static String simplifiedPath(String directory) {
        StringBuilder resultDirectory = new StringBuilder();
        Stack<String> stack = new Stack<>();

        String[] strs = directory.split("/");

        for (String s : strs) {
            if (!s.isEmpty()) {
                if (s.equals("..")) {
                    if (!stack.isEmpty()) stack.pop();
                } else if (!s.equals(".")) {
                    stack.push(s);
                }
            }
        }
        if (stack.isEmpty()) return "/";
        strs = new String[stack.size()];
        int i = 0;
        while (!stack.isEmpty()) {
            strs[i++] = stack.pop();
        }

        for (i = strs.length - 1; i >= 0; i--) {
            resultDirectory.append("/").append(strs[i]);
        }


        return resultDirectory.toString();
    }
}
