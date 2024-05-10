package View;

import Model.Investidor;
import java.text.DecimalFormat;

/**
 *
 * @author unifpvalim
 * @author uniflduarte
 */
public class Cotacoes extends javax.swing.JFrame {
    
    Investidor pessoa;
    
    public Cotacoes(Investidor pessoa){
        initComponents();
        DecimalFormat df = new DecimalFormat("#0.000");
        String cotbit = df.format(pessoa.getCarteira().getMoedas().get(1).getCotacao()).replace(',', '.');
        String cotethe = df.format(pessoa.getCarteira().getMoedas().get(2).getCotacao()).replace(',', '.');
        String cotrip = df.format(pessoa.getCarteira().getMoedas().get(3).getCotacao()).replace(',', '.');
        this.pessoa = pessoa;
        this.TxtPaneCotacoes.setText("\n\nNova cotação BITCOIN: " + cotbit + "\n\nNova cotação ETHEREUM: " + cotethe + 
                                     "\n\nNova cotação RIPPLE: " + cotrip);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblCotacoes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtPaneCotacoes = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        LblCotacoes.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        LblCotacoes.setForeground(new java.awt.Color(0, 0, 204));
        LblCotacoes.setText("COTAÇÕES ATUALIZADAS");

        TxtPaneCotacoes.setEditable(false);
        TxtPaneCotacoes.setBackground(new java.awt.Color(204, 204, 204));
        TxtPaneCotacoes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TxtPaneCotacoes.setForeground(new java.awt.Color(0, 0, 51));
        jScrollPane1.setViewportView(TxtPaneCotacoes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblCotacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(LblCotacoes)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
//            java.util.logging.Logger.getLogger(Cotacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Cotacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Cotacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Cotacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Cotacoes().setVisible(true);
//            }
//        });
//    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblCotacoes;
    private javax.swing.JTextPane TxtPaneCotacoes;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
