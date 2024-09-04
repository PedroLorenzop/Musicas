package br.com.alura.minhasmusicas.modelos;

public class Preferidas {

    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 8){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto por todos");
        }
        else{
            System.out.println(audio.getTitulo() + " Esta na moda");
        }
    }
}
