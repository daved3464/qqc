/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david.chamorro
 */
public class NewGame extends javax.swing.JFrame {

    /**
     * Creates new form NewGame
     */
    public NewGame() {
        initComponents();
        setTransparentButtons();
    }
    // <editor-fold defaultstate="collapsed" desc="Invisible Buttons">    
    private void setTransparentButtons(){
        this.BtnAyudaComodin1.setOpaque(false);
        this.BtnAyudaComodin1.setContentAreaFilled(false);
        this.BtnAyudaComodin1.setBorderPainted(false);
        this.BtnAyudaComodin2.setOpaque(false);
        this.BtnAyudaComodin2.setContentAreaFilled(false);
        this.BtnAyudaComodin2.setBorderPainted(false);
        this.BtnAyudaComodin3.setOpaque(false);
        this.BtnAyudaComodin3.setContentAreaFilled(false);
        this.BtnAyudaComodin3.setBorderPainted(false);
        this.BtnComodin1.setOpaque(false);
        this.BtnComodin1.setContentAreaFilled(false);
        this.BtnComodin1.setBorderPainted(false);
        this.BtnComodin2.setOpaque(false);
        this.BtnComodin2.setContentAreaFilled(false);
        this.BtnComodin2.setBorderPainted(false);
        this.BtnComodin3.setOpaque(false);
        this.BtnComodin3.setContentAreaFilled(false);
        this.BtnComodin3.setBorderPainted(false);
    
    }
    // </editor-fold>        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        QuestionPanel = new javax.swing.JPanel();
        QuestionLabel = new javax.swing.JLabel();
        BtnComodin1 = new javax.swing.JButton();
        BtnComodin2 = new javax.swing.JButton();
        BtnComodin3 = new javax.swing.JButton();
        BtnOpcionA = new javax.swing.JButton();
        BtnOpcionB = new javax.swing.JButton();
        BtnOpcionC = new javax.swing.JButton();
        BtnOpcionD = new javax.swing.JButton();
        BtnAyudaComodin1 = new javax.swing.JButton();
        BtnAyudaComodin2 = new javax.swing.JButton();
        BtnAyudaComodin3 = new javax.swing.JButton();
        TimerLabel = new javax.swing.JLabel();
        QuestionQuantLabel = new javax.swing.JLabel();
        PunctuationPanel = new javax.swing.JPanel();
        PunctuationScroll = new javax.swing.JScrollPane();
        TextAreaPuntuacion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        QuestionPanel.setBackground(new java.awt.Color(255, 255, 255));

        QuestionLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        QuestionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuestionLabel.setText("Pregunta");

        BtnComodin1.setBackground(new java.awt.Color(255, 255, 255));
        BtnComodin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/2da.png"))); // NOI18N
        BtnComodin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnComodin1ActionPerformed(evt);
            }
        });

        BtnComodin2.setBackground(new java.awt.Color(255, 255, 255));
        BtnComodin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/5050.png"))); // NOI18N
        BtnComodin2.setBorder(null);
        BtnComodin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnComodin2ActionPerformed(evt);
            }
        });

        BtnComodin3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ExT.png"))); // NOI18N

        BtnOpcionA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnOpcionA.setText("Opcion A");

        BtnOpcionB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnOpcionB.setText("Opcion B");

        BtnOpcionC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnOpcionC.setText("Opcion C");

        BtnOpcionD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnOpcionD.setText("Opcion D");
        BtnOpcionD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOpcionDActionPerformed(evt);
            }
        });

        BtnAyudaComodin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/question.png"))); // NOI18N

        BtnAyudaComodin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/question.png"))); // NOI18N

        BtnAyudaComodin3.setBackground(new java.awt.Color(255, 255, 255));
        BtnAyudaComodin3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/question.png"))); // NOI18N
        BtnAyudaComodin3.setBorder(null);
        BtnAyudaComodin3.setBorderPainted(false);

        TimerLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TimerLabel.setText("Tiempo: 00");

        QuestionQuantLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        QuestionQuantLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuestionQuantLabel.setText("0 de 0");

        javax.swing.GroupLayout QuestionPanelLayout = new javax.swing.GroupLayout(QuestionPanel);
        QuestionPanel.setLayout(QuestionPanelLayout);
        QuestionPanelLayout.setHorizontalGroup(
            QuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuestionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(QuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QuestionPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(BtnComodin1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnAyudaComodin1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(BtnComodin2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnAyudaComodin2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(BtnComodin3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnAyudaComodin3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(49, Short.MAX_VALUE))
                    .addGroup(QuestionPanelLayout.createSequentialGroup()
                        .addGroup(QuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QuestionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(QuestionPanelLayout.createSequentialGroup()
                                .addComponent(TimerLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(QuestionQuantLabel))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QuestionPanelLayout.createSequentialGroup()
                                .addGroup(QuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BtnOpcionA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnOpcionC, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addGroup(QuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BtnOpcionB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnOpcionD, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        QuestionPanelLayout.setVerticalGroup(
            QuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuestionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(QuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TimerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuestionQuantLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QuestionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(QuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnOpcionA, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(BtnOpcionB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(QuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnOpcionC, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(BtnOpcionD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(QuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(QuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnComodin3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnComodin1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtnComodin2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAyudaComodin3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAyudaComodin2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAyudaComodin1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        TextAreaPuntuacion.setColumns(20);
        TextAreaPuntuacion.setRows(5);
        PunctuationScroll.setViewportView(TextAreaPuntuacion);

        javax.swing.GroupLayout PunctuationPanelLayout = new javax.swing.GroupLayout(PunctuationPanel);
        PunctuationPanel.setLayout(PunctuationPanelLayout);
        PunctuationPanelLayout.setHorizontalGroup(
            PunctuationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PunctuationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PunctuationScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );
        PunctuationPanelLayout.setVerticalGroup(
            PunctuationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PunctuationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PunctuationScroll)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(QuestionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PunctuationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PunctuationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(QuestionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnComodin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnComodin1ActionPerformed
        BtnComodin1.setBorder(null);
    }//GEN-LAST:event_BtnComodin1ActionPerformed

    private void BtnComodin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnComodin2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnComodin2ActionPerformed

    private void BtnOpcionDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOpcionDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnOpcionDActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAyudaComodin1;
    private javax.swing.JButton BtnAyudaComodin2;
    private javax.swing.JButton BtnAyudaComodin3;
    private javax.swing.JButton BtnComodin1;
    private javax.swing.JButton BtnComodin2;
    private javax.swing.JButton BtnComodin3;
    private javax.swing.JButton BtnOpcionA;
    private javax.swing.JButton BtnOpcionB;
    private javax.swing.JButton BtnOpcionC;
    private javax.swing.JButton BtnOpcionD;
    private javax.swing.JPanel PunctuationPanel;
    private javax.swing.JScrollPane PunctuationScroll;
    private javax.swing.JLabel QuestionLabel;
    private javax.swing.JPanel QuestionPanel;
    private javax.swing.JLabel QuestionQuantLabel;
    private javax.swing.JTextArea TextAreaPuntuacion;
    private javax.swing.JLabel TimerLabel;
    // End of variables declaration//GEN-END:variables
}
