public class Cao {
    // declarar atributos
    private String nome;
    private String raca;

    //metodo construtor

    public Cao(String nome, String raca){
        this.nome=nome;
        this.raca=raca;


    }

    // Métodos get
    public String getNome(){
        return this.nome;
    }

    public String getRaca(){
        return this.raca;
    }

    //Métodos set
    public void setNome(String nome){
        this.nome=nome;
    }

    public void setRaca(String raca){
        this.raca=raca;
    }

    public void latir(){
        System.out.println("au au au");
    }



}
