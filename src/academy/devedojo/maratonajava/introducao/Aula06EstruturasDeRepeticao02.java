package academy.devedojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 1000000
        int num = 0;

        while (num < 1000000) {
            if (num % 2 == 0) {
                System.out.println(num + " par.");
            }
            num++;
        }
    }
}
