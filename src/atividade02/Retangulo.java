package atividade02;

public class Retangulo {
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;

    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
    
    public double area(){
       return altura *largura;
    }
    
    @Override
    public String toString() {
        return "Retangulo" + "\nAltura = " + altura + " \nLargura = " + largura +"\nArea do Retangulo = " + area() + "\n";
    }
}
