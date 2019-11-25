package by.it.bodukhin.jd01_12;

import java.util.*;

public class TaskC2 {
    static Set<Number> getCross(Set<Number> left, Set<Number> ... right) {
        Set<Number> result = new HashSet<>(left);
        result.retainAll(Arrays.asList(right));
        return result;
    }

    static Set<Number> getUnion(Set<Number> left, Set<Number> right){
        Set<Number> result = new HashSet<>(left);
        result.addAll(right);
        return result;
    }

    public static void main(String[] args) {
        Integer[] left = {1,1,1,1,1,1,4,5,6,7,8,10};
        Integer[] right = {2,4,5,6,4,43,3,2,4,4,66,9};
        Integer[] right2 = {1,2,2,2,2,4,4,5,5,6,9,9,8};
        HashSet<Number> hashSet = new HashSet<>(Arrays.asList(left));
        TreeSet<Number> treeSet = new TreeSet<>(Arrays.asList(right));
        HashSet<Number> hashSet2 = new HashSet<>(Arrays.asList(right2));
        //System.out.println(left);
        //System.out.println(right);
        //System.out.println(right2);
        Set<Number> cross = getCross(hashSet,treeSet, hashSet2);
        Set<Number> union = getUnion(hashSet, treeSet);
        System.out.println(cross);
        System.out.println(union);
    }
}
