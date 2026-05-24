package dev.victor.estruturadedados.exercicios;

public class QUESTION3 {
    public void reverse() {
        // nao faz nada se a lista for vazia
        if (init == null || init.next == null) {
            return;
        }

        Node<T> anterior = null;
        Node<T> current = init;
        Node<T> proximo = null;

        end = init; // O início vira o fim

        while (current != null) {
            proximo = current.next;
            current.next = anterior;
            anterior = current;
            current = proximo;
        }
        init = anterior;
    }
}
