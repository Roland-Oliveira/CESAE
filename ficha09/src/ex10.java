import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Funcionario roland = new Funcionario("Roland",14500,"Informatica");
        System.out.println("Detalhes funcionario");
        roland.detalhesFuncionario();

        roland.aumentoSalario(20);
        System.out.println("funcionario após aumento");
        roland.detalhesFuncionario();



    }
}
