package lk.clearview.gui;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import lk.clearview.panel.SlideButton;

/**
 *
 * @author EnovateX Team
 */
public class Dashboard extends javax.swing.JFrame {

    public static JPanel[] slideButton;
    public static JPanel[] slideColorButton;

    public Dashboard(String username, String fname, String lname) {
        initComponents();
        initMy();
        sliderPanel.setLayout(new BoxLayout(sliderPanel, BoxLayout.Y_AXIS));

        // Add the side panel to a scroll pane
       

        sliderButtonLoader();
        sliderButtonLoader();
        sliderButtonLoader();
        sliderButtonLoader();
        sliderButtonLoader();
        sliderButtonLoader();
        sliderButtonLoader();
        sliderButtonLoader();

    }

    private void initMy(){
        scrollPaneOptimize(jScrollPane1);
    }
    
    public void sliderButtonLoader() {
        sliderPanel.add(new SlideButton(), sliderPanel.getComponentCount() - 1);
    }

    //change panel view 
    public void changeView(JPanel viewPanel) {
        jPanel11.removeAll();
        jPanel11.add(viewPanel, BorderLayout.CENTER);
        SwingUtilities.updateComponentTreeUI(jPanel11);
    }
    
    public void scrollPaneOptimize(JScrollPane ScrollPane) {
        ScrollPane.setBorder(BorderFactory.createEmptyBorder());
        ScrollPane.setViewportBorder(BorderFactory.createEmptyBorder());
        ScrollPane.getVerticalScrollBar().setUnitIncrement(16);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sliderPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clear View");
        setMinimumSize(new java.awt.Dimension(930, 566));

        jPanel2.setPreferredSize(new java.awt.Dimension(80, 538));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(90, 100));

        sliderPanel.setPreferredSize(new java.awt.Dimension(90, 415));

        javax.swing.GroupLayout sliderPanelLayout = new javax.swing.GroupLayout(sliderPanel);
        sliderPanel.setLayout(sliderPanelLayout);
        sliderPanelLayout.setHorizontalGroup(
            sliderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        sliderPanelLayout.setVerticalGroup(
            sliderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(sliderPanel);

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel13.setBackground(new java.awt.Color(20, 20, 24));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 736, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel13, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel11, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (jPanel2.getWidth() > 100) {
            collaps();
        } else {
            expan();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void expan() {
        Thread t = new Thread(
                () -> {
                    for (int i = 80; i <= 200; i += 10) {
                        jPanel2.setPreferredSize(new Dimension(i, jPanel2.getHeight()));
                        SwingUtilities.updateComponentTreeUI(jPanel2);
                        try {
                            Thread.sleep(10);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
        );
        t.start();
    }

    public void collaps() {
        Thread t = new Thread(
                () -> {

                    for (int i = 200; i >= 80; i -= 10) {
                        jPanel2.setPreferredSize(new Dimension(i, jPanel2.getHeight()));
                        SwingUtilities.updateComponentTreeUI(jPanel2);
                        try {
                            Thread.sleep(10);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
        );
        t.start();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
//        FlatAtomOneLightIJTheme.setup();
        FlatMacDarkLaf.setup();
        UIManager.put("Button.arc", 17); // Button
        UIManager.put("ProgressBar.arc", 17); // Progress Bar
        UIManager.put("TextComponent.arc", 17); // JTextField, JPasswordField, etc
        UIManager.put("CheckBox.arc", 17); // JCombo Box
        UIManager.put("Component.arc", 17); // JCombo Box
        UIManager.put("Component.innerFocusWidth", 0); // 

//        javax.swing.LookAndFeel lookAndFeel = UIManager.getLookAndFeel();
//        if (lookAndFeel.getClass().getSimpleName().equals("FlatMacDarkLaf")) {
//            System.out.println("Theme is FlatMacDarkLaf");
//        }
//        FlatOneDarkIJTheme.setup();
//        FlatMaterialDesignDarkIJTheme.setup();
//        FlatMaterialDeepOceanIJTheme.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Dashboard adminDashboard = new Dashboard("200328712369", "fName", "lName");
                adminDashboard.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel sliderPanel;
    // End of variables declaration//GEN-END:variables
}
