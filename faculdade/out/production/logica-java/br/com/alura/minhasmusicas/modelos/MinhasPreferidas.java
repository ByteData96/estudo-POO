package Alura.src.praticandoAlura.br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if (audio.getClassificacai() >= 8) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto "
                    + " e preferido por todos.");
        } else {
            System.out.println(audio.getTitulo() + " também é um dos que todos estão" +
                    " curtindo");
        }
    }
}
