package academy.devedojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Dado os valores de 1 a 7, imprima se é dia útil o final de semana
        // Considerando 1 como domingo

        byte dia = 4;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        if(dia >= 2 && dia <= 6){
            System.out.println("Meio da semana.");
        }
        else {
            System.out.println("Final de semana.");
        }

    }
}
