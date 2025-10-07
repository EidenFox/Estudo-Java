public class Aniversario extends CartaoWeb{
    public Aniversario (String destinatario){
        super(destinatario);
        this.setDestinatario(destinatario);
    }

    @Override
    public void ShowMessage() {
        System.out.println("Feliz aniversário "+ this.destinatario);

    }
}
