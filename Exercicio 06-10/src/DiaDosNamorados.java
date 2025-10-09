public class DiaDosNamorados extends CartaoWeb{
    public  DiaDosNamorados (String destinatario, String mensagem){
        super(destinatario, mensagem);
        this.setDestinatario(destinatario);
        this.setMensagem(mensagem);
    }

    @Override
    public void ShowMessage() {
        System.out.println("--------------------");
        System.out.println("Feliz Dia dos Namorados "+ this.destinatario);
        System.out.println("Mensagem: "+ this.mensagem);
    }
}
