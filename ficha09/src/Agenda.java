import java.util.ArrayList;
public class Agenda {
    private ArrayList<PessoaAgenda> pessoas = new ArrayList<PessoaAgenda>();
    public Agenda() {

    }

    public void addPessoa(PessoaAgenda x){
        pessoas.add(x);
    }

    public void printAgenda(){

        for (PessoaAgenda i: pessoas){

            System.out.println(i.getNome());
            System.out.println(i.getIdade());
            System.out.println(i.getEmail());
            System.out.println(i.getTelemovel());
            System.out.println();
        }


    }
}
