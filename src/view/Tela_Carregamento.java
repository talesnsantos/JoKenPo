package view;

import com.sun.javafx.applet.Splash;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aluno
 */
public class Tela_Carregamento extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Carregamento
     */
    public Tela_Carregamento() {
        initComponents();
        new Thread() {

            public void run() {

                for (int i = 0; i < 101; i++) {
                    try {
                        sleep(60);

                        progresso.setValue(i);
                        if (progresso.getValue() == 10) {

                            label.setText("Fazendo a conexao com o banco de dados");
                            sleep(2000);

                        } else if (progresso.getValue() <= 30) {
                            label.setText("Carregando o sistema");
                            sleep(100);
                        } else if (progresso.getValue() <= 99) {
                            label.setText("Carregamento quase completo");

                        } else {
                            label.setText("Carregamento completo. Seu programa sera iniciado.");

                            sleep(3000);
                            dispose();
                            new tela0().setVisible(true);
                        }

                    } catch (InterruptedException ex) {
                        Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }

        }.start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        jLabel2 = new javax.swing.JLabel();
        progresso = new javax.swing.JProgressBar();
        label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tella.png"))); // NOI18N
        panelImage2.setInheritsPopupMenu(true);
        panelImage2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Rosewood Std Regular", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("JOKENPÔ");
        panelImage2.add(jLabel2);
        jLabel2.setBounds(290, 150, 190, 50);

        progresso.setBackground(new java.awt.Color(255, 51, 0));
        progresso.setForeground(new java.awt.Color(0, 0, 0));
        panelImage2.add(progresso);
        progresso.setBounds(10, 350, 480, 20);

        label.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        label.setForeground(new java.awt.Color(255, 0, 0));
        panelImage2.add(label);
        label.setBounds(10, 330, 370, 20);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Criadores: Alisson Bastos & Tales Luis.");
        panelImage2.add(jLabel1);
        jLabel1.setBounds(10, 10, 350, 14);

        getContentPane().add(panelImage2);
        panelImage2.setBounds(0, 0, 500, 370);

        setSize(new java.awt.Dimension(498, 368));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_Carregamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Carregamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Carregamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Carregamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Carregamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel label;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private javax.swing.JProgressBar progresso;
    // End of variables declaration//GEN-END:variables
}
