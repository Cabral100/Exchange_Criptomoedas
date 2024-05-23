package View;

import Controller.Controle;
import Model.Bitcoin;
import Model.CriptoAdicional1;
import Model.CriptoAdicional2;
import Model.Ethereum;
import Model.Investidor;
import Model.Ripple;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author uniflduarte
 * @author unifpvalim
 */
public class VenderCripto3 extends javax.swing.JFrame {
    
    private Investidor pessoa;
    private Controle controle;
    
    /**
     *
     * @param pessoa
     * @param controle
     */
    public VenderCripto3(Investidor pessoa,Controle controle){
        initComponents();
        this.pessoa = pessoa;
        this.controle = controle;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblTxtComprar = new javax.swing.JLabel();
        LblTxtComprar2 = new javax.swing.JLabel();
        LblVender = new javax.swing.JLabel();
        LblSenhaVender = new javax.swing.JLabel();
        LblQuantidade = new javax.swing.JLabel();
        TxtSenhaVender = new javax.swing.JTextField();
        TxtAreaSaldoAtualizado = new javax.swing.JScrollPane();
        TextAreaCotacoes = new javax.swing.JTextArea();
        TxtQuantidade = new javax.swing.JTextField();
        LblCotacoes = new javax.swing.JLabel();
        RadioBtBitcoin = new javax.swing.JRadioButton();
        RadioBtEthereum = new javax.swing.JRadioButton();
        RadioBtRipple = new javax.swing.JRadioButton();
        BtOk = new javax.swing.JButton();
        BtVender = new javax.swing.JButton();
        RadioBtMoeda1 = new javax.swing.JRadioButton();
        RadioBtMoeda2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        LblTxtComprar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LblTxtComprar.setText("Selecione a moeda e");

        LblTxtComprar2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblTxtComprar2.setText("digite a quantidade!");

        LblVender.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        LblVender.setForeground(new java.awt.Color(0, 0, 204));
        LblVender.setText("VENDER CRIPTO");

        LblSenhaVender.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        LblSenhaVender.setText("Senha:");

        LblQuantidade.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblQuantidade.setText("Quantidade:");

        TxtSenhaVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSenhaVenderActionPerformed(evt);
            }
        });

        TextAreaCotacoes.setEditable(false);
        TextAreaCotacoes.setColumns(20);
        TextAreaCotacoes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TextAreaCotacoes.setRows(5);
        TextAreaCotacoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TxtAreaSaldoAtualizado.setViewportView(TextAreaCotacoes);

        TxtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtQuantidadeActionPerformed(evt);
            }
        });

        LblCotacoes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LblCotacoes.setText("Cotações");

        RadioBtBitcoin.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        RadioBtBitcoin.setText("Bitcoin");
        RadioBtBitcoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBtBitcoinActionPerformed(evt);
            }
        });

        RadioBtEthereum.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        RadioBtEthereum.setText("Ethereum");
        RadioBtEthereum.setToolTipText("");
        RadioBtEthereum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBtEthereumActionPerformed(evt);
            }
        });

        RadioBtRipple.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        RadioBtRipple.setText("Ripple");
        RadioBtRipple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBtRippleActionPerformed(evt);
            }
        });

        BtOk.setBackground(new java.awt.Color(51, 0, 255));
        BtOk.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        BtOk.setForeground(new java.awt.Color(255, 255, 255));
        BtOk.setText("OK!");
        BtOk.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtOkActionPerformed(evt);
            }
        });

        BtVender.setBackground(new java.awt.Color(51, 51, 255));
        BtVender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtVender.setForeground(new java.awt.Color(255, 255, 255));
        BtVender.setText("VENDER");
        BtVender.setToolTipText("");
        BtVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtVenderActionPerformed(evt);
            }
        });

        RadioBtMoeda1.setText("Moeda1");
        RadioBtMoeda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBtMoeda1ActionPerformed(evt);
            }
        });

        RadioBtMoeda2.setText("Moeda2");
        RadioBtMoeda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBtMoeda2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addComponent(TxtAreaSaldoAtualizado, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(LblTxtComprar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(LblSenhaVender, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtSenhaVender, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtOk, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(LblCotacoes))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(LblQuantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(LblTxtComprar2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(LblVender))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(BtVender, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(RadioBtBitcoin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RadioBtEthereum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RadioBtRipple)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RadioBtMoeda1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RadioBtMoeda2)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(LblVender)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtSenhaVender, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblSenhaVender, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtOk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LblCotacoes)
                .addGap(18, 18, 18)
                .addComponent(TxtAreaSaldoAtualizado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LblTxtComprar)
                .addGap(18, 18, 18)
                .addComponent(LblTxtComprar2)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioBtBitcoin)
                    .addComponent(RadioBtEthereum)
                    .addComponent(RadioBtRipple)
                    .addComponent(RadioBtMoeda1)
                    .addComponent(RadioBtMoeda2))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(BtVender, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtSenhaVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSenhaVenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSenhaVenderActionPerformed

    private void TxtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtQuantidadeActionPerformed

    private void RadioBtBitcoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBtBitcoinActionPerformed
        this.RadioBtEthereum.setSelected(false);
        this.RadioBtRipple.setSelected(false);
        pessoa.getExtrato().setNomeMoeda("Bitcoin");
        Bitcoin bitcoinObj = (Bitcoin) pessoa.getCarteira().getMoedas().get(1);
        pessoa.getExtrato().setCotgeral(pessoa.getCarteira().getMoedas().get(1).getCotacao());
        pessoa.getExtrato().setTaxageral(bitcoinObj.getTaxaVenda());
    }//GEN-LAST:event_RadioBtBitcoinActionPerformed

    private void RadioBtEthereumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBtEthereumActionPerformed
        this.RadioBtBitcoin.setSelected(false);
        this.RadioBtRipple.setSelected(false);
        pessoa.getExtrato().setNomeMoeda("Ethereum");
        Ethereum etheObj = (Ethereum) pessoa.getCarteira().getMoedas().get(2);
        pessoa.getExtrato().setCotgeral(pessoa.getCarteira().getMoedas().get(2).getCotacao());
        pessoa.getExtrato().setTaxageral(etheObj.getTaxaVenda());
    }//GEN-LAST:event_RadioBtEthereumActionPerformed

    private void RadioBtRippleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBtRippleActionPerformed
        this.RadioBtBitcoin.setSelected(false);
        this.RadioBtEthereum.setSelected(false);
        pessoa.getExtrato().setNomeMoeda("Ripple");
        Ripple rippleObj = (Ripple) pessoa.getCarteira().getMoedas().get(3);
        pessoa.getExtrato().setCotgeral(pessoa.getCarteira().getMoedas().get(3).getCotacao());
        pessoa.getExtrato().setTaxageral(rippleObj.getTaxaVenda());
    }//GEN-LAST:event_RadioBtRippleActionPerformed

    private void BtOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtOkActionPerformed
        if(this.TxtSenhaVender.getText().equals(pessoa.getSenha()) == true){
            try {
                controle.TxtVender2(this);
            } catch (SQLException ex) {
                Logger.getLogger(VenderCripto3.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null,"Senha incorreta!" , "Falha", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtOkActionPerformed

    private void BtVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtVenderActionPerformed
        double quantidade = Double.parseDouble(this.TxtQuantidade.getText());
        controle.Vender(quantidade);

        controle.Salvar();
        this.RadioBtBitcoin.setSelected(false);
        this.RadioBtEthereum.setSelected(false);
        this.RadioBtRipple.setSelected(false);
        this.TxtQuantidade.setText("");
    }//GEN-LAST:event_BtVenderActionPerformed

    private void RadioBtMoeda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBtMoeda1ActionPerformed
        this.RadioBtBitcoin.setSelected(false);
        this.RadioBtMoeda2.setSelected(false);
        this.RadioBtBitcoin.setSelected(false);
        this.RadioBtEthereum.setSelected(false);
        CriptoAdicional1 moeda1 = (CriptoAdicional1) pessoa.getCarteira().getMoedas().get(4);
        pessoa.getExtrato().setNomeMoeda(moeda1.getNome());
        pessoa.getExtrato().setCotgeral(pessoa.getCarteira().getMoedas().get(4).getCotacao());
        pessoa.getExtrato().setTaxageral(moeda1.getTaxaVenda());
        System.out.println(moeda1.getTaxavenda());
    }//GEN-LAST:event_RadioBtMoeda1ActionPerformed

    private void RadioBtMoeda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBtMoeda2ActionPerformed
        this.RadioBtBitcoin.setSelected(false);
        this.RadioBtBitcoin.setSelected(false);
        this.RadioBtEthereum.setSelected(false);
        this.RadioBtMoeda1.setSelected(false);
        CriptoAdicional2 moeda2 = (CriptoAdicional2) pessoa.getCarteira().getMoedas().get(5);
        pessoa.getExtrato().setNomeMoeda(moeda2.getNome());
        pessoa.getExtrato().setCotgeral(pessoa.getCarteira().getMoedas().get(5).getCotacao());
        pessoa.getExtrato().setTaxageral(moeda2.getTaxaVenda());
        System.out.println(moeda2.getTaxavenda());
    }//GEN-LAST:event_RadioBtMoeda2ActionPerformed

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
//            java.util.logging.Logger.getLogger(VenderCripto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VenderCripto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VenderCripto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VenderCripto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VenderCripto().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtOk;
    private javax.swing.JButton BtVender;
    private javax.swing.JLabel LblCotacoes;
    private javax.swing.JLabel LblQuantidade;
    private javax.swing.JLabel LblSenhaVender;
    private javax.swing.JLabel LblTxtComprar;
    private javax.swing.JLabel LblTxtComprar2;
    private javax.swing.JLabel LblVender;
    private javax.swing.JRadioButton RadioBtBitcoin;
    private javax.swing.JRadioButton RadioBtEthereum;
    public javax.swing.JRadioButton RadioBtMoeda1;
    public javax.swing.JRadioButton RadioBtMoeda2;
    private javax.swing.JRadioButton RadioBtRipple;
    public javax.swing.JTextArea TextAreaCotacoes;
    private javax.swing.JScrollPane TxtAreaSaldoAtualizado;
    private javax.swing.JTextField TxtQuantidade;
    private javax.swing.JTextField TxtSenhaVender;
    // End of variables declaration//GEN-END:variables
}
