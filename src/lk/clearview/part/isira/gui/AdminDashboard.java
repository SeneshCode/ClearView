package lk.clearview.part.isira.gui;

import lk.clearview.gui.*;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import lk.clearview.part.isira.panel.ManageActivities;
import lk.clearview.part.isira.panel.ManageStaff;

/**
 *
 * @author EnovateX Team
 */
public class AdminDashboard extends javax.swing.JFrame {

    private static JPanel[] panelsToggle = new JPanel[5];
    private static JPanel[] panelsToggleStyle = new JPanel[5];

    public static JFrame window;

    private static String username;

    private static Color clickColor;
    private static Color hoverColor;
    private static Color defaultColor;
    private static Color bgColor;
    private static ImageIcon themeIcon;

    public AdminDashboard(String username, String fname, String lname) {
        initComponents();
        window = this;
        this.username = fname + " " + lname;
        jLabel29.setText("");
        loadStaticArrays();
        loadTheme();
        panelToggleClick(ManageBooks_panel, jPanel4);
        firstStartupPanel();
        UIManager.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                loadTheme();
                panelToggleClick(ManageBooks_panel4, jPanel9);
            }
        });
        window.setIconImage(new ImageIcon(getClass().getResource("../../resources/eye-35.png")).getImage());
        setNameofDashboards();
    }
    private void setNameofDashboards(){
//      name of 1st Dashboard 
        jLabel1.setText("Manage Staff");

//      name of 2nd Dashboard 
        jLabel6.setText("Manage Activities");

//      name of 3rd Dashboard 
        jLabel10.setText("");

//      name of 4th Dashboard 
        jLabel12.setText("");

//      name of 5th Dashboard
        jLabel14.setText("");
    }
    
    private void firstStartupPanel() {
//     Main Button in Dashboard
//     මෙතැනදී තමයි ඔයාගේ panel එකට අදාල object එක හදන්න ඕන, 
//     ඒක හදන්න ඕන පහත නිදසුනේ පෙනෙන පරිදි changeView කියන method එකට parameter සෙට් කරන තැනදී. 
//     ( parameter සෙට් කරන තැන යනු method name එකේ වරහන් දෙක  ඇතුලතටයි ) 
//     එලෙස දැමු පසු එය click කරන විටදී  ඔයාගේ panel එක ගානට dashboard එකට වැටෙනවා. 
//     example below->>>>
     changeView(new ManageStaff());
    }

    private void loadTheme() {
        themeIcon = new ImageIcon("src/resources/eye-35.png");
        LookAndFeel theme = UIManager.getLookAndFeel();
        if (theme.getClass().getSimpleName().equals("FlatMacLightLaf")) {
            clickColor = new Color(0, 117, 255);
            hoverColor = new Color(170, 205, 255);
            defaultColor = new Color(243, 243, 247);
            bgColor = new Color(255, 255, 255);
            jLabel26.setForeground(Color.BLACK);
            jPanel7.setBackground(bgColor);
            jPanel5.setBackground(bgColor);
            jPanel17.setBackground(bgColor);
        } else {
            clickColor = new Color(0, 117, 255);
            hoverColor = new Color(10, 10, 15);
            defaultColor = new Color(18, 18, 22);
            bgColor = new Color(24, 24, 28);
            jLabel26.setForeground(Color.WHITE);
            jPanel7.setBackground(bgColor);
            jPanel5.setBackground(bgColor);
            jPanel17.setBackground(bgColor);
        }
        jLabel26.setVisible(false);
        jLabel27.setVisible(false);
        jLabel29.setVisible(false);
        panelToggleHover(false, ManageBooks_panel, jPanel4);
        panelToggleHover(false, ManageBooks_panel1, jPanel6);
        panelToggleHover(false, ManageBooks_panel2, jPanel7);
        panelToggleHover(false, ManageBooks_panel3, jPanel8);
        panelToggleHover(false, ManageBooks_panel4, jPanel9);
    }

    //load one time
    public void loadStaticArrays() {
        panelsToggle[0] = jPanel4;
        panelsToggle[1] = jPanel6;
        panelsToggle[2] = jPanel7;
        panelsToggle[3] = jPanel8;
        panelsToggle[4] = jPanel9;
        panelsToggleStyle[0] = ManageBooks_panel;
        panelsToggleStyle[1] = ManageBooks_panel1;
        panelsToggleStyle[2] = ManageBooks_panel2;
        panelsToggleStyle[3] = ManageBooks_panel3;
        panelsToggleStyle[4] = ManageBooks_panel4;
        panelToggleClick(ManageBooks_panel, jPanel4);
    }

    //load panel toggle Hover
    public void panelToggleHover(boolean hover, JPanel panel1, JPanel panel2) {
        if (!(panel2.getBackground().equals(new Color(0, 117, 255)))) {
            if (hover == false) {
                panel1.setBackground(defaultColor);
                panel2.setBackground(defaultColor);
            } else {
                panel1.setBackground(hoverColor);
                panel2.setBackground(hoverColor);
            }
        }
    }

    //load colors panel at click
    public void panelToggleClick(JPanel panel1, JPanel panel2) {
        for (JPanel p1 : panelsToggleStyle) {
            if (p1 == panel1) {
                p1.setBackground(hoverColor);
            } else {
                p1.setBackground(defaultColor);
            }
        }
        for (JPanel p2 : panelsToggle) {
            if (p2 == panel2) {
                p2.setBackground(clickColor);
            } else {
                p2.setBackground(defaultColor);
            }
        }
    }

    //change panel view 
    public void changeView(JPanel viewPanel) {
        jPanel11.removeAll();
        jPanel11.add(viewPanel, BorderLayout.CENTER);
        SwingUtilities.updateComponentTreeUI(jPanel11);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        ManageBooks_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        ManageBooks_panel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        ManageBooks_panel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        ManageBooks_panel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        ManageBooks_panel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clear View - Admin Dashboard");
        setMinimumSize(new java.awt.Dimension(930, 566));

        jPanel5.setBackground(new java.awt.Color(24, 24, 28));
        jPanel5.setPreferredSize(new java.awt.Dimension(70, 555));

        ManageBooks_panel.setBackground(new java.awt.Color(33, 33, 36));
        ManageBooks_panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManageBooks_panel.setPreferredSize(new java.awt.Dimension(150, 45));
        ManageBooks_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageBooks_panelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ManageBooks_panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ManageBooks_panelMouseExited(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Dashboard");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/clearview/resources/admin/staff-22.png"))); // NOI18N

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

        javax.swing.GroupLayout ManageBooks_panelLayout = new javax.swing.GroupLayout(ManageBooks_panel);
        ManageBooks_panel.setLayout(ManageBooks_panelLayout);
        ManageBooks_panelLayout.setHorizontalGroup(
            ManageBooks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageBooks_panelLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        ManageBooks_panelLayout.setVerticalGroup(
            ManageBooks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageBooks_panelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        ManageBooks_panel1.setBackground(new java.awt.Color(33, 33, 36));
        ManageBooks_panel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManageBooks_panel1.setPreferredSize(new java.awt.Dimension(150, 45));
        ManageBooks_panel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageBooks_panel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ManageBooks_panel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ManageBooks_panel1MouseExited(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(0, 102, 255));
        jLabel6.setText("Manage Patient");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/clearview/resources/admin/lawyer-22.png"))); // NOI18N

        jPanel6.setBackground(new java.awt.Color(33, 33, 36));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ManageBooks_panel1Layout = new javax.swing.GroupLayout(ManageBooks_panel1);
        ManageBooks_panel1.setLayout(ManageBooks_panel1Layout);
        ManageBooks_panel1Layout.setHorizontalGroup(
            ManageBooks_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageBooks_panel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ManageBooks_panel1Layout.setVerticalGroup(
            ManageBooks_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageBooks_panel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        ManageBooks_panel2.setBackground(new java.awt.Color(33, 33, 36));
        ManageBooks_panel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManageBooks_panel2.setPreferredSize(new java.awt.Dimension(150, 45));
        ManageBooks_panel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageBooks_panel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ManageBooks_panel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ManageBooks_panel2MouseExited(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(0, 102, 255));
        jLabel10.setText("Manage eye result");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/clearview/resources/eye search.png"))); // NOI18N

        jPanel7.setBackground(new java.awt.Color(33, 33, 36));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ManageBooks_panel2Layout = new javax.swing.GroupLayout(ManageBooks_panel2);
        ManageBooks_panel2.setLayout(ManageBooks_panel2Layout);
        ManageBooks_panel2Layout.setHorizontalGroup(
            ManageBooks_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageBooks_panel2Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ManageBooks_panel2Layout.setVerticalGroup(
            ManageBooks_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageBooks_panel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(ManageBooks_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ManageBooks_panel3.setBackground(new java.awt.Color(33, 33, 36));
        ManageBooks_panel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManageBooks_panel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageBooks_panel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ManageBooks_panel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ManageBooks_panel3MouseExited(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(0, 102, 255));
        jLabel12.setText("Manage Diagnosis");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/clearview/resources/Diagnosis.png"))); // NOI18N

        jPanel8.setBackground(new java.awt.Color(33, 33, 36));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ManageBooks_panel3Layout = new javax.swing.GroupLayout(ManageBooks_panel3);
        ManageBooks_panel3.setLayout(ManageBooks_panel3Layout);
        ManageBooks_panel3Layout.setHorizontalGroup(
            ManageBooks_panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageBooks_panel3Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ManageBooks_panel3Layout.setVerticalGroup(
            ManageBooks_panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageBooks_panel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(ManageBooks_panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ManageBooks_panel4.setBackground(new java.awt.Color(33, 33, 36));
        ManageBooks_panel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManageBooks_panel4.setPreferredSize(new java.awt.Dimension(150, 45));
        ManageBooks_panel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageBooks_panel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ManageBooks_panel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ManageBooks_panel4MouseExited(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(0, 102, 255));
        jLabel14.setText("Settings");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/clearview/resources/settings.png"))); // NOI18N

        jPanel9.setBackground(new java.awt.Color(33, 33, 36));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ManageBooks_panel4Layout = new javax.swing.GroupLayout(ManageBooks_panel4);
        ManageBooks_panel4.setLayout(ManageBooks_panel4Layout);
        ManageBooks_panel4Layout.setHorizontalGroup(
            ManageBooks_panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageBooks_panel4Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ManageBooks_panel4Layout.setVerticalGroup(
            ManageBooks_panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageBooks_panel4Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(ManageBooks_panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel17.setMaximumSize(new java.awt.Dimension(32767, 58));
        jPanel17.setMinimumSize(new java.awt.Dimension(0, 57));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("ADLaM Display", 0, 15)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Clear");
        jPanel17.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 12, 40, -1));

        jLabel27.setFont(new java.awt.Font("ADLaM Display", 0, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 102, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("View");
        jPanel17.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 12, 40, -1));

        jLabel28.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/clearview/resources/eye-35.png"))); // NOI18N
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel28.setMinimumSize(new java.awt.Dimension(32, 32));
        jLabel28.setPreferredSize(new java.awt.Dimension(32, 32));
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });
        jPanel17.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, 40, 40));

        jLabel29.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 102, 102));
        jLabel29.setText("username");
        jPanel17.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 33, 90, 19));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ManageBooks_panel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(ManageBooks_panel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(ManageBooks_panel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(ManageBooks_panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(ManageBooks_panel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addGap(14, 14, 14))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(ManageBooks_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ManageBooks_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ManageBooks_panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ManageBooks_panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(ManageBooks_panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel13.setBackground(new java.awt.Color(20, 20, 24));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel13, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel11, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ManageBooks_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageBooks_panelMouseClicked
//      මෙ method එක තුල කිසිදු code එකක් වෙනස් කිරීමට හෝ අලුතෙන් add කිරීමට ඔබට කිසිදු අවසරයක් නොමැත.
        panelToggleClick(ManageBooks_panel, jPanel4);
        firstStartupPanel();
    }//GEN-LAST:event_ManageBooks_panelMouseClicked

    private void ManageBooks_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageBooks_panelMouseEntered
        // TODO add your handling code here:
        panelToggleHover(true, ManageBooks_panel, jPanel4);
    }//GEN-LAST:event_ManageBooks_panelMouseEntered

    private void ManageBooks_panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageBooks_panelMouseExited
        // TODO add your handling code here:
        panelToggleHover(false, ManageBooks_panel, jPanel4);
    }//GEN-LAST:event_ManageBooks_panelMouseExited

    private void ManageBooks_panel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageBooks_panel1MouseClicked
        panelToggleClick(ManageBooks_panel1, jPanel6);
//      Button 2 in Dashboard
//      මෙතැනදී තමයි ඔයාගේ panel එකට අදාල object එක හදන්න ඕන, 
//      ඒක හදන්න ඕන පහත නිදසුනේ පෙනෙන පරිදි changeView කියන method එකට parameter සෙට් කරන තැනදී. 
//     ( parameter සෙට් කරන තැන යනු method name එකේ වරහන් දෙක  ඇතුලතටයි ) 
//     එලෙස දැමු පසු එය click කරන විටදී  ඔයාගේ panel එක ගානට dashboard එකට වැටෙනවා. 
//     example below->>>>
     changeView(new ManageActivities());
    }//GEN-LAST:event_ManageBooks_panel1MouseClicked

    private void ManageBooks_panel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageBooks_panel1MouseEntered
        // TODO add your handling code here:
        panelToggleHover(true, ManageBooks_panel1, jPanel6);
    }//GEN-LAST:event_ManageBooks_panel1MouseEntered

    private void ManageBooks_panel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageBooks_panel1MouseExited
        // TODO add your handling code here:
        panelToggleHover(false, ManageBooks_panel1, jPanel6);
    }//GEN-LAST:event_ManageBooks_panel1MouseExited

    private void ManageBooks_panel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageBooks_panel2MouseClicked
        panelToggleClick(ManageBooks_panel2, jPanel7);
//      Button 3 in Dashboard
//      මෙතැනදී තමයි ඔයාගේ panel එකට අදාල object එක හදන්න ඕන, 
//      ඒක හදන්න ඕන පහත නිදසුනේ පෙනෙන පරිදි changeView කියන method එකට parameter සෙට් කරන තැනදී. 
//     ( parameter සෙට් කරන තැන යනු method name එකේ වරහන් දෙක  ඇතුලතටයි ) 
//     එලෙස දැමු පසු එය click කරන විටදී  ඔයාගේ panel එක ගානට dashboard එකට වැටෙනවා. 
//     example below->>>>
//     changeView(new YourPanelName());
    }//GEN-LAST:event_ManageBooks_panel2MouseClicked

    private void ManageBooks_panel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageBooks_panel2MouseEntered
        // TODO add your handling code here:
        panelToggleHover(true, ManageBooks_panel2, jPanel7);
    }//GEN-LAST:event_ManageBooks_panel2MouseEntered

    private void ManageBooks_panel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageBooks_panel2MouseExited
        // TODO add your handling code here:
        panelToggleHover(false, ManageBooks_panel2, jPanel7);
    }//GEN-LAST:event_ManageBooks_panel2MouseExited

    private void ManageBooks_panel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageBooks_panel3MouseClicked
        panelToggleClick(ManageBooks_panel3, jPanel8);
//      Button 4 in Dashboard
//      මෙතැනදී තමයි ඔයාගේ panel එකට අදාල object එක හදන්න ඕන, 
//      ඒක හදන්න ඕන පහත නිදසුනේ පෙනෙන පරිදි changeView කියන method එකට parameter සෙට් කරන තැනදී. 
//     ( parameter සෙට් කරන තැන යනු method name එකේ වරහන් දෙක  ඇතුලතටයි ) 
//     එලෙස දැමු පසු එය click කරන විටදී  ඔයාගේ panel එක ගානට dashboard එකට වැටෙනවා. 
//     example below->>>>
//     changeView(new YourPanelName());
    }//GEN-LAST:event_ManageBooks_panel3MouseClicked

    private void ManageBooks_panel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageBooks_panel3MouseEntered
        // TODO add your handling code here:
        panelToggleHover(true, ManageBooks_panel3, jPanel8);
    }//GEN-LAST:event_ManageBooks_panel3MouseEntered

    private void ManageBooks_panel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageBooks_panel3MouseExited
        // TODO add your handling code here:
        panelToggleHover(false, ManageBooks_panel3, jPanel8);
    }//GEN-LAST:event_ManageBooks_panel3MouseExited

    private void ManageBooks_panel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageBooks_panel4MouseClicked
        panelToggleClick(ManageBooks_panel4, jPanel9);
//        මෙතනදී එන්නේ settings button එක ඒකට දැනට මුකුත් ඔයාලට දාන්න කියලා නැත්නම් දන්නා එපා  
//        changeView(new YourPanelName());
    }//GEN-LAST:event_ManageBooks_panel4MouseClicked

    private void ManageBooks_panel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageBooks_panel4MouseEntered
        // TODO add your handling code here:
        panelToggleHover(true, ManageBooks_panel4, jPanel9);
    }//GEN-LAST:event_ManageBooks_panel4MouseEntered

    private void ManageBooks_panel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageBooks_panel4MouseExited
        // TODO add your handling code here:
        panelToggleHover(false, ManageBooks_panel4, jPanel9);
    }//GEN-LAST:event_ManageBooks_panel4MouseExited

    public void expan() {
        Thread t = new Thread(
                () -> {
                    for (int i = 70; i < 195; i += 10) {
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

                    for (int i = 188; i >= 70; i -= 10) {
                        jPanel2.setPreferredSize(new Dimension(i, jPanel2.getHeight()));
                        SwingUtilities.updateComponentTreeUI(jPanel2);
                        try {
                            Thread.sleep(10);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    jLabel26.setText("");
                    jLabel27.setText("");
                    jLabel29.setText("");
                }
        );
        t.start();
    }

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        if (jPanel2.getWidth() < 90) {
            jLabel26.setText("Clear");
            jLabel27.setText("View");
            jLabel29.setText(username);
            jLabel26.setVisible(true);
            jLabel27.setVisible(true);
            jLabel29.setVisible(true);
            expan();
        } else {
            collaps();
        }
    }//GEN-LAST:event_jLabel28MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
//        FlatAtomOneLightIJTheme.setup();
        FlatMacDarkLaf.setup();
        UIManager.put("Button.arc", 10); // Button
        UIManager.put("ProgressBar.arc", 10); // Progress Bar
        UIManager.put("TextComponent.arc", 10); // JTextField, JPasswordField, etc
        UIManager.put("CheckBox.arc", 10); // JCombo Box
        UIManager.put("Component.arc", 10); // JCombo Box
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
                AdminDashboard adminDashboard = new AdminDashboard("200429722170", "fName", "lName");
                adminDashboard.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ManageBooks_panel;
    private javax.swing.JPanel ManageBooks_panel1;
    private javax.swing.JPanel ManageBooks_panel2;
    private javax.swing.JPanel ManageBooks_panel3;
    private javax.swing.JPanel ManageBooks_panel4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
