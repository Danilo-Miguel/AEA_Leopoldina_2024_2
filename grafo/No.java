public class No<T> {   
    T dado; // Dado armazenado no nó
    No<T> proximo; // Referência para o próximo nó da lista
// Construtor que inicializa o dado e define o próximo como null
public No(T dado) {
    this.dado = dado;
    this.proximo = null;
}

// Getter para obter o dado
public T getDado() {
    return dado;
}

// Setter para atualizar o dado
public void setDado(T dado) {
    this.dado = dado;
}
    
    // Getter para obter o próximo nó
    public No<T> getProximo() {
        return proximo;
    }

    // Setter para atualizar o próximo nó
    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }
}