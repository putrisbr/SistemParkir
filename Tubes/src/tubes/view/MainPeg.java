
package tubes.view;


public class MainPeg extends javax.swing.JFrame {

   
    public MainPeg() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        MenuBarPeg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Trns = new javax.swing.JButton();
        Lv = new javax.swing.JButton();
        Form = new javax.swing.JButton();
        Out = new javax.swing.JButton();
        BodyPanel = new javax.swing.JPanel();
        List = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        FFC = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        Trx = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenuBarPeg.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes/gambar/P kecil.png"))); // NOI18N

        Trns.setBackground(new java.awt.Color(255, 102, 0));
        Trns.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes/gambar/icons8-transaction-40.png"))); // NOI18N
        Trns.setText("Transaction");
        Trns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrnsActionPerformed(evt);
            }
        });

        Lv.setBackground(new java.awt.Color(255, 102, 0));
        Lv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes/gambar/icons8-car-badge-40.png"))); // NOI18N
        Lv.setText("List Vehicle");
        Lv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LvActionPerformed(evt);
            }
        });

        Form.setBackground(new java.awt.Color(255, 102, 0));
        Form.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes/gambar/icons8-forgot-password-40.png"))); // NOI18N
        Form.setText("Form Forget Code");
        Form.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormActionPerformed(evt);
            }
        });

        Out.setBackground(new java.awt.Color(0, 0, 0));
        Out.setForeground(new java.awt.Color(255, 255, 255));
        Out.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes/gambar/logout.png"))); // NOI18N
        Out.setText("Logout");
        Out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuBarPegLayout = new javax.swing.GroupLayout(MenuBarPeg);
        MenuBarPeg.setLayout(MenuBarPegLayout);
        MenuBarPegLayout.setHorizontalGroup(
            MenuBarPegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuBarPegLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addComponent(Trns)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Form)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Out)
                .addContainerGap())
        );
        MenuBarPegLayout.setVerticalGroup(
            MenuBarPegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuBarPegLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(MenuBarPegLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuBarPegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuBarPegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Trns)
                        .addComponent(Lv))
                    .addComponent(Form)
                    .addComponent(Out))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BodyPanel.setBackground(new java.awt.Color(255, 255, 255));
        BodyPanel.setLayout(new java.awt.CardLayout());

        List.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("Vehicle on Parking Area");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setText("History ");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout ListLayout = new javax.swing.GroupLayout(List);
        List.setLayout(ListLayout);
        ListLayout.setHorizontalGroup(
            ListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListLayout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(ListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ListLayout.createSequentialGroup()
                        .addGroup(ListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ListLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(292, 292, 292))))
            .addGroup(ListLayout.createSequentialGroup()
                .addGap(401, 401, 401)
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ListLayout.setVerticalGroup(
            ListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BodyPanel.add(List, "card3");

        FFC.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel9.setText("Code Loss Report");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Name ");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Check In ");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Vechicle Number");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Loss Regulation \n\n1.If you do not bring your vehicle \n   registration vehicle will be confiscated \n   by the management\n2. If the STNK can be proven, \n    then it will be charged 20,000 rupiah\n\n\n\n\t         Parking Management");
        jScrollPane3.setViewportView(jTextArea1);

        jButton5.setText("Submit");

        jTextField2.setText("jTextField2");

        jTextField3.setText("jTextField3");

        jTextField5.setText("jTextField5");

        javax.swing.GroupLayout FFCLayout = new javax.swing.GroupLayout(FFC);
        FFC.setLayout(FFCLayout);
        FFCLayout.setHorizontalGroup(
            FFCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FFCLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(350, 350, 350))
            .addGroup(FFCLayout.createSequentialGroup()
                .addGroup(FFCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FFCLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(FFCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(47, 47, 47)
                        .addGroup(FFCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(jTextField3)
                            .addComponent(jTextField5)))
                    .addGroup(FFCLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        FFCLayout.setVerticalGroup(
            FFCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FFCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(41, 41, 41)
                .addGroup(FFCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(FFCLayout.createSequentialGroup()
                        .addGroup(FFCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(FFCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(FFCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        BodyPanel.add(FFC, "card4");

        Trx.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("TRANSACTION");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Parking Code");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Check In ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Check Out ");

        jTextField1.setText("jTextField1");

        jFormattedTextField1.setText("jFormattedTextField1");

        jFormattedTextField2.setText("jFormattedTextField2");

        jTextField4.setText("jTextField4");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setText("BILL");
        jLabel6.setToolTipText("");

        jButton6.setText("SUBMIT");

        javax.swing.GroupLayout TrxLayout = new javax.swing.GroupLayout(Trx);
        Trx.setLayout(TrxLayout);
        TrxLayout.setHorizontalGroup(
            TrxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TrxLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(373, 373, 373))
            .addGroup(TrxLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(TrxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(TrxLayout.createSequentialGroup()
                        .addGroup(TrxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(63, 63, 63)
                        .addGroup(TrxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(TrxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField1)
                                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))))
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                .addGroup(TrxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );
        TrxLayout.setVerticalGroup(
            TrxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addGroup(TrxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(TrxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(TrxLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(TrxLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(TrxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addGroup(TrxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );

        BodyPanel.add(Trx, "card2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuBarPeg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(MenuBarPeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OutActionPerformed
        First n = new First();
        n.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_OutActionPerformed

    private void TrnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrnsActionPerformed
        BodyPanel.removeAll();
        BodyPanel.repaint();
        BodyPanel.revalidate();
        
        BodyPanel.add(Trx);
        BodyPanel.repaint();
        BodyPanel.revalidate();
    }//GEN-LAST:event_TrnsActionPerformed

    private void LvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LvActionPerformed
        BodyPanel.removeAll();
        BodyPanel.repaint();
        BodyPanel.revalidate();
        
        BodyPanel.add(List);
        BodyPanel.repaint();
        BodyPanel.revalidate();
    }//GEN-LAST:event_LvActionPerformed

    private void FormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormActionPerformed
        BodyPanel.removeAll();
        BodyPanel.repaint();
        BodyPanel.revalidate();
        
        BodyPanel.add(FFC);
        BodyPanel.repaint();
        BodyPanel.revalidate();
    }//GEN-LAST:event_FormActionPerformed

 
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPeg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JPanel FFC;
    private javax.swing.JButton Form;
    private javax.swing.JPanel List;
    private javax.swing.JButton Lv;
    private javax.swing.JPanel MenuBarPeg;
    private javax.swing.JButton Out;
    private javax.swing.JButton Trns;
    private javax.swing.JPanel Trx;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
