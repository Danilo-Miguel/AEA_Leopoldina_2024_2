public class ListaAdjacencia {
    private No<Integer>[] lista; // Array de listas ligadas para representar os vértices do grafo
 
  // Construtor que inicializa o grafo com o número de vértices
  public ListaAdjacencia(int vertices) {
    lista = new No[vertices]; // Cada posição do array contém a lista de adjacência de um vértice
}
// Método que adiciona uma aresta entre dois vértices (grafo não-direcionado)
public void adicionarAresta(int vertice1, int vertice2) {

    // Adiciona o vértice 2 à lista de adjacência do vértice 1

    No<Integer> no = new No<>(vertice2);
    no.setProximo(lista[vertice1]);
    lista[vertice1] = no;


    // Adiciona o vértice 1 à lista de adjacência do vértice 2 (grafo não-direcionado)
    no = new No<>(vertice1);
    no.setProximo(lista[vertice2]);
    lista[vertice2] = no;

}
public void imprimirGrafo() {

    for (int i = 0; i < lista.length; i++) {
        System.out.print("Vértice " + i + ":");
        No<Integer> atual =lista[i];
        while (atual != null) {
            System.out.print(" -> " + atual.getDado());
            atual = atual.getProximo();
        }

        System.out.println();

}
}

}
