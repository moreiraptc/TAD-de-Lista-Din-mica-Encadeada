package dev.victor.estruturadedados.exercicios;

public class QUESTION5 {
    public void removeNthFromEnd(int n) {
        Node<T> end = init;      // Ponteiro que vai correr na frente
        Node<T> current = init;  // Ponteiro que vem atrás

        // Anda 'n' casas com o ponteiro end
        for (int i = 0; i < n; i++) {
            if (end == null) return; // Se n for maior que a lista, para por aqui
            end = end.next;
        }

        // Se o end chegou no nulo logo agora, quer dizer que o alvo é o primeiro nó (init)
        if (end == null) {
            init = init.next;
            return;
        }

        // Anda com os dois juntos até o end chegar no último nó da lista
        while (end.next != null) {
            end = end.next;
            current = current.next;
        }

        // O current parou exatamente antes do nó que a gente quer arrancar
        current.next = current.next.next;
    }
}
