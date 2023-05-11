import java.io.*;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) throws FileNotFoundException {
        /*ABRIR FICHEIRO EXISTENTE*/
        File meuFile = new File("exercicio_06.txt");
        Scanner meuScanner = new Scanner(meuFile);
        int i =0;
       String[][] tabela = new String[33][2];

       //Grava cada linha do ficheiro numa posição da matriz de forma estruturada
        while (meuScanner.hasNextLine()){
            String linha[];
             linha = meuScanner.nextLine().split(",") ;
            tabela[i][0]=linha[0];
            tabela[i][1]=linha[1];
            i++;

            
        }

        int maiorIdade = 0,lineMaiorIdade=0;

        for(int line=0;line< tabela.length;line++){
            for(int col=0;col<tabela[0].length;col++){

                System.out.println("Tabela["+line+"]["+col+"]: "+tabela[line][col]);

                    int idade = Integer.parseInt(tabela[line][1]);
                    if (idade > maiorIdade) {
                        maiorIdade = idade;
                        lineMaiorIdade = line;

                    }


            }

        }





        System.out.println("A idade mais alta é do: " + tabela[lineMaiorIdade][0]);


        meuScanner.close();

    }
}

