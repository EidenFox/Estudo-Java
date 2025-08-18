import dao.LoginDao;
import model.Login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormCadastro extends JFrame{
    private JPanel Main;
    private JTextField tfMail;
    private JPasswordField tfPassword;
    private JTextField tfName;
    private JButton cadastrarButton;
    private JButton listarButton;

    LoginDao loginDao;


    public FormCadastro() {

        setContentPane(Main);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 500);
        setTitle("Cadastro de Usuários");
        setLocationRelativeTo(null);
        setVisible(true);

        loginDao = new LoginDao();


        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = tfName.getText();
                String email = tfMail.getText();
                String senha = tfPassword.getText();
                String dataCadastro = "2025-08-14";
                String dataAtualizacao = "";
                loginDao.inserirLogin(new Login(nome, email, senha, dataCadastro, dataAtualizacao));

                System.out.println(loginDao.getLista());
            }
        });



        listarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
