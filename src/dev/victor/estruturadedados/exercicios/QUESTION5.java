package dev.victor.estruturadedados.exercicios;

public class QUESTION5 {
    public void removeNthFromEnd(int n) {
        Node<T> end = init;
        Node<T> current = init;

        for (int i = 0; i < n; i++) {
            if (end == null) return;
            end = end.next;
        }

        if (end == null) {
            init = init.next;
            return;
        }
        while (end.next != null) {
            end = end.next;
            current = current.next;
        }

        current.next = current.next.next;
    }
}
