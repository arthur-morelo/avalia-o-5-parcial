import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Criação do JFrame principal
        JFrame frame = new JFrame("Sistema de Cadastro");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        JButton abrirDialogo = new JButton("Abrir Cadastro");
        abrirDialogo.addActionListener(e -> {
            JDialog dialog = new JDialog(frame, "Cadastro", true);
            dialog.setSize(400, 200);
            dialog.setLocationRelativeTo(frame);

            BotoesCadastro botoesCadastro = new BotoesCadastro(dialog);
            dialog.getContentPane().add(botoesCadastro.criar(), BorderLayout.SOUTH);

            dialog.setVisible(true);
        });

        frame.getContentPane().add(abrirDialogo, BorderLayout.CENTER);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

class BotoesCadastro {
    private final JDialog dialog;

    public BotoesCadastro(JDialog dialog) {
        this.dialog = dialog;
    }

    public JPanel criar() {
        JPanel painelBotoes = new JPanel(new FlowLayout());
        String[] labels = {"Incluir", "Alterar", "Excluir", "Consultar", "Cancelar", "Sair"};
        for (String label : labels) {
            JButton button = new JButton(label);
            if ("Sair".equals(label)) {
                button.addActionListener(e -> dialog.setVisible(false));
            } else {
                button.addActionListener(e -> JOptionPane.showMessageDialog(dialog, "Botão " + label + " clicado!"));
            }
            painelBotoes.add(button);
        }
        return painelBotoes;
    }
} 
