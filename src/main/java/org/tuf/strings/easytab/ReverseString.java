package org.tuf.strings.easytab;

public class ReverseString {
    public static void main(String[] args) {


        String str = "abcdefg";
        char[] c = str.toCharArray();
        int endC = str.length() - 1;
        int i = 0;

        while (i < endC) {
            char temp = c[i];
            c[i] = c[endC];
            c[endC] = temp;
            i++;
            endC--;
        }
        str = String.valueOf(c);
        System.out.println(str);
    }
}
