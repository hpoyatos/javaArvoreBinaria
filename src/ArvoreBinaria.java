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

    // Percorrer : técnica Em-Ordem : filho esquerdo, nó-da-vez, filho direito..
    public void percorrerEmOrdem(No no)
    {
        if (no != null) {
            this.percorrerEmOrdem(no.getFilhoEsquerdo());
            System.out.print(no.getValor() + " ");
            this.percorrerEmOrdem(no.getFilhoDireito());
        }
    }

    // Percorrer : técnica Pos-Ordem : filho esquerdo, filho direito, nó-da-vez ..
    public void percorrerPosOrdem(No no)
    {
        if (no != null) {
            this.percorrerPosOrdem(no.getFilhoEsquerdo());
            this.percorrerPosOrdem(no.getFilhoDireito());
            System.out.print(no.getValor() + " ");
        }
    }

    // Percorrer : técnica Em-Ordem : filho direito, nó-da-vez, filho esquerdo..
    public void percorrerEmOrdemDecrescente(No no)
    {
        if (no != null) {
            this.percorrerEmOrdemDecrescente(no.getFilhoDireito());
            System.out.print(no.getValor() + " ");
            this.percorrerEmOrdemDecrescente(no.getFilhoEsquerdo());
        }
    }

    // Remover
    public void remover(int valor) {
        this.raiz = this.removerRecursivamente(this.raiz, valor);        
    }

    public No removerRecursivamente(No noDaVez, int valor) {
        if (noDaVez == null) {
            return noDaVez;
        }
        else
        {
            if (valor < noDaVez.getValor()) {
                noDaVez.setFilhoEsquerdo(removerRecursivamente(noDaVez.getFilhoEsquerdo(), valor));
            } else if (valor > noDaVez.getValor()) {
                noDaVez.setFilhoDireito(removerRecursivamente(noDaVez.getFilhoDireito(), valor));
            } else {
                if (noDaVez.getFilhoEsquerdo() == null) {
                    return noDaVez.getFilhoDireito();
                } else if (noDaVez.getFilhoDireito() == null) {
                    return noDaVez.getFilhoEsquerdo();
                }
                
                //Localiza o menor número da direita e traz no lugar..
                noDaVez.setValor(encontrarMinimo(noDaVez.getFilhoDireito()).getValor());
                noDaVez.setFilhoDireito(removerRecursivamente(noDaVez.getFilhoDireito(), noDaVez.getValor()));

            }
            return noDaVez;
        }
    }

    private No encontrarMinimo(No no) {
        while (no.getFilhoEsquerdo() != null) {
            no = no.getFilhoEsquerdo();
        }
        return no;
    }
}
