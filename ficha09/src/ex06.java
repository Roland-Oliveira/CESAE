import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("introduza o primeiro numero:");
        double num1 = input.nextDouble();

        System.out.println("introduza o segundo numero:");
        double num2 = input.nextDouble();

        Calculadora calculadora =  new Calculadora(num1,num2);

        System.out.println();
        String op;

        do {
            System.out.println("Escolha sua operação +, -, *, / e 0 para desligar o programa ");
             op = input.next();

            switch (op){

                case "+":
                    System.out.println(calculadora.adicao());
                    break;
                case "-":
                    System.out.println(calculadora.subtracao());
                    break;
                case "*":
                    System.out.println(calculadora.multiplicacao());
                    break;
                case "/":
                    System.out.println(calculadora.divisao());
                    break;

                case "0":
                    System.out.println("calculadora desligada");
                    break;
                default:
                    System.out.println("opção incorreta");
                    break;



            }


        }while (!op.equals("0"));



    }
}
