package View;
import Controller.Controle;
import Model.Bitcoin;
import Model.Ethereum;
import Model.Investidor;
import Model.Ripple;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 *
 * @author uniflduarte
 * @author unifpvalim
 */
public class ComprarCripto extends javax.swing.JFrame {
    
    private Investidor pessoa;
    private Controle controle;
    
    /**
     *
     * @param pessoa
     * @param controle
     */
    public ComprarCripto(Investidor pessoa,Controle controle){
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

        LblComprar = new javax.swing.JLabel();
        LblSenhaCompra = new javax.swing.JLabel();
        TxtSenhaCompra = new javax.swing.JTextField();
        TxtAreaSaldoAtualizado = new javax.swing.JScrollPane();
        TextAreaCotacoes = new javax.swing.JTextArea();
        RadioBtBitcoin = new javax.swing.JRadioButton();
        RadioBtEthereum = new javax.swing.JRadioButton();
        RadioBtRipple = new javax.swing.JRadioButton();
        LblTxtComprar = new javax.swing.JLabel();
        LblTxtComprar2 = new javax.swing.JLabel();
        LblQuantidade = new javax.swing.JLabel();
        TxtQuantidade = new javax.swing.JTextField();
        LblCotacoes = new javax.swing.JLabel();
        BtOk = new javax.swing.JButton();
        BtComprar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        LblComprar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        LblComprar.setForeground(new java.awt.Color(0, 0, 153));
        LblComprar.setText("COMPRAR CRIPTO");

        LblSenhaCompra.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        LblSenhaCompra.setText("Senha:");

        TxtSenhaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSenhaCompraActionPerformed(evt);
            }
        });

        TextAreaCotacoes.setEditable(false);
        TextAreaCotacoes.setColumns(20);
        TextAreaCotacoes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TextAreaCotacoes.setRows(5);
        TextAreaCotacoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TxtAreaSaldoAtualizado.setViewportView(TextAreaCotacoes);

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

        LblTxtComprar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LblTxtComprar.setText("Selecione a moeda e");

        LblTxtComprar2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblTxtComprar2.setText("digite a quantidade!");

        LblQuantidade.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblQuantidade.setText("Quantidade:");

        TxtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtQuantidadeActionPerformed(evt);
            }
        });

        LblCotacoes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LblCotacoes.setText("Cotações");

        BtOk.setBackground(new java.awt.Color(51, 51, 255));
        BtOk.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        BtOk.setForeground(new java.awt.Color(255, 255, 255));
        BtOk.setText("OK!");
        BtOk.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtOkActionPerformed(evt);
            }
        });

        BtComprar.setBackground(new java.awt.Color(51, 51, 255));
        BtComprar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtComprar.setForeground(new java.awt.Color(255, 255, 255));
        BtComprar.setText("COMPRAR");
        BtComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtComprarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(LblSenhaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtSenhaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtOk, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(LblComprar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(LblTxtComprar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(LblCotacoes))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(LblTxtComprar2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtAreaSaldoAtualizado, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LblQuantidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(RadioBtBitcoin)
                                        .addGap(51, 51, 51)
                                        .addComponent(RadioBtEthereum)
                                        .addGap(40, 40, 40)
                                        .addComponent(RadioBtRipple))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(BtComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(LblComprar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtSenhaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblSenhaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addComponent(LblCotacoes)
                .addGap(18, 18, 18)
                .addComponent(TxtAreaSaldoAtualizado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LblTxtComprar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblTxtComprar2)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioBtBitcoin)
                    .addComponent(RadioBtEthereum)
                    .addComponent(RadioBtRipple))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BtComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtSenhaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSenhaCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSenhaCompraActionPerformed

    private void RadioBtBitcoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBtBitcoinActionPerformed
        this.RadioBtEthereum.setSelected(false);
        this.RadioBtRipple.setSelected(false);
        pessoa.getExtrato().setNomeMoeda("Bitcoin");
        Bitcoin bitcoinObj = (Bitcoin) pessoa.getCarteira().getMoedas().get(1);
        pessoa.getExtrato().setCotgeral(pessoa.getCarteira().getMoedas().get(1).getCotacao());
        pessoa.getExtrato().setTaxageral(bitcoinObj.getTaxaCompra());
    }//GEN-LAST:event_RadioBtBitcoinActionPerformed

    private void RadioBtEthereumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBtEthereumActionPerformed
        this.RadioBtBitcoin.setSelected(false);
        this.RadioBtRipple.setSelected(false);
        pessoa.getExtrato().setNomeMoeda("Ethereum");
        Ethereum etheObj = (Ethereum) pessoa.getCarteira().getMoedas().get(2);
        pessoa.getExtrato().setCotgeral(pessoa.getCarteira().getMoedas().get(2).getCotacao());
        pessoa.getExtrato().setTaxageral(etheObj.getTaxaCompra());
    }//GEN-LAST:event_RadioBtEthereumActionPerformed

    private void RadioBtRippleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBtRippleActionPerformed
        this.RadioBtBitcoin.setSelected(false);
        this.RadioBtEthereum.setSelected(false);
        pessoa.getExtrato().setNomeMoeda("Ripple");
        Ripple rippleObj = (Ripple) pessoa.getCarteira().getMoedas().get(3);
        pessoa.getExtrato().setCotgeral(pessoa.getCarteira().getMoedas().get(3).getCotacao());
        pessoa.getExtrato().setTaxageral(rippleObj.getTaxaCompra());
    }//GEN-LAST:event_RadioBtRippleActionPerformed

    private void TxtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtQuantidadeActionPerformed
        
    }//GEN-LAST:event_TxtQuantidadeActionPerformed

    private void BtOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtOkActionPerformed
        if(this.TxtSenhaCompra.getText().equals(pessoa.getSenha()) == true){
            JOptionPane.showMessageDialog(null,"Senha correta!" , "Sucesso", INFORMATION_MESSAGE);
            DecimalFormat df = new DecimalFormat("#0.000");
            String cotbit = df.format(pessoa.getCarteira().getMoedas().get(1).getCotacao()).replace(',', '.');
            String cotethe = df.format(pessoa.getCarteira().getMoedas().get(2).getCotacao()).replace(',', '.');
            String cotrip = df.format(pessoa.getCarteira().getMoedas().get(3).getCotacao()).replace(',', '.');
            this.TextAreaCotacoes.setText("Cotação BITCOIN: " + cotbit + "\n\nCotação ETHEREUM: " + cotethe + 
                                     "\n\nCotação RIPPLE: " + cotrip);
        } else {
            JOptionPane.showMessageDialog(null,"Senha incorreta!" , "Falha", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtOkActionPerformed

    private void BtComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtComprarActionPerformed
        double quantidade = Double.parseDouble(this.TxtQuantidade.getText());
        controle.Comprar(quantidade);    
        controle.Salvar();
        
        this.RadioBtBitcoin.setSelected(false);
        this.RadioBtEthereum.setSelected(false);
        this.RadioBtRipple.setSelected(false);
        this.TxtQuantidade.setText("");
    }//GEN-LAST:event_BtComprarActionPerformed

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
//            java.util.logging.Logger.getLogger(ComprarCripto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ComprarCripto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ComprarCripto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ComprarCripto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ComprarCripto().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtComprar;
    private javax.swing.JButton BtOk;
    private javax.swing.JLabel LblComprar;
    private javax.swing.JLabel LblCotacoes;
    private javax.swing.JLabel LblQuantidade;
    private javax.swing.JLabel LblSenhaCompra;
    private javax.swing.JLabel LblTxtComprar;
    private javax.swing.JLabel LblTxtComprar2;
    private javax.swing.JRadioButton RadioBtBitcoin;
    private javax.swing.JRadioButton RadioBtEthereum;
    private javax.swing.JRadioButton RadioBtRipple;
    private javax.swing.JTextArea TextAreaCotacoes;
    private javax.swing.JScrollPane TxtAreaSaldoAtualizado;
    private javax.swing.JTextField TxtQuantidade;
    private javax.swing.JTextField TxtSenhaCompra;
    // End of variables declaration//GEN-END:variables
}
