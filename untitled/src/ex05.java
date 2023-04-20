import javax.swing.*;
import java.util.Scanner;

public class ex05 {

    public static  boolean primo(int n){
        int divisor = 2;

        if (n <=1)
            return false;
        while(divisor<n){

            //Perceber se a divisão inteira
            if(n%divisor==0){
                return false;
            }
            divisor++;
        }

        return true;


    }

    public static  boolean imparPar(int n){
        String resultado = " ";

        if (n%2 == 0){
            return true;
        } else
            return false;





    }


    public static  boolean positivo(int n){


        if (n > 0){
            return true;
        } else
            return false;





    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;


        do{
            // System.out.println("indique uma opção de menu : 1-Para descobrir se o numero é primo, 2-para descobrir se é positivo ou negativo ,4-paradesligar o programa");
            menu = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções: \n1 - Descobrir se um numero é primo \n 2 - descobrir se um numero é positivo ou negativo \n 3 - descobrir se o numero é par ou impar \n 4 - sair"));
            switch (menu){
                case 1:
                    int num;


                    //System.out.print("Introduza um número: ");
                    num=Integer.parseInt(JOptionPane.showInputDialog("Introduza um número:"));


                    if(primo(num)){
                        // System.out.println("É primo");
                        JOptionPane.showMessageDialog(null,"O numero é primo");
                    }else{
                        JOptionPane.showMessageDialog(null,"O numero não é primo");
                    }
                    break;

                case 2:
                    int n;
                    //  System.out.println("Indique um numero:");
                    n = Integer.parseInt(JOptionPane.showInputDialog("Introduza um número:"));
                    if (positivo(n)){
                        // System.out.println("O numero " + n + " é positivo");
                        JOptionPane.showMessageDialog(null,"O numero é postivo");
                    } else
                        JOptionPane.showMessageDialog(null,"O numero é negativo");
                    break;
                case 3:

                    int num1;
                    // System.out.println("Indique um numero:");
                    num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduza um número:"));

                    if (imparPar(num1)){
                        JOptionPane.showMessageDialog(null,"O numero é par");
                    } else
                        JOptionPane.showMessageDialog(null,"O numero é ímpar");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"Programa desligado");
                    break;
            }
        } while(menu !=4);
    }
}