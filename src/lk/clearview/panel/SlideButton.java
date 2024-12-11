/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package lk.clearview.panel;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import lk.clearview.gui.Dashboard;

/**
 *
 * @author USER
 */
public class SlideButton extends javax.swing.JPanel {

    private static Color clickColor;
    private static Color hoverColor;
    private static Color defaultColor;
    private static Color bgColor;

    /**
     * Creates new form SlideButton
     */
    public SlideButton() {
        initComponents();
        loadTheme();
    }

    private void loadTheme() {
        LookAndFeel theme = UIManager.getLookAndFeel();
        if (theme.getClass().getSimpleName().equals("FlatMacLightLaf")) {
            clickColor = new Color(0, 117, 255);
            hoverColor = new Color(170, 205, 255);
            defaultColor = new Color(243, 243, 247);
            bgColor = new Color(255, 255, 255);
        } else {
            clickColor = new Color(0, 117, 255);
            hoverColor = new Color(10, 10, 15);
            defaultColor = new Color(18, 18, 22);
            bgColor = new Color(24, 24, 28);
        }
    }

    //load panel toggle Hover
    public void panelToggleHover(boolean hover, JPanel panel1) {
        if (!(panel1.getBackground().equals(clickColor))) {
            if (hover == false) {
                panel1.setBackground(defaultColor);
            } else {
                panel1.setBackground(hoverColor);
            }
        }
    }

    //load colors panel at click
    public void panelToggleClick(JPanel panel1) {
        if (Dashboard.slideButton != null) {
            for (JPanel p1 : Dashboard.slideColorButton) {
                if (p1 == panel1 && !(panel1.getBackground().equals(clickColor))) {
                    p1.setBackground(clickColor);
                } else {
                    p1.setBackground(defaultColor);
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sideButton = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(45, 45));

        sideButton.setBackground(new java.awt.Color(33, 33, 36));
        sideButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sideButton.setPreferredSize(new java.awt.Dimension(150, 45));
        sideButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sideButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sideButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sideButtonMouseExited(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Dashboard");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/clearview/resources/settings.png"))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(33, 33, 36));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout sideButtonLayout = new javax.swing.GroupLayout(sideButton);
        sideButton.setLayout(sideButtonLayout);
        sideButtonLayout.setHorizontalGroup(
            sideButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideButtonLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        sideButtonLayout.setVerticalGroup(
            sideButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideButtonLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sideButton, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(sideButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sideButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sideButtonMouseClicked
        //      මෙ method එක තුල කිසිදු code එකක් වෙනස් කිරීමට හෝ අලුතෙන් add කිරීමට ඔබට කිසිදු අවසරයක් නොමැත.

    }//GEN-LAST:event_sideButtonMouseClicked

    private void sideButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sideButtonMouseEntered
        // TODO add your handling code here:
        panelToggleHover(true, sideButton);
    }//GEN-LAST:event_sideButtonMouseEntered

    private void sideButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sideButtonMouseExited
        // TODO add your handling code here:
        panelToggleHover(false, sideButton);
    }//GEN-LAST:event_sideButtonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel sideButton;
    // End of variables declaration//GEN-END:variables
}
