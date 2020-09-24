import lista.Lista;

public class App {
    public static void main(String[] args) throws Exception {
        Lista<String> lista = new Lista<String>();
		
		lista.insereValor("Livro", "Objeto com folhas");
		lista.imprimeLista();
		
		lista.removeValor("Livro");
		lista.imprimeLista();
    }
}
