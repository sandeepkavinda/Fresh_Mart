package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import model.AppIcon;
import panels.Dashboard;
import panels.DrawerManagement;
import panels.GrnManagement;
import panels.InvoiceManagement;
import panels.ProductManagement;
import panels.QuatationManagement;
import panels.ReturnManagement;
import panels.StockManagement;
import panels.SupplierManagement;
import panels.UserManagement;

public class Home extends javax.swing.JFrame {
    
    static Boolean animationStatus = true;

    public Home() {
        initComponents();
        new AppIcon().setIcon(this);
        setMaximizeMenu(false);
        loadPanel(new Dashboard(), dashboardButton, dashboardActiveBar);
        
    }
    


    private void loadPanel(JPanel panel, JButton clickedButton, JPanel toggledBar) {
        MainPanel.removeAll();
        MainPanel.add(panel, BorderLayout.CENTER);
        SwingUtilities.updateComponentTreeUI(jPanel3);
        changeToggledButton(clickedButton);
        changeToggledBar(toggledBar);
    }

    private void changeToggledButton(JButton clickedButton) {
        Color panelBackgroundColor = jPanel4.getBackground();
        dashboardButton.setBackground(panelBackgroundColor);
        userManagementButton.setBackground(panelBackgroundColor);
        supplierManagementButton.setBackground(panelBackgroundColor);
        productManagementButton.setBackground(panelBackgroundColor);
        stockManagementButton.setBackground(panelBackgroundColor);
        grnManagementButton.setBackground(panelBackgroundColor);
        invoiceManagementButton.setBackground(panelBackgroundColor);
        returnManagementButton.setBackground(panelBackgroundColor);
        drawerManagementButton.setBackground(panelBackgroundColor);
        quatationManagementButton.setBackground(panelBackgroundColor);
        //Clicked Button
        clickedButton.setBackground(new java.awt.Color(255, 255, 255));
    }

    private void changeToggledBar(JPanel toggledBar) {
        dashboardActiveBar.setVisible(false);
        userManagementActiveBar.setVisible(false);
        supplierManagementActiveBar.setVisible(false);
        productManagementActiveBar.setVisible(false);
        stockManagementActiveBar.setVisible(false);
        grnManagementActiveBar.setVisible(false);
        invoiceManagementActiveBar.setVisible(false);
        returnManagementActiveBar.setVisible(false);
        drawerManagementActiveBar.setVisible(false);
        quatationManagementActiveBar.setVisible(false);
        //Toggled Bar
        toggledBar.setVisible(true);
    }

    private void setMaximizeMenu(Boolean animationStatus) {
        
        //If animationStatus is true Menu Open With a Animation
        if (animationStatus) {
            Thread t = new Thread(
                    () -> {

                        dashboardButton.setIconTextGap(15);
                        userManagementButton.setIconTextGap(15);
                        supplierManagementButton.setIconTextGap(15);
                        productManagementButton.setIconTextGap(15);
                        stockManagementButton.setIconTextGap(15);
                        grnManagementButton.setIconTextGap(15);
                        invoiceManagementButton.setIconTextGap(15);
                        returnManagementButton.setIconTextGap(15);
                        drawerManagementButton.setIconTextGap(15);
                        quatationManagementButton.setIconTextGap(15);

                        for (int i = 58; i <= 250; i += 32) {
                            jPanel4.setPreferredSize(new Dimension(i, jPanel4.getHeight()));
                            SwingUtilities.updateComponentTreeUI(jPanel4);
                            try {
                                Thread.sleep(5);

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        menuMaximizeButton.setVisible(false);
                        jSeparator1.setVisible(false);
                    }
            );
            t.start();

        } else {

            jPanel4.setPreferredSize(new Dimension(250, jPanel4.getHeight()));
            SwingUtilities.updateComponentTreeUI(jPanel4);

            dashboardButton.setIconTextGap(15);
            userManagementButton.setIconTextGap(15);
            supplierManagementButton.setIconTextGap(15);
            productManagementButton.setIconTextGap(15);
            stockManagementButton.setIconTextGap(15);
            grnManagementButton.setIconTextGap(15);
            invoiceManagementButton.setIconTextGap(15);
            returnManagementButton.setIconTextGap(15);
            drawerManagementButton.setIconTextGap(15);
            quatationManagementButton.setIconTextGap(15);

            menuMaximizeButton.setVisible(false);
            jSeparator1.setVisible(false);
        }

    }

    private void setMinimizeMenu(Boolean animationStatus) {

        //If animationStatus is true Menu Open With a Animation
        if (animationStatus) {

            Thread t = new Thread(
                    () -> {

                        for (int i = 250; i >= 58; i -= 32) {
                            jPanel4.setPreferredSize(new Dimension(i, jPanel4.getHeight()));
                            SwingUtilities.updateComponentTreeUI(jPanel4);
                            try {
                                Thread.sleep(5);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        dashboardButton.setIconTextGap(21);
                        userManagementButton.setIconTextGap(21);
                        supplierManagementButton.setIconTextGap(21);
                        productManagementButton.setIconTextGap(21);
                        stockManagementButton.setIconTextGap(21);
                        grnManagementButton.setIconTextGap(21);
                        invoiceManagementButton.setIconTextGap(21);
                        returnManagementButton.setIconTextGap(21);
                        drawerManagementButton.setIconTextGap(21);
                        quatationManagementButton.setIconTextGap(21);

                        menuMaximizeButton.setVisible(true);
                        jSeparator1.setVisible(true);
                    }
            );
            t.start();

        } else {

            jPanel4.setPreferredSize(new Dimension(58, jPanel4.getHeight()));
            SwingUtilities.updateComponentTreeUI(jPanel4);

            dashboardButton.setIconTextGap(21);
            userManagementButton.setIconTextGap(21);
            supplierManagementButton.setIconTextGap(21);
            productManagementButton.setIconTextGap(21);
            stockManagementButton.setIconTextGap(21);
            grnManagementButton.setIconTextGap(21);
            invoiceManagementButton.setIconTextGap(21);
            returnManagementButton.setIconTextGap(21);
            drawerManagementButton.setIconTextGap(21);
            quatationManagementButton.setIconTextGap(21);

            menuMaximizeButton.setVisible(true);
            jSeparator1.setVisible(true);

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        logoutButton = new javax.swing.JButton();
        notoficationButton = new javax.swing.JButton();
        settingsButton = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        menuMinimizeButton = new javax.swing.JButton();
        menuMaximizeButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        dashboardActiveBar = new javax.swing.JPanel();
        dashboardButton = new javax.swing.JButton();
        userManagementActiveBar = new javax.swing.JPanel();
        userManagementButton = new javax.swing.JButton();
        supplierManagementActiveBar = new javax.swing.JPanel();
        supplierManagementButton = new javax.swing.JButton();
        productManagementActiveBar = new javax.swing.JPanel();
        productManagementButton = new javax.swing.JButton();
        stockManagementActiveBar = new javax.swing.JPanel();
        stockManagementButton = new javax.swing.JButton();
        grnManagementActiveBar = new javax.swing.JPanel();
        grnManagementButton = new javax.swing.JButton();
        invoiceManagementActiveBar = new javax.swing.JPanel();
        invoiceManagementButton = new javax.swing.JButton();
        returnManagementActiveBar = new javax.swing.JPanel();
        returnManagementButton = new javax.swing.JButton();
        drawerManagementActiveBar = new javax.swing.JPanel();
        drawerManagementButton = new javax.swing.JButton();
        quatationManagementActiveBar = new javax.swing.JPanel();
        quatationManagementButton = new javax.swing.JButton();
        MainPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fresh Mart Stock Management System");
        setMinimumSize(new java.awt.Dimension(1325, 663));

        jPanel7.setBackground(new java.awt.Color(32, 116, 134));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/dashboard_logo.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(180, 114));

        jPanel2.setBackground(new java.awt.Color(32, 116, 134));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/user.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Poppins", 1, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("A. Sandeep Kavinda");

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Administrator");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel8)))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(32, 116, 134));

        logoutButton.setBackground(new java.awt.Color(32, 116, 134));
        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/logout.png"))); // NOI18N
        logoutButton.setToolTipText("Logout");
        logoutButton.setBorder(null);
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        notoficationButton.setBackground(new java.awt.Color(32, 116, 134));
        notoficationButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/notification.png"))); // NOI18N
        notoficationButton.setToolTipText("Notifications");
        notoficationButton.setBorder(null);
        notoficationButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        notoficationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notoficationButtonActionPerformed(evt);
            }
        });

        settingsButton.setBackground(new java.awt.Color(32, 116, 134));
        settingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/setting.png"))); // NOI18N
        settingsButton.setToolTipText("Settings");
        settingsButton.setBorder(null);
        settingsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(notoficationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(notoficationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(settingsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(238, 238, 238));
        jPanel4.setMaximumSize(new java.awt.Dimension(250, 572));
        jPanel4.setMinimumSize(new java.awt.Dimension(250, 572));
        jPanel4.setPreferredSize(new java.awt.Dimension(250, 572));

        jPanel8.setBackground(new java.awt.Color(32, 116, 134));
        jPanel8.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("11:26 PM");

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("25th July 2024");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(jLabel3)
                .addGap(12, 12, 12))
        );

        menuMinimizeButton.setBackground(new java.awt.Color(238, 238, 238));
        menuMinimizeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/back.png"))); // NOI18N
        menuMinimizeButton.setToolTipText("Minimize Menu");
        menuMinimizeButton.setBorder(null);
        menuMinimizeButton.setBorderPainted(false);
        menuMinimizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMinimizeButtonActionPerformed(evt);
            }
        });

        menuMaximizeButton.setBackground(new java.awt.Color(238, 238, 238));
        menuMaximizeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/next.png"))); // NOI18N
        menuMaximizeButton.setToolTipText("Maximize Menu");
        menuMaximizeButton.setBorder(null);
        menuMaximizeButton.setBorderPainted(false);
        menuMaximizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMaximizeButtonActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(32, 116, 134));
        jSeparator1.setForeground(new java.awt.Color(32, 116, 134));

        jSeparator2.setBackground(new java.awt.Color(32, 116, 134));
        jSeparator2.setForeground(new java.awt.Color(32, 116, 134));

        dashboardActiveBar.setBackground(new java.awt.Color(32, 116, 134));
        dashboardActiveBar.setMaximumSize(new java.awt.Dimension(5, 38));
        dashboardActiveBar.setMinimumSize(new java.awt.Dimension(5, 38));
        dashboardActiveBar.setPreferredSize(new java.awt.Dimension(5, 38));

        javax.swing.GroupLayout dashboardActiveBarLayout = new javax.swing.GroupLayout(dashboardActiveBar);
        dashboardActiveBar.setLayout(dashboardActiveBarLayout);
        dashboardActiveBarLayout.setHorizontalGroup(
            dashboardActiveBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        dashboardActiveBarLayout.setVerticalGroup(
            dashboardActiveBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        dashboardButton.setBackground(new java.awt.Color(238, 238, 238));
        dashboardButton.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        dashboardButton.setForeground(new java.awt.Color(51, 51, 51));
        dashboardButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/dashboard.png"))); // NOI18N
        dashboardButton.setText("Dashboard");
        dashboardButton.setToolTipText("Dashboard");
        dashboardButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 16, 1, 1));
        dashboardButton.setBorderPainted(false);
        dashboardButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        dashboardButton.setIconTextGap(15);
        dashboardButton.setMaximumSize(new java.awt.Dimension(245, 38));
        dashboardButton.setMinimumSize(new java.awt.Dimension(245, 38));
        dashboardButton.setPreferredSize(new java.awt.Dimension(245, 38));
        dashboardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardButtonActionPerformed(evt);
            }
        });

        userManagementActiveBar.setBackground(new java.awt.Color(32, 116, 134));
        userManagementActiveBar.setMaximumSize(new java.awt.Dimension(5, 38));
        userManagementActiveBar.setMinimumSize(new java.awt.Dimension(5, 38));

        javax.swing.GroupLayout userManagementActiveBarLayout = new javax.swing.GroupLayout(userManagementActiveBar);
        userManagementActiveBar.setLayout(userManagementActiveBarLayout);
        userManagementActiveBarLayout.setHorizontalGroup(
            userManagementActiveBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        userManagementActiveBarLayout.setVerticalGroup(
            userManagementActiveBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        userManagementButton.setBackground(new java.awt.Color(238, 238, 238));
        userManagementButton.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        userManagementButton.setForeground(new java.awt.Color(51, 51, 51));
        userManagementButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/userManagement.png"))); // NOI18N
        userManagementButton.setText("User Management");
        userManagementButton.setToolTipText("User Management");
        userManagementButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 16, 1, 1));
        userManagementButton.setBorderPainted(false);
        userManagementButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        userManagementButton.setIconTextGap(15);
        userManagementButton.setMaximumSize(new java.awt.Dimension(245, 38));
        userManagementButton.setMinimumSize(new java.awt.Dimension(245, 38));
        userManagementButton.setPreferredSize(new java.awt.Dimension(245, 38));
        userManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userManagementButtonActionPerformed(evt);
            }
        });

        supplierManagementActiveBar.setBackground(new java.awt.Color(32, 116, 134));
        supplierManagementActiveBar.setMaximumSize(new java.awt.Dimension(5, 38));
        supplierManagementActiveBar.setMinimumSize(new java.awt.Dimension(5, 38));

        javax.swing.GroupLayout supplierManagementActiveBarLayout = new javax.swing.GroupLayout(supplierManagementActiveBar);
        supplierManagementActiveBar.setLayout(supplierManagementActiveBarLayout);
        supplierManagementActiveBarLayout.setHorizontalGroup(
            supplierManagementActiveBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        supplierManagementActiveBarLayout.setVerticalGroup(
            supplierManagementActiveBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        supplierManagementButton.setBackground(new java.awt.Color(238, 238, 238));
        supplierManagementButton.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        supplierManagementButton.setForeground(new java.awt.Color(51, 51, 51));
        supplierManagementButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/supplier.png"))); // NOI18N
        supplierManagementButton.setText("Supplier Management");
        supplierManagementButton.setToolTipText("Supplier Management");
        supplierManagementButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 16, 1, 1));
        supplierManagementButton.setBorderPainted(false);
        supplierManagementButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        supplierManagementButton.setIconTextGap(15);
        supplierManagementButton.setMaximumSize(new java.awt.Dimension(245, 38));
        supplierManagementButton.setMinimumSize(new java.awt.Dimension(245, 38));
        supplierManagementButton.setPreferredSize(new java.awt.Dimension(245, 38));
        supplierManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierManagementButtonActionPerformed(evt);
            }
        });

        productManagementActiveBar.setBackground(new java.awt.Color(32, 116, 134));
        productManagementActiveBar.setMaximumSize(new java.awt.Dimension(5, 38));
        productManagementActiveBar.setMinimumSize(new java.awt.Dimension(5, 38));

        javax.swing.GroupLayout productManagementActiveBarLayout = new javax.swing.GroupLayout(productManagementActiveBar);
        productManagementActiveBar.setLayout(productManagementActiveBarLayout);
        productManagementActiveBarLayout.setHorizontalGroup(
            productManagementActiveBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        productManagementActiveBarLayout.setVerticalGroup(
            productManagementActiveBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        productManagementButton.setBackground(new java.awt.Color(238, 238, 238));
        productManagementButton.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        productManagementButton.setForeground(new java.awt.Color(51, 51, 51));
        productManagementButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/product.png"))); // NOI18N
        productManagementButton.setText("Product Management");
        productManagementButton.setToolTipText("Product Management");
        productManagementButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 16, 1, 1));
        productManagementButton.setBorderPainted(false);
        productManagementButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        productManagementButton.setIconTextGap(15);
        productManagementButton.setMaximumSize(new java.awt.Dimension(245, 38));
        productManagementButton.setMinimumSize(new java.awt.Dimension(245, 38));
        productManagementButton.setPreferredSize(new java.awt.Dimension(245, 38));
        productManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productManagementButtonActionPerformed(evt);
            }
        });

        stockManagementActiveBar.setBackground(new java.awt.Color(32, 116, 134));
        stockManagementActiveBar.setMaximumSize(new java.awt.Dimension(5, 38));
        stockManagementActiveBar.setMinimumSize(new java.awt.Dimension(5, 38));

        javax.swing.GroupLayout stockManagementActiveBarLayout = new javax.swing.GroupLayout(stockManagementActiveBar);
        stockManagementActiveBar.setLayout(stockManagementActiveBarLayout);
        stockManagementActiveBarLayout.setHorizontalGroup(
            stockManagementActiveBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        stockManagementActiveBarLayout.setVerticalGroup(
            stockManagementActiveBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        stockManagementButton.setBackground(new java.awt.Color(238, 238, 238));
        stockManagementButton.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        stockManagementButton.setForeground(new java.awt.Color(51, 51, 51));
        stockManagementButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/stock.png"))); // NOI18N
        stockManagementButton.setText("Stock Management");
        stockManagementButton.setToolTipText("Stock Management");
        stockManagementButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 16, 1, 1));
        stockManagementButton.setBorderPainted(false);
        stockManagementButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        stockManagementButton.setIconTextGap(15);
        stockManagementButton.setMaximumSize(new java.awt.Dimension(245, 38));
        stockManagementButton.setMinimumSize(new java.awt.Dimension(245, 38));
        stockManagementButton.setPreferredSize(new java.awt.Dimension(245, 38));
        stockManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockManagementButtonActionPerformed(evt);
            }
        });

        grnManagementActiveBar.setBackground(new java.awt.Color(32, 116, 134));
        grnManagementActiveBar.setMaximumSize(new java.awt.Dimension(5, 38));
        grnManagementActiveBar.setMinimumSize(new java.awt.Dimension(5, 38));

        javax.swing.GroupLayout grnManagementActiveBarLayout = new javax.swing.GroupLayout(grnManagementActiveBar);
        grnManagementActiveBar.setLayout(grnManagementActiveBarLayout);
        grnManagementActiveBarLayout.setHorizontalGroup(
            grnManagementActiveBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        grnManagementActiveBarLayout.setVerticalGroup(
            grnManagementActiveBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        grnManagementButton.setBackground(new java.awt.Color(238, 238, 238));
        grnManagementButton.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        grnManagementButton.setForeground(new java.awt.Color(51, 51, 51));
        grnManagementButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/grn.png"))); // NOI18N
        grnManagementButton.setText("GRN Management");
        grnManagementButton.setToolTipText("GRN Management");
        grnManagementButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 16, 1, 1));
        grnManagementButton.setBorderPainted(false);
        grnManagementButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        grnManagementButton.setIconTextGap(15);
        grnManagementButton.setMaximumSize(new java.awt.Dimension(245, 38));
        grnManagementButton.setMinimumSize(new java.awt.Dimension(245, 38));
        grnManagementButton.setPreferredSize(new java.awt.Dimension(245, 38));
        grnManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grnManagementButtonActionPerformed(evt);
            }
        });

        invoiceManagementActiveBar.setBackground(new java.awt.Color(32, 116, 134));
        invoiceManagementActiveBar.setMaximumSize(new java.awt.Dimension(5, 38));
        invoiceManagementActiveBar.setMinimumSize(new java.awt.Dimension(5, 38));

        javax.swing.GroupLayout invoiceManagementActiveBarLayout = new javax.swing.GroupLayout(invoiceManagementActiveBar);
        invoiceManagementActiveBar.setLayout(invoiceManagementActiveBarLayout);
        invoiceManagementActiveBarLayout.setHorizontalGroup(
            invoiceManagementActiveBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        invoiceManagementActiveBarLayout.setVerticalGroup(
            invoiceManagementActiveBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        invoiceManagementButton.setBackground(new java.awt.Color(238, 238, 238));
        invoiceManagementButton.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        invoiceManagementButton.setForeground(new java.awt.Color(51, 51, 51));
        invoiceManagementButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/invoice.png"))); // NOI18N
        invoiceManagementButton.setText("Invoice Management");
        invoiceManagementButton.setToolTipText("Invoice Management");
        invoiceManagementButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 16, 1, 1));
        invoiceManagementButton.setBorderPainted(false);
        invoiceManagementButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        invoiceManagementButton.setIconTextGap(15);
        invoiceManagementButton.setMaximumSize(new java.awt.Dimension(245, 38));
        invoiceManagementButton.setMinimumSize(new java.awt.Dimension(245, 38));
        invoiceManagementButton.setPreferredSize(new java.awt.Dimension(245, 38));
        invoiceManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceManagementButtonActionPerformed(evt);
            }
        });

        returnManagementActiveBar.setBackground(new java.awt.Color(32, 116, 134));
        returnManagementActiveBar.setMaximumSize(new java.awt.Dimension(5, 38));
        returnManagementActiveBar.setMinimumSize(new java.awt.Dimension(5, 38));

        javax.swing.GroupLayout returnManagementActiveBarLayout = new javax.swing.GroupLayout(returnManagementActiveBar);
        returnManagementActiveBar.setLayout(returnManagementActiveBarLayout);
        returnManagementActiveBarLayout.setHorizontalGroup(
            returnManagementActiveBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        returnManagementActiveBarLayout.setVerticalGroup(
            returnManagementActiveBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        returnManagementButton.setBackground(new java.awt.Color(238, 238, 238));
        returnManagementButton.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        returnManagementButton.setForeground(new java.awt.Color(51, 51, 51));
        returnManagementButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/return.png"))); // NOI18N
        returnManagementButton.setText("Return Management");
        returnManagementButton.setToolTipText("Return Management");
        returnManagementButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 16, 1, 1));
        returnManagementButton.setBorderPainted(false);
        returnManagementButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        returnManagementButton.setIconTextGap(15);
        returnManagementButton.setMaximumSize(new java.awt.Dimension(245, 38));
        returnManagementButton.setMinimumSize(new java.awt.Dimension(245, 38));
        returnManagementButton.setPreferredSize(new java.awt.Dimension(245, 38));
        returnManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnManagementButtonActionPerformed(evt);
            }
        });

        drawerManagementActiveBar.setBackground(new java.awt.Color(32, 116, 134));
        drawerManagementActiveBar.setMaximumSize(new java.awt.Dimension(5, 38));
        drawerManagementActiveBar.setMinimumSize(new java.awt.Dimension(5, 38));

        javax.swing.GroupLayout drawerManagementActiveBarLayout = new javax.swing.GroupLayout(drawerManagementActiveBar);
        drawerManagementActiveBar.setLayout(drawerManagementActiveBarLayout);
        drawerManagementActiveBarLayout.setHorizontalGroup(
            drawerManagementActiveBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        drawerManagementActiveBarLayout.setVerticalGroup(
            drawerManagementActiveBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        drawerManagementButton.setBackground(new java.awt.Color(238, 238, 238));
        drawerManagementButton.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        drawerManagementButton.setForeground(new java.awt.Color(51, 51, 51));
        drawerManagementButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/drawer.png"))); // NOI18N
        drawerManagementButton.setText("Drawer Management");
        drawerManagementButton.setToolTipText("Drawer Management");
        drawerManagementButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 16, 1, 1));
        drawerManagementButton.setBorderPainted(false);
        drawerManagementButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        drawerManagementButton.setIconTextGap(15);
        drawerManagementButton.setMaximumSize(new java.awt.Dimension(245, 38));
        drawerManagementButton.setMinimumSize(new java.awt.Dimension(245, 38));
        drawerManagementButton.setPreferredSize(new java.awt.Dimension(245, 38));
        drawerManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawerManagementButtonActionPerformed(evt);
            }
        });

        quatationManagementActiveBar.setBackground(new java.awt.Color(32, 116, 134));
        quatationManagementActiveBar.setMaximumSize(new java.awt.Dimension(5, 38));
        quatationManagementActiveBar.setMinimumSize(new java.awt.Dimension(5, 38));

        javax.swing.GroupLayout quatationManagementActiveBarLayout = new javax.swing.GroupLayout(quatationManagementActiveBar);
        quatationManagementActiveBar.setLayout(quatationManagementActiveBarLayout);
        quatationManagementActiveBarLayout.setHorizontalGroup(
            quatationManagementActiveBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        quatationManagementActiveBarLayout.setVerticalGroup(
            quatationManagementActiveBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        quatationManagementButton.setBackground(new java.awt.Color(238, 238, 238));
        quatationManagementButton.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        quatationManagementButton.setForeground(new java.awt.Color(51, 51, 51));
        quatationManagementButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/quatation.png"))); // NOI18N
        quatationManagementButton.setText("Quatation Management");
        quatationManagementButton.setToolTipText("Quatation Management");
        quatationManagementButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 16, 1, 1));
        quatationManagementButton.setBorderPainted(false);
        quatationManagementButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        quatationManagementButton.setIconTextGap(15);
        quatationManagementButton.setMaximumSize(new java.awt.Dimension(245, 38));
        quatationManagementButton.setMinimumSize(new java.awt.Dimension(245, 38));
        quatationManagementButton.setPreferredSize(new java.awt.Dimension(245, 38));
        quatationManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quatationManagementButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(menuMaximizeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menuMinimizeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jSeparator2))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(invoiceManagementActiveBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stockManagementActiveBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supplierManagementActiveBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dashboardActiveBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userManagementActiveBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productManagementActiveBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grnManagementActiveBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnManagementActiveBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drawerManagementActiveBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quatationManagementActiveBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(quatationManagementButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(drawerManagementButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(returnManagementButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(invoiceManagementButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grnManagementButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stockManagementButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productManagementButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(supplierManagementButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userManagementButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dashboardButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menuMinimizeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(menuMaximizeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dashboardButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dashboardActiveBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userManagementActiveBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userManagementButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(supplierManagementActiveBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supplierManagementButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(productManagementActiveBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productManagementButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(stockManagementActiveBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stockManagementButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(grnManagementActiveBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grnManagementButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(invoiceManagementActiveBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invoiceManagementButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(returnManagementActiveBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnManagementButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(drawerManagementActiveBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drawerManagementButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(quatationManagementActiveBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quatationManagementButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setMinimumSize(new java.awt.Dimension(1076, 572));
        MainPanel.setPreferredSize(new java.awt.Dimension(1076, 572));
        MainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(51, 102, 255));

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/new-receipt.png"))); // NOI18N
        jMenuItem1.setText("New Invoice");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void userManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userManagementButtonActionPerformed
        // TODO add your handling code here:
        loadPanel(new UserManagement(this), userManagementButton, userManagementActiveBar);
    }//GEN-LAST:event_userManagementButtonActionPerformed

    private void supplierManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierManagementButtonActionPerformed
        // TODO add your handling code here:
        loadPanel(new SupplierManagement(), supplierManagementButton, supplierManagementActiveBar);
    }//GEN-LAST:event_supplierManagementButtonActionPerformed

    private void productManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productManagementButtonActionPerformed
        // TODO add your handling code here:
        loadPanel(new ProductManagement(), productManagementButton, productManagementActiveBar);
    }//GEN-LAST:event_productManagementButtonActionPerformed

    private void stockManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockManagementButtonActionPerformed
        // TODO add your handling code here:
        loadPanel(new StockManagement(), stockManagementButton, stockManagementActiveBar);
    }//GEN-LAST:event_stockManagementButtonActionPerformed

    private void grnManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grnManagementButtonActionPerformed
        // TODO add your handling code here:
        loadPanel(new GrnManagement(), grnManagementButton, grnManagementActiveBar);
    }//GEN-LAST:event_grnManagementButtonActionPerformed

    private void invoiceManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceManagementButtonActionPerformed
        // TODO add your handling code here:
        loadPanel(new InvoiceManagement(), invoiceManagementButton, invoiceManagementActiveBar);
    }//GEN-LAST:event_invoiceManagementButtonActionPerformed

    private void returnManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnManagementButtonActionPerformed
        // TODO add your handling code here:
        loadPanel(new ReturnManagement(), returnManagementButton, returnManagementActiveBar);
    }//GEN-LAST:event_returnManagementButtonActionPerformed

    private void drawerManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawerManagementButtonActionPerformed
        // TODO add your handling code here:
        loadPanel(new DrawerManagement(), drawerManagementButton, drawerManagementActiveBar);
    }//GEN-LAST:event_drawerManagementButtonActionPerformed

    private void quatationManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quatationManagementButtonActionPerformed
        // TODO add your handling code here:
        loadPanel(new QuatationManagement(), quatationManagementButton, quatationManagementActiveBar);
    }//GEN-LAST:event_quatationManagementButtonActionPerformed

    private void dashboardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardButtonActionPerformed
        // TODO add your handling code here:
        loadPanel(new Dashboard(), dashboardButton, dashboardActiveBar);
    }//GEN-LAST:event_dashboardButtonActionPerformed

    private void menuMaximizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMaximizeButtonActionPerformed
        // TODO add your handling code here:
        setMaximizeMenu(Home.animationStatus);
    }//GEN-LAST:event_menuMaximizeButtonActionPerformed

    private void menuMinimizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMinimizeButtonActionPerformed
        // TODO add your handling code here:
        setMinimizeMenu(Home.animationStatus);
    }//GEN-LAST:event_menuMinimizeButtonActionPerformed

    private void notoficationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notoficationButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notoficationButtonActionPerformed

    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_settingsButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel dashboardActiveBar;
    private javax.swing.JButton dashboardButton;
    private javax.swing.JPanel drawerManagementActiveBar;
    private javax.swing.JButton drawerManagementButton;
    private javax.swing.JPanel grnManagementActiveBar;
    private javax.swing.JButton grnManagementButton;
    private javax.swing.JPanel invoiceManagementActiveBar;
    private javax.swing.JButton invoiceManagementButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton menuMaximizeButton;
    private javax.swing.JButton menuMinimizeButton;
    private javax.swing.JButton notoficationButton;
    private javax.swing.JPanel productManagementActiveBar;
    private javax.swing.JButton productManagementButton;
    private javax.swing.JPanel quatationManagementActiveBar;
    private javax.swing.JButton quatationManagementButton;
    private javax.swing.JPanel returnManagementActiveBar;
    private javax.swing.JButton returnManagementButton;
    private javax.swing.JButton settingsButton;
    private javax.swing.JPanel stockManagementActiveBar;
    private javax.swing.JButton stockManagementButton;
    private javax.swing.JPanel supplierManagementActiveBar;
    private javax.swing.JButton supplierManagementButton;
    private javax.swing.JPanel userManagementActiveBar;
    private javax.swing.JButton userManagementButton;
    // End of variables declaration//GEN-END:variables
}
