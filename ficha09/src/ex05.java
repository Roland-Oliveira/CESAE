import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Carro mcqueen =  new Carro("mazda","RX8",2006);

        // apresentando atributos
        System.out.println("A marca do carro é:" + mcqueen.getMarca());
        System.out.println("O modelo do carro é: " + mcqueen.getModelo());
        System.out.println("O ano de fabrico é: " + mcqueen.getAnoFabrico());

        mcqueen.ligarCarro();
        mcqueen.kaChow();

    }
}
