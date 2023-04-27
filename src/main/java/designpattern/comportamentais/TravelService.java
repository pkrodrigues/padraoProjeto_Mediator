package designpattern.comportamentais;

public interface TravelService {
    String receberReserva(String data, int numeroAcomodacao);
    String receberCancelamento(String msg);
    String receberSugestao(String msg);
}
