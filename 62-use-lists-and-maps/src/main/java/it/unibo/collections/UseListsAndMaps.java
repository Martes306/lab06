package it.unibo.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Example class using {@link List} and {@link Map}.
 *
 */
public final class UseListsAndMaps {

    private final static int ELEM = 100000;

    private UseListsAndMaps() {
    }

    /**
     * @param s
     *          unused
     */
    public static void main(final String... s) {

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1000; i <= 2000; i++) {
            arr.add(i);
        }
        System.out.println(arr);

        LinkedList<Integer> list = new LinkedList<>(arr);
        System.out.println(list);

        int tmp; 
        tmp = arr.get(0); 
        arr.set(0, arr.get(arr.size()));
        arr.set(arr.size(), tmp);

        for(final int arrMember : arr){
            System.out.println(arrMember);
        }

        arr.clear();
        long timeArr = System.nanoTime();
        for (int i = 1; i <= ELEM; i++) {
            arr.add(i);
        }
        timeArr = System.nanoTime() - timeArr;
        
        list.clear();
        long timeList = System.nanoTime();
        for (int i = 1; i <= ELEM; i++) {
            list.add(i);
        }
        timeList = System.nanoTime() - timeList;

        System.out.println("Tempo array : " + timeArr + "\n" + "Tempo lista : " + timeList);

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
