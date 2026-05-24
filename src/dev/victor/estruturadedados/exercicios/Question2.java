package dev.victor.estruturadedados.exercicios;

public class Question2 {
    public void removeNodeWithoutPredecessor(Node<T> current) {
        if (current != null && current.next != null) {
            // copia o valor do próximo nó para o nó atual
            current.element = current.next.element;
            //pula o próximo no e remove
            current.next = current.next.next;
        }
    }
}
