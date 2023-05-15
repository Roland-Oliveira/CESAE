public class ex11 {

    public static void main(String[] args){

        // Instanciar Contas
        ContaBancaria conta1 = new ContaBancaria(111222, 120, "Cristiano Ronaldo");
        ContaBancaria conta2 = new ContaBancaria(222222, 400, "Messi");




        System.out.println("Saldo da Conta "+conta1.getNumeroConta()+": "+conta1.getSaldo());
        System.out.println("Saldo da Conta "+conta2.getNumeroConta()+": "+conta2.getSaldo());
        System.out.println(conta1.getEmprestimo());
        System.out.println(conta1.pedirEmprestimo(108));

    }
}
