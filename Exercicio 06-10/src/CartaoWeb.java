abstract public class CartaoWeb {
    String destinatario;

    public CartaoWeb(String destinatario){
        this.setDestinatario(destinatario);
    }

    public abstract void ShowMessage();

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
}
