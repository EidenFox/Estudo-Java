public class DiaDosNamorados extends CartaoWeb{
    public  DiaDosNamorados (String destinatario){
        super(destinatario);
        this.setDestinatario(destinatario);
    }

    @Override
    public void ShowMessage() {
        System.out.println("Feliz Dia dos Namorados "+ this.destinatario);
    }
}
