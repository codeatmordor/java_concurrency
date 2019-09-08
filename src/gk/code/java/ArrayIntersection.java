
// PACKAGE/IMPORTS --------------------------------------------------
package gk.code.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayIntersection {

    public static List<Integer> intersection(int[] a, int[] b) {
        Set<Integer> s = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            s.add(a[i]);
        }

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
            if (s.contains(b[i])) {
                res.add(b[i]);
            }

        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = new int[] { 1, 4, 5, -8, 9, 10, 0, 7, 6, 5 };
        int[] b = new int[] { 1, 4, 5, -8, 9, 10, 0 };

        ArrayIntersection.intersection(a, b).stream().forEach(i -> System.out.println(i));
    }

}
