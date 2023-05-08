public class Aluno {
    private String nomeAluno;
    private int idadeAluno;

    private String curso;
    private double mediaNota;

    public Aluno(String nomeAluno, int idadeAluno, String curso, double mediaNota ){
        this.nomeAluno = nomeAluno;
        this.idadeAluno= idadeAluno;
        this.curso = curso;
        this.mediaNota = mediaNota;
    }
    public String getNomeAluno() {
        return nomeAluno;
    }

    public int getIdadeAluno(){
        return idadeAluno;
    }

    public String getCurso(){
        return curso;
    }

    public double getMediaNota() {
        return mediaNota;
    }


    public void exibirDetalhesAluno(){
        System.out.println(getNomeAluno());
        System.out.println(getIdadeAluno());
        System.out.println(getCurso());
        System.out.println(getMediaNota());
        if(aprovadoReprovado()){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
    }



    public boolean aprovadoReprovado() {
        if (mediaNota >= 9.5) {

            return true;
        }else

        return false;
    }
}
