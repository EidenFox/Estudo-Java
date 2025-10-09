public class Aniversario extends CartaoWeb{
    public Aniversario (String destinatario, String mensagem){
        super(destinatario, mensagem);
        this.setDestinatario(destinatario);
        this.setMensagem(mensagem);
    }

    @Override
    public void ShowMessage() {
        System.out.println("--------------------");
        System.out.println("Feliz aniversário "+ this.destinatario);
        System.out.println("Mensagem: "+ this.mensagem);
    }
}
