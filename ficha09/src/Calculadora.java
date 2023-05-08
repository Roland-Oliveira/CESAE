public class Calculadora {
    private double x;
    private double y;


    public Calculadora (double x, double y){
        this.x = x;
        this.y =  y;

    }

    public double adicao(){
        return  x+y;
    }

    public double subtracao(){
        return  x-y;
    }


    public double multiplicacao(){
        return  x*y;
    }

    public double divisao(){
        return x/y;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.x = y;
    }



}
