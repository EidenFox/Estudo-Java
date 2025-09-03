import dao.LoginDao;
import model.Login;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormProdutos extends JFrame{
    private JPanel Main;
    private JTextField tfName;
    private JButton cadastrarButton;
    private JButton listarButton;
    private JTable table1;
    private JTextField tfQTD;
    private JTextField tfDesc;
    private JTextField tfPrice;
    private JTextField tfID;


    //Linha 0 do Array de strings
    String[] colunas = {"ID", "NOME", "DESCRIÇÃO", "PREÇO", "QUANTIDADE"};

    DefaultTableModel model = new DefaultTableModel(colunas, 0);
    public FormProdutos() {
        table1.setModel(model);

        setContentPane(Main);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 500);
        setTitle("Cadastrar Produtos");
        setLocationRelativeTo(null);
        setVisible(true);


        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = tfName.getText();

                if (nome.isEmpty() || email.isEmpty() || senha.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuário");
                }else{
                    ID++;
                    Login login = new Login(nome, email, senha, dataCadastro, dataAtualizacao);
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
