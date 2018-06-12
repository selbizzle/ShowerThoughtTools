package com.burgaggle.collections;

import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BubbleBathSort {

    private static final int LINE_LENGTH = 20;

    public static List<String> sort(List<? extends Comparable> collection) {
        Collections.sort(collection);

        List<String> output = collection.stream()
                .map(i -> buildBubble(i.toString()))
                .collect(Collectors.toList());

       // Just cause this isn't stupid enough....
        output.add(0, leadDuck());
        output.add(duckCaboose());

        return output;
    }

    private static String buildBubble(String text) {
        StringBuilder sb = new StringBuilder();
        sb.append(repeatCharacter("_", text.length() + 2));
        sb.append(System.getProperty("line.separator"));

        String[] lines = Iterables.toArray(
                Splitter.fixedLength(LINE_LENGTH).split(text),
                String.class
        );

        if (lines.length <= 1) {
            sb.append("<".concat(text).concat(">"));
        } else if (lines.length == 2) {
            sb.append("/".concat(lines[0]).concat("\\"));
            sb.append(System.getProperty("line.separator"));
            sb.append("\\".concat(lines[1]).concat("/"));
        } else {
            List<String> temp = Arrays.asList(lines);

            for (int i = 0; i < temp.size(); i++) {
                if (i == 0) {
                    sb.append("/ ".concat(temp.get(i)).concat(" \\"));
                    sb.append(System.getProperty("line.separator"));
                } else if (i == temp.size() - 1) {
                    sb.append("\\ ".concat(temp.get(i)).concat(" /"));
                } else {
                    sb.append("| ".concat(temp.get(i)).concat(" |"));
                    sb.append(System.getProperty("line.separator"));
                }
            }

        }

        sb.append(System.getProperty("line.separator"));
        sb.append(repeatCharacter("-", text.length() + 2));
        sb.append(System.getProperty("line.separator"));
        sb.append(repeatCharacter(" ", text.length() + 2).concat("\\"));
        sb.append(System.getProperty("line.separator"));
        sb.append(repeatCharacter(" ", text.length() + 4).concat("\\"));

        return sb.toString();
    }

    private static String repeatCharacter(String character, int times) {
        return new String(new char[times > LINE_LENGTH + 4 ? LINE_LENGTH + 4 : times]).replace("\0", character);
    }

    private static String leadDuck() {
        return "    __\n" +
                "___( o)>\n" +
                "\\ <_. )\n" +
                " `---'";
    }

    private static String duckCaboose() {
        return "   __\n" +
                " <(o )___\n" +
                "  ( ._> /\n" +
                "   `---'";
    }

}
