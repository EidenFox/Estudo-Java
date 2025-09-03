import dao.LoginDao;
import model.Login;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class
FormCadastroo extends JFrame{
    private JPanel Main;
    private JTextField tfMail;
    private JPasswordField tfPassword;
    private JTextField tfName;
    private JButton cadastrarButton;
    private JButton listarButton;
    private JTable table1;
    private JRadioButton clienteRadioButton;
    private JRadioButton funcionarioRadioButton;
    private JRadioButton estagiarioRadioButton;
    private JRadioButton administradorRadioButton;
    private JPanel cargoPanel;

    LoginDao loginDao;

    static int ID;

    //Linha 0 do Array de strings
    String[] colunas = {"ID", "NOME", "E-MAIL", "DATA CADASTRO", "DATA ATUALIZAÇÃO"};

    DefaultTableModel model = new DefaultTableModel(colunas, 0);
    public FormCadastroo() {
        table1.setModel(model);

        setContentPane(Main);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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
                String cargo = null;

                //CARGO
                if (clienteRadioButton.isSelected()) {
                    cargo = "Cliente";
                } else if (funcionarioRadioButton.isSelected()) {
                    cargo = "Funcionário";
                } else if (estagiarioRadioButton.isSelected()) {
                    cargo = "Estagiário";
                } else if (administradorRadioButton.isSelected()) {
                    cargo = "Administrador";
                }
                //CARGO//

                if (nome.trim().isEmpty() || nome.trim().length() > 50) {
                    JOptionPane.showMessageDialog(null, "Nome não pode ser vazio nem conter mais do que 50 caracteres!");
                } else if (email.trim().isEmpty() || !email.contains("@")) {
                    JOptionPane.showMessageDialog(null, "O e-mail não pode estar vazio ou o seu formato está incorreto!");
                }else if(senha.length() < 4){
                    JOptionPane.showMessageDialog(null, "Senha deve conter pelo menos 4 caracteres!");
                }else{
                    ID = loginDao.returnID() + 1;
                    System.out.println("ID: "+ ID);

                    Login login = new Login(nome, email, senha, dataCadastro, dataAtualizacao, cargo, 0);
                    login.setID(ID);
                    loginDao.inserirLogin(login);
                    JOptionPane.showMessageDialog(null, "Usuário Cadastrado com sucesso.");
                }

                System.out.println(loginDao.getLista());
            }
        });

        listarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                model.setRowCount(0);
                for (Login l : loginDao.getLista()){
                    Object[] linha = {l.getID(), l.getNome(), l.getEmail(), l.getDataCadastro(), l.getDataAtualizacao()};
                    model.addRow(linha);

                }
            }
        });
    }
}
