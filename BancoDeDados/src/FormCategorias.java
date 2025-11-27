import DAO.CategoriaDao;
import Modelo.Categoria;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class FormCategorias extends JFrame {
    private JPanel Main;
    private JTable categoriatJT;
    private JTextField categoriaTF; // Nome da Categoria
    private JTextField descricaoTF; // Descrição
    private JCheckBox estadoCB;     // Checkbox de Estado
    private JButton AdicionarBTN;
    private JButton EditarBTN;
    private JButton CancelarBTN;
    private JButton SalvarBTN;

    CategoriaDao categoriaDao = new CategoriaDao();
    static int id;

    String[] colunas = {"ID", "NOME", "DESCRIÇÃO", "ESTADO"};

    DefaultTableModel model = new DefaultTableModel(colunas, 0);

    public FormCategorias() {
        setContentPane(Main);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(600, 500);
        setTitle("Gerenciador de Categorias");
        setLocationRelativeTo(null);
        categoriatJT.setModel(model);
        setVisible(true);

        limparcampos();
        habilitarCampos(false);
        listarCategorias();


        AdicionarBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                habilitarCampos(true);
                AdicionarBTN.setEnabled(false);
                estadoCB.setSelected(true); // Padrão nova categoria como ativa
            }
        });

        SalvarBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome;
                String descricao;
                boolean estado;

                nome = categoriaTF.getText().trim();
                if (nome.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "O nome da categoria não pode ser vazio!", "ERRO", JOptionPane.ERROR_MESSAGE);
                    categoriaTF.requestFocus();
                    return;
                }

                descricao = descricaoTF.getText();
                estado = estadoCB.isSelected();

                Categoria categoria = new Categoria(nome, descricao);
                categoria.setState(estado);

                if (SalvarBTN.getText().equals("Salvar")) {
                    if (categoriaDao.inserir(categoria)) {
                        JOptionPane.showMessageDialog(null, "Categoria cadastrada com sucesso UwU");
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao inserir categoria Q-Q");
                    }
                } else if (SalvarBTN.getText().equals("Atualizar")) {
                    categoria.setID(id);

                    if (categoriaDao.atualizar(categoria)) {
                        categoriaDao.alterarEstado(id, estado);
                        JOptionPane.showMessageDialog(null, "Categoria atualizada com sucesso UwU");
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao atualizar categoria Q-Q");
                    }
                }

                limparcampos();
                SalvarBTN.setText("Salvar");
                habilitarCampos(false);
                listarCategorias();
            }
        });

        CancelarBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparcampos();
                SalvarBTN.setText("Salvar");
                habilitarCampos(false);
            }
        });

        EditarBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int linhaselecionada = categoriatJT.getSelectedRow();

                if (linhaselecionada != -1) {
                    id = Integer.parseInt(categoriatJT.getValueAt(linhaselecionada, 0).toString());

                    categoriaTF.setText(categoriatJT.getValueAt(linhaselecionada, 1).toString());

                    descricaoTF.setText(categoriatJT.getValueAt(linhaselecionada, 2).toString());

                    String estadoTexto = categoriatJT.getValueAt(linhaselecionada, 3).toString();
                    estadoCB.setSelected(estadoTexto.equals("Ativo"));

                    habilitarCampos(true);
                    EditarBTN.setEnabled(false);
                    SalvarBTN.setText("Atualizar");
                }
                linhaselecionada = -1;
                categoriatJT.clearSelection();
            }
        });
    }

    /**
     * MÉTODOS AUXILIARES
     **/

    public void habilitarCampos(Boolean estado) {
        categoriaTF.setEnabled(estado);
        descricaoTF.setEnabled(estado);
        estadoCB.setEnabled(estado);

        SalvarBTN.setEnabled(estado);
        CancelarBTN.setEnabled(estado);

        AdicionarBTN.setEnabled(!estado);
        EditarBTN.setEnabled(!estado);

        categoriatJT.clearSelection();
        SalvarBTN.setText("Salvar");
    }

    public void limparcampos() {
        categoriaTF.setText("");
        descricaoTF.setText("");
        estadoCB.setSelected(false);
    }

    public void listarCategorias() {
        model.setRowCount(0);
        List<Categoria> lista = categoriaDao.categoriaList();

        for (Categoria c : lista) {
            Object[] linha = {
                    c.getID(),
                    c.getNome(),
                    c.getDescicao(),
                    c.isState() ? "Ativo" : "Inativo"
            };
            model.addRow(linha);
        }
    }
}