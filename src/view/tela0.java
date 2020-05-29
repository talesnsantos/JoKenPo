/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Random;

/**
 *
 * @author Tamires
 */
public class tela0 extends javax.swing.JFrame {

    public tela0() {
        initComponents();
        papel2.setVisible(false);
        tesoura2.setVisible(false);
        pedra2.setVisible(false);
        perdeu.setVisible(false);
        ganhou.setVisible(false);
        EMPATE.setVisible(false);

    }

    public void vencer() {
        AudioClip vencer ;
        vencer = java.applet.Applet.newAudioClip(getClass().getResource("/musicas/vencer.wav"));
        vencer.play();
    }

    public void perder() {
        AudioClip perder;
        perder = java.applet.Applet.newAudioClip(getClass().getResource("/musicas/perdeu.wav"));
        perder.play();
    }

    public void empate() {
        AudioClip empate;
        empate = java.applet.Applet.newAudioClip(getClass().getResource("/musicas/empate.wav"));
        empate.play();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        perdeu = new org.edisoncor.gui.panel.PanelImageReflect();
        ganhou = new org.edisoncor.gui.panel.PanelImage();
        EMPATE = new org.edisoncor.gui.panel.PanelImage();
        pedra2 = new org.edisoncor.gui.panel.PanelImage();
        papel2 = new org.edisoncor.gui.panel.PanelImage();
        tesoura2 = new org.edisoncor.gui.panel.PanelImage();
        tesoura = new org.edisoncor.gui.panel.PanelImage();
        papel = new org.edisoncor.gui.panel.PanelImage();
        pedra = new org.edisoncor.gui.panel.PanelImage();
        fechar = new org.edisoncor.gui.panel.PanelImageReflect();
        escolha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        panelImage1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/VS-fundo-vermelho-tipo-1-r.png"))); // NOI18N
        panelImage1.setLayout(null);

        perdeu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/game_over3.png"))); // NOI18N
        perdeu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                perdeuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout perdeuLayout = new javax.swing.GroupLayout(perdeu);
        perdeu.setLayout(perdeuLayout);
        perdeuLayout.setHorizontalGroup(
            perdeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        perdeuLayout.setVerticalGroup(
            perdeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        panelImage1.add(perdeu);
        perdeu.setBounds(200, 10, 230, 380);

        ganhou.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ganhou.png"))); // NOI18N
        ganhou.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ganhouMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ganhouLayout = new javax.swing.GroupLayout(ganhou);
        ganhou.setLayout(ganhouLayout);
        ganhouLayout.setHorizontalGroup(
            ganhouLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        ganhouLayout.setVerticalGroup(
            ganhouLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        panelImage1.add(ganhou);
        ganhou.setBounds(130, 10, 350, 190);

        EMPATE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Untitled.png"))); // NOI18N
        EMPATE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EMPATEMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout EMPATELayout = new javax.swing.GroupLayout(EMPATE);
        EMPATE.setLayout(EMPATELayout);
        EMPATELayout.setHorizontalGroup(
            EMPATELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        EMPATELayout.setVerticalGroup(
            EMPATELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        panelImage1.add(EMPATE);
        EMPATE.setBounds(100, 180, 440, 250);

        pedra2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pedra.png"))); // NOI18N

        javax.swing.GroupLayout pedra2Layout = new javax.swing.GroupLayout(pedra2);
        pedra2.setLayout(pedra2Layout);
        pedra2Layout.setHorizontalGroup(
            pedra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        pedra2Layout.setVerticalGroup(
            pedra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        panelImage1.add(pedra2);
        pedra2.setBounds(400, -10, 220, 170);

        papel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/papel.png"))); // NOI18N

        javax.swing.GroupLayout papel2Layout = new javax.swing.GroupLayout(papel2);
        papel2.setLayout(papel2Layout);
        papel2Layout.setHorizontalGroup(
            papel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        papel2Layout.setVerticalGroup(
            papel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        panelImage1.add(papel2);
        papel2.setBounds(430, 160, 160, 160);

        tesoura2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tesoura.png"))); // NOI18N

        javax.swing.GroupLayout tesoura2Layout = new javax.swing.GroupLayout(tesoura2);
        tesoura2.setLayout(tesoura2Layout);
        tesoura2Layout.setHorizontalGroup(
            tesoura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        tesoura2Layout.setVerticalGroup(
            tesoura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        panelImage1.add(tesoura2);
        tesoura2.setBounds(440, 340, 150, 140);

        tesoura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tesoura2.png"))); // NOI18N
        tesoura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tesouraMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tesouraLayout = new javax.swing.GroupLayout(tesoura);
        tesoura.setLayout(tesouraLayout);
        tesouraLayout.setHorizontalGroup(
            tesouraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        tesouraLayout.setVerticalGroup(
            tesouraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        panelImage1.add(tesoura);
        tesoura.setBounds(20, 10, 180, 140);

        papel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/papel2.png"))); // NOI18N
        papel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                papelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout papelLayout = new javax.swing.GroupLayout(papel);
        papel.setLayout(papelLayout);
        papelLayout.setHorizontalGroup(
            papelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        papelLayout.setVerticalGroup(
            papelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        panelImage1.add(papel);
        papel.setBounds(30, 170, 150, 160);

        pedra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pedra2.png"))); // NOI18N
        pedra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pedraMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pedraLayout = new javax.swing.GroupLayout(pedra);
        pedra.setLayout(pedraLayout);
        pedraLayout.setHorizontalGroup(
            pedraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        pedraLayout.setVerticalGroup(
            pedraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        panelImage1.add(pedra);
        pedra.setBounds(0, 330, 200, 180);

        fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fechar.png"))); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, fechar, org.jdesktop.beansbinding.ELProperty.create("${border.borderOpaque}"), fechar, org.jdesktop.beansbinding.BeanProperty.create("border"));
        bindingGroup.addBinding(binding);

        fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fecharMouseClicked(evt);
            }
        });
        panelImage1.add(fechar);
        fechar.setBounds(270, 430, 70, 90);

        escolha.setFont(new java.awt.Font("Vineta BT", 3, 18)); // NOI18N
        escolha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        escolha.setText("ESCOLHA UMA OPÇÃO");
        escolha.setBorder(new org.edisoncor.gui.util.DropShadowBorder());
        panelImage1.add(escolha);
        escolha.setBounds(210, 20, 340, 50);

        jPanel1.add(panelImage1);
        panelImage1.setBounds(-4, -4, 610, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        setSize(new java.awt.Dimension(596, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tesouraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tesouraMouseClicked
        int a = 0;  // tesoura 0 , papel 1, pedra 2
        Random ale = new Random();
        int b = ale.nextInt(3);
        escolha.setVisible(false);

        if (a == b) {
            tesoura.setVisible(true);
            tesoura2.setVisible(true);
            pedra.setVisible(false);
            papel.setVisible(false);
            EMPATE.setVisible(true);
            empate();
        } else if (a == 0 && b == 1) {
            tesoura.setVisible(true);
            papel2.setVisible(true);
            papel.setVisible(false);
            pedra.setVisible(false);
            ganhou.setVisible(true);
            vencer();
        } else if (a == 0 && b == 2) {
            tesoura.setVisible(true);
            pedra2.setVisible(true);
            perdeu.setVisible(true);
            pedra.setVisible(false);
            papel.setVisible(false);
            perder();
        }

    }//GEN-LAST:event_tesouraMouseClicked

    private void papelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_papelMouseClicked
        int a = 1;  // tesoura 0 , papel 1, pedra 2;
        Random ale = new Random();
        int b = ale.nextInt(3);
        escolha.setVisible(false);

        if (a == b) {
            papel.setVisible(true);
            papel2.setVisible(true);
            pedra.setVisible(false);
            tesoura.setVisible(false);
            EMPATE.setVisible(true);
            empate();
        } else if (a == 1 && b == 0) {
            papel.setVisible(true);
            tesoura2.setVisible(true);
            tesoura.setVisible(false);
            pedra.setVisible(false);
            perdeu.setVisible(true);
            perder();
        } else if (a == 1 && b == 2) {
            papel.setVisible(true);
            pedra2.setVisible(true);
            tesoura.setVisible(false);
            pedra.setVisible(false);
            ganhou.setVisible(true);
            vencer();
        }
    }//GEN-LAST:event_papelMouseClicked

    private void pedraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pedraMouseClicked
        int a = 2;  //tesoura 0 , papel 1, pedra 2;
        Random ale = new Random();
        int b = ale.nextInt(3);
        escolha.setVisible(false);

        if (a == b) {
            pedra.setVisible(true);
            pedra2.setVisible(true);
            papel.setVisible(false);
            tesoura.setVisible(false);
            EMPATE.setVisible(true);
            empate();
        } else if (a == 2 && b == 0) {
            pedra.setVisible(true);
            tesoura2.setVisible(true);
            papel.setVisible(false);
            tesoura.setVisible(false);
            ganhou.setVisible(true);
            vencer();
        } else if (a == 2 && b == 1) {
            pedra.setVisible(true);
            papel2.setVisible(true);
            perdeu.setVisible(true);
            tesoura.setVisible(false);
            papel.setVisible(false);
            perder();
        }
    }//GEN-LAST:event_pedraMouseClicked

    private void perdeuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_perdeuMouseClicked

        this.dispose(); // depois que terminar de  jogar clicando em "tryagain" o jogo volta pra tela de inicio do game
        new tela0().setVisible(true); //
    }//GEN-LAST:event_perdeuMouseClicked

    private void fecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fecharMouseClicked
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_fecharMouseClicked

    private void EMPATEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EMPATEMouseClicked
        this.dispose(); // depois que terminar de  jogar clicando em "tryagain" o jogo volta pra tela de inicio do game
        new tela0().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_EMPATEMouseClicked

    private void ganhouMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ganhouMouseClicked
        this.dispose(); // depois que terminar de  jogar clicando em "tryagain" o jogo volta pra tela de inicio do game
        new tela0().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_ganhouMouseClicked

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
            java.util.logging.Logger.getLogger(tela0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela0().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static org.edisoncor.gui.panel.PanelImage EMPATE;
    private javax.swing.JLabel escolha;
    private org.edisoncor.gui.panel.PanelImageReflect fechar;
    public static org.edisoncor.gui.panel.PanelImage ganhou;
    private javax.swing.JPanel jPanel1;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage papel;
    private org.edisoncor.gui.panel.PanelImage papel2;
    public static org.edisoncor.gui.panel.PanelImage pedra;
    private org.edisoncor.gui.panel.PanelImage pedra2;
    public static org.edisoncor.gui.panel.PanelImageReflect perdeu;
    private org.edisoncor.gui.panel.PanelImage tesoura;
    private org.edisoncor.gui.panel.PanelImage tesoura2;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
