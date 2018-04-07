package collections;

import java.util.*;

public class JavaSet {

    public static void main(String[] args) {
        Set hashSet = new HashSet();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(5);
        hashSet.add(3);
        hashSet.add(6);
        hashSet.add(2);
        hashSet.add(6);
//        hashSet.stream().forEach(System.out::println);

        Set linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(1);
        linkedHashSet.add(1);
        linkedHashSet.add(1);
        linkedHashSet.add(5);

//        linkedHashSet.stream().forEach(System.out::println);

        Set treeSet = new TreeSet<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        Set myTreeSet = new TreeSet<Integer>((o1, o2) -> o1-o2);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);

        treeSet.stream().forEach(System.out::println);

        Map linkedHashMap = new LinkedHashMap();

    }
}
