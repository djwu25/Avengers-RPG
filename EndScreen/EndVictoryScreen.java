/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avengersgameproject;

/**
 *
 * @author Xuqiang
 */
public class EndVictoryScreen extends javax.swing.JFrame {

    /**
     * Creates new form EndVictoryScreen
     */
    public EndVictoryScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        PlayAgain = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Papyrus", 1, 60)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("VICTORY");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 30, 410, 120);

        PlayAgain.setFont(new java.awt.Font("Traditional Arabic", 1, 36)); // NOI18N
        PlayAgain.setForeground(new java.awt.Color(0, 102, 0));
        PlayAgain.setText("PLAY AGAIN");
        PlayAgain.setBorderPainted(false);
        PlayAgain.setContentAreaFilled(false);
        PlayAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayAgainActionPerformed(evt);
            }
        });
        getContentPane().add(PlayAgain);
        PlayAgain.setBounds(190, 350, 270, 70);

        Exit.setFont(new java.awt.Font("Traditional Arabic", 1, 36)); // NOI18N
        Exit.setForeground(new java.awt.Color(102, 0, 0));
        Exit.setText("EXIT");
        Exit.setBorderPainted(false);
        Exit.setContentAreaFilled(false);
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit);
        Exit.setBounds(220, 450, 200, 70);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/avengersgameproject/VictoryEnlarge.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 630, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void PlayAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayAgainActionPerformed
        Title title = new Title();
        title.setBounds(0, 0, 646, 658);
        title.setVisible(true);
        setVisible(false);
        AntmanScreen.victoryLaunch = false;
        ThorScreen.victoryLaunch = false;
        AvengersTeamScreen.victoryLaunch = false;
    }//GEN-LAST:event_PlayAgainActionPerformed

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
            java.util.logging.Logger.getLogger(EndVictoryScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EndVictoryScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EndVictoryScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EndVictoryScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EndVictoryScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton PlayAgain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}