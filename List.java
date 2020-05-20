/*
 * Group: Project Team #5
 * Course: CS211 (C) Spring 2020
 * Date: May 19, 2020
 * Assignment: Ch16 Programming Project #3
 *  
 */

// Generic interface for a List of E objects.

public interface List<E> extends Iterable<E> {
    public int size();
    public E get(int index);
    public int indexOf(E value);
    public boolean isEmpty();
    public boolean contains(E value);
    public void add(E value);
    public void add(int index, E value);
    public void addAll(List<E> other);
    public void remove(int index);
    public void set(int index, E value);
    public void clear();
}
