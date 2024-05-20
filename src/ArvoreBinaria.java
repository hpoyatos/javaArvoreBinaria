public class ArvoreBinaria {
    private No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }

    public void inserir (int valor) {
        this.raiz = this.inserirRecursivamente(this.raiz, valor);
    }

    private No inserirRecursivamente(No noDaVez, int valor) {
        // Se a árvore estiver vazia (raiz é nula), cria um nó na raiz...
        if (noDaVez == null) {
            return new No(valor);
        }
        else
        {
            // Percorre a árvore recursivamente para encontrar o lugar correto..
            if (valor < noDaVez.getValor()){
                noDaVez.setFilhoEsquerdo(inserirRecursivamente(noDaVez.getFilhoEsquerdo(), valor));
            }
            else
            {
                noDaVez.setFilhoDireito(inserirRecursivamente(noDaVez.getFilhoDireito(), valor));
            }

            return noDaVez;
        }
    }

    // Percorrer : técnica Pré-Ordem : nó-da-vez, filho esquerdo, filho direito..
    public void percorrerPreOrdem(No no)
    {
        if (no != null) {
            System.out.print(no.getValor() + " ");
            this.percorrerPreOrdem(no.getFilhoEsquerdo());
            this.percorrerPreOrdem(no.getFilhoDireito());
        }
    }
}
