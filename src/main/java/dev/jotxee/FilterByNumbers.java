package dev.jotxee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
Kata.filterList(List.of(1, 2, "a", "b", 0, 15)) => List.of(1,2,0,15)
Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231)) => List.of(1, 2, 231)
 */
public class FilterByNumbers {

    static List<? super Integer> filterList(final List<?> args) { // Not working
        List<Object> result = new ArrayList<>();

        for (Object object : args) {
            if (object instanceof Integer) {
                result.add(object);
            }
        }
        return result;
    }

    static List filterListCopy(final  List<Object> args) { // My final compile solution
        List<Object> result = new ArrayList<>();

        for (Object object : args) {
            if (object instanceof Integer) {
                result.add(object);
            }
        }
        return result;
    }

    static List filterListSolution1(final List<Object> list) {
        return list.stream()
                .filter(e -> e instanceof Integer)
                .collect(Collectors.toList());
    }

    static List<Object> filterListSolution2(List<Object> list) {
        return list.stream().filter(Integer.class::isInstance).toList();
    }

}
