package net.htlgkr.mittermayrm180114.beispiel2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class HalloJavaMitForEach {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Apfel", "Orange", "Banane"));

        for (String s : list) {
            System.out.println(s);
        }

        list.forEach((String s) -> System.out.println(s));
        Consumer<String> consumer = (String s) -> System.out.println(s);
        list.forEach(System.out::print);
    }
}