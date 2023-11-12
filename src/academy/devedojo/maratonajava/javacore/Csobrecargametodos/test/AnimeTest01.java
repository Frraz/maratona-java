package academy.devedojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devedojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akurama Drive","TV",12);
        anime.init2("Akurama Drive","TV",12,"Ação");
        /*anime.setNome("Akurama Drive");
        anime.setTipo("TV");
        anime.setEpisodios(12);*/
        anime.imprime();
    }

}
