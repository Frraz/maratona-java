package academy.devedojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devedojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Ferrari";
        carro1.modelo = "F911";
        carro1.ano = 2019;

        carro2.nome = "Lamborghini";
        carro2.modelo = "Aventador";
        carro2.ano = 2023;

        carro1 = carro2;

        System.out.println("Primeiro carro:");
        System.out.println("Nome: " + carro1.nome + " Modelo: " + carro1.modelo + " Ano: " + carro1.ano);
        System.out.println("\nSegundo carro");
        System.out.println("Nome: " + carro2.nome + " Modelo: " + carro2.modelo + " Ano: " + carro2.ano);

    }
}
