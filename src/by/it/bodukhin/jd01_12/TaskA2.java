package by.it.bodukhin.jd01_12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TaskA2 {

    static Set<Integer> getCross(Set<Integer> left, Set<Integer> right) {
        Set<Integer> result = new HashSet<>(left);
        result.retainAll(right);
        return result;
    }

    static Set<Integer> getUnion(Set<Integer> left, Set<Integer> right){
        Set<Integer> result = new HashSet<>(left);
        result.addAll(right);
        return result;
    }

    public static void main(String[] args) {
        Integer[] left = {1,1,1,1,1,1,4,5,6,7,8,10};
        Integer[] right = {2,4,5,6,4,43,3,2,4,4,66,9};
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(left));
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(right));
        System.out.println(left);
        System.out.println(right);
        Set<Integer> cross = getCross(hashSet,treeSet);
        Set<Integer> union = getUnion(hashSet, treeSet);
        System.out.println(cross);
        System.out.println(union);
    }
}
