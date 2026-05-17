package dev.victor.estruturadedados;

public class Node <T> {
    private T element;
    private Node<T> next;

    public Node(T element) {
        this.element = element;
        this.next = null;
    }

    // usado em casos que ja se sabe o proximo
    public Node(T element, Node<T> next) {
        this.element = element;
        this.next = next;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public T getElement() {
       return this.element;
    }


    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getInit() {
        return element;
    }

    public void setInit(T init) {
        this.element = init;
    }

    @Override
    public String toString() {
        return "Node[element=" + element + "]";
    }
}
