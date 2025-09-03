import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {
    private JPanel Main;
    private JButton cadUsrBtn;
    private JButton cadProdBtn;
    private JButton iniciarProgBtn;

        public MainMenu(){
            setContentPane(Main);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(600, 500);
            setTitle("Cadastro de Usuários");
            setLocationRelativeTo(null);
            setVisible(true);

            cadUsrBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });


            cadProdBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });


            iniciarProgBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                }
            });
        }
}
