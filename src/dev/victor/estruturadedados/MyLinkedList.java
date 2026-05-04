package dev.victor.estruturadedados;

public class MyLinkedList implements MyList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    private static class Node<T> {
        T element;
        Node<T> next;

        Node(T element) {
            this.element = element;
            this.next = next;
        }

        Node(T element, Node<T> next) {
            this.element = element;
            this.next = next;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    void addFirst(T item){};

    @Override
    void addLast(T item){};

    @Override
    void insertAt(int i, T item){};

    @Override
    void addSorted(T element){};

    @Override
    T removeFirst(){};

    @Override
    T removeLast(){};

    @Override
    T removeAt(){};

    @Override
    boolean remove(T item){};

    @Override
    void  clear(){};

    @Override
    int find(T item){};

    @Override
    T get(int i ){};

    @Override
    void set(int i, T item){};
}
