package bootApp.listTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListPerformance {

    private static int N = 5000000;

    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>();
        fillList(arrList);

        List<Integer> linkList = new LinkedList<>();
        fillList(linkList);

//        addAtFirstTest(arrList,linkList);
//        removeFirstTest(arrList,linkList);
        getFromMiddleTest(arrList,linkList);
    }

    private static void addAtFirstTest(List<Integer> arrList, List<Integer> linkList) {

        long start = System.currentTimeMillis();
        arrList.add(0,100);
        long finish = System.currentTimeMillis();

        System.out.println("time for arrList = " + (finish - start));

        start = System.currentTimeMillis();
        linkList.add(0,100);
        finish = System.currentTimeMillis();

        System.out.println("time for linkList = " + (finish - start));

    }


    private static void removeFirstTest(List<Integer> arrList, List<Integer> linkList) {

        long start = System.currentTimeMillis();
        arrList.remove(0);
        long finish = System.currentTimeMillis();

        System.out.println("time for arrList = " + (finish - start));

        start = System.currentTimeMillis();
        linkList.remove(0);
        finish = System.currentTimeMillis();

        System.out.println("time for linkList = " + (finish - start));

    }


    private static void getFromMiddleTest(List<Integer> arrList, List<Integer> linkList) {

        long start = System.currentTimeMillis();
        Integer integer = arrList.get(N / 2);
        long finish = System.currentTimeMillis();

        System.out.println("time for arrList = " + (finish - start));

        start = System.currentTimeMillis();
        Integer integer1 = linkList.get(N / 2);
        finish = System.currentTimeMillis();

        System.out.println("time for linkList = " + (finish - start));

    }


    private static void fillList(List<Integer> arrList) {
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            arrList.add(random.nextInt());
        }
    }
}
