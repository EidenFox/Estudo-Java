public class Natal extends CartaoWeb{
    public Natal (String destinatario, String mensagem){
        super(destinatario, mensagem);
        this.setDestinatario(destinatario);
        this.setMensagem(mensagem);
    }

    @Override
    public void ShowMessage() {
        System.out.println("--------------------");
        System.out.println("Feliz Natal "+ this.destinatario);
        System.out.println("Mensagem: "+ this.mensagem);
    }
}
