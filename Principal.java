
package listaencadeada;


public class Principal {

  
    public static void main(String[] args) {
   Lista lista = new Lista();
   lista.adicionar("Ducler", "123");
   lista.adicionar("Ducler1", "234");
   lista.adicionar("Ducler2", "321");
   lista.ImprimirLista();
   
        String tel = lista.buscaTelefone("Ducler");
        System.out.println(tel);
        
        tel = lista.buscaTelefone("Du");
        System.out.println(tel);
    }
    
}
