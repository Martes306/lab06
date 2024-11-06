package it.unibo.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Example class using {@link List} and {@link Map}.
 *
 */
public final class UseListsAndMaps {

    private final static int INDEX_START = 0;
    private final static int INDEX_FINAL = 1;
    private final static int ELEM = 100000;

    private UseListsAndMaps() {
    }

    /**
     * @param s
     *          unused
     */
    public static void main(final String... s) {

        // consegna 1
        int i;
        ArrayList<Integer> arr = new ArrayList<>();
        for (i = 1000; i <= 2000; i++) {
            arr.add(i);
        }
        // System.out.println(arr);

        // consegna 2
        LinkedList<Integer> list = new LinkedList<>(arr);
        // System.out.println(list);

        // consegna 3
        int tmp;
        tmp = arr.get(INDEX_START);
        arr.set(0, arr.get(arr.size() - INDEX_FINAL));
        arr.set(arr.size() - INDEX_FINAL, tmp);

        // consegna 4
        for (final int arrMember : arr) {
            System.out.print(arrMember + " ");
        }
        System.out.println();

        // consegna 5
        arr.clear();
        long timeArr = System.nanoTime();
        for (i = 1; i <= ELEM; i++) {
            arr.addFirst(i);
        }
        timeArr = System.nanoTime() - timeArr;

        list.clear();
        long timeList = System.nanoTime();
        for (i = 1; i <= ELEM; i++) {
            list.addFirst(i);
        }
        timeList = System.nanoTime() - timeList;

        System.out.println("Tempo array : " + timeArr + "\n" + "Tempo lista : " + timeList);

        // consegna 6
        timeArr = System.nanoTime();
        for (int times = 0; times < 5; times++) {
            arr.get(ELEM / 2);
        }
        timeArr = System.nanoTime() - timeArr;
        System.out.println("Tempo array : " + timeArr);

        timeList = System.nanoTime();
        for (int times = 0; times < 5; times++) {
            list.get(ELEM / 2);
        }
        timeList = System.nanoTime();
        System.out.println("Tempo lista : " + timeList);

        // consegna 7
        Map<String, Long> map = new HashMap<>();
        map.put("Africa", 1110635000L);
        map.put("Americas", 972005000L);
        map.put("Antarctica", 0L);
        map.put("Asia", 4298723000L);
        map.put("Europe", 742452000L);
        map.put("Oceania", 38304000L);

        // consegna 8
        long population = 0;
        for (final Map.Entry<String, Long> entry : map.entrySet()) {
            population = population + entry.getValue();
        }
        System.out.println("The mondial population is : " + population);

        /*
         * 1) Create a new ArrayList<Integer>, and populate it with the numbers
         * from 1000 (included) to 2000 (excluded).
         */
        /*
         * 2) Create a new LinkedList<Integer> and, in a single line of code
         * without using any looping construct (for, while), populate it with
         * the same contents of the list of point 1.
         */
        /*
         * 3) Using "set" and "get" and "size" methods, swap the first and last
         * element of the first list. You can not use any "magic number".
         * (Suggestion: use a temporary variable)
         */
        /*
         * 4) Using a single for-each, print the contents of the arraylist.
         */
        /*
         * 5) Measure the performance of inserting new elements in the head of
         * the collection: measure the time required to add 100.000 elements as
         * first element of the collection for both ArrayList and LinkedList,
         * using the previous lists. In order to measure times, use as example
         * TestPerformance.java.
         */
        /*
         * 6) Measure the performance of reading 1000 times an element whose
         * position is in the middle of the collection for both ArrayList and
         * LinkedList, using the collections of point 5. In order to measure
         * times, use as example TestPerformance.java.
         */
        /*
         * 7) Build a new Map that associates to each continent's name its
         * population:
         *
         * Africa -> 1,110,635,000
         *
         * Americas -> 972,005,000
         *
         * Antarctica -> 0
         *
         * Asia -> 4,298,723,000
         *
         * Europe -> 742,452,000
         *
         * Oceania -> 38,304,000
         */
        /*
         * 8) Compute the population of the world
         */
    }
}
