package by.it.bodukhin.jd01_11;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class SetC<T> implements Set<T> {

    private T[] elements = (T[]) new Object[]{};
    private int size=0;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        String delimeter = "";
        for (int i = 0; i < size; i++) {
            sb.append(delimeter).append(elements[i]);
            delimeter = ", ";
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {

        if (size > 0) {
            return false;
        }
        else return true;
    }
    @Override
    public boolean contains(Object o) {
        boolean isCont = false;
        if(size>0){
            for(int i=0; i<size; i++){
                if(o==null && elements[i]==null){
                    isCont=true;
                }
                else if (o != null && o.equals(elements[i])) {
                    isCont = true;
                }
            }
        }
        return isCont;
    }

    @Override
    public boolean add(T t) {
        if (!contains(t)) {
            if (size == elements.length) {
                elements = Arrays.copyOf(elements, (size * 3) / 2 + 1);
            }
            elements[size++] = t;
            return true;
        } else return false;
    }

    @Override
    public boolean remove(Object o) {
        boolean del = false;
        if(size == 0){
            del=false;
        }
        for (int i=0; i<size; i++){
                if(elements[i]==o){
                System.arraycopy(elements, i+1, elements,i,(size-i-1));
                del=true;
                size--;
            }
        }
        return del;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        boolean isConAll = false;
        int num=0;
        Object[] colToArr = c.toArray();
        if(size>0){
            for(int i=0; i<size; i++) {
                for (int j = 0; j < colToArr.length; j++) {
                    if (colToArr[j]==null && elements[i]==null){
                        num++;
                    }
                    else if (colToArr[j] != null &&
                            colToArr[j].equals(elements[i])) {
                        num++;
                    }
                }
            }
        }
        if(num==colToArr.length){
            isConAll=true;
        }
        return isConAll;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        boolean isAdd = false;
        int num=0;
        Object[] colToArr = c.toArray();
        for(int i=0; i<colToArr.length; i++) {
            if(!contains(colToArr[i])) {
                add((T) colToArr[i]);
                num++;
            }
        }
        if(num==colToArr.length) {
            isAdd=true;
        }
        return isAdd;
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
        size=0;
    }
}
