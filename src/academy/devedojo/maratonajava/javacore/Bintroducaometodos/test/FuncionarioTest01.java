package academy.devedojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devedojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionarios;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionarios funcionario01 = new Funcionarios();

        funcionario01.setNome("Warley");
        funcionario01.setIdade(21);
        funcionario01.setSalario(new double[]{1600.60, 1900.40, 2000.50});
        funcionario01.imprime();
    }
}
