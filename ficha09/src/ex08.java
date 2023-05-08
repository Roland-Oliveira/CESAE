import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o nome do Aluno");
        String nome = input.next();
        System.out.println("Insira a idade do Aluno");
        int idade = input.nextInt();
        System.out.println("Insira o Curso do Aluno");
        String curso = input.next();
        System.out.println("Insira a media do Aluno");
        double media = input.nextDouble();

        Aluno roland = new Aluno(nome,idade,curso,media);

        roland.exibirDetalhesAluno();

    }
}
