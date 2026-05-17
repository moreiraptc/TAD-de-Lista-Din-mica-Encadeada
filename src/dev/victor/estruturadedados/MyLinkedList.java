package dev.victor.estruturadedados;

import java.util.NoSuchElementException;
import java.util.Objects;

public class MyLinkedList<T> implements MyList<T>{

    private Node<T> init;
    private Node<T> tail;
    private int size = 0;

    @Override
    public void addFirst(T element){
        Node<T> node = new Node<T>(element);

        if(this.size == 0){
            this.init = node;
            this.tail = node;
        } else {
            node.setNext(this.init);
            this.init = node;
        }

        this.size++;
    }

    @Override
    public void addLast(T item){
        Node<T> node = new Node<T>(item);

        if(this.size == 0){
            this.init = node;
            this.tail = node;
        } else {
            this.tail.setNext(node);
            this.tail = node;
        }

        this.size++;
    }

    @Override
    public void insertAt(int i, T item){
        if(i <= 0){
            addFirst(item);
            return;
        }

        if(i >= this.size){
            addLast(item);
            return;
        }

        Node<T> previous = this.nodeAt(i - 1);
        Node<T> node = new Node<T>(item, previous.getNext());
        previous.setNext(node);
        this.size++;
    }

    @Override
    public void addSorted(T element){
        if(this.size == 0 || this.compare(element, this.init.getElement()) <= 0){
            addFirst(element);
            return;
        }

        Node<T> previous = this.init;
        Node<T> current = this.init.getNext();

        while(current != null && this.compare(current.getElement(), element) < 0){
            previous = current;
            current = current.getNext();
        }

        Node<T> node = new Node<T>(element, current);
        previous.setNext(node);

        if(current == null){
            this.tail = node;
        }

        this.size++;
    }

    @Override
    public T removeFirst(){
        if(this.size == 0){
            throw new NoSuchElementException("A lista está vazia");
        }
        T element = this.init.getElement();
        this.init = this.init.getNext();
        this.size--;

        if(this.size == 0){
            this.tail = null;
        }

        return element;
    }

    @Override
    public T removeLast(){
        if(this.size == 0){
            throw new NoSuchElementException("A lista está vazia");
        }

        if(this.size == 1){
            return this.removeFirst();
        }

        Node<T> previous = this.nodeAt(this.size - 2);
        T element = this.tail.getElement();
        previous.setNext(null);
        this.tail = previous;
        this.size--;
        return element;
    }

    @Override
    public T removeAt(int i){
        if(i < 0 || i >= this.size){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.size);
        }

        if(i == 0){
            return this.removeFirst();
        }

        if(i == this.size - 1){
            return this.removeLast();
        }

        Node<T> previous = this.nodeAt(i - 1);
        Node<T> removed = previous.getNext();
        previous.setNext(removed.getNext());
        this.size--;
        return removed.getElement();
    }

    @Override
    public boolean remove(T item){
        int index = this.find(item);

        if(index == -1){
            return false;
        }

        this.removeAt(index);
        return true;
    }

    @Override
    public void clear(){
        this.init = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public int find(T item){
        Node<T> current = this.init;
        int index = 0;

        while(current != null){
            if(Objects.equals(current.getElement(), item)){
                return index;
            }

            current = current.getNext();
            index++;
        }

        return -1;
    }

    @Override
    public T get(int i){
        return this.nodeAt(i).getElement();
    }

    @Override
    public void set(int i, T item){
        this.nodeAt(i).setElement(item);
    }

    @Override
    public int size(){
        return this.size;
    }

    public void removeAllList(){
        this.clear();
    }

    public String showLinkedList() {
        StringBuilder builder = new StringBuilder();
        Node<T> nodeMoment = this.init;

        if(this.size() == 0){
            return "[]";
        }

        builder.append("[");

        while(nodeMoment != null){
            builder.append(nodeMoment.getElement());
            nodeMoment = nodeMoment.getNext();

            if(nodeMoment != null){
                builder.append(", ");
            }
        }

        builder.append("]");

        return builder.toString();
    }

    @Override
    public String toString(){
        return this.showLinkedList();
    }

    private Node<T> nodeAt(int i){
        if(i < 0 || i >= this.size){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.size);
        }

        Node<T> current = this.init;

        for(int index = 0; index < i; index++){
            current = current.getNext();
        }

        return current;
    }

    @SuppressWarnings("unchecked")
    private int compare(T left, T right){
        if(left == null && right == null){
            return 0;
        }

        if(left == null){
            return -1;
        }

        if(right == null){
            return 1;
        }

        if(!(left instanceof Comparable<?>)){
            throw new IllegalArgumentException("Os elementos precisam implementar Comparable");
        }

        return ((Comparable<Object>) left).compareTo(right);
    }
}
