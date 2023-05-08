import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Circulo circulo = new Circulo(3.52);
            //Raio do circulo
        System.out.println("O raio do circulo é: " + circulo.getRaio());
        // A area do circulo é

        System.out.printf("A area do circulo é: %.2f", circulo.areaCirculo());
        System.out.println();
        System.out.printf("O perimetro do circulo é: %.2f", circulo.perimetroCirculo());
        System.out.println("--------------------");
        System.out.println("Atualizando o valor do raio");
        circulo.setRaio(4.5);
        System.out.printf("A nova area do circulo é: %.2f", circulo.areaCirculo());
        System.out.println();
        System.out.printf("O novo perimetro do circulo é: %.2f", circulo.perimetroCirculo());




    }
}
