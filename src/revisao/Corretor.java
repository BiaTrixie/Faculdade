package revisao;

public class Corretor {
   String nomeCorretor;
   String registro;
   Imovel imovel;

public Corretor (String nomeCorretor, String registro, Imovel imovel){
    this.nomeCorretor = nomeCorretor;
    this.registro = registro;
    this.imovel = imovel;
}

public String getNomeCorretor() {
    return nomeCorretor;
}

public void setNomeCorretor(String nomeCorretor) {
    this.nomeCorretor = nomeCorretor;
}

public String getRegistro() {
    return registro;
}

public void setRegistro(String registro) {
    this.registro = registro;
}

public Imovel getImovel() {
    return imovel;
}

public void setImovel(Imovel imovel) {
    this.imovel = imovel;
}


public String exibirInfoCorretor() {
    return "Corretor \nnomeCorretor = " + nomeCorretor + "\nregistro = " + registro + "\nimovel = " + imovel + "\n";
}
    
}
