import java.io.*;

public class Main {



    public static void main(String[] args) throws FileNotFoundException {
        String conteudoFicheiro = "Hello";
        /*CRIAR FICHEIRO VAZIO*/
        File nomeFile = new File("hello.txt");
        PrintWriter criarFicheiro = new PrintWriter(nomeFile);
        /*FIM DA CRIAÇÃO*/

        /*IMPRIMIR CONTEUDO NO FICHEIRO ATÉ AGORA VAZIO \/ */
        criarFicheiro.print(conteudoFicheiro);

        /*FECHAR FICCHEIRO PARA SALVAR*/
        criarFicheiro.close();
    }
}