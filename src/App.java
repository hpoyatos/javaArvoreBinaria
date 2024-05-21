public class App {
    public static void main(String[] args) throws Exception {
        ArvoreBinaria asn = new ArvoreBinaria();

        asn.inserir(8);

        //System.out.println("Trem da Raiz"); 
        //System.out.println(asn.getRaiz().getValor());

        asn.inserir(10);
        asn.inserir(3);

        //System.out.println("Trem da Esquerda");
        //System.out.println(asn.getRaiz().getFilhoEsquerdo().getValor());

        //System.out.println("Trem da Direito");
        //System.out.println(asn.getRaiz().getFilhoDireito().getValor());

        asn.inserir(6);
        asn.inserir(14);
        asn.inserir(1);

        asn.inserir(13);
        asn.inserir(7);
        asn.inserir(4);  
        
        //Chamando o percorrerPreOrder(No no):void...
        asn.percorrerPreOrdem(asn.getRaiz());

        System.err.println("");
        //Chamando o percorrerEmOrder(No no):void...
        asn.percorrerEmOrdem(asn.getRaiz());

        System.err.println("");
        //Chamando o percorrerPosOrder(No no):void...
        asn.percorrerPosOrdem(asn.getRaiz());
        
        System.err.println("");
        //Chamando o percorrerEmOrder(No no):void...
        asn.percorrerEmOrdemDecrescente(asn.getRaiz());

        
        System.err.println("");

        //Remover o 1
        asn.remover(1);

        asn.percorrerPreOrdem(asn.getRaiz());


    }
}
