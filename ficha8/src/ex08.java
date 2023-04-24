import java.io.*;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("exercicio_07.txt"));
        int i = 0;
        String p = in.nextLine()+"_";
        String res = "";
        String a = "turma";
        String b = "aluno";

        while (in.hasNextLine()){
            p+=in.nextLine()+"_";
            i++;
        }
        String pal [] = p.split("_");

        for (int x = 0;x< pal.length;x++){
            if (pal[x].contains(b)){
                res+=pal[x]+"\n";
            }
        }

        File ficheiro = new File("C:copy_ex08.txt");
        PrintWriter imprimeFicheiro = new PrintWriter(ficheiro);
        imprimeFicheiro.print(res);
        imprimeFicheiro.close();
        in.close();
    }
}