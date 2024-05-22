package View;

import Controller.Controle;
import Model.CriptoAdicional1;
import Model.CriptoAdicional2;
import Model.Investidor;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
/**
 *
 * @author unifpvalim
 */
public class Menu extends javax.swing.JFrame {

    Investidor pessoa;

    public Menu(Investidor pessoa) {
        initComponents();
        this.pessoa = pessoa;
        controle = new Controle(pessoa);
    }

    public JButton getBtAtulizar() {
        return BtAtulizar;
    }

    public void setBtAtulizar(JButton BtAtulizar) {
        this.BtAtulizar = BtAtulizar;
    }

    public JButton getBtComprar() {
        return BtComprar;
    }

    public void setBtComprar(JButton BtComprar) {
        this.BtComprar = BtComprar;
    }

    public JButton getBtConsultarExtrato() {
        return BtConsultarExtrato;
    }

    public void setBtConsultarExtrato(JButton BtConsultarExtrato) {
        this.BtConsultarExtrato = BtConsultarExtrato;
    }

    public JButton getBtConsultarSaldo() {
        return BtConsultarSaldo;
    }

    public void setBtConsultarSaldo(JButton BtConsultarSaldo) {
        this.BtConsultarSaldo = BtConsultarSaldo;
    }

    public JButton getBtDepositar() {
        return BtDepositar;
    }

    public void setBtDepositar(JButton BtDepositar) {
        this.BtDepositar = BtDepositar;
    }

    public JButton getBtSacar() {
        return BtSacar;
    }

    public void setBtSacar(JButton BtSacar) {
        this.BtSacar = BtSacar;
    }

    public JButton getBtSair() {
        return BtSair;
    }

    public void setBtSair(JButton BtSair) {
        this.BtSair = BtSair;
    }

    public JButton getBtVender() {
        return BtVender;
    }

    public void setBtVender(JButton BtVender) {
        this.BtVender = BtVender;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtConsultarSaldo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BtConsultarExtrato = new javax.swing.JButton();
        BtSacar = new javax.swing.JButton();
        BtDepositar = new javax.swing.JButton();
        BtComprar = new javax.swing.JButton();
        BtVender = new javax.swing.JButton();
        BtAtulizar = new javax.swing.JButton();
        BtSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu");

        BtConsultarSaldo.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        BtConsultarSaldo.setText("1. Consultar Saldo");
        BtConsultarSaldo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtConsultarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtConsultarSaldoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Exchange de Criptomoedas");

        BtConsultarExtrato.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        BtConsultarExtrato.setText("2. Consultar Extrato");
        BtConsultarExtrato.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtConsultarExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtConsultarExtratoActionPerformed(evt);
            }
        });

        BtSacar.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        BtSacar.setText("4. Sacar");
        BtSacar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSacarActionPerformed(evt);
            }
        });

        BtDepositar.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        BtDepositar.setText("3. Depositar");
        BtDepositar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtDepositarActionPerformed(evt);
            }
        });

        BtComprar.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        BtComprar.setText("5. Comprar Criptomoedas");
        BtComprar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtComprarActionPerformed(evt);
            }
        });

        BtVender.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        BtVender.setText("6. Vender Criptomoedas");
        BtVender.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtVenderActionPerformed(evt);
            }
        });

        BtAtulizar.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        BtAtulizar.setText("7. Atualizar Cotação");
        BtAtulizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtAtulizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAtulizarActionPerformed(evt);
            }
        });

        BtSair.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        BtSair.setText("Sair");
        BtSair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtComprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtVender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtSacar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtDepositar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtConsultarExtrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtConsultarSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtAtulizar, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel1)))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtSair, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(BtConsultarSaldo)
                .addGap(18, 18, 18)
                .addComponent(BtConsultarExtrato)
                .addGap(18, 18, 18)
                .addComponent(BtDepositar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtSacar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtComprar)
                .addGap(14, 14, 14)
                .addComponent(BtVender)
                .addGap(18, 18, 18)
                .addComponent(BtAtulizar)
                .addGap(49, 49, 49)
                .addComponent(BtSair))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSairActionPerformed
        this.setVisible(false);
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_BtSairActionPerformed

    private void BtConsultarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtConsultarSaldoActionPerformed
        Saldo saldo = new Saldo(pessoa,controle);
        saldo.setVisible(true);
    }//GEN-LAST:event_BtConsultarSaldoActionPerformed

    private void BtConsultarExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtConsultarExtratoActionPerformed
        Extrato extrato = new Extrato(controle,pessoa);
        extrato.setVisible(true);
    }//GEN-LAST:event_BtConsultarExtratoActionPerformed

    private void BtDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtDepositarActionPerformed
        Depositar depositar = new Depositar(pessoa,controle);
        depositar.setVisible(true);
    }//GEN-LAST:event_BtDepositarActionPerformed

    private void BtSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSacarActionPerformed
        Sacar sacar = new Sacar(pessoa,controle);
        sacar.setVisible(true);
    }//GEN-LAST:event_BtSacarActionPerformed

    private void BtComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtComprarActionPerformed
        try {
            controle.RBComprar();
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtComprarActionPerformed

    private void BtVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtVenderActionPerformed
        try {
            controle.RBVender();
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtVenderActionPerformed

    private void BtAtulizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAtulizarActionPerformed
        try {
            controle.Cotacoes();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_BtAtulizarActionPerformed

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
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Menu().setVisible(true);
//            }
//        });
//    }
    
    Controle controle;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAtulizar;
    private javax.swing.JButton BtComprar;
    private javax.swing.JButton BtConsultarExtrato;
    private javax.swing.JButton BtConsultarSaldo;
    private javax.swing.JButton BtDepositar;
    private javax.swing.JButton BtSacar;
    private javax.swing.JButton BtSair;
    private javax.swing.JButton BtVender;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
