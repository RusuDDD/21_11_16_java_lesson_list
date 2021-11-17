package de.telran.list;

public class CustomArrayList implements CustomList {

    private static final int INITIAL_CAPACITY = 8;

    private int[] source;
    private int size;

    public CustomArrayList() {
        source = new int[INITIAL_CAPACITY];
    }


    @Override
    public void set(int index, int value) {

    }

    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(int value) {
        if (size == source.length)
            increaseCapacity();
        source[size++] = value;
    }

    private void increaseCapacity() {
        int[] newSource = new int[source.length * 2];
        for (int i = 0; i < source.length; i++) {
            newSource[i] = source[i];
        }
    }

    @Override
    public void insert(int index, int value) {

    }

    @Override
    public void removeById(int index) {

    }

    @Override
    public boolean contains(int value) {
        return false;
    }

    @Override
    public void println() {

    }
}
