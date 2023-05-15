public class PessoaAgenda {
    private String nome;
    private int idade;
    private String email;
    private int telemovel;

    public PessoaAgenda (String nome, int idade, String email, int telemovel){

        this.nome =  nome;
        this.idade = idade;
        this.email =  email;
        this.telemovel = telemovel;

    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getTelemovel() {
        return telemovel;
    }

    public String getEmail() {
        return email;
    }
}


