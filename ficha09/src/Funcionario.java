public class Funcionario {
    private String nomeFuncionario;
    private double salario;
    private String departamento;


    public Funcionario(String nomeFuncionario, double salario, String departamento){
        this.nomeFuncionario = nomeFuncionario;
        this.salario= salario;
        this.departamento =  departamento;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public double getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void detalhesFuncionario() {
        System.out.println(getNomeFuncionario());
        System.out.println(getSalario());
        System.out.println(getDepartamento());
    }

    public double aumentoSalario(double n){
        salario = salario+(salario*(n/100));
        return salario;
    }

}
