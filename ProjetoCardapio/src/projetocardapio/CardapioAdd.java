package projetocardapio;

import javax.swing.JOptionPane;

public class CardapioAdd extends javax.swing.JFrame {
    private String[][] almocos = new String[5][2]; 
    private String[][] jantares = new String[5][2]; 
    
    
    public CardapioAdd() {
        initComponents();
  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TerçaFeira = new javax.swing.JLabel();
        SegundaFeira = new javax.swing.JLabel();
        QuartaFeira = new javax.swing.JLabel();
        QuintaFeira = new javax.swing.JLabel();
        SextaFeira = new javax.swing.JLabel();
        Almoco = new javax.swing.JLabel();
        Jantar = new javax.swing.JLabel();
        AlmocoSegundaComida = new javax.swing.JTextField();
        JantarSegundaBebida = new javax.swing.JTextField();
        JantarTercaBebida = new javax.swing.JTextField();
        JantarQuartaComida = new javax.swing.JTextField();
        JantarQuintaComida = new javax.swing.JTextField();
        JantarSextaComida = new javax.swing.JTextField();
        AlmocoTercaComida = new javax.swing.JTextField();
        AlmocoQuartaComida = new javax.swing.JTextField();
        AlmocoQuintaComida = new javax.swing.JTextField();
        AlmocoSextaComida = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        AlmocoSegundaBebida = new javax.swing.JTextField();
        AlmocoTercaBebida = new javax.swing.JTextField();
        AlmocoQuartaBebida = new javax.swing.JTextField();
        AlmocoQuintaBebida = new javax.swing.JTextField();
        AlmocoSextaBebida = new javax.swing.JTextField();
        JantarSegundaComida = new javax.swing.JTextField();
        JantarTercaComida = new javax.swing.JTextField();
        JantarQuartaBebida = new javax.swing.JTextField();
        JantarQuintaBebida = new javax.swing.JTextField();
        JantarSextaBebida = new javax.swing.JTextField();
        carregar = new javax.swing.JButton();
        SucoAlmoco = new javax.swing.JLabel();
        SucoJanta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TerçaFeira.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TerçaFeira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TerçaFeira.setText("Terça-Feira");
        TerçaFeira.setMaximumSize(new java.awt.Dimension(98, 20));
        TerçaFeira.setMinimumSize(new java.awt.Dimension(98, 20));
        TerçaFeira.setPreferredSize(new java.awt.Dimension(98, 20));

        SegundaFeira.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SegundaFeira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SegundaFeira.setText("Segunda-Feira");

        QuartaFeira.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        QuartaFeira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuartaFeira.setText("Quarta-Feira");

        QuintaFeira.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        QuintaFeira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuintaFeira.setText("Quinta-Feira");

        SextaFeira.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SextaFeira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SextaFeira.setText("Sexta-Feira");
        SextaFeira.setMaximumSize(new java.awt.Dimension(98, 20));
        SextaFeira.setMinimumSize(new java.awt.Dimension(98, 20));
        SextaFeira.setPreferredSize(new java.awt.Dimension(98, 20));

        Almoco.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Almoco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Almoco.setText("Almoço");

        Jantar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Jantar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jantar.setText("Jantar");

        AlmocoSegundaComida.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        AlmocoSegundaComida.setToolTipText("");
        AlmocoSegundaComida.setActionCommand("<Not Set>");
        AlmocoSegundaComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlmocoSegundaComidaActionPerformed(evt);
            }
        });

        JantarSextaComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JantarSextaComidaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cardápio da Semana");

        btnVoltar.setText("Voltar ao início");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        AlmocoSegundaBebida.setToolTipText("");
        AlmocoSegundaBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlmocoSegundaBebidaActionPerformed(evt);
            }
        });

        JantarSextaBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JantarSextaBebidaActionPerformed(evt);
            }
        });

        carregar.setText("Visualizar Cardápio");
        carregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carregarActionPerformed(evt);
            }
        });

        SucoAlmoco.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SucoAlmoco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SucoAlmoco.setText("Suco");

        SucoJanta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SucoJanta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SucoJanta.setText("Suco");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Jantar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SucoJanta, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JantarSegundaBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JantarTercaBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(JantarSegundaComida, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JantarTercaComida, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JantarQuartaBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JantarQuintaBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JantarSextaBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JantarQuartaComida, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JantarQuintaComida, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JantarSextaComida, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Almoco, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SucoAlmoco, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(AlmocoSegundaBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AlmocoTercaBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AlmocoQuartaBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(AlmocoSegundaComida, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AlmocoTercaComida, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(AlmocoQuartaComida, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(AlmocoQuintaComida, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AlmocoSextaComida, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(AlmocoQuintaBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AlmocoSextaBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(SegundaFeira, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TerçaFeira, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(QuartaFeira, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(QuintaFeira, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SextaFeira, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnVoltar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnSalvar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(carregar)))
                                .addGap(221, 221, 221)
                                .addComponent(jLabel1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(7, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVoltar)
                            .addComponent(btnSalvar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carregar)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SegundaFeira, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TerçaFeira, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuartaFeira, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuintaFeira, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SextaFeira, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AlmocoSegundaComida, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AlmocoTercaComida, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AlmocoQuartaComida, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AlmocoQuintaComida, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AlmocoSextaComida, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Almoco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AlmocoSegundaBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AlmocoTercaBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AlmocoQuartaBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AlmocoQuintaBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AlmocoSextaBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SucoAlmoco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JantarTercaComida, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JantarSegundaComida, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JantarQuartaComida, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JantarQuintaComida, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JantarSextaComida, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Jantar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JantarSegundaBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JantarTercaBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JantarQuartaBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JantarQuintaBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JantarSextaBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SucoJanta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JantarSextaComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JantarSextaComidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JantarSextaComidaActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void AlmocoSegundaComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlmocoSegundaComidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlmocoSegundaComidaActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
                                        
        almocos[0][0] = AlmocoSegundaComida.getText();
        almocos[0][1] = AlmocoSegundaBebida.getText();
        almocos[1][0] = AlmocoTercaComida.getText();
        almocos[1][1] = AlmocoTercaBebida.getText();
        almocos[2][0] = AlmocoQuartaComida.getText();
        almocos[2][1] = AlmocoQuartaBebida.getText();
        almocos[3][0] = AlmocoQuintaComida.getText();
        almocos[3][1] = AlmocoQuintaBebida.getText();
        almocos[4][0] = AlmocoSextaComida.getText();
        almocos[4][1] = AlmocoSextaBebida.getText();

        jantares[0][0] = JantarSegundaComida.getText();
        jantares[0][1] = JantarSegundaBebida.getText();
        jantares[1][0] = JantarTercaComida.getText();
        jantares[1][1] = JantarTercaBebida.getText();
        jantares[2][0] = JantarQuartaComida.getText();
        jantares[2][1] = JantarQuartaBebida.getText();
        jantares[3][0] = JantarQuintaComida.getText();
        jantares[3][1] = JantarQuintaBebida.getText();
        jantares[4][0] = JantarSextaComida.getText();
        jantares[4][1] = JantarSextaBebida.getText();
        
        JOptionPane.showMessageDialog(this, "Dados salvos com sucesso!");
        
        AlmocoSegundaComida.setText("");
        AlmocoSegundaBebida.setText("");
        AlmocoTercaComida.setText("");
        AlmocoTercaBebida.setText("");
        AlmocoQuartaComida.setText("");
        AlmocoQuartaBebida.setText("");
        AlmocoQuintaComida.setText("");
        AlmocoQuintaBebida.setText("");
        AlmocoSextaComida.setText("");
        AlmocoSextaBebida.setText("");
        JantarSegundaComida.setText("");
        JantarSegundaBebida.setText("");
        JantarTercaComida.setText("");
        JantarTercaBebida.setText("");
        JantarQuartaComida.setText("");
        JantarQuartaBebida.setText("");
        JantarQuintaComida.setText("");
        JantarQuintaBebida.setText("");
        JantarSextaComida.setText("");
        JantarSextaBebida.setText("");
    
    }//GEN-LAST:event_btnSalvarActionPerformed
public String[][] getAlmocos() {
    return almocos;
}

public String[][] getJantares() {
    return jantares;
}
    private void AlmocoSegundaBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlmocoSegundaBebidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlmocoSegundaBebidaActionPerformed

    private void JantarSextaBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JantarSextaBebidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JantarSextaBebidaActionPerformed

    private void carregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carregarActionPerformed

        String[][] almocos = getAlmocos();
        String[][] jantares = getJantares();

         AlmocoSegundaComida.setText(almocos[0][0]);
         AlmocoSegundaBebida.setText(almocos[0][1]);
         AlmocoTercaComida.setText(almocos[1][0]);
         AlmocoTercaBebida.setText(almocos[1][1]);
         AlmocoQuartaComida.setText(almocos[2][0]);
         AlmocoQuartaBebida.setText(almocos[2][1]);
         AlmocoQuintaComida.setText(almocos[3][0]);
         AlmocoQuintaBebida.setText(almocos[3][1]);
         AlmocoSextaComida.setText(almocos[4][0]);
         AlmocoSextaBebida.setText(almocos[4][1]);
         
         JantarSegundaComida.setText(jantares[0][0]);
         JantarSegundaBebida.setText(jantares[0][1]);
         JantarTercaComida.setText(jantares[1][0]);
         JantarTercaBebida.setText(jantares[1][1]);
         JantarQuartaComida.setText(jantares[2][0]);
         JantarQuartaBebida.setText(jantares[2][1]);
         JantarQuintaComida.setText(jantares[3][0]);
         JantarQuintaBebida.setText(jantares[3][1]);
         JantarSextaComida.setText(jantares[4][0]);
         JantarSextaBebida.setText(jantares[4][1]);
    }//GEN-LAST:event_carregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Almoco;
    private javax.swing.JTextField AlmocoQuartaBebida;
    private javax.swing.JTextField AlmocoQuartaComida;
    private javax.swing.JTextField AlmocoQuintaBebida;
    private javax.swing.JTextField AlmocoQuintaComida;
    private javax.swing.JTextField AlmocoSegundaBebida;
    private javax.swing.JTextField AlmocoSegundaComida;
    private javax.swing.JTextField AlmocoSextaBebida;
    private javax.swing.JTextField AlmocoSextaComida;
    private javax.swing.JTextField AlmocoTercaBebida;
    private javax.swing.JTextField AlmocoTercaComida;
    private javax.swing.JLabel Jantar;
    private javax.swing.JTextField JantarQuartaBebida;
    private javax.swing.JTextField JantarQuartaComida;
    private javax.swing.JTextField JantarQuintaBebida;
    private javax.swing.JTextField JantarQuintaComida;
    private javax.swing.JTextField JantarSegundaBebida;
    private javax.swing.JTextField JantarSegundaComida;
    private javax.swing.JTextField JantarSextaBebida;
    private javax.swing.JTextField JantarSextaComida;
    private javax.swing.JTextField JantarTercaBebida;
    private javax.swing.JTextField JantarTercaComida;
    private javax.swing.JLabel QuartaFeira;
    private javax.swing.JLabel QuintaFeira;
    private javax.swing.JLabel SegundaFeira;
    private javax.swing.JLabel SextaFeira;
    private javax.swing.JLabel SucoAlmoco;
    private javax.swing.JLabel SucoJanta;
    private javax.swing.JLabel TerçaFeira;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton carregar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
