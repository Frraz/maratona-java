package academy.devedojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAut0orizadoComprarBebida = idade >= 19;
        if (idade >= 18) {
            System.out.println("Autorizado a comprar bebidas alcolicas.");
        }else {
            System.out.println("Não autorizado para comprar bebidas alcolicas");
        }

        if (!isAut0orizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebida alcolica.");
        }
        boolean c = true;
        if(c = false) {
            System.out.println("Dentro de algo que nunca deve ser feito.");
        }

            System.out.println("Fora do if");
    }
}
