
import dao.ListaTarefasDao;
import model.ListaTarefas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tarefas extends JFrame{
    private JPanel main;
    private JTextField tarefaTF;
    private JTextField prazoTF;
    private JRadioButton clienteRadioButton;
    private JRadioButton administradorRadioButton;
    private JRadioButton funcionarioRadioButton;
    private JTextField nomeTF;
    private JTable tableTarefas;
    private JButton adicionarTarefaButton;
    private JButton atualizarPaginaButton;
    private JTextArea descricaoTA;
    private ButtonGroup cargoResponsavel;



    String[] colunas = {"Tarefa", "Descrição", "Responsavel", "Cargo Responsavel", "Prazo", "Concluida"};
    DefaultTableModel model= new DefaultTableModel(colunas, 0);

    public Tarefas() {
        tableTarefas.setModel(model);

        setContentPane(main);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(600, 500);
        setTitle("Gerenciador de Tarefas");
        setLocationRelativeTo(null);
        setVisible(true);



        adicionarTarefaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tarefa = tarefaTF.getText();
                String descricao = descricaoTA.getText();
                String responsavel = nomeTF.getText();
                String prazo = prazoTF.getText();
                String cargo = null;
                if (clienteRadioButton.isSelected()) {
                    cargo = "Cliente";
                } else if (funcionarioRadioButton.isSelected()) {
                    cargo = "Funcionário";
                } else if (administradorRadioButton.isSelected()) {
                    cargo = "Administrador";
                }

                if (tarefa.trim().isEmpty() || tarefa.trim().length() > 50) {
                    JOptionPane.showMessageDialog(null, "Tarefa não pode ser vazia nem conter mais do que 50 caracteres!");
                } else {
                    ListaTarefas ltarefas = new ListaTarefas(tarefa, descricao, responsavel, cargo, prazo);

                }
            }

        });
        atualizarPaginaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                model.setRowCount(0);

            }
        });

    }


    public void listarTarefas(){
        model.setRowCount(0);
//        for ( l : ) {
//            Object[] linha = {};
//            model.addRow(linha);
//        }
    }
}