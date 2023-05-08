public class Carro {
    private String marca;
    private String modelo;
    private int anoFabrico;

    public Carro (String marca, String modelo,int anoFabrico){
        this.marca=marca;
        this.modelo=modelo;
        this.anoFabrico=anoFabrico;
    }

    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public int getAnoFabrico(){
        return this.anoFabrico;
    }

    public void ligarCarro(){
        System.out.println("O carro ligou vrum vrum");
    }

    public void kaChow(){
        System.out.println("Ka-chow");
    }

}
