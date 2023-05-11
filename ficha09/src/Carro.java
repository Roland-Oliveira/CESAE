public class Carro {
    private String marca;
    private String modelo;
    private int anoFabrico;

    private int potencia;
    private int cilindrada;
    private  TipoCombustivel combustivel;
    private double consumoL100;



    public Carro (String marca, String modelo,int anoFabrico,int potencia, int cilindrada,  TipoCombustivel combustivel, double consumoL100){
        this.marca=marca;
        this.modelo=modelo;
        this.anoFabrico=anoFabrico;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.combustivel = combustivel;
        this.consumoL100 = consumoL100;

    }

    public Carro corrida (Carro carroadv){
        if (this.potencia > carroadv.potencia){
            System.out.println("O carro " + this.marca + " venceu a corrida");
            return this;
        }
        else if (this.potencia < carroadv.potencia) {
            System.out.println("O carro " + carroadv.marca + " venceu a corrida");
            return carroadv;
        }else {
            if (this.cilindrada > carroadv.cilindrada) {
                System.out.println("O carro " + this.marca + " venceu a corrida");
                return this;
            } else if (this.cilindrada < carroadv.cilindrada) {
                System.out.println("O carro " + carroadv.marca + " venceu a corrida");
                return carroadv;

            } else {
                if ((2023 - this.anoFabrico) > (2023 - carroadv.anoFabrico)) {
                    System.out.println("O carro " + this.marca + " venceu a corrida");
                    return this;
                }
                else if ((2023 - this.anoFabrico) > (2023 - carroadv.anoFabrico)) {
                System.out.println("O carro " + carroadv.marca + " venceu a corrida");
                return this;
            }
        }

        }
        return null;
    }

    public double consumo (double distancia){
        double consumo = distancia*(this.consumoL100/100);
        return consumo;
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
        if ((2023-anoFabrico) <= 30) {
            if (potencia >= 250)
                System.out.println("O carro ligou! VRUM VRUM");
            else
                System.out.println("O cara está ligado! Vrummmmmmmm");
        } else
            if (this.combustivel.equals(TipoCombustivel.DIESEL)){
                System.out.println("Dieta um pouco de fumo.. custa a pegar.. O cara está ligado! Vrum-vrum-vrum");
            } else
                System.out.println("Custa a pegar o carro está ligado Vrum-vrum-vrum");
    }

    public void kaChow(){
        System.out.println("Ka-chow");
    }




}
