package io.stanford.tim;

public class StringReverser {
    public String reverse(String str, int a, int b) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i == a) {
                for (int j = b; j >= a; j--) {
                    char ic = str.charAt(j);
                    stringBuilder.append(ic);
                }
                i = b;
                continue;
            }
            char c = str.charAt(i);
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
}