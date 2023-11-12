package academy.devedojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while e for
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;
        }

        count = 0;
        do {
            System.out.println("Dentro do while /**/" + count++);
        } while (count < 10);

        count = 0;
        int i;
        for (i = 0; i< 10; i++) {
            System.out.println("For" +1);
        }

    }
}
