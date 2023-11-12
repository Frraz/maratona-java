package academy.devedojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado o valor de um carro, descubra quantas vezes ele pode ser parcelado.
    // Condição valor da parcela >= 1000
    public static void main(String[] args) {
        double valorTotal = 30000;
        double valorMinParcela = 1000;
        double numeroDeParcelas = 1;
        while (valorTotal / numeroDeParcelas >= valorMinParcela) {
            System.out.println("Parcela: " + numeroDeParcelas + "x R$" + (valorTotal / numeroDeParcelas));
            numeroDeParcelas++;
        }
    }
}
