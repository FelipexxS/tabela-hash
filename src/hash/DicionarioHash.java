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

    final int funcaoHash(String palavra) {
        
        //Calcula o valor do hash da palavra
        palavra = palavra.toLowerCase();
        int posicao = palavra.charAt(0);
        return posicao - 97;
    }

    final void addTabela(String palavra, String descricao) {
        Vetor[funcaoHash(palavra)].insereValor(palavra, descricao);
    }


    final void excluirItem(String palavra) {
        System.out.println("***Itens nesse indice:***\n");
        Vetor[funcaoHash(palavra)].imprimeLista();
        Vetor[funcaoHash(palavra)].removeValor(palavra);
        System.out.println("***Itens nesse indice após excluir:***\n");
        Vetor[funcaoHash(palavra)].imprimeLista();

    }

    final void buscaPalavra(String palavra) {
        
        System.out.println(Vetor[funcaoHash(palavra)].buscarValor(palavra).getDescricao());
    }
    


}
