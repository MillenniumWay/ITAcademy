package HomeWork5;

import java.util.Iterator;

public class Task3<T> implements Iterator<T> {

    private T[][] array;

    private int a;
    private int b;

    public Task3(T[][]array) {
        this.array = array; }

    public boolean hasNext() {
        return a < array.length && b < array[a].length;
    }

    public T next() {
        T element = array[a][b++];
        if (b >= array[a].length) {
            a++;
            b = 0;
        }
        return element;
    }
}
