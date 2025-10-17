import DAO.ProdutoDao;
import Modelo.Produto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import javax.swing.table.DefaultTableModel;

public class FormGerenciadorEstoque extends JFrame{
    private JPanel Main;
    private JTextField ProdutoTF;
    private JTextField QuantidadeTF;
    private JTextField PrecoTF;
    private JButton adicionarButton;
    private JButton salvarButton;
    private JButton excluirButton;
    private JTable table1;
    private JTextField TotalTF;
    private JButton calcelarButton;
    private JButton editarButton;

    ProdutoDao produtoDao = new ProdutoDao();
    static int id;



    //Array de string para rótulo da tabla
    String[] colunas = {"ID", "NOME", "PREÇO", "QUANTIDADE"};

    //inserindo modelo
    DefaultTableModel model = new DefaultTableModel(colunas, 0);


    public FormGerenciadorEstoque(){
        setContentPane(Main);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        table1.setModel(model);
        setSize(600, 500);
        setTitle("Gerenciador de Estoque");
        setLocationRelativeTo(null);
        setVisible(true);

        limparcampos();
        habilitarCampos(false);
        excluirButton.setEnabled(false);
        listarProdutos();

        adicionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                habilitarCampos(true);
                adicionarButton.setEnabled(false);
            }
        });
        salvarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome;
                int quantidade;
                double preco;

                nome = ProdutoTF.getText().trim();
                if (nome.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Nome não pode ser vazio!", "ERRO", JOptionPane.ERROR_MESSAGE);
                    ProdutoTF.requestFocus();
                    return;
                }

                quantidade = Integer.parseInt(QuantidadeTF.getText());
                preco = Double.parseDouble(PrecoTF.getText());
                if(quantidade < 1){
                    JOptionPane.showMessageDialog(null,"A quantidade deve ser Maior ou Igual a 1 >-<", "ERRO", JOptionPane.ERROR_MESSAGE);
                    QuantidadeTF.requestFocus();
                    return;
                }else if(preco <= 0){
                    JOptionPane.showMessageDialog(null, "O preço não pode ser menor do que zero -_-", "ERRO", JOptionPane.PLAIN_MESSAGE);
                    PrecoTF.requestFocus();
                    return;
                }


                Produto produto = new Produto(nome, preco, quantidade);
                if(salvarButton.getText().equals("Salvar")){
                    if(produtoDao.inserir(produto)){
                        JOptionPane.showMessageDialog(null, "Produto cadastrado com suscesso UwU");
                    }else{
                        JOptionPane.showMessageDialog(null, "Erro ao inserir produto Q-Q");
                    }
                } else if (salvarButton.getText().equals("Atualizar")) {
                    produto.setID(id);
                    if(produtoDao.atualizar(produto)){
                        JOptionPane.showMessageDialog(null, "Produto Atualizado com suscesso UwU");
                    }else{
                        JOptionPane.showMessageDialog(null, "Erro ao Atualizar produto Q-Q");
                    }
                }

                limparcampos();
                habilitarCampos(false);
                listarProdutos();

            }
        });
        calcelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparcampos();
                habilitarCampos(false);
            }
        });
        table1.addComponentListener(new ComponentAdapter() {
        });
        editarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int linhaselecionada = table1.getSelectedRow();
                if(linhaselecionada != -1){
                    ProdutoTF.setText(table1.getValueAt(linhaselecionada, 1).toString());
                    QuantidadeTF.setText(table1.getValueAt(linhaselecionada, 2).toString());
                    PrecoTF.setText(table1.getValueAt(linhaselecionada, 3).toString());
                    id = Integer.parseInt(table1.getValueAt(linhaselecionada, 0).toString());
                    habilitarCampos(true);
                    salvarButton.setText("Atualizar");
                }
            }
        });
    }

    public void habilitarCampos(Boolean status){
        ProdutoTF.setEnabled(status);
        QuantidadeTF.setEnabled(status);
        PrecoTF.setEnabled(status);
        salvarButton.setEnabled(status);
        calcelarButton.setEnabled(status);
        adicionarButton.setEnabled(!status);
    }

    public void limparcampos(){
        ProdutoTF.setText("");
        PrecoTF.setText("");
        QuantidadeTF.setText("");
    }

    public void listarProdutos(){
        model.setRowCount(0);
        double total = 0;
        for (Produto p : produtoDao.listarTodos(true)){
            Object[] linha = {
                    p.getID(),
                    p.getNome(),
                    p.getPreco(),
                    p.getQuantidade()
            };
            total = total + (p.getPreco() * p.getQuantidade());
            model.addRow(linha);

        }
        TotalTF.setText(String.valueOf(total));
    }

}
