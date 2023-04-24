import java.io.*;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) throws FileNotFoundException {
       /*ABRIR FICHEIRO EXISTENTE*/
        File meuFile = new File("hello.txt");
        Scanner meuScanner = new Scanner(meuFile);

        System.out.println(meuScanner.nextLine());

        meuScanner.close();
    }
}
