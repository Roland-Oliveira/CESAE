import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex04  {
        public static void main(String[] args) throws FileNotFoundException {
    /*ABRIR FICHEIRO EXISTENTE*/
    File ficheiroCsv = new File("exercicio_04.csv");
    Scanner meuScanner = new Scanner(ficheiroCsv);

    System.out.println(meuScanner.nextLine());
    while(meuScanner.hasNextLine()){
        System.out.println(meuScanner.nextLine());
    }
    meuScanner.close();
}

}
