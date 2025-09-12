
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
    private JRadioButton funcionárioRadioButton;
    private JTextField nomeTF;
    private JTable tableTarefas;
    private JButton adicionarTarefaButton;
    private JButton atualizarPaginaButton;
    private JTextArea textArea1;
    private ButtonGroup cargoResponsavel;



    String[] colunas = {"Tarefa", "Descrição", "Responsavel", "Cargo Responsavel", "prazo", "Concluida"};
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

            }
        });
        atualizarPaginaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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