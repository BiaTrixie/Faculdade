package revisao;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente( "jõao", "62 98765-3280");
        cliente1.exibirInfoCliente();

        Imovel imovel1 = new Imovel("Rua das flores","Casa" , 1500, cliente1);
        imovel1.exibirInfoImovel();

        Corretor corretor1 = new Corretor("Alberto", "CRECI: 008765", imovel1);
        corretor1.exibirInfoCorretor();

        System.out.println(cliente1.exibirInfoCliente());
        System.out.println(imovel1.exibirInfoImovel());
        System.out.println(corretor1.exibirInfoCorretor());
    }
}
