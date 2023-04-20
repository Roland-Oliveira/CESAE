import java.util.Random;
import java.util.Scanner;

public class ex07 {
    public static int menor(int[] numeros) {
        int menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int[] numeros = new int[10];

        for (int i=0; i<numeros.length; i++){
            // ADCIONAR VALOR A CADA POSIÇÃO DO ARRAY

            numeros[i] = rand.nextInt(101) ;
        }




        System.out.println("O menor número é: " + menor(numeros));




    }
}


