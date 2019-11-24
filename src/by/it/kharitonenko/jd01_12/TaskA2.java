package by.it.kharitonenko.jd01_12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class TaskA2 {

    static Set<Integer> getUnion(Set<Integer> left, Set<Integer> right) {
        Set<Integer> result = new HashSet<>(left);
        result.addAll(right);
        return result;
    }

    static Set<Integer> getCross(Set<Integer> left, Set<Integer> right) {
        Set<Integer> result = new HashSet<>(right);
        result.retainAll(left);
        return result;
    }

    public static void main(String[] args) {
        Integer[] left = {7, 1, 1, 1, 3, 2, 3, 6, 5, 6, 92};
        Integer[] right = {10, 4, 5, 6, 4, 8, 9, 9, 9, 10};
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(left));
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(right));

    }
}
