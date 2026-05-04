package dev.victor.estruturadedados;

public interface MyList <T>{
    void addFirst(T item);
    void addLast(T item);
    void insertAt(int i, T item);
    void addSorted(T element);

    T removeFirst();
    T removeLast();
    T removeAt();
    boolean remove(T item);
    void  clear();

    int find(T item);
    T get(int i );
    void set(int i, T item);

    int size();

}
