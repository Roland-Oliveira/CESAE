import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex07
{
    public static void main(String[] args) throws FileNotFoundException {
        /*ABRIR FICHEIRO EXISTENTE*/
        File meuFile = new File("exercicio_07.txt");
        Scanner meuScanner = new Scanner(meuFile);
        Scanner meuScannerLinhas = new Scanner(meuFile);


        int linhas=0, palavras=0;

        while(meuScannerLinhas.hasNextLine()){

            meuScannerLinhas.nextLine();
            linhas++;
        }

        while(meuScanner.hasNext()){
           meuScanner.next();
            palavras++;
        }
        System.out.println("O numero de linhas é: "+ linhas + " ,o numero de palavras é:" +palavras );



    }
}
