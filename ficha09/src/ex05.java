import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Carro mcqueen =  new Carro("mazda","RX8",1886, 40,2600,TipoCombustivel.DIESEL,16);
        Carro ferrari =  new Carro("Ferrari","Ferrari",2010,40,2700,TipoCombustivel.GASOLINA,20);

        // apresentando atributos
        /*
        System.out.println("A marca do carro é:" + mcqueen.getMarca());
        System.out.println("O modelo do carro é: " + mcqueen.getModelo());
        System.out.println("O ano de fabrico é: " + mcqueen.getAnoFabrico());
        */
        mcqueen.ligarCarro();
        mcqueen.kaChow();

        mcqueen.corrida(ferrari);
        System.out.println(mcqueen.consumo(97));
        System.out.println(ferrari.consumo(97));


    }
}
