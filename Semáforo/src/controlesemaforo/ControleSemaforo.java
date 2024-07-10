package controlesemaforo;

import javax.swing.*;
import java.awt.*;

public class ControleSemaforo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Controle de Semáforos");
        Cruzamento cruzamento = new Cruzamento();
        frame.add(cruzamento);
        
        //Botão de Alterar os semáforos
        JButton botaoAlternar = new JButton("Analógico - Digital");
        botaoAlternar.addActionListener(e -> cruzamento.alternarModo());
        botaoAlternar.setFont(new Font("Arial", Font.BOLD, 20));
        botaoAlternar.setBackground(new Color(0, 100, 0));
        botaoAlternar.setForeground(Color.WHITE);
        botaoAlternar.setFocusable(false);
        frame.add(botaoAlternar, BorderLayout.NORTH);
        
        //Tela ao executar
        frame.setSize(400, 400);
        frame.setLocationRelativeTo( null );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        new Thread(() -> {
            try {
                cruzamento.controlarSemaforos();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}