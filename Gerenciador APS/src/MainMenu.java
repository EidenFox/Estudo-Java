import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {
    private JPanel Main;
    private JButton cadUsrBtn;
    private JButton tarefasBtn;
    private JButton sobreBtn;
    private JButton sairButton;

    public MainMenu(){
            setContentPane(Main);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(600, 500);
            setTitle("Main Menu");
            setLocationRelativeTo(null);
            setVisible(true);

            //MENU//
//            JMenuBar menuBar = new JMenuBar();
//            setJMenuBar(menuBar);
//
//            JMenu menuUser = new JMenu("Usuários");
//            menuBar.add(menuUser);
//
//            JMenu cadUser = new JMenu("Novo Usuário");
//            JMenu sair = new JMenu("Sair");





            cadUsrBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    FormCadastroo formCadastro = new FormCadastroo();
                    formCadastro.setVisible(true);

                }
            });


            tarefasBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });


            sobreBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                }
            });
        }
}
