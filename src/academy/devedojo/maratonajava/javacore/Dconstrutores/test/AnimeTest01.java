package academy.devedojo.maratonajava.javacore.Dconstrutores.test;


import academy.devedojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyu","TV",12,"Ação" , "productig");
        Anime anime2 = new Anime();
        /*anime.init("Akurama Drive","TV",12);
        anime.init2("Akurama Drive","TV",12,"Ação");*/
        /*anime.setNome("Akurama Drive");
        anime.setTipo("TV");
        anime.setEpisodios(12);*/
        anime.imprime();
        anime2.imprime();

    }

}
