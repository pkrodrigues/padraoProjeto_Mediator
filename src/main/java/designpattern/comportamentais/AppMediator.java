package designpattern.comportamentais;

public class AppMediator {
    private static AppMediator instancia = new AppMediator();

    private AppMediator() {}

    public static AppMediator getInstancia(){
        return instancia;
    }

    public String receberReservaAcomodacao(String data, int numeroAcomodacao){
        return "O hotel recebeu sua solicitação de Reserva."+
                "E respondeu com a seguinte mensagem: '\n"+
                Hotel.getInstancia().receberReserva(data, numeroAcomodacao);
    }
    public String receberCancelamentoAcomodacao(String msg){
        return "Seu pedido foi enviado e foi respondido pelos destinatários da seguinte forma: \n"+
                Hotel.getInstancia().receberCancelamento(msg);
    }

    public String receberFeedbackDaAcomodacao(String msg) {
        return "Sua mensagem foi enviada com sucesso e teve a seguinte resposta: \n"+
                Hotel.getInstancia().receberSugestao(msg);
    }
}
