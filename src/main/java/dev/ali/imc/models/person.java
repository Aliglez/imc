package dev.ali.imc;

public class person {
    public String name;
    public double peso;
    public double altura;

    public person(String name, double peso, double altura) {
        this.name = name;
        this.peso = peso;
        this.altura = altura;
    }

    public String getName() {
        return name;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }  
    
}
