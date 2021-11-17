package de.telran.list;

public interface CustomList {

    public void set(int index, int value);

    public int get(int index);

    public int size();

    public void add(int value);

    public void insert(int index, int value);

    public void removeById(int index);

    public boolean contains(int value);

    public void println();

}
