package by.it.yaroshenko.testing;

import java.util.ArrayList;
import java.util.List;

public class arlist {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> arrayList2 = new ArrayList<>();
        arrayList.add(4);
        arrayList.add(8);
        arrayList.add(-7);
        arrayList.add(3);
        arrayList.add(0);
        arrayList.add(6);
        arrayList.add(1);
        arrayList.add(-4);
        arrayList.add(9);
        arrayList.add(6);
        arrayList.add(-1);
        arrayList.add(5);
        arrayList.add(3);
        System.out.println(arrayList.size());
        int pos = 0;
        for (Integer integer : arrayList) {
            if (integer > 0) {
                arrayList2.add(pos++, integer);
            }
            if (integer == 0) {
                arrayList2.add(pos, 0);
            }
            if (integer < 0) {
                arrayList2.add(integer);
            }
        }
        for (Integer list: arrayList2 ) {
            System.out.print(list+" ");
        }
    }
}
