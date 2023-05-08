public class Retangulo {
    private double altura;
    private double largura;

    public Retangulo (double altura, double largura){
        this.altura =  altura;
        this.largura = largura;

    }

    public double getAltura(){
        return this.altura;
    }

    public double getLargura(){
       return this.largura;
    }

    public double area(){
        return  this.altura * this.largura;
    }

    public double perimetro(){
        return (this.altura*2) + (this.largura*2);
    }

}
