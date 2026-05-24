package dev.victor.estruturadedados.exercicios;

public class QUESTION1 {
    public void addAscendingSorted(T element) {
        Node<T> newNode = new Node<>(element);

        //trata lista vazia
        if (head == null || ((Comparable<T>) head.element).compareTo(element) > 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node<T> current = head;

        //avança enquanto o prximo no for nulo E o valor do prximo for menorou igual ao novo
        while (current.next != null && ((Comparable<T>) current.next.element).compareTo(element) <= 0) {
            current = current.next;
        }

        // coloca o newNode entre current e current.next
        newNode.next = current.next;
        current.next = newNode;
    }

}
