import java.util.Scanner;

public class ex08 {

    public static boolean estaCrescente(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i+1]) {
                return false;


            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i=0; i<numeros.length; i++){
            // ADCIONAR VALOR A CADA POSIÇÃO DO ARRAY
            System.out.println("indique um numero");
            numeros[i] = input.nextInt();
        }

        if (estaCrescente(numeros))
            System.out.println("a ordem é crescente");

    }
}

