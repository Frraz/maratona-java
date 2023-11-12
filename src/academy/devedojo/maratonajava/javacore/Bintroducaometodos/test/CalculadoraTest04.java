package academy.devedojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devedojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("\nDentro do CalculadoraTest04");
        System.out.println("Num1 "+num1);
        System.out.println("Num2 "+num2);
    }
}
