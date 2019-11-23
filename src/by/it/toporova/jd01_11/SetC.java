package by.it.toporova.jd01_11;


import java.util.*;

//TaskC. Свой SetC. Напишите класс SetC<T>, который реализует toString()как в HashSet
// и 8 методов add(T e),remove(Object o), contains(Object o), size(), isEmpty(), addAll(List<?> c),
// containsAll(Collection<?> c),
// removeAll(Collection<?> c) интерфейса Set<T>(реализация остальных –фиктивная).

public class SetC<T> implements Set<T> {
    private T[] elements = (T[]) new Object[]{};
    private int size = 0;

    @Override
    public boolean add(T t) {
        if (size == elements.length)
            elements = Arrays.copyOf(elements, size * 3 / 2 + 1);
        elements[size++] = t;
        return false;
    }

    @Override
    public boolean remove(Object o) {
        if (size == 0) {
            return false;
        }
        for (int i = 0; i <size ; i++) {
            if (elements[i] == o){
              System.arraycopy(elements, i+1, elements, i, size-1-i);
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0)
            return true;
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        if (c.toArray().getClass() == this.elements.getClass()) {
            for (int i = 0; i < c.size(); i++) {
                add((T) c.toArray()[i]);
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        if (c.toArray().getClass() == this.elements.getClass()) {
            for (int i = 0; i < c.size(); i++) {
                if (!this.contains((T) c.toArray()[i])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    @Override
    public boolean removeAll(Collection<?> c) {
        if (c.toArray().getClass() == this.elements.getClass()) {
            for (int i = 0; i < c.size(); i++) {
                remove((T) c.toArray()[i]);
            }
            return true;
        }
        return false;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            if (i > 0) sb.append(", ");
            sb.append(elements[i]);
        }
        sb.append("]");
        return sb.toString();
    }
    @Override
    public boolean contains(Object o) {

        for (T element : elements) {
            if (element == o)
                return true;
        }

        return false;
    }

    //stubs

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
