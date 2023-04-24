import javax.swing.*;
import java.util.Scanner;
import java.util.Scanner;
import java.io.*;


public class Main {
    /*Função para ler o ficheiro*/
    public static void lerFicheiro(File ficheiro) throws FileNotFoundException{

        Scanner meuScanner = new Scanner(new File(ficheiro.toURI()));
        String linhas;
        while (meuScanner.hasNextLine()){
            linhas = meuScanner.nextLine();

            System.out.println(linhas);
        }

        meuScanner.close();

    }

    public static void matrizFicheiro(File ficheiro) throws FileNotFoundException{
        Scanner meuScanner = new Scanner(new File(ficheiro.toURI()));
        String linha = meuScanner.nextLine();
        int i =0;
        String[][] tabela = new String[100][9];
        String[] itemslinha = linha.split(";");
        while (meuScanner.hasNextLine()){

            tabela[i][0]=linha[0];
            tabela[i][1]=linha[1];
            i++;
        }


        meuScanner.close();

    }

     public static void exibirNumerosDeVendasETotal(File ficheiro) throws FileNotFoundException{
         Scanner meuScanner = new Scanner(new File(ficheiro.toURI()));
         String linha = meuScanner.nextLine();
         String idVenda,nomeCLiente,contacto,email,editora,categoria,jogo;
         int idCliente ,count=0;
         double valor, total = 0;

         while (meuScanner.hasNextLine()){

             idVenda = meuScanner.next();
             idCliente = meuScanner.nextInt();
             nomeCLiente = meuScanner.next();
             contacto = meuScanner.next();
             email = meuScanner.next();
             editora = meuScanner.next();
             categoria = meuScanner.next();
             jogo = meuScanner.next();
             valor = meuScanner.nextDouble();

             count++;
             total+=valor;

         }

         System.out.println("O numero de vendas foi: " + count + "O valor total foi: " + total);
         meuScanner.close();

    }






    public static void menu() {

        File meuFicheiro = new File("GameStart.csv");
        int opcaoMenu;

        try {


        do {
            opcaoMenu = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções: \n1 - Ler ficheiro \n 2 - Exibir número de vendas e total \n 3 - Ver Lucro  \n4 - Exibir dados de clientes \n5 - Opções de jogos e gêneros \n6 - Jogo mais caro \n 7 - sair"));
            switch (opcaoMenu){

                case 1:

                    lerFicheiro(meuFicheiro);

                    break;

                case 2:
                    exibirNumerosDeVendasETotal(meuFicheiro);
                    break;

                case 3:

                    break;

                case 4:

                    break;


                case 5:

                    break;


                case 6:

                    break;


                case 7:

                    JOptionPane.showMessageDialog(null,"Programa desligado");
                    break;




            }

        } while (opcaoMenu != 7);
        }catch (FileNotFoundException exc){
            System.out.println("Error!!!!!");
        }
    }

    public static void main(String[] args) {

        menu();




    }
}