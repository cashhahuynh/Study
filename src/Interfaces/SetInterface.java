package Interfaces;

import java.util.*;

public class SetInterface {

    //HashSet is collection of unique items but no guaranteed order. Static method contains mathematical operations of Set interface
    public static void hashSetTest() {
        Set<ArrayList<Integer>> hs = new HashSet<>();
        Integer num1 = 1,  num2 = 2, num3 = 3, num4 = 4;

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();

        arr1.add(num1); arr1.add(num2); arr1.add(num3);

        arr2.add(num2); arr2.add(num4); arr2.add(num1);

        //HashSet will not print this object because it's a duplicate
        arr3.add(num1); arr3.add(num2); arr3.add(num3);

        hs.add(arr1); hs.add(arr2); hs.add(arr3);

        System.out.println("Original HashSet with duplicate object: " + hs);

        Set<Integer> intersection = new HashSet<>(arr1);
        intersection.retainAll(arr2);
        System.out.println("Intersection of HashSet is: " + intersection);

        Set<Integer> union = new HashSet<>(arr1);
        union.addAll(arr2);
        System.out.println("Union of HashSet is: " + union);

        Set<Integer> difference = new HashSet<>(arr1);
        difference.removeAll(arr2);
        System.out.println("Difference of HashSet is: " + difference);

    }

    //LinkedHashSet is collection of unique items that does guarantee order
    public static void linkedHashSetTest() {
        Set<Integer> lhs = new LinkedHashSet<>();
        Integer num1 = 4, num2 = 4, num3 = 3, num4 = 1;

        lhs.add(num1); lhs.add(num2); lhs.add(num3); lhs.add(num4);

        System.out.println("LinkedHashSet in order of insertion with duplicate object: ");
        Iterator it = lhs.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
