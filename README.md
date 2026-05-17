# TADListaDinamicaEncadeada

Resumo das alterações

- Implementação e limpeza da classe `MyLinkedList<T>` para operações típicas de lista encadeada: inserção no início/fim, inserção em índice, inserção ordenada, remoções, acesso (`get`/`set`), busca e limpeza.
- Ajustes no `Node<T>` para nomes mais claros e `toString` legível.
- Adicionada suíte de testes simples em `src/dev/victor/estruturadedados/tests/MyLinkedListTests.java` para validar cenários comuns.

Como executar os testes

1. Compile o projeto (usando javac ou seu IDE):

```bash
javac -d out $(find src -name "*.java")
```

2. Execute a classe de testes:

```bash
java -cp out dev.victor.estruturadedados.tests.MyLinkedListTests
```

Notas para o vídeo de entrega

- Grave um vídeo (até 10 minutos) demonstrando a execução dos testes e explicando as escolhas de implementação.
- No vídeo, detalhe o encadeamento de nós, os casos de borda (listas vazias, remoção de elementos não existentes) e a complexidade assintótica de cada operação.

Complexidade (resumo)

- `addFirst`: O(1)
- `addLast`: O(1) graças ao ponteiro `tail`
- `insertAt`: O(n) no pior caso
- `addSorted`: O(n) no pior caso
- `removeFirst`: O(1)
- `removeLast`: O(n) (precisa do nó anterior)
- `removeAt`: O(n)
- `find`: O(n)
- `get`/`set`: O(n)

Contribuição

Sinta-se à vontade para rodar os testes, revisar e pedir refatorações adicionais para deixar o código ainda mais didático.
