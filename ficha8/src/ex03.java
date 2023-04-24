import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) throws FileNotFoundException {

        /*CRIAR FICHEIRO VAZIO*/
        File nomeFile = new File("novo.txt");
        PrintWriter criarFicheiro = new PrintWriter(nomeFile);
        /*FIM DA CRIAÇÃO*/

        File meuFile = new File("hello.txt");
        Scanner meuScanner = new Scanner(meuFile);

        String novoFicheiro = meuScanner.nextLine();


        /*CRIAR FICHEIRO  \/ */
        criarFicheiro.print(novoFicheiro);



        /*FECHAR FICCHEIRO PARA SALVAR*/
        criarFicheiro.close();


    }
}
