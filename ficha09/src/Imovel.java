public class Imovel {
    private String rua;
    private int numeroPorta;
    private String cidade;
    private  TipoMoradia tipo;
    private double area;
    private int numeroQuartos;
    private int numeroWc;
    private double areaPiscina;
    private Acabamento acabamento;



    public Imovel (String rua, int numeroPorta, String cidade, TipoMoradia tipo,double area, int numeroQuartos,int numeroWc,double areaPiscina, Acabamento acabamento){
        this.rua = rua;
        this.numeroPorta =  numeroPorta;
        this.cidade =  cidade;
        this.tipo = tipo;
        this.area = area;
        this.numeroQuartos =  numeroQuartos;
        this.numeroWc = numeroWc;
        this.areaPiscina = areaPiscina;
        this.acabamento = acabamento;
    }

    public String getRua() {
        return rua;
    }

    public int getNumeroPorta() {
        return numeroPorta;
    }

    public String getCidade() {
        return cidade;
    }

    public TipoMoradia getTipo() {
        return tipo;
    }

    public double getArea() {
        return area;
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public int getNumeroWc() {
        return numeroWc;
    }

    public double getAreaPiscina() {
        return areaPiscina;
    }

    public Acabamento getAcabamento() {
        return acabamento;
    }

    public double valorImovel () {
        double valorImovel, metros, diferencaValor=1 ;

        if (tipo.equals(TipoMoradia.APARTAMENTO)){
            metros = this.area*1000;

        } else if (tipo.equals(TipoMoradia.CASA)){
            metros = this.area*3000;
        } else
            metros = this.area*5000;

        if (this.acabamento.equals(Acabamento.PARARESTAURO)){
            diferencaValor =  0.50;
        } else if (this.acabamento.equals(Acabamento.USADA)) {
            diferencaValor = 0.10;
        } else if (this.acabamento.equals(Acabamento.NOVACOMALTOACABAMENTO)){
            diferencaValor =2.5;
        }

        valorImovel = (metros + (this.numeroQuartos*7500) + (this.numeroWc*10500) + (this.areaPiscina*1000))* diferencaValor;

        return valorImovel;


    }

    public void setAcabamento(Acabamento acabamento) {
        this.acabamento = acabamento;

    }

    public void imprimirDescricao (){

        System.out.print("Morada: "+getRua());
        System.out.print(", nº " +getNumeroPorta());
        System.out.println(", " + getCidade());
        System.out.print(getTipo());
        System.out.print(", " + getArea());
        System.out.print(", quartos: "+getNumeroQuartos());
        System.out.print( ", wc: "+getNumeroWc());
        System.out.print(", piscina: " + getAreaPiscina() + "m2 ");
        System.out.println(getAcabamento());



    }


    public Imovel compararImoveis (Imovel segundoImovel){
        if (this.valorImovel() > segundoImovel.valorImovel()){

            System.out.println("Primeira casa é mais cara");
            return this;

        }else if (this.valorImovel() < segundoImovel.valorImovel()) {
            System.out.println("Segunda casa é mais cara");
            return segundoImovel;
        } else{
            System.out.println("Ambas as casas possuem o mesmo valor! ");
            return null;
        }


    }
}
