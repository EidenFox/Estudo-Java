import DAO.ProdutoDao;
import Modelo.Produto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class FormGerenciadorEstoque extends JFrame{
    private JPanel Main;
    private JTextField ProdutoTF;
    private JTextField QuantidadeTF;
    private JTextField PrecoTF;
    private JButton adicionarButton;
    private JButton salvarAtualizarButton;
    private JButton excluirButton;
    private JTable table1;
    private JTextField TotalTF;
    private JButton calcelarButton;

    ProdutoDao produtoDao = new ProdutoDao();



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
        salvarAtualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nome = ProdutoTF.getText();
                int quantidade = Integer.parseInt(QuantidadeTF.getText());
                double preco = Double.parseDouble(PrecoTF.getText());
                limparcampos();
                habilitarCampos(false);

                Produto produto = new Produto(nome, preco, quantidade);
                produtoDao.inserir(produto);
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
    }

    public void habilitarCampos(Boolean status){
        ProdutoTF.setEnabled(status);
        QuantidadeTF.setEnabled(status);
        PrecoTF.setEnabled(status);
        salvarAtualizarButton.setEnabled(status);
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
