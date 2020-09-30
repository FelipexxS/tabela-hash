package hash;

import javax.print.DocFlavor.STRING;

import hash.Lista;

public class DicionarioHash {
    Lista[] Vetor;
    public DicionarioHash() {
        Vetor = new Lista[26];
        
        iniciaLista();
    }

    public void iniciaLista() {
        for (int i = 0; i < Vetor.length; i++) {
            Vetor[i] = new Lista<String>();
        }
    }

    public int funcaoHash(String palavra) {
        
        //Calcula o valor do hash da palavra
        palavra = palavra.toLowerCase();
        int posicao = palavra.charAt(0);
        return posicao - 97;
    }

    public void addTabela(String palavra, String descricao) {
    	if (Vetor[funcaoHash(palavra)].buscarValor(palavra) == null) {
    		Vetor[funcaoHash(palavra)].insereValor(palavra, descricao);
    		return;
    	}
    	
        System.out.println("Chave " + palavra + " já existe na tabela.");
        return;
    }


    public void excluirItem(String palavra) {
        System.out.println("***Itens nesse indice:***\n");
        Vetor[funcaoHash(palavra)].imprimeLista();
        Vetor[funcaoHash(palavra)].removeValor(palavra);
        System.out.println("***Itens nesse indice apos excluir:***\n");
        Vetor[funcaoHash(palavra)].imprimeLista();

    }

    public void buscaPalavra(String palavra) {
    	if (Vetor[funcaoHash(palavra)].buscarValor(palavra) != null) {
    		System.out.println(Vetor[funcaoHash(palavra)].buscarValor(palavra).getDescricao());
    		return;
    	}
    	
    	System.out.println("Chave " + palavra + " não localizada na Tabela");
    }
    


}
