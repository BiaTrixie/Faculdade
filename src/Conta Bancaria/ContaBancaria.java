public class ContaBancaria {
    private String nomeCliente;
    private double saldo;

    // Método Contrutor, todo contrutor tem o memso nome da classe
    public ContaBancaria() {
        nomeCliente = "Não foi informado!";
        saldo = 0.0;
    }

    public ContaBancaria(String nome) {
        nomeCliente = nome;
        saldo = 0.0;
    }

    public ContaBancaria(String nome, double saldoInicial) {
        nomeCliente = nome;
        saldo = saldoInicial;
    }

    public String toString() {
        return "Cliente: " + nomeCliente + " >>> Saldo R$ " + saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
        } else {
            System.out.println("NÃO pode depositar valores negativos!");
        }

    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
            return true;
        } else {
            return false;
        }

    }

    public void transferir(ContaBancaria outraConta, double valor) {
        boolean saqueOK = sacar(valor);
        if (saqueOK == true) {
            outraConta.depositar(valor);
        }
    }
}
