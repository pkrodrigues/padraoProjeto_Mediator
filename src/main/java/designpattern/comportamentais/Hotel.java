package designpattern.comportamentais;

public class Hotel implements TravelService{
    private static Hotel instancia = new Hotel();
    private Hotel() {}

    public static Hotel getInstancia(){
        return instancia;
    }
    public String receberReserva(String data, int numeroAcomodacao){
        return "Sua reserva para o dia "+data+" para a acomodação de numero "+numeroAcomodacao+
                ", foi realizada com Sucesso";
    }
    public String receberCancelamento(String msg){
        return "Conforme o pedido descrito abaixo, realizamos o cancelamento de sua acomodação\n"+msg;
    }
    public String receberSugestao(String msg){
        return "Agradecemos pelo seu feedback, e estaremos analizando o feedback abaixo"+ msg;
    }
}
