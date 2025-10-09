abstract public class CartaoWeb {
    String destinatario;
    String mensagem;

    public CartaoWeb(String destinatario, String mensagem){
        this.setDestinatario(destinatario);
        this.setMensagem(mensagem);
    }

    public abstract void ShowMessage();

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
