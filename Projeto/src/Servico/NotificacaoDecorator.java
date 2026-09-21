package Servico;

public class NotificacaoDecorator implements Notificador {
    private final Notificador operacaoOriginal;
    private final String tipoAcao;


    public NotificacaoDecorator(Notificador operacaoOriginal, String tipoAcao) {
        this.operacaoOriginal = operacaoOriginal;
        this.tipoAcao = tipoAcao;
    }

    @Override
    public void enviar(String mensagem) {
        operacaoOriginal.enviar(mensagem);
        System.out.println("[SISTEMA] Sucesso: Ação de "+tipoAcao+" concluida para o item");
    }


}
