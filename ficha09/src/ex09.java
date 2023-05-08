import java.util.Scanner;

public class ex09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Produto garrafa = new Produto("Garrafa",10,5);

        garrafa.comprar(5);

        System.out.println(garrafa.getStock());

        garrafa.vender(2);
        System.out.println(garrafa.getStock());




    }
}
