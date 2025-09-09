import dao.LoginDao;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.Objects;

public class FormLogin extends JFrame{
    private JPanel Main;
    private JPasswordField senhaTF;
    private JTextField emailTF;
    private JButton loginButton;
    private JButton esqueciASenhaButton;
    private JButton sairButton;

//    LoginDao loginDao = new LoginDao();


    public FormLogin(LoginDao loginDao){
        setContentPane(Main);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setTitle("Login");
        setSize(600, 500);
        setLocationRelativeTo(null);
        setVisible(true);

        esqueciASenhaButton.setEnabled(false);

        esqueciASenhaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Problema Seu!");
            }
        });
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String email = emailTF.getText().toLowerCase();
            String senha = new String(senhaTF.getPassword());
            String cargo = loginDao.validarLogin(email, senha);

            if(!cargo.equals("false")){

                System.out.println(loginDao.cargo);

                JOptionPane.showMessageDialog(null, "Logado com Sucesso!");

                MainMenu mainMenu = new MainMenu(cargo, loginDao);
                mainMenu.setVisible(true);
                dispose();

            }else{
                senhaTF.setText("");
                JOptionPane.showMessageDialog(null, "Usuário ou Senha Invalidos!");
            }

            }
        });
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        emailTF.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                esqueciASenhaButton.setEnabled(true);
            }
        });
    }

    public void limparCampos(){
        emailTF.setText("");
        senhaTF.setText("");
    }

}
