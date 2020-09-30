import hash.DicionarioHash;
import hash.Lista;

public class App {
    public static void main(String[] args) throws Exception {
		DicionarioHash teste = new DicionarioHash();
        teste.addTabela("Amazônia", "Maior floresta tropical");
		teste.addTabela("Amor", "Sentimento afetivo que faz com que a pessoa queira o bem de outra");
//		
		teste.buscaPalavra("Amor");
		teste.excluirItem("Amor");
		teste.addTabela("Amor", "Sentimento afetivo que faz com que a pessoa queira o bem de outra");
		teste.buscaPalavra("Amazônia");
		teste.buscaPalavra("Amor");
		teste.buscaPalavra("ABLUBLBE");
                
    }
}
