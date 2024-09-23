
### 📋 Resumo da Atividade
O objetivo desta atividade é implementar e testar diferentes algoritmos de ordenação (Bubble Sort, Insertion Sort, Selection Sort, Merge Sort, Heap Sort e Quick Sort). O programa deve ler números inteiros de um arquivo, ordená-los utilizando o algoritmo escolhido pelo usuário, e gravar o resultado ordenado em um novo arquivo. Para garantir a precisão dos resultados, cada algoritmo é executado 3 vezes, e o tempo médio de execução é calculado.

>🚨O registro dos resultados, bem como as perguntas e respostas da atividade, está localizado no diretório "resultados" deste projeto.

### 💻 Tutorial do Código
1. **Entrada de Dados**: 
   - O usuário informa o número de elementos a serem ordenados e o nome do arquivo de entrada.

2. **Menu de Ordenação**:
   - As listas podem ser criadas nas seguintes ordens:
     1. Crescente sem repetição
     2. Crescente com repetição
     3. Decrescente sem repetição
     4. Decrescente com repetição
     5. Aleatória sem repetição
     6. Aleatória com repetição

3. **Menu de Algoritmos**:
   - São oferecidas seis opções de algoritmos: Bubble Sort, Insertion Sort, Selection Sort, Merge Sort, Heap Sort e Quick Sort.

4. **Execução da Ordenação (3 vezes)**:
   - Para garantir uma média precisa, o algoritmo selecionado é executado 3 vezes. 
   - A cada execução, o tempo de processamento é guardado.
   - O vetor original é clonado a cada iteração para garantir que as três execuções sejam consistentes, rodando sempre na lista desordenada.
   - Ao final, é calculado o **tempo médio de execução** das três execuções para que o desempenho seja avaliado de forma mais justa. ⚡

5. **Saída de Dados**:
   - A lista ordenada é salva em um arquivo especificado (solicitado no começo do programa).
   - O resultado final é uma lista de números organizada.
