package bootApp.quiz.collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionOperation {


    public static void main(String[] args) {

        List<String> unmodifiableList = Arrays.asList("str1", "str2");
        try {
            removeInCycle(unmodifiableList);
        } catch (UnsupportedOperationException ex) {
            System.out.println("Changes in unmodifiable collection is prohibited");
        }
        printCollection(unmodifiableList);
    }

    private static void removeInCycle(Collection<String> strings) {
        for (String string : strings) {
            if (string.equals("str2")) {
                strings.remove("str2");
            }
        }
    }

    private static void printCollection(Iterable<?> collection) {
        collection.forEach(System.out::println);
    }


}
