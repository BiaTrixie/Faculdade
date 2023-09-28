package revisao;

public class Imovel {
    String endereco;
    String tipo;
    double valor;
    Cliente cliente;

public Imovel (String endereco, String tipo, double valor, Cliente cliente){
    this.endereco = endereco;
    this.tipo = tipo;
    this.valor = valor;
    this.cliente = cliente;
}

public String getEndereco() {
    return endereco;
}

public void setEndereco(String endereco) {
    this.endereco = endereco;
}

public String getTipo() {
    return tipo;
}

public void setTipo(String tipo) {
    this.tipo = tipo;
}

public double getValor() {
    return valor;
}

public void setValor(double valor) {
    this.valor = valor;
}

public Cliente getCliente() {
    return cliente;
}

public void setCliente(Cliente cliente) {
    this.cliente = cliente;
}

public String toString() {
     return "Imovel \nendereco = " + endereco + "\ntipo = " + tipo + "\nvalor = " + valor + "\ncliente = " + cliente + "\n";
}


    

}
