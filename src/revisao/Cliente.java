package revisao;

public class Cliente {
    String nome;
    String contato;

    public Cliente(String nome, String contato){
        this.nome = nome;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String toString() {
        return "cliente \nnome = " + nome + "\ncontato = " + contato + "\n";
    }

    
    
}
