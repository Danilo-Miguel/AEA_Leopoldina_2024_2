public class GrafoTeste {
    public static void main(String[] args) {

     // Teste com Lista de Adjacência (usando lista ligada simples)
     System.out.println("Teste com Lista de Adjacência (Lista Ligada Simples):");
     ListaAdjacencia grafoSimples = new ListaAdjacencia(5);

     grafoSimples.adicionarAresta(0, 1);
     grafoSimples.adicionarAresta(0, 4);
     grafoSimples.adicionarAresta(1, 2);
     grafoSimples.adicionarAresta(1, 3);
     grafoSimples.adicionarAresta(1, 4);
     grafoSimples.adicionarAresta(2, 3);
     grafoSimples.adicionarAresta(3, 4);

     grafoSimples.imprimirGrafo();

}}