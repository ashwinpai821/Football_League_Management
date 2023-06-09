import java.awt.Color;
import java.sql.*;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Registration extends javax.swing.JFrame {
	Connection con;
	PreparedStatement ps;
    /**
     * Creates new form Registration
     */
    public Registration() {
        initComponents();
        con = database_connectivity.connectDatabase();
        Reg.setVisible(false);
        Fin.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel6 = new javax.swing.JPanel();
        HOME = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        REG = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Centre = new javax.swing.JPanel();
        Home = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Reg = new javax.swing.JPanel();
        teamn = new javax.swing.JTextField();
        pl1 = new javax.swing.JTextField();
        pl2 = new javax.swing.JTextField();
        pl4 = new javax.swing.JTextField();
        pl3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        Fin = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        teamn2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        final_tally = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        s2 = new javax.swing.JTextField();
        s1 = new javax.swing.JTextField();
        teamn1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        HOME.setBackground(new java.awt.Color(0, 0, 0));
        HOME.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        HOME.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HOMEMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("HOME");

        javax.swing.GroupLayout HOMELayout = new javax.swing.GroupLayout(HOME);
        HOME.setLayout(HOMELayout);
        HOMELayout.setHorizontalGroup(
            HOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HOMELayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HOMELayout.setVerticalGroup(
            HOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HOMELayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        REG.setBackground(new java.awt.Color(0, 0, 0));
        REG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        REG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                REGMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("REGISTRATION");

        javax.swing.GroupLayout REGLayout = new javax.swing.GroupLayout(REG);
        REG.setLayout(REGLayout);
        REGLayout.setHorizontalGroup(
            REGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(REGLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        REGLayout.setVerticalGroup(
            REGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(REGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("FINAL TALLY");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(HOME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(REG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(HOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(REG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Centre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Home.setBackground(new java.awt.Color(153, 153, 153));
        Home.setPreferredSize(new java.awt.Dimension(762, 583));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/footballicon.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel4.setText("FOOTBALL LEAGUE MANAGEMENT");

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel1)
                .addContainerGap(135, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        Reg.setBackground(new java.awt.Color(0, 0, 0));
        Reg.setPreferredSize(new java.awt.Dimension(762, 583));
        pl1.setPreferredSize(new java.awt.Dimension(7, 40));
        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Team name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Player no");

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Player Name");

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Player Age");

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Position");

        Add.setText("ADD");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        jButton3.setText("View");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("ADD Team");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No", "Name", "Age", "Position"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel18.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Click View to view the updated table");

        javax.swing.GroupLayout RegLayout = new javax.swing.GroupLayout(Reg);
        Reg.setLayout(RegLayout);
        RegLayout.setHorizontalGroup(
            RegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegLayout.createSequentialGroup()
                .addGroup(RegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(RegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(RegLayout.createSequentialGroup()
                                .addGroup(RegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(RegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pl3)
                                    .addComponent(pl4)))
                            .addGroup(RegLayout.createSequentialGroup()
                                .addGroup(RegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(RegLayout.createSequentialGroup()
                                        .addGroup(RegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(26, 26, 26))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegLayout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(RegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pl2, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                    .addComponent(teamn)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegLayout.createSequentialGroup()
                                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)))
                .addGroup(RegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegLayout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
        );
        RegLayout.setVerticalGroup(
            RegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(RegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teamn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(RegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(RegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(RegLayout.createSequentialGroup()
                        .addGroup(RegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(RegLayout.createSequentialGroup()
                                .addGroup(RegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pl2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(50, 50, 50))
                            .addGroup(RegLayout.createSequentialGroup()
                                .addGroup(RegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pl1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(162, 162, 162)))
                        .addGap(3, 3, 3)
                        .addGroup(RegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pl3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88))
                    .addGroup(RegLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(13, 13, 13)
                        .addGroup(RegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pl4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42)
                .addComponent(Add)
                .addGap(39, 39, 39))
        );

        Fin.setBackground(new java.awt.Color(204, 204, 255));
        Fin.setLayout(null);

        jButton2.setText("View Champions");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Fin.add(jButton2);
        jButton2.setBounds(510, 510, 130, 23);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Team", "Wins", "Draw", "Loss", "GA", "Points"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(jTable2);

        Fin.add(jScrollPane2);
        jScrollPane2.setBounds(420, 330, 310, 140);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Team name");
        Fin.add(jLabel17);
        jLabel17.setBounds(570, 130, 110, 30);

        teamn2.setBackground(new java.awt.Color(204, 204, 204));
        Fin.add(teamn2);
        teamn2.setBounds(430, 130, 110, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("VS");
        Fin.add(jLabel16);
        jLabel16.setBounds(370, 130, 30, 22);

        jButton4.setText("Leaderboards");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Fin.add(jButton4);
        jButton4.setBounds(400, 250, 120, 23);

        final_tally.setText("Submit");
        final_tally.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                final_tallyActionPerformed(evt);
            }
        });
        Fin.add(final_tally);
        final_tally.setBounds(240, 250, 100, 23);

        jLabel15.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("-");
        Fin.add(jLabel15);
        jLabel15.setBounds(370, 200, 20, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 2, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Final Tally");
        Fin.add(jLabel14);
        jLabel14.setBounds(270, 40, 250, 70);

        jLabel13.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Final Score");
        Fin.add(jLabel13);
        jLabel13.setBounds(330, 170, 100, 22);

        s2.setBackground(new java.awt.Color(204, 204, 204));
        s2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Fin.add(s2);
        s2.setBounds(390, 200, 20, 30);

        s1.setBackground(new java.awt.Color(204, 204, 204));
        s1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Fin.add(s1);
        s1.setBounds(340, 200, 20, 30);

        teamn1.setBackground(new java.awt.Color(204, 204, 204));
        Fin.add(teamn1);
        teamn1.setBounds(220, 130, 110, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Team name");
        Fin.add(jLabel12);
        jLabel12.setBounds(100, 120, 100, 40);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/football_managaments/output-onlinejpgtools.jpg"))); // NOI18N
        Fin.add(jLabel11);
        jLabel11.setBounds(0, 0, 780, 630);

        javax.swing.GroupLayout CentreLayout = new javax.swing.GroupLayout(Centre);
        Centre.setLayout(CentreLayout);
        CentreLayout.setHorizontalGroup(
            CentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
            .addGroup(CentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Reg, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE))
            .addGroup(CentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Fin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CentreLayout.setVerticalGroup(
            CentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
            .addGroup(CentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Reg, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE))
            .addGroup(CentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Fin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(Centre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Centre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HOMEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOMEMouseClicked
        Home.setVisible(true);
        Reg.setVisible(false);
        Fin.setVisible(false);
    }

    private void REGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REGMouseClicked
        Reg.setVisible(true);
        Home.setVisible(false);
        Fin.setVisible(false);
    }

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
    	
    	try{
		        String insertSQL = "INSERT INTO "+teamn.getText()+" (No,Name,Age,Position ) VALUES (?, ?, ?, ?)";
		        ps = con.prepareStatement(insertSQL);
		        ps.setString(1, pl1.getText());
		        ps.setString(2, pl2.getText());
		        ps.setString(3, pl3.getText());
		        ps.setString(4, pl4.getText());
		        ps.executeUpdate();
		        pl1.setText("");
		        pl2.setText("");
		        pl3.setText("");
		        pl4.setText("");
    	}
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
    }//GEN-LAST:event_AddActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try{
		        String queryCreateTable = "CREATE TABLE {0}" +
		                                 "(No INT not NULL ," +
		                                 "Name VARCHAR(40)," +
		                                 "Age INT not NULL," +
		                                 "Position VARCHAR(40)," +
		                                 "PRIMARY KEY (No))";
		        String newNameOfTable = teamn.getText();
		        Statement statement = con.createStatement();
		        statement.execute(MessageFormat.format(queryCreateTable, newNameOfTable));
		        String insertSQL = "Insert INTO final (Team,Wins,Draw,Loss,GA,Points) VALUES (?, 0,0,0,0,0)";
		        ps = con.prepareStatement(insertSQL);
		        ps.setString(1, teamn.getText());
		        ps.executeUpdate();
        }
         catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    try{
	        ps=con.prepareStatement("select * from "+teamn.getText());
	        ResultSet rs=ps.executeQuery();
	        DefaultTableModel table_model=(DefaultTableModel)jTable1.getModel();
	        table_model.setRowCount(0);
	        while(rs.next())
	        {
	        	Object o[]={rs.getString("No"),rs.getString("Name"),rs.getString("Age"),rs.getString("Position")};
	        	table_model.addRow(o);
	        }
    }
    
     catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        
        Fin.setVisible(true);
        Home.setVisible(false);
        Reg.setVisible(false);
        
    }//GEN-LAST:event_jPanel1MouseClicked

    private void final_tallyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_final_tallyActionPerformed
          try{
		        int score1 = Integer.parseInt(s1.getText());
		        int score2 = Integer.parseInt(s2.getText());
		        String team1 = teamn1.getText();
		        String team2 = teamn2.getText();
		        ps = con.prepareStatement("select GA from final where Team= ?;");
	            ps.setString(1, team1);
	            ResultSet rs = ps.executeQuery();
	            rs.next();
	            int GA1 = rs.getInt("GA");
	            GA1 += score1;
	            ps.setString(1,team2);
	            rs = ps.executeQuery();
	            rs.next();
	            int GA2 = rs.getInt("GA");
	            GA2 += score2;
	            ps = con.prepareStatement("select Draw from final where Team= ?;");
	            ps.setString(1, team1);
	            rs = ps.executeQuery();
	            rs.next();
	            int draw1 = rs.getInt("Draw");
	            ps.setString(1, team2);
	            rs = ps.executeQuery();
	            rs.next();
	            int draw2 = rs.getInt("Draw");
	            ps = con.prepareStatement("select Loss from final where Team= ?;");
	            ps.setString(1, team1);
	            rs = ps.executeQuery();
	            rs.next();
	            int loss1 = Integer.parseInt(rs.getString("Loss"));
	            ps.setString(1, team2);
	            rs = ps.executeQuery();
	            rs.next();
	            int loss2 = Integer.parseInt(rs.getString("Loss"));
	            ps = con.prepareStatement("select Wins from final where Team= ?;");
	            ps.setString(1, team1);
	            rs = ps.executeQuery();
	            rs.next();
	            int win1 = Integer.parseInt(rs.getString("Wins"));
	            ps = con.prepareStatement("select Wins from final where Team= ?;");
	            ps.setString(1, team2);
	            rs = ps.executeQuery();
	            rs.next();
	            int win2 = Integer.parseInt(rs.getString("Wins"));
	            if(score1>score2)
		        {
		            win1++;
		            loss2++;
		          
		        }
		        else if (score1==score2)
		        {
		            draw1++;
		            draw2++;    
		        }
		        else
		        {
		            win2++;
		            loss1++;
		        }
		        int pts1 = 3*win1 + draw1;
		        int pts2 = 3*win2 + draw2;	        
	            ps = con.prepareStatement("update final set Wins = ?,Draw = ?,Loss = ?, GA = ?, Points =? where (Team = ?)");
	            ps.setInt(1, win1);
	            ps.setInt(2, draw1);
	            ps.setInt(3, loss1);
	            ps.setInt(4, GA1);
	            ps.setInt(5, pts1);
	            ps.setString(6, team1);
	            ps.executeUpdate();
	            ps = con.prepareStatement("update final set Wins = ?,Draw = ?,Loss = ?, GA = ?, Points = ? where (Team = ?)");
	            ps.setInt(1, win2);
	            ps.setInt(2, draw2);
	            ps.setInt(3, loss2);
	            ps.setInt(4, GA2);
	            ps.setInt(5, pts2);
	            ps.setString(6, team2);
	            ps.executeUpdate();
	            teamn1.setText("");
	            teamn2.setText("");
	            s1.setText("");
	            s2.setText("");		        	
          }
           catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
          
    }//GEN-LAST:event_final_tallyActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
		        ps=con.prepareStatement("select * from final order by Points desc , GA desc;");
		        ResultSet rs=ps.executeQuery();
		        DefaultTableModel tm=(DefaultTableModel)jTable2.getModel();
		        tm.setRowCount(0);
		        while(rs.next())
		        {
		        	Object o[]={rs.getString("Team"),rs.getString("Wins"),rs.getString("Draw"),rs.getString("Loss"),rs.getInt("GA"),rs.getInt("Points")};
		        	tm.addRow(o);
		        }
        }
    
     catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
        	ps=con.prepareStatement("select Team from final order by Points desc , GA desc;");
        	ResultSet rs=ps.executeQuery();
            rs.next();
            String champ = rs.getString("Team");
            JOptionPane.showMessageDialog(null, champ +" are the Champions!!");
            con.close();
        }
    
     catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JPanel Centre;
    private javax.swing.JPanel Fin;
    private javax.swing.JPanel HOME;
    private javax.swing.JPanel Home;
    private javax.swing.JPanel REG;
    private javax.swing.JPanel Reg;
    private javax.swing.JButton final_tally;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField pl1;
    private javax.swing.JTextField pl2;
    private javax.swing.JTextField pl3;
    private javax.swing.JTextField pl4;
    private javax.swing.JTextField s1;
    private javax.swing.JTextField s2;
    private javax.swing.JTextField teamn;
    private javax.swing.JTextField teamn1;
    private javax.swing.JTextField teamn2;
    // End of variables declaration//GEN-END:variables
}
