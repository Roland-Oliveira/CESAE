import java.util.Scanner;
public class ex03 {
    public static boolean primo(int num) {

        // Declara as variáveis locais
        int divisor = 2;


        //Considerar exceções como 0, 1 e números negativos
        if (num <= 1) {
            return false;
        }
        while(divisor<num){

            //Perceber se a divisão inteira
            if(num%divisor==0){
                return false;
            }
            divisor++;
        }

        return true;
    }


    public static void main(String[] args) {

        // Declarar variáveis
        int num;

        // Declaro o Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("***** Ficha 06 - Exercicio 3 *****");

        //Ler número inteiro do utilizador
        System.out.print("Introduza um número: ");
        num=input.nextInt();

        // Invocar a função "par"
        if(primo(num)){
            System.out.println("É primo");
        }else{
            System.out.println("Não é primo");
        }




    }
}
