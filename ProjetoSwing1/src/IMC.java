import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IMC extends JFrame{
    private JPanel Principal;
    private JTextField tf_Peso;
    private JTextField tf_Altura;
    private JButton calcularButton;
    private JButton limparCamposButton;
    private JTextField tf_IMC;
    private JTextField tf_Classificacao;

    public void classificacao(Double imc){
        if(imc < 18.5) tf_Classificacao.setText("Abaixo do peso");
        else if (imc < 24.9) tf_Classificacao.setText("Peso Normal");
        else if (imc < 29.9) tf_Classificacao.setText("Sobrepeso");
        else if (imc < 34.9) tf_Classificacao.setText("Obesidade grau 1");
        else if (imc < 39.9) tf_Classificacao.setText("Obresidade grau 2");
        else tf_Classificacao.setText("Obesidade grau 3 (Severa)");
    }


    public IMC(){
        setContentPane(Principal);
        setVisible((true));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 500);
        setTitle("Calculadora de IMC");
        setLocationRelativeTo(null);


        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                try{
                    double peso =  Double.parseDouble(tf_Peso.getText());
                    double altura =  Double.parseDouble(tf_Altura.getText());
                    double imc = 0;

                    if (peso > 0 && altura > 0){
                        if(altura > 30){
                            altura = altura/100;
                        }

                        imc = peso / (altura * altura);

    //                    tf_IMC.setText(String.valueOf(imc));
                        tf_IMC.setText(String.valueOf(String.format("%.2f", imc)));
                        classificacao(imc);
                    }else{
                        JOptionPane.showMessageDialog(null, "Dados Inválidos!");
                    }
                } catch (NumberFormatException ex) {
                    System.out.println(ex.getMessage());
                    JOptionPane.showMessageDialog(null, "Peso e Altura devem ser números");
                }
            }
        });
        limparCamposButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf_Altura.setText("");
                tf_Peso.setText("");
                tf_IMC.setText("");
                tf_Classificacao.setText("");
            }
        });
    }


}
