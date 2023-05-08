public class Circulo {
    private double raio;

    public Circulo (double raio){
        this.raio =  raio;
    }

    public double getRaio(){
        return this.raio;
    }


    public void setRaio(double raio){
        this.raio = raio;
    }

    public double areaCirculo(){
        return  3.14*(this.raio*this.raio);
    }

    public double perimetroCirculo(){
        return (2 * 3.14) * this.raio;
    }
}
