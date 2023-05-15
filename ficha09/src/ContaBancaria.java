import java.sql.SQLOutput;
import java.util.Scanner;

public class ContaBancaria {
    private int numeroConta;
    private double saldo,emprestimo, divida;
    private String titularConta;

    private int criacaoConta;


    ContaBancaria(int numeroConta,  double saldo,String titularConta){
        this.numeroConta = numeroConta;
        this.saldo =  saldo;
        this.titularConta = titularConta;
        this.criacaoConta = 2023;



    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getEmprestimo() {
        this.emprestimo= saldo*0.9;
        return emprestimo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getDivida() {
        return divida;
    }

   public double transfer(int x){
        saldo -= x;
        return saldo;
   }

    public boolean transferencia (double valor, ContaBancaria contaDestino){

        // Verificar se a conta remetente tem saldo suficiente
        if(this.saldo>=valor){
            // Subtraio ao saldo da conta remetente
            this.saldo-=valor;
            // Incremento ao saldo da conta destino
            contaDestino.saldo+=valor;
            // Mensagem de sucesso
            System.out.println("Transferência Concluida");
            return true;
        }else{
            // Mensagem de erro
            System.out.println("Erro ao Transferir");
            return false;
        }
    }


    public boolean saque (double valor){
        if (this.saldo >= valor){
            this.setSaldo(this.getSaldo()-valor);
            System.out.println("Levantamento bem sucedido!");
            return true;
        }else
            System.out.println("Saldo insuficiente :^(");
        return false;
    }


    public void depositar(double valor){
        // Incremento ao saldo da conta
        this.setSaldo(this.getSaldo()+valor);
    }


    public boolean pedirEmprestimo(double valor){
        if(this.emprestimo>=valor && this.divida==0){ // Tem margem de empréstimo suficiente e nenhuma dívida pendente
            // Atualizar o saldo da conta
            this.setSaldo(this.getSaldo()+valor);
            // Atualizo o valor em dívida
            this.divida+=valor;

            return true;
        }else{ // Não é possível pedir o empréstimo
            return false;
        }
    }







}
