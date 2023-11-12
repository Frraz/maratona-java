package academy.devedojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salario = 70000;

        if(salario <= 34712){
            double salarioComDesconto = salario * 0.097;
            System.out.println("Valor com desconto: € " + salarioComDesconto);
            System.out.println("Valor do imposto : €" + (salario - salarioComDesconto));
        }
        else if (salario > 34712 && salario < 68507) {
            double salarioComDesconto = salario * 0.3735;
            System.out.println("Valor com desconto: € " + salarioComDesconto);
            System.out.println("Valor do imposto : €" + (salario - salarioComDesconto));
        }
        else {
            double salarioComDesconto = salario * 0.495;
            System.out.println("Valor com desconto: € " + salarioComDesconto);
            System.out.println("Valor do imposto : €" + (salario - salarioComDesconto));
        }

    }
}
