package org.tuf.strings.easytab;

public class RotateString {

    public static void main(String[] args) {
        String str = "abcde";
        char[] ch = str.toCharArray();
        String goal = "abced";
        if (str.length() != goal.length()) {
            System.out.println("NO");
        }
        if (str.equals(goal)) {
            System.out.println("YES");
        }
        boolean result = false;
        for (int i = 0; i < str.length(); i++) {
            char temp = ch[0];
            for (int j = 0; j < str.length()-1; j++) {
                ch[j] = ch[j + 1];
            }
            ch[str.length() - 1] = temp;
            if (String.valueOf(ch).equalsIgnoreCase(goal)) {
                result = true;
                break;
            }
        }
        System.out.println(result);

        //2
        if(str.length()!= goal.length()){
            System.out.println(false);
        }
        String doubled = str+str;
        System.out.println(doubled.contains(goal));
    }
}
