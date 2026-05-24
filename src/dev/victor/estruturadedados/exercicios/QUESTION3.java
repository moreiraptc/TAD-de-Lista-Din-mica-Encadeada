package dev.victor.estruturadedados.exercicios;

public class QUESTION3 {
    public void reverse() {
        // Se a lista estiver vazia ou só tiver um elemento, não faz nada
        if (init == null || init.next == null) {
            return;
        }

        Node<T> anterior = null;
        Node<T> current = init;
        Node<T> proximo = null;

        end = init; // O início de agora vai virar o fim (end) da lista invertida

        while (current != null) {
            proximo = current.next;   // Salva o resto da lista pra não perder
            current.next = anterior;  // Vira a seta para trás

            // Anda um passo para a frente com os ponteiros
            anterior = current;
            current = proximo;
        }

        // No final, o nó 'anterior' vai estar no último elemento, que vira o novo início
        init = anterior;
    }
}
