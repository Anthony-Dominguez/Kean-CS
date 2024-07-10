import java.util.ArrayList;
import java.util.List;

public class UtilList {
    public static <T> List<T> filter(List<T> list, Condition<T> condition) {
        List<T> filteredList = new ArrayList<>();
        for (T element : list) {
            if (condition.matches(element)) {
                filteredList.add(element);
            }
        }
        return filteredList;
    }
    public static void main(String[] args) {
        List<Integer> number = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> words = List.of("apple", "bananna", "cherry", "date", "elderberry");
        List<Integer> evennumber = filter(number, new EvenNumberCondition());
        List<String> longWords = filter(words, new LongWordCondition());


        System.out.println("Even numbers: " + evennumber);
        System.out.println("Long words: " + longWords);
    }
    interface Condition<T> {
        boolean matches(T element);
    }

    static class LongWordCondition implements Condition<String> {
        // override
        public boolean matches(String element) {
            return element.length() > 5;
        }
    }
    static class EvenNumberCondition implements Condition<Integer> {
        //override
        public boolean matches(Integer element) {
            return element % 2 == 0;
        }
    }
}