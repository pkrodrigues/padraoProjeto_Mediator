import designpattern.comportamentais.Client;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClientTest {
    @Test
    public void deveRealizarAgendamento(){
        Client client = new Client();
        assertEquals("O hotel recebeu sua solicitação de Reserva.E respondeu com a seguinte mensagem: '\nSua reserva para o dia 15/05/2023 para a acomodação de numero 302, foi realizada com Sucesso", client.agendarAcomodacao("15/05/2023", 302));
    }

    @Test
    public void deveRealizarCancelamento(){
        Client client = new Client();
        assertEquals("Seu pedido foi enviado e foi respondido pelos destinatários da seguinte forma: \nConforme o pedido descrito abaixo, realizamos o cancelamento de sua acomodação\nGostaria de cancelar o agendamento da acomodação", client.realizarCancelamento("Gostaria de cancelar o agendamento da acomodação"));
    }

    @Test
    public void deveEnviarFeedback(){
        Client client = new Client();
        assertEquals("Sua mensagem foi enviada com sucesso e teve a seguinte resposta: \nAgradecemos pelo seu feedback, e estaremos analizando o feedback abaixoÓtimo quarto, tudo bem higienizado, e local silencioso", client.realizarFeedback("Ótimo quarto, tudo bem higienizado, e local silencioso"));
    }
}
