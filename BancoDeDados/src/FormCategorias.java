import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormCategorias extends JFrame{
    private JPanel Main;
    private JTable categoriatJT;
    private JTextField categoriaTF;
    private JButton AdicionarBTN;
    private JButton EditarBTN;
    private JButton ExcluirBTN;
    private JButton CancelarBTN;
    private JButton SalvarBTN;

    public FormCategorias(){
        setContentPane(Main);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(600, 500);
        setTitle("Gerenciador de Categorias");
        setLocationRelativeTo(null);
        setVisible(true);


        /**
         * ACTION LISTENERS
         **/


        CancelarBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparcampos();
                habilitarCampos(false);
            }
        });

        AdicionarBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            habilitarCampos(true);
            }
        });


        EditarBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                habilitarCampos(false);
                try {

                    SalvarBTN.setText("Atualizar");
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }

    /**
     * METODOS
     **/

    void habilitarCampos(boolean estado){
        AdicionarBTN.setEnabled(!estado);
        EditarBTN.setEnabled(!estado);
        ExcluirBTN.setEnabled(estado);
        CancelarBTN.setEnabled(estado);
        SalvarBTN.setEnabled(estado);
        limparcampos();
    }

    void limparcampos(){
        categoriaTF.setText("");
        SalvarBTN.setText("Salvar");
    }







}
