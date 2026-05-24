package dev.victor.estruturadedados.exercicios;

public class QUESTION4 {
    public Node<T> mergeTwoLists(Node<T> init1, Node<T> init2) {
        Node<T> init = new Node<>(null);
        Node<T> current = init;

        while (init1 != null && init2 != null) {
            if (((Comparable<T>) init1.element).compareTo(init2.element) <= 0) {
                current.next = init1;
                init1 = init1.next;
            } else {
                current.next = init2;
                init2 = init2.next;
            }
            current = current.next;
        }

        if (init1 != null) {
            current.next = init1;
        } else {
            current.next = init2;
        }

        return init.next;
    }
}
