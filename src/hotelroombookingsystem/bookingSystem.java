/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelroombookingsystem;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.util.ArrayList;




public class bookingSystem extends javax.swing.JFrame {

    int boardP;
    int roomTypeP;
    String board;
    String roomType;
    double total;
    int price;
    int totalNoDis;
    private static ArrayList<Reservations> reservations = new ArrayList<>();
    public bookingSystem() {
        
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        nameField = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        singleCheckBox = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        familyCheckBox = new javax.swing.JCheckBox();
        doubleCheckBox = new javax.swing.JCheckBox();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        selfCheckBox = new javax.swing.JCheckBox();
        halfCheckBox = new javax.swing.JCheckBox();
        fullCheckBox = new javax.swing.JCheckBox();
        submitButton = new javax.swing.JButton();
        nightsField = new javax.swing.JFormattedTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(100, 100));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextArea1.setRows(1);
        jTextArea1.setText("Room Type:                                       Board:");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        nameField.setToolTipText("");
        nameField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextArea2.setRows(1);
        jTextArea2.setTabSize(3);
        jTextArea2.setText("Name:");
        jTextArea2.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea2);

        singleCheckBox.setPreferredSize(new java.awt.Dimension(40, 40));
        singleCheckBox.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                singleCheckBoxAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                singleCheckBoxAncestorRemoved(evt);
            }
        });
        singleCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singleCheckBoxActionPerformed(evt);
            }
        });

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextArea3.setRows(1);
        jTextArea3.setTabSize(3);
        jTextArea3.setText("DOUBLE £75");
        jTextArea3.setToolTipText("");
        jTextArea3.setWrapStyleWord(true);
        jScrollPane3.setViewportView(jTextArea3);

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextArea4.setRows(1);
        jTextArea4.setTabSize(3);
        jTextArea4.setText("FAMILY(4) £105");
        jTextArea4.setWrapStyleWord(true);
        jScrollPane4.setViewportView(jTextArea4);

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextArea5.setRows(1);
        jTextArea5.setTabSize(3);
        jTextArea5.setText("SINGLE £50");
        jTextArea5.setWrapStyleWord(true);
        jScrollPane5.setViewportView(jTextArea5);

        familyCheckBox.setPreferredSize(new java.awt.Dimension(40, 40));
        familyCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                familyCheckBoxActionPerformed(evt);
            }
        });

        doubleCheckBox.setPreferredSize(new java.awt.Dimension(40, 40));
        doubleCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doubleCheckBoxActionPerformed(evt);
            }
        });

        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea6.setColumns(20);
        jTextArea6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextArea6.setRows(1);
        jTextArea6.setTabSize(3);
        jTextArea6.setText("SELF-CATERING FREE");
        jTextArea6.setWrapStyleWord(true);
        jScrollPane6.setViewportView(jTextArea6);

        jScrollPane7.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane7.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea7.setColumns(20);
        jTextArea7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextArea7.setRows(1);
        jTextArea7.setTabSize(3);
        jTextArea7.setText("HALF-BOARD £10");
        jScrollPane7.setViewportView(jTextArea7);

        jScrollPane8.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane8.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea8.setColumns(20);
        jTextArea8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextArea8.setRows(1);
        jTextArea8.setTabSize(3);
        jTextArea8.setText("FULL BOARD £20");
        jScrollPane8.setViewportView(jTextArea8);

        selfCheckBox.setPreferredSize(new java.awt.Dimension(40, 40));
        selfCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selfCheckBoxActionPerformed(evt);
            }
        });

        halfCheckBox.setPreferredSize(new java.awt.Dimension(40, 40));
        halfCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                halfCheckBoxActionPerformed(evt);
            }
        });

        fullCheckBox.setPreferredSize(new java.awt.Dimension(40, 40));
        fullCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullCheckBoxActionPerformed(evt);
            }
        });

        submitButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        nightsField.setToolTipText("");
        nightsField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nightsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nightsFieldActionPerformed(evt);
            }
        });

        jScrollPane9.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane9.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea9.setColumns(20);
        jTextArea9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextArea9.setRows(1);
        jTextArea9.setTabSize(3);
        jTextArea9.setText("Number of Nights:");
        jTextArea9.setWrapStyleWord(true);
        jScrollPane9.setViewportView(jTextArea9);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(singleCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(selfCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(doubleCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(familyCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                    .addComponent(nameField, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                    .addComponent(nightsField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(halfCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fullCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(606, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(singleCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selfCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doubleCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(halfCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(familyCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fullCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(169, 169, 169)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(nightsField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(85, 85, 85)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(463, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void singleCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singleCheckBoxActionPerformed
        familyCheckBox.setEnabled(false);
        doubleCheckBox.setEnabled(false);

    }//GEN-LAST:event_singleCheckBoxActionPerformed

    private void familyCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_familyCheckBoxActionPerformed
        singleCheckBox.setEnabled(false);
        doubleCheckBox.setEnabled(false);
    }//GEN-LAST:event_familyCheckBoxActionPerformed

    private void doubleCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doubleCheckBoxActionPerformed
        familyCheckBox.setEnabled(false);
        singleCheckBox.setEnabled(false);
    }//GEN-LAST:event_doubleCheckBoxActionPerformed

    private void selfCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selfCheckBoxActionPerformed
        halfCheckBox.setEnabled(false);
        fullCheckBox.setEnabled(false);
    }//GEN-LAST:event_selfCheckBoxActionPerformed

    private void halfCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_halfCheckBoxActionPerformed
        selfCheckBox.setEnabled(false);
        fullCheckBox.setEnabled(false);
    }//GEN-LAST:event_halfCheckBoxActionPerformed

    private void fullCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullCheckBoxActionPerformed
        selfCheckBox.setEnabled(false);
        halfCheckBox.setEnabled(false);
    }//GEN-LAST:event_fullCheckBoxActionPerformed

    private void singleCheckBoxAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_singleCheckBoxAncestorRemoved
       
    }//GEN-LAST:event_singleCheckBoxAncestorRemoved

    private void singleCheckBoxAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_singleCheckBoxAncestorAdded
        

    }//GEN-LAST:event_singleCheckBoxAncestorAdded

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        if(singleCheckBox.isSelected()){
            roomTypeP = 50;
            roomType = "Single";
        }
        else if(doubleCheckBox.isSelected()){
            roomTypeP = 75;
            roomType = "Double";
        }
        else if(familyCheckBox.isSelected()){
            roomTypeP = 105;
            roomType = "Family";
        }
        if(selfCheckBox.isSelected()){
            boardP = 0;
            board = "Self-Catering";
        }
        else if(halfCheckBox.isSelected()){
            boardP = 10;
            board = "half-Board";
        }
        else if(familyCheckBox.isSelected()){
            boardP = 20;
            board = "Full Board";
        }
        
        String name = nameField.getText();
        int numOfNights = Integer.parseInt(nightsField.getText());
        price = roomTypeP + boardP;
        if(numOfNights > 7){
            total = 7 * price;
            total = total + (numOfNights - 7)*(price*0.8);
        }
        else{
            total = numOfNights * price;
        }
        totalNoDis = numOfNights * price;
        
        Reservations newReserve = new Reservations(price, name, board, roomType);
        reservations.add(newReserve);
        bill game = new bill();
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = (int)tk.getScreenSize().getWidth();
        int ySize = (int)tk.getScreenSize().getHeight();
        game.setSize(xSize,ySize);
        game.getContentPane().setBackground(Color.decode("#05F9ED"));
        if(numOfNights > 7){
           bill.bill.setText("Details:\n"+newReserve+" "+numOfNights+" nights"+"\n\nBefore discount: "+totalNoDis+"\nAfter Discount :"+total);
        }
        else{
           bill.bill.setText("Details:\n"+newReserve+" "+numOfNights+" nights"+"\n\nTotal: £"+total);
        }
        this.dispose();
        game.setVisible(true); 
    }//GEN-LAST:event_submitButtonActionPerformed

    private void nightsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nightsFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nightsFieldActionPerformed

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
            java.util.logging.Logger.getLogger(bookingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bookingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bookingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bookingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bookingSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox doubleCheckBox;
    private javax.swing.JCheckBox familyCheckBox;
    private javax.swing.JCheckBox fullCheckBox;
    private javax.swing.JCheckBox halfCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    private javax.swing.JFormattedTextField nameField;
    private javax.swing.JFormattedTextField nightsField;
    private javax.swing.JCheckBox selfCheckBox;
    private javax.swing.JCheckBox singleCheckBox;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
