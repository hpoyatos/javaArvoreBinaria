public class App {
    public static void main(String[] args) throws Exception {
        ArvoreBinaria asn = new ArvoreBinaria();

        asn.inserir(8);

        System.out.println("Trem da Raiz"); 
        System.out.println(asn.getRaiz().getValor());

        asn.inserir(10);
        asn.inserir(3);

        System.out.println("Trem da Esquerda");
        System.out.println(asn.getRaiz().getFilhoEsquerdo().getValor());

        System.out.println("Trem da Direito");
        System.out.println(asn.getRaiz().getFilhoDireito().getValor());

        asn.inserir(6);
        asn.inserir(14);
        asn.inserir(1);

        asn.inserir(13);
        asn.inserir(7);
        asn.inserir(4);        
    }
}
