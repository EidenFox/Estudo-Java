
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


    //Linha 0 do Array de strings
    String[] colunas = {"Tarefa", "Descrição", "Responsavel", "Cargo Responsavel", "Prazo"};
    DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

    public Tarefas(ListaTarefasDao listaTarefasDao) {
        tableTarefas.setModel(modelo);

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

                //Cargo Res
                if (clienteRadioButton.isSelected()) {
                    cargo = "Cliente";
                } else if (funcionarioRadioButton.isSelected()) {
                    cargo = "Funcionário";
                } else if (administradorRadioButton.isSelected()) {
                    cargo = "Administrador";
                }
                //Cargo Res//

                if (tarefa.trim().isEmpty() || tarefa.trim().length() > 50) {
                    JOptionPane.showMessageDialog(null, "Tarefa não pode ser vazia nem conter mais do que 50 caracteres!");
                } else {
                    ListaTarefas listaTarefas = new ListaTarefas(tarefa, descricao, responsavel, cargo, prazo);
                    listaTarefasDao.inserirTarefa(listaTarefas);
                    JOptionPane.showMessageDialog(null, "Tarefa Cadastrada com sucesso.");
                }
                System.out.println(listaTarefasDao.getListaT());
                atualizaLista(listaTarefasDao);
            }

        });
        atualizarPaginaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                atualizaLista(listaTarefasDao);
            }
        });
    }

    public void atualizaLista(ListaTarefasDao listaTarefasDao){
        modelo.setRowCount(0);
        for (ListaTarefas l : listaTarefasDao.getListaT()) {
            Object[] linha = {l.getTarefa(), l.getDescricao(), l.getResponsavel(), l.getCargoRes(), l.getPrazo()};
            modelo.addRow(linha);
            System.out.println("PRAZO: "+ l.getPrazo());
        }

    }
}
