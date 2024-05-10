package View;
import Controller.Controle;
import Model.Investidor;
import java.sql.SQLException;
/**
 *
 * @author unifpvalim
 * @author uniflduarte
 */
public class Extrato extends javax.swing.JFrame {

    Controle controle;
    Investidor pessoa;
    
    public Extrato(Controle controle, Investidor pessoa) {
        initComponents();
        this.controle = controle;
        this.pessoa = pessoa;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblSenhaExtrato = new javax.swing.JLabel();
        TxtSenhaExtrato = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtAreaExtrato = new javax.swing.JTextArea();
        BtConsultarExtrato = new javax.swing.JButton();
        LblExtrato = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Extrato");

        LblSenhaExtrato.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        LblSenhaExtrato.setText("Senha:");

        TxtSenhaExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSenhaExtratoActionPerformed(evt);
            }
        });

        TxtAreaExtrato.setEditable(false);
        TxtAreaExtrato.setColumns(20);
        TxtAreaExtrato.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TxtAreaExtrato.setRows(5);
        TxtAreaExtrato.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(TxtAreaExtrato);

        BtConsultarExtrato.setBackground(new java.awt.Color(51, 51, 255));
        BtConsultarExtrato.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        BtConsultarExtrato.setForeground(new java.awt.Color(255, 255, 255));
        BtConsultarExtrato.setText("Consultar");
        BtConsultarExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtConsultarExtratoActionPerformed(evt);
            }
        });

        LblExtrato.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        LblExtrato.setForeground(new java.awt.Color(0, 0, 153));
        LblExtrato.setText("EXTRATO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(LblExtrato)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LblSenhaExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtSenhaExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtConsultarExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(LblExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblSenhaExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtSenhaExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtConsultarExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtSenhaExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSenhaExtratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSenhaExtratoActionPerformed

    private void BtConsultarExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtConsultarExtratoActionPerformed
        String senha = this.TxtSenhaExtrato.getText();
        String extrato = "";
        try{
            extrato = controle.Extrato(senha);
        }catch(SQLException e){
            
        }  
        this.TxtAreaExtrato.setText(extrato);
    }//GEN-LAST:event_BtConsultarExtratoActionPerformed

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
//            java.util.logging.Logger.getLogger(Extrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Extrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Extrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Extrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Extrato().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtConsultarExtrato;
    private javax.swing.JLabel LblExtrato;
    private javax.swing.JLabel LblSenhaExtrato;
    public javax.swing.JTextArea TxtAreaExtrato;
    private javax.swing.JTextField TxtSenhaExtrato;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
