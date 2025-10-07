public class Natal extends CartaoWeb{
    public Natal (String destinatario){
        super(destinatario);
        this.setDestinatario(destinatario);
    }

    @Override
    public void ShowMessage() {
        System.out.println("Feliz Natal "+ this.destinatario);

    }
}
