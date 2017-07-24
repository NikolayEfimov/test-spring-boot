package bootApp.quiz.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamQuiz {

    public static void main(String[] args) {
        elementInList();
    }

    private static void elementInList() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        Stream<String> stream = list.stream();
        list.add("C");
        stream.forEach(System.out::println);
    }
}
