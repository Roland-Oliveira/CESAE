import java.util.ArrayList;
import java.util.Scanner;
public class MainAnimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        ArrayList<String> alimentos = new ArrayList<String>();
        alimentos.add("carne");
        alimentos.add("banana");
        alimentos.add("pera");


        System.out.print("Introduza o Nome do Animal: ");
        String nome= input.next();

        System.out.print("Introduza a Espécie do Animal: ");
        String especie= input.next();

        System.out.print("Introduza o País do Animal: ");
        String pais= input.next();

        System.out.print("Introduza o Peso (Kg) do Animal: ");
        double peso= input.nextDouble();



        Animal animal1 =  new Animal(nome,especie,pais,peso, alimentos);

        System.out.println(animal1.getPeso());

        System.out.println("Qual alimento o Animal vai comer: ");
        String alimento = input.next();
        System.out.println("Peso alimento em kg");
        double quantidade = input.nextDouble();

        System.out.println(animal1.Alimentar(alimento, quantidade));

        System.out.println("Peso após o animal ter comido "+animal1.getPeso());


    }
}
