package academy.devedojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01 + numero02;
        System.out.println(resultado);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQue20 = 10 > 20;
        System.out.println(isDezMaiorQue20);

        // && (AND) ||(or) !
        int idade = 35;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQue30 = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQue30 = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQue30 " + isDentroDaLeiMaiorQue30);
        System.out.println("isDentroDaLeiMenorQue30 " + isDentroDaLeiMenorQue30);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        // == +- -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        System.out.println(bonus);

    }
}
