
package org.example;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static <T> List<T> zip(List<T> list1, List<T> list2) {
        List<T> resultList = new ArrayList<>();
        int i = 0;
        int size1 = list1.size();
        int size2 = list2.size();
        int minimumSize = Math.min(size1, size2);

        for (; i < minimumSize; i++) {
            resultList.add(list1.get(i));
            resultList.add(list2.get(i));
        }

        for (; i < size1; i++) {
            resultList.add(list1.get(i));
        }

        for (; i < size2; i++) {
            resultList.add(list2.get(i));
        }

        return resultList;
    }

    public static void main(String[] args) {
        List<Integer> numbers1 = List.of(1, 3, 5, 7);
        List<Integer> numbers2 = List.of(2, 4, 6, 8);
        List<Integer> zippedNumbers = zip(numbers1, numbers2);
        System.out.println(zippedNumbers); 

        List<String> strings1 = List.of("Red", "Green", "Blue");
        List<String> strings2 = List.of("White", "Black", "Orange", "Pink", "Fuchsia");
        List<String> zippedStrings = zip(strings1, strings2);
        System.out.println(zippedStrings);
    }
}