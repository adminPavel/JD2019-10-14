package by.it.kharitonenko.jd01_11;

import java.net.BindException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

class SetC<T> implements Set<T> {

    private T[] elements = (T[]) new Object[1];
    private int size = 0;

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (T element : elements) if (element == o) return true;
        return false;
    }

    @Override
    public boolean add(T element) {
        if (contains(element)) return false;
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, elements.length * 3 / 2 + 1);
        }
        elements[size++] = element;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (size == 0) {
            return false;
        }
        for (int index = 0; index < size(); index++) {
            if (elements[index] == o) {
                System.arraycopy(elements, index + 1, elements, index, --size - index);
                return true;
            }
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
    public boolean removeAll(Collection<?> c) {
        if (c.toArray().getClass() == this.elements.getClass()) {
            for (int i = 0; i < c.size(); i++) {
                remove((T) c.toArray()[i]);
            }
            return true;
        }
        return false;
    }

    /* =========================DON'T NEED========================== */
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
        System.arraycopy(elements,0,elements,0,0);
        size = 0;
    }
}
