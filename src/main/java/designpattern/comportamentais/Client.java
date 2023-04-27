package designpattern.comportamentais;

public class Client {
    public String agendarAcomodacao(String data, int numeroAcomodacao ){
        return AppMediator.getInstancia().receberReservaAcomodacao(data, numeroAcomodacao);
    }

    public String realizarCancelamento(String msg){
        return AppMediator.getInstancia().receberCancelamentoAcomodacao(msg);
    }
}
