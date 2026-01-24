
/*
 * This class compares search performance
 * using Array, HashSet, and TreeSet.
 */
import java.util.*;

public class dataStructureSearchComparison {

    public static void main(String[] args) {

        // Using ArrayList
        List<Integer> list = new ArrayList<>();

        // Using HashSet
        Set<Integer> hashSet = new HashSet<>();

        // Using TreeSet
        Set<Integer> treeSet = new TreeSet<>();

        // Adding elements
        for (int i = 0; i < 1000; i++) {
            list.add(i);
            hashSet.add(i);
            treeSet.add(i);
        }

        // Searching element
        System.out.println(list.contains(500));
        System.out.println(hashSet.contains(500));
        System.out.println(treeSet.contains(500));
    }
}
