import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("insira uma altura");
        double altura = input.nextDouble();
        System.out.println("insira uma largura");
        double largura = input.nextDouble();

        Retangulo retangulo = new Retangulo(altura,largura);
        System.out.println(retangulo.getLargura());
        System.out.println(retangulo.getAltura());
        System.out.println(retangulo.area());
        System.out.println(retangulo.perimetro());




    }

}
