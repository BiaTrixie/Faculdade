package atividade02;

public class Animal {
    private String nome;
    private String especie;
    int idade;

    public Animal(String nome, String especie, int idade) {
    this.nome = nome;
    this.especie = especie;
    this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String emitirSom(){
        return "Este animal faz um som!";
    }

    @Override
    public String toString() {
        return "Animal" + "\nNome = " + nome + " \nEspecie = " + especie +"\nIdade = " + idade +  "\n" + emitirSom() + "\n";
    }

    
}
