package by.it.sermyazhko.jd01_11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Runner {
    public static void main(String[] args) {
        List<Integer> l = new ListA<Integer>();
        l.add(55);
        l.add(66);
        l.add(77);
        l.add(88);
        l.remove(3);
        l.get(0);
        System.out.println(l);

        List<Integer> b = new ListB<Integer>();
        b.add(0);
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(1,17);
        System.out.println(b);
        //+iterator ListA b.addAll(l);

        HashSet h = new SetC<String>();
        System.out.println(h.add(1));
        System.out.println(h);
        System.out.println(h.add(2));
        System.out.println(h);
        System.out.println(h.add(1));
        System.out.println(h);
        System.out.println(h.add(18));
        System.out.println(h);
        System.out.println(h.remove(null));
        System.out.println(h);
        System.out.println(h);
        h.add(null);
        //System.out.println();
        System.out.println(h);
        h.add(null);
        System.out.println(h);
        System.out.println(h.addAll(Arrays.asList(new Integer[]{0, null, 2, 4, 6, 8, 1000, 1001, 10, 1002, 12, 14, 16, 18})));
        System.out.println(h);
        System.out.println(h.contains(null));
        System.out.println(h.contains(8));
        h.clear();
        System.out.println(h.size());
    }
}
