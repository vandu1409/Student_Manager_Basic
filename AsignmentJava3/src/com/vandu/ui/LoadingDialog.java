/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/AWTForms/Dialog.java to edit this template
 */
package com.vandu.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Văn Dự
 */
public class LoadingDialog extends java.awt.Dialog {

    public LoadingDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        Timer t = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = pgbLoading.getValue();
                index = (++index) % pgbLoading.getMaximum();
                pgbLoading.setValue(index);
                lblPercent.setText(String.valueOf(index) + "%");
                if (pgbLoading.getValue() == 20) {
                    lblStatus.setText("Đang kết nối cơ sở dữ liệu...");
                } else if (pgbLoading.getValue() == 30) {
                    lblStatus.setText("Kết nối cơ sở dữ liệu thành công...");
                } else if (pgbLoading.getValue() == 50) {
                    lblStatus.setText("Đang kiểm tra dữ liệu...");
                } else if (pgbLoading.getValue() == 60) {
                    lblStatus.setText("Kiểm tra dữ liệu thành công...");
                } else if (pgbLoading.getValue() == 80) {
                    lblStatus.setText("Đang kiểm tra kết nối...");
                }else if(pgbLoading.getValue()==97){
                 lblStatus.setText("Kết nối thành công...");
                }
                else if (pgbLoading.getValue() == 99) {
                    setVisible(false);
                    dispose();
                }
            }

        });
        t.start();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblStatus = new javax.swing.JLabel();
        lblPercent = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pgbLoading = new javax.swing.JProgressBar();

        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblStatus.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblStatus.setText("Đang tải...");
        jPanel1.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        lblPercent.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblPercent.setText("0%");
        jPanel1.add(lblPercent, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 460, 30, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/5fd80ce36e1a9c64f373d428_what-is-a-student-management-system-Thumb.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 490));
        jPanel1.add(pgbLoading, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 890, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoadingDialog dialog = new LoadingDialog(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPercent;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JProgressBar pgbLoading;
    // End of variables declaration//GEN-END:variables
}
