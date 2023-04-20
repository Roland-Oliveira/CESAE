import java.util.Scanner;
public class ex02 {
    public static boolean positivo(int num){

        // Verifica se o número é igual ou superior a 0
        if(num>=0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {

        // Declarar variáveis
        int num;

        // Declaro o Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("***** Ficha 06 - Exercicio 2 *****");

        //Ler número inteiro do utilizador
        System.out.print("Introduza um número: ");
        num=input.nextInt();

        // Invocar a função "par"
        if(positivo(num)){
            System.out.println("É positivo");
        }else{
            System.out.println("É negativo");
        }


    }



}
