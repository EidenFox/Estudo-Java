import dao.LoginDao;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {
    private JPanel Main;
    private JButton cadUsrBtn;
    private JButton tarefasBtn;
    private JButton sobreBtn;
    private JButton sairButton;


    public MainMenu(String cargo, LoginDao loginDao){
        setContentPane(Main);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(600, 500);
        setTitle("Main Menu");
        setLocationRelativeTo(null);
        setVisible(true);

        cadUsrBtn.setEnabled(false);
        tarefasBtn.setEnabled(false);
        sairButton.setEnabled(true);

        FormCadastroo formCadastro;
        formCadastro = new FormCadastroo(loginDao);
        formCadastro.setVisible(false);

        //MENU//
//            JMenuBar menuBar = new JMenuBar();
//            setJMenuBar(menuBar);
//
//            JMenu menuUser = new JMenu("Usuários");
//            menuBar.add(menuUser);
//
//            JMenu cadUser = new JMenu("Novo Usuário");
//            JMenu sair = new JMenu("Sair");


        System.out.println(cargo);
        checarCargo(cargo);

            cadUsrBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
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
            sairButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    FormLogin formLogin = new FormLogin(loginDao);
                    formLogin.setVisible(true);
                    formCadastro.dispose();
                    dispose();
            }
        });
    }

    public void checarCargo(String cargo){
        switch(cargo){
            case "Cliente":
                cadUsrBtn.setEnabled(false);
                tarefasBtn.setEnabled(false);
                sobreBtn.setEnabled(true);
                break;
            case "Funcionário":
                cadUsrBtn.setEnabled(false);
                tarefasBtn.setEnabled(true);
                sobreBtn.setEnabled(true);
                break;
            case "Estagiário":
                cadUsrBtn.setEnabled(false);
                tarefasBtn.setEnabled(true);
                sobreBtn.setEnabled(true);
                break;
            case "Administrador":
                cadUsrBtn.setEnabled(true);
                tarefasBtn.setEnabled(true);
                sobreBtn.setEnabled(true);
                break;
        }
    }
}
