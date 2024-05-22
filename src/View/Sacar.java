package View;

import Controller.Controle;
import Model.Investidor;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author thelm
 */
public class Sacar extends javax.swing.JFrame {

    Investidor pessoa;
    Controle controle;
    
    public Sacar(Investidor pessoa, Controle controle) {
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

    public JButton getBtSacar() {
        return BtSacar;
    }

    public void setBtSacar(JButton BtSacar) {
        this.BtSacar = BtSacar;
    }

    public JLabel getLblsacar() {
        return Lblsacar;
    }

    public void setLblsacar(JLabel Lblsacar) {
        this.Lblsacar = Lblsacar;
    }

    public JTextArea getTextAreaSaque() {
        return TextAreaSaque;
    }

    public void setTextAreaSaque(JTextArea TextAreaSaque) {
        this.TextAreaSaque = TextAreaSaque;
    }

    public JTextField getTxtSacar() {
        return TxtSacar;
    }

    public void setTxtSacar(JTextField TxtSacar) {
        this.TxtSacar = TxtSacar;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Lblsacar = new javax.swing.JLabel();
        TxtSacar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaSaque = new javax.swing.JTextArea();
        BtSacar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("SACAR");

        Lblsacar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Lblsacar.setText("Valor:");

        TxtSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSacarActionPerformed(evt);
            }
        });

        TextAreaSaque.setEditable(false);
        TextAreaSaque.setColumns(20);
        TextAreaSaque.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TextAreaSaque.setRows(5);
        TextAreaSaque.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(TextAreaSaque);

        BtSacar.setBackground(new java.awt.Color(51, 51, 255));
        BtSacar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        BtSacar.setForeground(new java.awt.Color(255, 255, 255));
        BtSacar.setText("SACAR");
        BtSacar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSacarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(138, 138, 138))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Lblsacar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lblsacar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtSacar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtSacar))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSacarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSacarActionPerformed

    private void BtSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSacarActionPerformed
        double quantidade = Double.parseDouble(this.TxtSacar.getText());
        controle.Sacar(quantidade);
        DecimalFormat df = new DecimalFormat("#0.000");
        String reais = df.format(pessoa.getSaldoreal()).replace(',', '.');
        this.TextAreaSaque.setText("\n\nSaldo Atualizado: " + reais);
        controle.Salvar();     
    }//GEN-LAST:event_BtSacarActionPerformed

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
//            java.util.logging.Logger.getLogger(Sacar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Sacar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Sacar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Sacar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Sacar().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtSacar;
    private javax.swing.JLabel Lblsacar;
    private javax.swing.JTextArea TextAreaSaque;
    private javax.swing.JTextField TxtSacar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

