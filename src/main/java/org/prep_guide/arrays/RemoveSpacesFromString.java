package org.prep_guide.arrays;

public class RemoveSpacesFromString {
    void main() {
        String str = " gh ///    def    ";
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != ' ') {
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
