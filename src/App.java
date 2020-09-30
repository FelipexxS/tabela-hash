import hash.DicionarioHash;
import hash.Lista;

public class App {
    public static void main(String[] args) throws Exception {
		DicionarioHash teste = new DicionarioHash();
        teste.addTabela("EAD", "Pior coisa de 2020");
		teste.addTabela("Estudar", "Niguém consegue no ead.");
		
		teste.excluirItem("palavra");
		teste.buscaPalavra("palavra");

    }
}
