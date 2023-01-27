package HomeWork4;

import java.util.Arrays;

    public class CustomArray<T> {


        private static final int DEFAULT_CAPASITY = 16;
        private T[] array;
        private int index = 0;

        public CustomArray(T[] array) {
            super();
            this.array = (T[]) new Object[DEFAULT_CAPASITY];
        }

        public CustomArray(int capacity) {
            super();
            this.array = (T[]) new Object[capacity];
        }

        public void add(T obj) {
            if (index >= array.length) {
                grow();
            }
            array[index++] = obj;
        }

        private void grow() {
            T[] newArray = (T[]) new Object[array.length * 2 + 1];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }

        public void print() {
            T[] temp = (T[]) new Object[index];
            System.arraycopy(array, 0, temp, 0, index);
            System.out.println(Arrays.toString(array));
        }

        public T get(int index) {
            return array[index];
        }

        public T getLast() {
            return index == 0 ? null : array[index - 1];
        }

        public T getFirst() {
            return index == 0 ? null : array[0];
        }

        public int size() {
            return index;
        }

        public int capacity() {
            return array.length;
        }

        public T remove(int i) {
            T temp = array[i];
            System.arraycopy(array, i + 1, array, i, index);
            array[array.length - 1] = null;
            index--;
            return temp;
        }

        public T remove(T obj) {
            for (int i = 0; i < index; i++) {
                if (array[i].equals(obj)) {
                    return remove(i);
                }
            }
            return null;
        }

        @Override
        public String toString() {
            return "CustomArray [array=" + Arrays.toString(array) + ", index=" + index + ", count=" + count + "]";
        }

        int count = 0;

        public boolean hasNext() {
            return count < array.length && array[count] != null;
        }

        public T next() {
            return array[count++];
        }
    }
