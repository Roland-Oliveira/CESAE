import java.util.ArrayList;
import java.util.Scanner;
public class Animal {
    private String nome;
    private String especie;
    private String paisOrigem;
    private double peso;
    private ArrayList<String> alimentacao;

    public  Animal (String nome, String especie, String paisOrigem,double peso, ArrayList<String> alimentacao){
        this.nome = nome;
        this.especie =  especie;
        this.paisOrigem =  paisOrigem;
        this.peso = peso;
        this.alimentacao =  alimentacao;
    }

    public double getPeso() {
        return peso;
    }

    public boolean Alimentar(String alimento,double peso){

        if (alimento.equals("banana")) {
            System.out.println("não gosta de " + alimento);
        } else{
            for (String i :this.alimentacao){
                System.out.println("O "+ this.nome + " comeu");
                this.peso+=peso;
                return true;
        }
        }
        System.out.println("O animal rejeitou a comida");

        return false;
    }


    }


