package View;

import Controller.Controle;
import Model.Investidor;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author unifpvalim
 */
public class Depositar extends javax.swing.JFrame {

    Investidor pessoa;
    Controle controle;
    
    public Depositar(Investidor pessoa,Controle controle) {
        initComponents();
        this.pessoa = pessoa;
        this.controle = controle;
    }

    public Investidor getPessoa() {
        return pessoa;
    }

    public void setPessoa(Investidor pessoa) {
        this.pessoa = pessoa;
    }

    public Controle getControle() {
        return controle;
    }

    public void setControle(Controle controle) {
        this.controle = controle;
    }

    public JButton getBtDepositar() {
        return BtDepositar;
    }

    public void setBtDepositar(JButton BtDepositar) {
        this.BtDepositar = BtDepositar;
    }

    public JLabel getLblDeposito() {
        return LblDeposito;
    }

    public void setLblDeposito(JLabel LblDeposito) {
        this.LblDeposito = LblDeposito;
    }

    public JLabel getLblValor() {
        return LblValor;
    }

    public void setLblValor(JLabel LblValor) {
        this.LblValor = LblValor;
    }

    public JTextArea getTxtAreaDeposito() {
        return TxtAreaDeposito;
    }

    public void setTxtAreaDeposito(JTextArea TxtAreaDeposito) {
        this.TxtAreaDeposito = TxtAreaDeposito;
    } 

    public JTextField getTxtValor() {
        return TxtValor;
    }

    public void setTxtValor(JTextField TxtValor) {
        this.TxtValor = TxtValor;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblDeposito = new javax.swing.JLabel();
        LblValor = new javax.swing.JLabel();
        TxtValor = new javax.swing.JTextField();
        BtDepositar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtAreaDeposito = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Depositar");

        LblDeposito.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        LblDeposito.setForeground(new java.awt.Color(0, 0, 153));
        LblDeposito.setText("DEPÓSITO");

        LblValor.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        LblValor.setText("Valor:");

        TxtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtValorActionPerformed(evt);
            }
        });

        BtDepositar.setBackground(new java.awt.Color(51, 51, 255));
        BtDepositar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        BtDepositar.setForeground(new java.awt.Color(255, 255, 255));
        BtDepositar.setText("OK!!");
        BtDepositar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtDepositarActionPerformed(evt);
            }
        });

        TxtAreaDeposito.setEditable(false);
        TxtAreaDeposito.setColumns(20);
        TxtAreaDeposito.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TxtAreaDeposito.setRows(5);
        TxtAreaDeposito.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(TxtAreaDeposito);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(LblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblDeposito)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(LblDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtValorActionPerformed
        
    }//GEN-LAST:event_TxtValorActionPerformed

    private void BtDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtDepositarActionPerformed
        double quantidade = Double.parseDouble(this.TxtValor.getText());
        controle.Depositar(quantidade);
        DecimalFormat df = new DecimalFormat("#0.000");
        String reais = df.format(pessoa.getSaldoreal()).replace(',', '.');
        this.TxtAreaDeposito.setText("\n\nSaldo Atualizado: " + reais);
        controle.Salvar();
    }//GEN-LAST:event_BtDepositarActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Depositar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Depositar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Depositar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Depositar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Depositar().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtDepositar;
    private javax.swing.JLabel LblDeposito;
    private javax.swing.JLabel LblValor;
    private javax.swing.JTextArea TxtAreaDeposito;
    private javax.swing.JTextField TxtValor;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
