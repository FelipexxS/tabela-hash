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

}
