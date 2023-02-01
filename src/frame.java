import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class frame extends javax.swing.JFrame {
    DefaultTableModel model;
    HashMap<String, Double> converter = new HashMap<>();
    int index = 1;
    public frame() {
        initComponents();
        model = (DefaultTableModel) tblMain.getModel();
        setColumnAlignment(tblMain, SwingConstants.CENTER);
        converter.put("AA", 4.0);
        converter.put("BA", 3.5);
        converter.put("BB", 3.0);
        converter.put("CB", 2.5);
        converter.put("CC", 2.0);
        converter.put("DC", 1.5);
        converter.put("DD", 1.0);
        converter.put("FF", 0.0);
        converter.put("VF", 0.0);
    }
    
    private static void setColumnAlignment(JTable table, int alignment) { //for center alignment of columns
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(alignment);
        TableModel tableModel = table.getModel();
        for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++) {
            table.getColumnModel().getColumn(columnIndex).setCellRenderer(renderer);
        }
        ((DefaultTableCellRenderer)table.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
    }    

    private boolean checkLetter(String s, HashMap<String, Double> converter) { //key check
        for (String x: converter.keySet()) {
            if (s.equals(x))
                return true;
        }
        return false;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblMain = new javax.swing.JTable();
        lblAdd = new javax.swing.JLabel();
        lblCode = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        lblCredit = new javax.swing.JLabel();
        txtCredit = new javax.swing.JTextField();
        lblLetter = new javax.swing.JLabel();
        txtLetter = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnDeleteSelected = new javax.swing.JButton();
        btnDeleteAll = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnTerm = new javax.swing.JButton();
        lblPreviousCredit = new javax.swing.JLabel();
        lblPreviousAvg = new javax.swing.JLabel();
        txtPreviousCredit = new javax.swing.JTextField();
        txtPreviousAvg = new javax.swing.JTextField();
        btnOverall = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblMain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "NAME", "CREDITS", "LETTER GRADE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMain.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblMain);
        if (tblMain.getColumnModel().getColumnCount() > 0) {
            tblMain.getColumnModel().getColumn(0).setMinWidth(45);
            tblMain.getColumnModel().getColumn(0).setMaxWidth(45);
            tblMain.getColumnModel().getColumn(2).setMinWidth(80);
            tblMain.getColumnModel().getColumn(2).setMaxWidth(80);
            tblMain.getColumnModel().getColumn(3).setMinWidth(100);
            tblMain.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        lblAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAdd.setText("Add course:");

        lblCode.setText("Name:");

        lblCredit.setText("Credits:");

        lblLetter.setText("Letter grade:");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDeleteSelected.setText("Delete selected");
        btnDeleteSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSelectedActionPerformed(evt);
            }
        });

        btnDeleteAll.setText("Delete all");
        btnDeleteAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAllActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("GPA CALCULATOR");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnTerm.setText("GPA Calculate");
        btnTerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTermActionPerformed(evt);
            }
        });

        lblPreviousCredit.setText("Previous Credits:");

        lblPreviousAvg.setText("Previous CGPA:");

        btnOverall.setText("CGPA Calculate");
        btnOverall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOverallActionPerformed(evt);
            }
        });

        lblResult.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCode)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCredit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(lblLetter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLetter, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnDeleteAll)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnDeleteSelected)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnAdd))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblAdd)
                                            .addGap(375, 375, 375)))
                                    .addComponent(jScrollPane1)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblPreviousAvg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPreviousCredit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPreviousCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPreviousAvg, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnOverall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)))
                .addGap(37, 37, 37))
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblTitle)
                .addGap(22, 22, 22)
                .addComponent(lblAdd)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCode)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCredit)
                    .addComponent(txtCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLetter)
                    .addComponent(txtLetter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnDeleteSelected)
                    .addComponent(btnDeleteAll))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPreviousCredit)
                    .addComponent(txtPreviousCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPreviousAvg)
                    .addComponent(txtPreviousAvg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTerm))
                .addGap(18, 18, 18)
                .addComponent(btnOverall)
                .addGap(27, 27, 27)
                .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            String letter = txtLetter.getText().toUpperCase();
            if (!checkLetter(letter, converter)) {
                lblResult.setText("Enter a valid letter grade.");
                return;
            }
            
            Object[] row = {Integer.toString(index), txtCode.getText().toUpperCase(), Double.parseDouble(txtCredit.getText()), letter};
            model.addRow(row);
            lblResult.setText("");
            txtCode.setText("");
            txtLetter.setText("");
            txtCredit.setText("");
            index++;
        } catch(Exception e) {
            lblResult.setText("Enter a valid credits.");
        } 
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSelectedActionPerformed
        int index = tblMain.getSelectedRow();
        if (index != -1)
            model.removeRow(index);
    }//GEN-LAST:event_btnDeleteSelectedActionPerformed

    private void btnDeleteAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAllActionPerformed
        model.setRowCount(0);
    }//GEN-LAST:event_btnDeleteAllActionPerformed
    private double[] termCalculate() {
        double[] arr = new double[2];
        double totalCredit = 0.0;
        double totalWeight = 0.0;
        for (int i = 0; i < model.getRowCount(); i++) {
            double rowCredit = (double) model.getValueAt(i, 2);
            totalCredit += rowCredit;
            totalWeight += rowCredit * converter.get((String) model.getValueAt(i, 3));
        }        
        arr[0] = totalWeight;
        arr[1] = totalCredit;
        return arr;
    }
    private void btnTermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTermActionPerformed
        if (model.getRowCount() == 0) {
            lblResult.setText("List is empty. add course.");
            return;
        }
        double[] arr = termCalculate();
        double total = arr[0] / arr[1];
        lblResult.setText("GPA is: " + String.format("%.2f", total));
        arr = null;
    }//GEN-LAST:event_btnTermActionPerformed

    private void btnOverallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOverallActionPerformed
        if (model.getRowCount() == 0) {
            lblResult.setText("List is empty. add course.");
            return;
        }
        try {
            double credit = Double.parseDouble(txtPreviousCredit.getText());
            double weight = Double.parseDouble(txtPreviousAvg.getText()) * credit;
            double[] arr = termCalculate();
            double result = (weight + arr[0]) / (arr[1] + credit);
            lblResult.setText("CGPA is: " + String.format("%.2f", result));
            arr = null;
        } catch(Exception e) {
            lblResult.setText("Enter valid values.");
        }
    }//GEN-LAST:event_btnOverallActionPerformed

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
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDeleteAll;
    private javax.swing.JButton btnDeleteSelected;
    private javax.swing.JButton btnOverall;
    private javax.swing.JButton btnTerm;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdd;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblCredit;
    private javax.swing.JLabel lblLetter;
    private javax.swing.JLabel lblPreviousAvg;
    private javax.swing.JLabel lblPreviousCredit;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblMain;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtCredit;
    private javax.swing.JTextField txtLetter;
    private javax.swing.JTextField txtPreviousAvg;
    private javax.swing.JTextField txtPreviousCredit;
    // End of variables declaration//GEN-END:variables
}
