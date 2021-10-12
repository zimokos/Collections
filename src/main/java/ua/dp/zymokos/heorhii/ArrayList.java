package ua.dp.zymokos.heorhii;

public class ArrayList<E> {
    public static final int INITIAL_CAPACITY = 5;
    private Object[] array;
    private Integer size;

    public ArrayList() {
        this.array = new Object[INITIAL_CAPACITY];
        this.size = 0;
    }

    public Integer getSize() {
        return size;
    }

    public Object[] add(E element) {
        if (size < INITIAL_CAPACITY) {
            array[size] = element;
            size++;
            return array;
        } else {
            Object[] newArray = new Object[this.array.length + 1];
            System.arraycopy(this.array, 0, newArray, 0, size);
            array = newArray;
            array[size] = element;
            size++;
            return array;
        }
    }

    public void set(int index, E element) {
        array[index] = element;
    }

    public void remove(int index) {
        System.arraycopy(this.array, index + 1, this.array, index, size - 1 - index);
        array[size - 1] = null;
        size--;
    }

    public E get(int index) {
        return (E) array[index];
    }

    public int size() {
        return getSize();
    }

    public void printArrayList() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
