package interfaz;


import modelo.clase_persona;


public class index extends javax.swing.JFrame {
    
    
    
    
    public index() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtID_KEY = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        txtNAME = new javax.swing.JTextField();
        txtLNAME = new javax.swing.JTextField();
        txtEMAIL = new javax.swing.JTextField();
        txtPHONE = new javax.swing.JTextField();
        txtTIME = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();
        btncargartabla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setText("ID USER:");

        jLabel2.setText("FIRTS NAME:");

        jLabel3.setText("LAST NAME:");

        jLabel4.setText("EMAIL ADDRESS:");

        jLabel5.setText("PHONE NUMBER:");

        jLabel6.setText("TIME CREATE:");

        txtID_KEY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID_KEYActionPerformed(evt);
            }
        });
        txtID_KEY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtID_KEYKeyTyped(evt);
            }
        });

        txtID.setEditable(false);

        btnbuscar.setText("Search");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btnguardar.setText("Save");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnmodificar.setText("Edit");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btneliminar.setText("Delete");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnlimpiar.setText("Clear");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        txtNAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNAMEActionPerformed(evt);
            }
        });
        txtNAME.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNAMEKeyTyped(evt);
            }
        });

        txtLNAME.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLNAMEKeyTyped(evt);
            }
        });

        txtEMAIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEMAILActionPerformed(evt);
            }
        });

        txtPHONE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPHONEActionPerformed(evt);
            }
        });
        txtPHONE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPHONEKeyTyped(evt);
            }
        });

        txtTIME.setEditable(false);
        txtTIME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTIMEActionPerformed(evt);
            }
        });

        jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "FIRST NAME", "LAST NAME", "EMAIL", "PHONE", "CREATE AT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtable);
        if (jtable.getColumnModel().getColumnCount() > 0) {
            jtable.getColumnModel().getColumn(0).setResizable(false);
            jtable.getColumnModel().getColumn(1).setResizable(false);
            jtable.getColumnModel().getColumn(2).setResizable(false);
            jtable.getColumnModel().getColumn(3).setResizable(false);
            jtable.getColumnModel().getColumn(4).setResizable(false);
            jtable.getColumnModel().getColumn(5).setResizable(false);
        }

        btncargartabla.setText("Load table");
        btncargartabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncargartablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtLNAME, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPHONE)
                            .addComponent(txtTIME, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEMAIL, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtID_KEY, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNAME))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnlimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnguardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btncargartabla, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                        .addGap(47, 47, 47))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID_KEY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncargartabla))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnguardar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmodificar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPHONE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneliminar))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTIME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlimpiar))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
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

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        txtID_KEY.setText(null);
        txtID.setText(null);
        txtNAME.setText(null);
        txtLNAME.setText(null);
        txtEMAIL.setText(null);
        txtPHONE.setText(null);
        txtTIME.setText(null);
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void txtEMAILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEMAILActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEMAILActionPerformed

    private void txtPHONEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPHONEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPHONEActionPerformed

    private void txtTIMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTIMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTIMEActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

        String first_name = txtNAME.getText();
        String last_name = txtLNAME.getText();
        String email_address = txtEMAIL.getText();
        String phonenumber = txtPHONE.getText();

        clase_persona ob = new clase_persona(phonenumber, first_name, last_name, email_address);
        ob.guardar(first_name, last_name, email_address, phonenumber);
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        int id_user = Integer.parseInt(txtID_KEY.getText());
        clase_persona ob = new clase_persona(id_user);
        ob.buscar(id_user, txtID, txtNAME, txtLNAME, txtEMAIL, txtPHONE, txtTIME);
        
        
        
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed

        int id_user = Integer.parseInt(txtID_KEY.getText());
        String first_name = txtNAME.getText();
        String last_name = txtLNAME.getText();
        String email_address = txtEMAIL.getText();
        String phonenumber = txtPHONE.getText();
        
        clase_persona ob = new clase_persona(id_user, first_name, last_name, email_address, phonenumber);
        ob.editar(id_user,first_name, last_name, email_address, phonenumber);
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void txtNAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNAMEActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed

        int id_user = Integer.parseInt(txtID_KEY.getText());
        clase_persona ob = new clase_persona(id_user);
        ob.eliminar(id_user);
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btncargartablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncargartablaActionPerformed

       clase_persona persona = new clase_persona();
    persona.cargartabla(jtable);
    }//GEN-LAST:event_btncargartablaActionPerformed

    private void txtID_KEYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID_KEYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID_KEYActionPerformed

    private void txtNAMEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNAMEKeyTyped
            int key = evt.getKeyChar();

    boolean mayusculas = key >= 65 && key <= 90;
    boolean minusculas = key >= 97 && key <= 122;
    boolean espacio = key == 32;
            
     if (!(minusculas || mayusculas || espacio))
    {
        evt.consume();
    }
    }//GEN-LAST:event_txtNAMEKeyTyped

    private void txtLNAMEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLNAMEKeyTyped
            int key = evt.getKeyChar();

    boolean mayusculas = key >= 65 && key <= 90;
    boolean minusculas = key >= 97 && key <= 122;
    boolean espacio = key == 32;
            
     if (!(minusculas || mayusculas || espacio))
    {
        evt.consume();
    }
    }//GEN-LAST:event_txtLNAMEKeyTyped

    private void txtPHONEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPHONEKeyTyped
        int key = evt.getKeyChar();
    boolean numeros = key >= 48 && key <= 57;
    if (!numeros)
    {
        evt.consume();
    }

    if (txtPHONE.getText().trim().length() == 10) {
        evt.consume();
    }
    }//GEN-LAST:event_txtPHONEKeyTyped

    private void txtID_KEYKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtID_KEYKeyTyped
        int key = evt.getKeyChar();
    boolean numeros = key >= 48 && key <= 57;
    if (!numeros)
    {
        evt.consume();
    }

    if (txtID_KEY.getText().trim().length() == 3) {
        evt.consume();
    }
    }//GEN-LAST:event_txtID_KEYKeyTyped

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncargartabla;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtable;
    private javax.swing.JTextField txtEMAIL;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtID_KEY;
    private javax.swing.JTextField txtLNAME;
    private javax.swing.JTextField txtNAME;
    private javax.swing.JTextField txtPHONE;
    private javax.swing.JTextField txtTIME;
    // End of variables declaration//GEN-END:variables
}
