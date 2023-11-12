package academy.devedojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario > 5000
        double salario = 6000;
        /*String mensagemDoar = "Eu vou doar 500 pro devDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";*/
        //(condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? "Eu vou doar 500 pro devDojo" : "Ainda não tenho condições, mas vou ter!";



        /*if(salario >= 5000){
            resultado = mensagemDoar;
        } else{
            resultado = mensagemNaoDoar;
        }*/
        System.out.println(resultado);
    }
}
