public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    private String titularConta;


    ContaBancaria(int numeroConta,  double saldo,String titularConta){
        this.numeroConta = numeroConta;
        this.saldo =  saldo;
        this.titularConta = titularConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public double getSaldo() {
        return saldo;
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





}
