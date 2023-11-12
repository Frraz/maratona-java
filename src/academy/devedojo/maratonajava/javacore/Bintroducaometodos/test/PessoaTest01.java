package academy.devedojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devedojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        /*pessoa.nome = "Jiraya";
        pessoa.idade = 70;*/

        pessoa.setNome("Warley");
        pessoa.setIdade(21);
        /*pessoa.imprime();*/

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
