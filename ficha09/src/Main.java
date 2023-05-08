import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declarar variáveis

        String nome =  "Roland";
        int idade = 25;
        double altura = 1.7;

        // Instaciar um objeto da classe pessoa
            Pessoa roland = new Pessoa(nome,idade,altura);

        // Instaciar um objeto da classe pessoa
            Pessoa ana =  new Pessoa("Ana",20,1.5);


        System.out.println("O nome da primeira pessoa é: " + roland.getNome());
        System.out.println("A idade da primeira pessoa é: " + roland.getIdade());
        System.out.println("A altura da primeira pessoa é: " + roland.getAltura());

        System.out.println();

        System.out.println("O nome da primeira pessoa é: " + ana.getNome());
        System.out.println("A idade da primeira pessoa é: " + ana.getIdade());
        System.out.println("A altura da primeira pessoa é: " + ana.getAltura());

        System.out.println("\n_________________________________________\n");
        //Perguntar ao utilizador informações para criar uma pessoa

        System.out.println("Insira o nome da pessoa");
        String nomePessoa= input.next();

        System.out.println("Insira a idade da pessoa");
        int idadePessoa =  input.nextInt();

        System.out.println("Insira a altura da pessoa");
        double alturaPessoa = input.nextDouble();

        // instanciar um objeto da classe pessoa

        Pessoa novaPessoa = new Pessoa(nomePessoa,idadePessoa,alturaPessoa);

        System.out.println("O nome da  pessoa é: " + novaPessoa.getNome());
        System.out.println("A idade da pessoa é: " + novaPessoa.getIdade());
        System.out.println("A altura da  pessoa é: " + novaPessoa.getAltura());


    }
}