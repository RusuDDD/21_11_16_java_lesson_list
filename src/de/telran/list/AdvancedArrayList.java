package de.telran.list;
//TODO complet (everuthink is in the Advancedarray)
public class AdvancedArrayList implements CustomList{

    private int[]source;

    public AdvancedArrayList() {
        source = new int[0];
    }

    public AdvancedArrayList(int initialSize) {
        source = new int[initialSize];
    }

    @Override
    public void set(int index, int value) {
        source[index] = value;
    }

    @Override
    public int get(int index) {
        return source[index];
    }

    @Override
    public int size() {
        return source.length;
    }

    @Override
    public void add(int value) {
        int[] newSource = new int[source.length + 1];
        for (int i = 0; i < source.length; i++) {
            newSource[i] = source[i];
        }
        newSource[newSource.length - 1] = value;
        source = newSource;
    }

    @Override
    public void insert(int index, int value) {
        int[] newSource = new int[source.length + 1];
        for (int i = 0; i < index; i++) {
            newSource[i] = source[i];
        }
        newSource[index] = value;
        for (int i = index; i < newSource.length; i++) {
            newSource[i] = source[i - 1];
        }
        source = newSource;
    }

    @Override
    public void removeById(int index) {
        int[] newSource = new int[source.length - 1];
        for (int i = 0; i < index; i++) {
            newSource[i] = source[i];
        }
        for (int i = index; i < newSource.length; i++) {
            newSource[i] = source[i + 1];
        }
        source = newSource;
    }

    @Override
    public boolean contains(int value) {
        for (int i = 0; i < source.length; i++) {
            if (source[i] == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void println() {
        for (int i = 0; i < source.length; i++) {


        }
    }
}
