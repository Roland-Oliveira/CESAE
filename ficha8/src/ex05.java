import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) throws FileNotFoundException {

        File meuFile = new File("exercicio_05_31.txt");
        Scanner meuScanner = new Scanner(meuFile);

        //System.out.println(meuScanner.nextLine());

        int soma=0,valor=0;

        while(meuScanner.hasNextInt()){
            valor = meuScanner.nextInt();
            soma += valor;
        }

        meuScanner.close();
        System.out.println("total= "+ soma);
    }
}
