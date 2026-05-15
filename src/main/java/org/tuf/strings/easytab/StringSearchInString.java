package org.tuf.strings.easytab;

public class StringSearchInString {
    public static void main(String[] args) {
        String str = "abcdefghij";
        String tar = "def";
        System.out.println(findFirst(str, tar));
    }

    private static int findFirst(String str, String tar) {
        int len = tar.length();
        if (str.equals(tar))
            return 0;
        for (int i = 0; i < str.length() - len + 1; i++) {
            if (str.substring(i, i + len).equals(tar)) {
                return i;
            }
        }
        return -1;

    }
}
