package controlesemaforo;

import javax.swing.*;
import java.awt.*;

public class Cruzamento extends JPanel {
    private Semaforo semaforoHorizontal;
    private Semaforo semaforoVertical;
    private boolean modoDigital;
    private Timer timer;

    public Cruzamento() {
        this.semaforoHorizontal = new Semaforo();
        this.semaforoVertical = new Semaforo();
        this.modoDigital = false;
        iniciarTimer();
    }

    private void iniciarTimer() {
        timer = new Timer(1000, e -> {
            atualizarTempoSemaforos();
            repaint();
        });
        timer.start();
    }

    private void atualizarTempoSemaforos() {
        if (semaforoHorizontal.getTempoRestante() > 0) {
            semaforoHorizontal.setTempoRestante(semaforoHorizontal.getTempoRestante() - 1);
        }
        if (semaforoVertical.getTempoRestante() > 0) {
            semaforoVertical.setTempoRestante(semaforoVertical.getTempoRestante() - 1);
        }
    }
    
    //Temporizador dos semáforos
    public void controlarSemaforos() throws InterruptedException {
        while (true) {
            semaforoHorizontal.mudarParaVerde(5);
            semaforoVertical.mudarParaVermelho(7);
            repaint();
            Thread.sleep(5000);

            semaforoHorizontal.mudarParaAmarelo(2);
            repaint();
            Thread.sleep(2000);

            semaforoHorizontal.mudarParaVermelho(7);
            semaforoVertical.mudarParaVerde(5);
            repaint();
            Thread.sleep(5000);

            semaforoVertical.mudarParaAmarelo(2);
            repaint();
            Thread.sleep(2000);
        }
    }

    public void alternarModo() {
        modoDigital = !modoDigital;
        repaint();
    }

    @Override //Posição dos semáforos
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawCruzamento(g);
        if (modoDigital) {
            drawSemaforoDigital(g, semaforoHorizontal, 70, 10);
            drawSemaforoDigital(g, semaforoVertical, 260, 225);
        } else {
            drawSemaforoAnalogico(g, semaforoHorizontal, 90, 10);
            drawSemaforoAnalogico(g, semaforoVertical, 260, 225);
        }
    }
    
    //Decorações além do semáforo
    private void drawCruzamento(Graphics g) {
        g.setColor(Color.lightGray);
        g.fillRect(0, 0, 500, 500);
        
        g.setColor(Color.BLACK);
        g.fillRect(125, 0, 130, 400);
        g.fillRect(0, 100, 390, 125);
        
        g.setColor(Color.YELLOW);
        g.fillRect(0, 155, 25, 10);
        g.fillRect(45, 155, 25, 10);
        
        g.fillRect(315, 155, 25, 10);
        g.fillRect(360, 155, 25, 10);
        
        
        g.fillRect(185, 0, 10, 25);
        g.fillRect(185, 40, 10, 25);
        
        g.fillRect(185, 270, 10, 25);
        g.fillRect(185, 310, 10, 25);
        
        
        g.setColor(Color.WHITE);
        g.fillRect(185, 85, 10, 20);
        g.fillRect(170, 85, 10, 20);
        g.fillRect(200, 85, 10, 20);
        g.fillRect(215, 85, 10, 20);
        g.fillRect(155, 85, 10, 20);
        g.fillRect(140, 85, 10, 20);
        g.fillRect(230, 85, 10, 20);
        g.fillRect(125, 85, 10, 20);
        g.fillRect(245, 85, 10, 20);
        
        g.fillRect(185, 220, 10, 20);
        g.fillRect(170, 220, 10, 20);
        g.fillRect(200, 220, 10, 20);
        g.fillRect(215, 220, 10, 20);
        g.fillRect(155, 220, 10, 20);
        g.fillRect(140, 220, 10, 20);
        g.fillRect(230, 220, 10, 20);
        g.fillRect(125, 220, 10, 20);
        g.fillRect(245, 220, 10, 20);
        
        g.fillRect(250, 150, 20, 10);
        g.fillRect(250, 135, 20, 10);
        g.fillRect(250, 120, 20, 10);
        g.fillRect(250, 105, 20, 10);
        g.fillRect(250, 165, 20, 10);
        g.fillRect(250, 180, 20, 10);
        g.fillRect(250, 195, 20, 10);
        g.fillRect(250, 210, 20, 10);
        
        g.fillRect(110, 150, 20, 10);
        g.fillRect(110, 135, 20, 10);
        g.fillRect(110, 120, 20, 10);
        g.fillRect(110, 105, 20, 10);
        g.fillRect(110, 165, 20, 10);
        g.fillRect(110, 180, 20, 10);
        g.fillRect(110, 195, 20, 10);
        g.fillRect(110, 210, 20, 10);
        
    }

    private void drawSemaforoAnalogico(Graphics g, Semaforo semaforo, int x, int y) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        g2d.setColor(Color.GRAY);
        g2d.fillRoundRect(x, y, 30, 90, 10, 10);
        
        g2d.setColor(semaforo.getCor() == Color.RED ? Color.RED : Color.lightGray);
        g2d.fillOval(x + 5, y + 5, 20, 20);
        g2d.setColor(semaforo.getCor() == Color.YELLOW ? Color.YELLOW : Color.lightGray);
        g2d.fillOval(x + 5, y + 35, 20, 20);
        g2d.setColor(semaforo.getCor() == Color.GREEN ? Color.GREEN : Color.lightGray);
        g2d.fillOval(x + 5, y + 65, 20, 20);
    }

    private void drawSemaforoDigital(Graphics g, Semaforo semaforo, int x, int y) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        g2d.setColor(Color.GRAY);
        g2d.fillRoundRect(x, y, 50, 90, 10, 10);
        
        g2d.setColor(semaforo.getCor());
        g2d.fillOval(x + 15, y + 10, 20, 20);

        g2d.setColor(Color.WHITE);
        g2d.setFont(new Font("Arial", Font.BOLD, 20));
        String tempoRestante = String.valueOf(semaforo.getTempoRestante());
        g2d.drawString(tempoRestante, x + 25 - g2d.getFontMetrics().stringWidth(tempoRestante) / 2, y + 70);
    }
}