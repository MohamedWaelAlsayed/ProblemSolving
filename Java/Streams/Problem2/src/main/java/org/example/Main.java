package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
        System.out.println(countElementsStartingWith('B', colors));
        System.out.println(countElementsStartingWith('R', colors));
    }

    public static long countElementsStartingWith(char startingLetter, List<String> colors) {
        long count = colors.stream().filter(color -> color.startsWith(String.valueOf(startingLetter))).count();
        return count;
    }
}
