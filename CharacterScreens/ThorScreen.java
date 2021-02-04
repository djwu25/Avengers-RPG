/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avengersgameproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Timer;

/**
 *
 * @author Xuqiang
 */
public class ThorScreen extends javax.swing.JFrame {

    /**
     * Creates new form ThorScreen
     */
    Avenger ThorChar = new Avenger("Thor", 500, 80);
    Avenger ThanosChar = new Avenger("Thanos", 1000, 200);
    private int indexThor = 0, indexThanos = 1;
    private ArrayList<Avenger> characters;
    private int newHealth = 0, 
            timerThorHealth = 0, timerThanosAttack = 1, timerThanosHealth = 2, 
            timerThorSoul = 3, timerStormbreaker = 4, timerThanosHeadCut = 5, timerThorStormbreaker = 6, 
            timerThorHalf = 7, timerSnapThanos = 8, timerDoubleStormbreaker = 9, timerDoubleThorStormbreaker = 10,
            timerSnapThor = 11, totalTimers = 12;
    private Timer[] timers;
    private boolean thanosTarget = false, mindControl = false, thanosHeadCut = false,
            fortnite = false;
    public static boolean victoryLaunch = false, defeatLaunch = false;
    public ThorScreen() {
        initComponents();
        enableButtons(true);
        timers = new Timer[13];
        characters = new ArrayList<Avenger>();
        characters.add(ThorChar);
        characters.add(ThanosChar);
    }
    
    private void enableButtons( boolean flag )
    {
        Beer.setEnabled(flag);
        Fortnite.setEnabled(flag);
        Stormbreaker.setEnabled(flag);
        if(thanosHeadCut)
            CutThanosHead.setEnabled(false);
        else
            CutThanosHead.setEnabled(flag);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TopLine = new javax.swing.JTextField();
        BottomLine = new javax.swing.JTextField();
        ThanosName = new javax.swing.JTextField();
        ThanosHealth = new javax.swing.JProgressBar();
        ThanosPic = new javax.swing.JLabel();
        Stormbreaker = new javax.swing.JButton();
        Fortnite = new javax.swing.JButton();
        CutThanosHead = new javax.swing.JButton();
        Beer = new javax.swing.JButton();
        ThorName = new javax.swing.JTextField();
        ThorHealth = new javax.swing.JProgressBar();
        Thor = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        TopLine.setEditable(false);
        TopLine.setBackground(new java.awt.Color(240, 240, 240));
        TopLine.setFont(new java.awt.Font("Perpetua Titling MT", 0, 24)); // NOI18N
        TopLine.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TopLine.setText("thor fights thanos");
        TopLine.setBorder(null);
        getContentPane().add(TopLine);
        TopLine.setBounds(0, 0, 630, 70);

        BottomLine.setEditable(false);
        BottomLine.setBackground(new java.awt.Color(240, 240, 240));
        BottomLine.setFont(new java.awt.Font("Perpetua Titling MT", 0, 24)); // NOI18N
        BottomLine.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BottomLine.setText("what should thor do?");
        BottomLine.setBorder(null);
        getContentPane().add(BottomLine);
        BottomLine.setBounds(0, 70, 630, 70);

        ThanosName.setBackground(new java.awt.Color(240, 240, 240));
        ThanosName.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        ThanosName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ThanosName.setText("THANOS");
        getContentPane().add(ThanosName);
        ThanosName.setBounds(340, 140, 290, 50);

        ThanosHealth.setBackground(new java.awt.Color(255, 0, 0));
        ThanosHealth.setForeground(new java.awt.Color(0, 204, 0));
        ThanosHealth.setMaximum(1000);
        ThanosHealth.setValue(1000);
        getContentPane().add(ThanosHealth);
        ThanosHealth.setBounds(340, 190, 290, 20);

        ThanosPic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ThanosPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/avengersgameproject/SmallThanos.png"))); // NOI18N
        getContentPane().add(ThanosPic);
        ThanosPic.setBounds(400, 220, 180, 280);

        Stormbreaker.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        Stormbreaker.setText("Stormbreaker");
        Stormbreaker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StormbreakerActionPerformed(evt);
            }
        });
        getContentPane().add(Stormbreaker);
        Stormbreaker.setBounds(440, 570, 190, 50);

        Fortnite.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        Fortnite.setText("Fortnite");
        Fortnite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FortniteActionPerformed(evt);
            }
        });
        getContentPane().add(Fortnite);
        Fortnite.setBounds(440, 520, 190, 50);

        CutThanosHead.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        CutThanosHead.setText("Cut Thanos's Head");
        CutThanosHead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CutThanosHeadActionPerformed(evt);
            }
        });
        getContentPane().add(CutThanosHead);
        CutThanosHead.setBounds(250, 570, 190, 50);

        Beer.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        Beer.setText("Beer");
        Beer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeerActionPerformed(evt);
            }
        });
        getContentPane().add(Beer);
        Beer.setBounds(250, 520, 190, 50);

        ThorName.setBackground(new java.awt.Color(240, 240, 240));
        ThorName.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        ThorName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ThorName.setText("THOR");
        getContentPane().add(ThorName);
        ThorName.setBounds(0, 350, 250, 50);

        ThorHealth.setBackground(new java.awt.Color(255, 0, 0));
        ThorHealth.setForeground(new java.awt.Color(0, 204, 0));
        ThorHealth.setMaximum(500);
        ThorHealth.setValue(500);
        getContentPane().add(ThorHealth);
        ThorHealth.setBounds(0, 400, 250, 14);

        Thor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Thor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/avengersgameproject/ThorCharacter.png"))); // NOI18N
        getContentPane().add(Thor);
        Thor.setBounds(60, 440, 120, 160);

        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/avengersgameproject/Background.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 630, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeerActionPerformed
        enableButtons(false);
        if(mindControl)
        {
            mindControl = false;
            TopLine.setText( characters.get(indexThor).getName() + " is influenced under the Mind Stone");
            BottomLine.setText( characters.get(indexThor).getName() + " can't drink the beer");
            ThanosAttack();
            return;
        }
        if(fortnite)
        {
            fortnite = false;
            characters.get(indexThor).setStrength(characters.get(indexThor).getStrength()*2);
        }
        if(thanosTarget)
        {
            thanosTarget = false;
        }
        TopLine.setText( characters.get(indexThor).getName() + " drinks some beer");
        BottomLine.setText( characters.get(indexThor).getName() + " heals up some health");
        if( characters.get(indexThor).getHealth() + characters.get(indexThor).getStrength() >= 500)
            newHealth = 500;
        else
            newHealth = characters.get(indexThor).getHealth() + characters.get(indexThor).getStrength();
        timers[timerThorHealth] = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ThorHealthIncrease();
            }
        } );
        timers[timerThorHealth].start();
        characters.get(indexThor).setStrength(80);
        ThanosAttack();
    }//GEN-LAST:event_BeerActionPerformed

    private void FortniteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FortniteActionPerformed
        enableButtons(false);
        if(mindControl)
        {
            mindControl = false;
            TopLine.setText( characters.get(indexThor).getName() + " was unable to use Fornite" );
            BottomLine.setText( characters.get(indexThor).getName() + " did nothing" );
            ThanosAttack();
            return;
        }
        if(thanosTarget)
        {
            thanosTarget = false;
        }
        fortnite = true;
        TopLine.setText( characters.get(indexThor).getName() + " loses to a kid in Fortnite" );
        BottomLine.setText( characters.get(indexThor).getName() + " is angry and his next move is doubled" );
        ThanosAttack();
    }//GEN-LAST:event_FortniteActionPerformed

    private void CutThanosHeadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CutThanosHeadActionPerformed
        enableButtons(false);
        fortnite = false;
        if(thanosTarget || mindControl)
        {
            thanosHeadCut = true;
            thanosTarget = false;
            mindControl = false;
            TopLine.setText( characters.get(indexThor).getName() + " missed " + characters.get(indexThanos).getName() + "'s head" );
            BottomLine.setText( characters.get(indexThor).getName() + " missed his chance" );
            ThanosAttack();
            return;
        }
        thanosHeadCut = true;
        TopLine.setText( characters.get(indexThor).getName() + " has cut off " + characters.get(indexThanos).getName() + "'s head!" );
        BottomLine.setText( characters.get(indexThanos).getName() + " is on the verge of death!" );
        newHealth = 10;
        timers[timerThanosHeadCut] = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ThanosHeadCutDecrease();
            }
        } );
        timers[timerThanosHeadCut].start();
        ThanosAttack();
    }//GEN-LAST:event_CutThanosHeadActionPerformed

    private void StormbreakerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StormbreakerActionPerformed
        enableButtons(false);
        if(mindControl && fortnite)
        {
            fortnite = false;
            mindControl = false;
            TopLine.setText( characters.get(indexThor).getName() + "  is confused under the Mind Stone" );
            BottomLine.setText( characters.get(indexThor).getName() + " hit himself while angry" );
            characters.get(indexThor).setStrength(characters.get(indexThor).getStrength()*2);
            characters.get(indexThor).useMove(characters.get(indexThor).getBasicMove(), 
                    characters.get(indexThor), characters.get(indexThor));
            newHealth = characters.get(indexThor).getHealth();
            timers[timerDoubleThorStormbreaker] = new Timer(10, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ThorHealthDecreaseDoubleStormbreaker();
                    if(characters.get(indexThor).getHealth() == 0)
                        checkGameState();
                }
            } );
            timers[timerDoubleThorStormbreaker].start();
            characters.get(indexThor).setStrength(80);
            ThanosAttack();
            return;
        }
        if(fortnite)
        {
            fortnite = false;
            TopLine.setText( characters.get(indexThor).getName() + " used Stormbreaker while angry" );
            BottomLine.setText( characters.get(indexThor).getName() + " did double his original damage!" );
            characters.get(indexThor).setStrength(characters.get(indexThor).getStrength()*2);
            characters.get(indexThor).useMove(characters.get(indexThor).getBasicMove(), 
                    characters.get(indexThor), characters.get(indexThanos));
            newHealth = characters.get(indexThanos).getHealth();
            timers[timerDoubleStormbreaker] = new Timer(10, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ThanosHealthDecreaseDoubleStormbreaker();
                    if(characters.get(indexThanos).getHealth() == 0)
                        checkGameState();
                }
            } );
            timers[timerDoubleStormbreaker].start();
            characters.get(indexThor).setStrength(80);
            ThanosAttack();
            return;
        }
        if(thanosTarget)
        {
            TopLine.setText( characters.get(indexThor).getName() + " swung Stormbreaker at nothing" );
            BottomLine.setText( characters.get(indexThor).getName() + " missed" );
            thanosTarget = false;
            ThanosAttack();
            return;
        }
        if(mindControl)
        {
            mindControl = false;
            TopLine.setText( characters.get(indexThor).getName() + " is confused under the Mind Stone" );
            BottomLine.setText( characters.get(indexThor).getName() + " used Stormbreaker on himself" );
            characters.get(indexThor).useMove(characters.get(indexThor).getBasicMove(), 
                    characters.get(indexThor), characters.get(indexThor));
            newHealth = characters.get(indexThor).getHealth();
            timers[timerThorStormbreaker] = new Timer(10, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ThorHealthStormbreakerDecrease();
                    if(characters.get(indexThor).getHealth() == 0)
                        checkGameState();
                }
            } );
            timers[timerThorStormbreaker].start();
            ThanosAttack();
            return;
        }
        characters.get(indexThor).useMove(characters.get(indexThor).getBasicMove(), 
                characters.get(indexThor), characters.get(indexThanos));
        newHealth = characters.get(indexThanos).getHealth();
        TopLine.setText( characters.get(indexThor).getName() + " used Stormbreaker on " + characters.get(indexThanos).getName());
        BottomLine.setText( "Stormbreaker was ineffective. . . " );
        timers[timerStormbreaker] = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ThanosHealthDecreaseStormbreaker();
                if(characters.get(indexThanos).getHealth() == 0)
                    checkGameState();
            }
        } );
        timers[timerStormbreaker].start();
        ThanosAttack();
    }//GEN-LAST:event_StormbreakerActionPerformed
    
    private void ThorHealthDecreaseDoubleStormbreaker()
    {
        if(ThorHealth.getValue() > newHealth+1)
        {
            characters.get(indexThor).setHealth(ThorHealth.getValue()-10);
            ThorHealth.setValue(ThorHealth.getValue()-10);
        } else {
            timers[timerDoubleThorStormbreaker].stop();
        }
    }
    
    private void ThanosHealthDecreaseDoubleStormbreaker()
    {
        if(ThanosHealth.getValue() > newHealth+1)
        {
            characters.get(indexThanos).setHealth(ThanosHealth.getValue()-10);
            ThanosHealth.setValue(ThanosHealth.getValue()-10);
        } else {
            timers[timerDoubleStormbreaker].stop();
        }
    }
    
    private void ThanosHeadCutDecrease()
    {
        if(ThanosHealth.getValue() > newHealth+1)
        {
            characters.get(indexThanos).setHealth(ThanosHealth.getValue()-10);
            ThanosHealth.setValue(ThanosHealth.getValue()-10);
        } else {
            timers[timerThanosHeadCut].stop();
        }
    }
    
    private void ThanosHealthDecreaseStormbreaker()
    {
        if(ThanosHealth.getValue() > newHealth+1)
        {
            characters.get(indexThanos).setHealth(ThanosHealth.getValue()-10);
            ThanosHealth.setValue(ThanosHealth.getValue()-10);
        } else {
            timers[timerStormbreaker].stop();
        }
    }
    
    private void ThorHealthStormbreakerDecrease()
    {
        if(ThorHealth.getValue() > newHealth+2)
        {
            characters.get(indexThor).setHealth(ThorHealth.getValue()-10);
            ThorHealth.setValue(ThorHealth.getValue()-10);
        } else {
            timers[timerThorStormbreaker].stop();
        }
    }
    
    private void ThorHealthIncrease()
    {
        if(ThorHealth.getValue() < newHealth)
        {
            characters.get(indexThor).setHealth(ThorHealth.getValue()+10);
            ThorHealth.setValue(ThorHealth.getValue()+10);
        } else {
            timers[timerThorHealth].stop();
        }
    }
    
    private void ThanosHealthIncrease()
    {
        if(ThanosHealth.getValue() < 1000)
        {
            characters.get(indexThanos).setHealth(ThanosHealth.getValue()+10);
            ThanosHealth.setValue(ThanosHealth.getValue()+10);
        } else {
            timers[timerThanosHealth].stop();
            enableButtons(true);
        }
    }
    
    private void ThorHealthDeplete()
    {
        if(ThorHealth.getValue() > newHealth+2)
        {
            characters.get(indexThor).setHealth(ThorHealth.getValue()-10);
            ThorHealth.setValue(ThorHealth.getValue()-10);
        } else {
            timers[timerThorSoul].stop();
            enableButtons(true);
        }
    }
    
    private void ThorHealthHalf()
    {
        if(ThorHealth.getValue() > newHealth+2)
        {
            characters.get(indexThor).setHealth(ThorHealth.getValue()-10);
            ThorHealth.setValue(ThorHealth.getValue()-10);
        } else {
            timers[timerThorHalf].stop();
            enableButtons(true);
        }
    }
    
    private void ThanosSnapThanos()
    {
        if(ThanosHealth.getValue() > newHealth+1)
        {
            characters.get(indexThanos).setHealth(ThanosHealth.getValue()-10);
            ThanosHealth.setValue(ThanosHealth.getValue()-10);
        } else {
            timers[timerSnapThanos].stop();
        }
    }
    
    private void ThanosSnapThor()
    {
        if(ThorHealth.getValue() > newHealth+1)
        {
            characters.get(indexThor).setHealth(ThorHealth.getValue()-10);
            ThorHealth.setValue(ThorHealth.getValue()-10);
        } else {
            timers[timerSnapThor].stop();
        }
    }
    
    private void ThanosAttack()
    {
        timers[timerThanosAttack] = new Timer(3500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ThanosAttackChoice();
            }
        } );
        timers[timerThanosAttack].start();
    }
    
    private void ThanosAttackChoice()
    {
        int stoneAttack = (int)(Math.random()*13);
        System.out.println(stoneAttack);
        if(stoneAttack == 0 || stoneAttack == 1)
        {
            timers[timerThanosHealth] = new Timer(10, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ThanosHealthIncrease();
                }
            } );
            timers[timerThanosHealth].start();
            characters.get(indexThanos).setHealth(1000);
            TopLine.setText( characters.get(indexThanos).getName() + " used the Time Stone" );
            BottomLine.setText( characters.get(indexThanos).getName() + " recovered all his HP" );
            timers[timerThanosAttack].stop();
            return;
        }
        if(stoneAttack == 2 || stoneAttack == 3)
        {
            TopLine.setText( characters.get(indexThanos).getName() + " used the Soul Stone" );
            BottomLine.setText( characters.get(indexThanos).getName() + " has stolen your soul!" );
            newHealth = 0;
            timers[timerThorSoul] = new Timer(10, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ThorHealthDeplete();
                    if(characters.get(indexThor).getHealth() <= 0)
                        checkGameState();
                }
            } );
            timers[timerThorSoul].start();
            timers[timerThanosAttack].stop();
            return;
        }
        if(stoneAttack == 4 || stoneAttack == 5)
        {
            TopLine.setText( characters.get(indexThanos).getName() + " used the Reality Stone" );
            BottomLine.setText( characters.get(indexThanos).getName() + " takes another turn" );
            timers[timerThanosAttack].stop();
            ThanosAttack();
            return;
        }
        if(stoneAttack == 6 || stoneAttack == 7)
        {
            TopLine.setText( characters.get(indexThanos).getName() + " used the Space Stone" );
            BottomLine.setText( characters.get(indexThanos).getName() + " has become untargetable" );
            thanosTarget = true;
            timers[timerThanosAttack].stop();
            enableButtons(true);
            return;
        }
        if(stoneAttack == 8 || stoneAttack == 9)
        {
            TopLine.setText( characters.get(indexThanos).getName() + " used the Mind Stone" );
            BottomLine.setText( characters.get(indexThanos).getName() + " now controls you" );
            mindControl = true;
            timers[timerThanosAttack].stop();
            enableButtons(true);
            return;
        }
        if(stoneAttack == 10 || stoneAttack == 11)
        {
            TopLine.setText( characters.get(indexThanos).getName() + " used the Power Stone" );
            BottomLine.setText( characters.get(indexThanos).getName() + " destroyed half your life!" );
            newHealth = ThorHealth.getValue()/2;
            if(characters.get(indexThor).getHealth() <= 85)
            {
                newHealth = 0;
            }
            timers[timerThorHalf] = new Timer(10, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ThorHealthHalf();
                    if(characters.get(indexThor).getHealth() == 0)
                        checkGameState();
                }
            } );
            timers[timerThorHalf].start();
            timers[timerThanosAttack].stop();
            return;
        }
        if( stoneAttack == 12 )
        {
            TopLine.setText( characters.get(indexThanos).getName() + " used Snap" );
            int random = (int)(Math.random()*2);
            if(random == 0)
            {
                BottomLine.setText( characters.get(indexThanos).getName() + " has killed himself" );
                newHealth = 0;
                timers[timerSnapThanos] = new Timer(10, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ThanosSnapThanos();
                        if(characters.get(indexThanos).getHealth() == 0)
                            checkGameState();
                    }
                } );
                timers[timerSnapThanos].start();
                timers[timerThanosAttack].stop();
                return;
            }
            if(random == 1)
            {
                BottomLine.setText( characters.get(indexThanos).getName() + " has killed you" );
                newHealth = 0;
                timers[timerSnapThor] = new Timer(10, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ThanosSnapThor();
                        if(characters.get(indexThor).getHealth() == 0)
                            checkGameState();
                    }
                } );
                timers[timerSnapThor].start();
                timers[timerThanosAttack].stop();
                return;
            }
            return;
        }
    }
    
    private void checkGameState()
    {
        EndDefeatScreen defeat = new EndDefeatScreen();
        EndVictoryScreen victory = new EndVictoryScreen();
        if(characters.get(indexThanos).getHealth() == 0 && !victoryLaunch)
        {
            victory.setBounds(0, 0, 646, 658);
            victory.setVisible(true);
            setVisible(false);
            victoryLaunch = true;
        }
        if(characters.get(indexThor).getHealth() == 0 && !defeatLaunch)
        {
            defeat.setBounds(0, 0, 646, 658);
            defeat.setVisible(true);
            setVisible(false);
            defeatLaunch = true;
        }
    }
    
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
            java.util.logging.Logger.getLogger(ThorScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThorScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThorScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThorScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThorScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton Beer;
    private javax.swing.JTextField BottomLine;
    private javax.swing.JButton CutThanosHead;
    private javax.swing.JButton Fortnite;
    private javax.swing.JButton Stormbreaker;
    private javax.swing.JProgressBar ThanosHealth;
    private javax.swing.JTextField ThanosName;
    private javax.swing.JLabel ThanosPic;
    private javax.swing.JLabel Thor;
    private javax.swing.JProgressBar ThorHealth;
    private javax.swing.JTextField ThorName;
    private javax.swing.JTextField TopLine;
    // End of variables declaration//GEN-END:variables
}