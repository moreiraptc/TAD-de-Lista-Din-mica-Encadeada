package dev.victor.estruturadedados.exercicios;

public class QUESTION4 {
    public Node<T> mergeTwoLists(Node<T> init1, Node<T> init2) {
        // Nó "falso" para servir de ponto de partida
        Node<T> init = new Node<>(null);
        Node<T> current = init;

        // Percorre enquanto ambas tiverem elementos
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

        // Se uma das listas terminou, anexa o restante da outra
        if (init1 != null) {
            current.next = init1;
        } else {
            current.next = init2;
        }

        // Retorna ignorando o nó falso de inicialização
        return init.next;
    }
}
