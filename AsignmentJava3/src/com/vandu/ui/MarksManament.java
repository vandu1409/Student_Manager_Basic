/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.vandu.ui;

import com.vandu.service.ExportExcel;
import com.vandu.dao.GradeDao;
import com.vandu.dao.StudentsDao;
import com.vandu.model.Grade;
import com.vandu.model.Student;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 *
 * @author Văn Dự
 */
public class MarksManament extends javax.swing.JPanel {

    DefaultTableModel model = new DefaultTableModel();
    DefaultComboBoxModel cbxmodel = new DefaultComboBoxModel();
    List<Grade> list = null;
    int index = -1;

    public MarksManament() {
        initComponents();
        addColums();
        fillDataToTable();
        fillDataToCbx();
    }

    private void addColums() {
        String colums[] = {"ID SINH VIÊN", "HỌ TÊN", "ENGLISH", "JAVA", "SQL SEVER"};
        model.setColumnIdentifiers(colums);
        tblTopMarks.setModel(model);

    }

    private void fillDataToTable() {
        try {
            GradeDao dao = new GradeDao();
            list = dao.getTopStudents(3);

            model.setRowCount(0);
            for (Grade grade : list) {
                model.addRow(new Object[]{grade.getIdStudent(),
                    grade.getFullname(), grade.getEnglish(), grade.getJava(), grade.getSql()});
            }
            model.fireTableDataChanged();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void fillDataToCbx() {
        StudentsDao dao = new StudentsDao();
        try {
            List<Student> list = dao.getAllStudents();
            cbxmodel.removeAllElements();
            cbxmodel.addElement("Chọn mã sinh viên");
            for (Student student : list) {
                cbxmodel.addElement(student.getId());
            }

            cbxId.setModel(cbxmodel);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTopMarks = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtFullname = new javax.swing.JTextField();
        txtEnglish = new javax.swing.JTextField();
        txtJava = new javax.swing.JTextField();
        txtSql = new javax.swing.JTextField();
        cbxId = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblMarks = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnFisrt = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(902, 180));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÍ ĐIỂM SINH VIÊN");

        tblTopMarks.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblTopMarks.setModel(new javax.swing.table.DefaultTableModel(
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
        tblTopMarks.setEnabled(false);
        tblTopMarks.setSelectionBackground(new java.awt.Color(102, 155, 255));
        tblTopMarks.getTableHeader().setReorderingAllowed(false);
        tblTopMarks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTopMarksMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblTopMarks);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("TÌM KIẾM"));

        jLabel5.setText("MÃ SV");

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Loupe-icon.png"))); // NOI18N
        btnSearch.setText("TÌM KIẾM");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txtSearch)
                .addGap(18, 18, 18)
                .addComponent(btnSearch)
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("THÔNG TIN SINH VIÊN"));

        jLabel2.setText("MA SV");

        jLabel3.setText("HỌ TÊN");

        jLabel4.setText("TIẾNG ANH");

        jLabel6.setText("JAVA");

        jLabel7.setText("SQL");

        txtFullname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtFullname.setEnabled(false);

        txtEnglish.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEnglish.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEnglishFocusLost(evt);
            }
        });

        txtJava.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtJava.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtJavaFocusLost(evt);
            }
        });

        txtSql.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSql.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSqlFocusLost(evt);
            }
        });

        cbxId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEnglish, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                            .addComponent(txtJava)
                            .addComponent(txtSql))
                        .addGap(150, 150, 150))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxId, 0, 414, Short.MAX_VALUE)
                            .addComponent(txtFullname)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtJava, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSql, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 59, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ĐIỂM TB");

        lblMarks.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblMarks.setForeground(new java.awt.Color(255, 0, 51));
        lblMarks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMarks.setText("0.0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
            .addComponent(lblMarks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMarks)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setText("TOP 3 SINH VIÊN CÓ ĐIỂM CAO NHẤT");

        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnFisrt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnFisrt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/first_16px.png"))); // NOI18N
        btnFisrt.setText("FISRT");
        btnFisrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFisrtActionPerformed(evt);
            }
        });

        btnPrev.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/previous_16px.png"))); // NOI18N
        btnPrev.setText("PREV");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next_16px.png"))); // NOI18N
        btnNext.setText("NEXT");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/last_16px.png"))); // NOI18N
        btnLast.setText("LAST");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnFisrt, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFisrt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit-validated-icon.png"))); // NOI18N
        btnUpdate.setText("CẬP NHẬT");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Trash-can-icon.png"))); // NOI18N
        btnDelete.setText("XÓA");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnNew.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/New-file-icon.png"))); // NOI18N
        btnNew.setText("THÊM");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnExport.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnExport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/excel-xls-icon.png"))); // NOI18N
        btnExport.setText("XUẤT");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save-icon.png"))); // NOI18N
        btnSave.setText("LƯU");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        JFileChooser choose = new JFileChooser();

        int result = choose.showOpenDialog(null);
        String file = "";
        if (result == JFileChooser.APPROVE_OPTION) {
            file = choose.getSelectedFile().getPath();
            if (file.endsWith("xls") || file.endsWith("xlsx")) {

            } else {
                file = choose.getSelectedFile().getPath() + ".xls";
            }
            System.out.println(file);
        } else {
            return;
        }

        File excelFilePath = new File(file);
        System.out.println(excelFilePath.toString());

        if (excelFilePath.exists()) {
            JOptionPane.showMessageDialog(this, "File đã tồn tại!", "Thông báo", HEIGHT);
            return;
        }
        try {
            Workbook workbook = ExportExcel.getWorkbook(excelFilePath.toString());
            Sheet sheet = workbook.createSheet("Bảng điểm");
            CellStyle cellstyle = ExportExcel.createStyleForHeader(sheet);

            Row row = null;
            Cell cell = null;

            row = sheet.createRow(3);
            cell = row.createCell(1, CellType.STRING);
            cell.setCellStyle(cellstyle);
            cell.setCellValue("ID");

            cell = row.createCell(2, CellType.STRING);
            cell.setCellStyle(cellstyle);
            cell.setCellValue("ID SINH VIÊN");

            cell = row.createCell(3, CellType.STRING);
            cell.setCellStyle(cellstyle);
            cell.setCellValue("HỌ TÊN");

            cell = row.createCell(4, CellType.STRING);
            cell.setCellStyle(cellstyle);
            cell.setCellValue("ENGLISH");

            cell = row.createCell(5, CellType.STRING);
            cell.setCellStyle(cellstyle);
            cell.setCellValue("JAVA");

            cell = row.createCell(6, CellType.STRING);
            cell.setCellStyle(cellstyle);
            cell.setCellValue("SQL");

            cell = row.createCell(7, CellType.STRING);
            cell.setCellStyle(cellstyle);
            cell.setCellValue("ĐIỂM TRUNG BÌNH");

            GradeDao dao = new GradeDao();
            List<Grade> list = dao.getAllGrade();

            for (int i = 0; i < list.size(); i++) {
                row = sheet.createRow(4 + i);

                cell = row.createCell(1);
                cell.setCellValue(list.get(i).getId());

                cell = row.createCell(2);
                cell.setCellValue(list.get(i).getIdStudent());

                cell = row.createCell(3);
                cell.setCellValue(list.get(i).getFullname());

                cell = row.createCell(4);
                cell.setCellValue(list.get(i).getEnglish());

                cell = row.createCell(5);
                cell.setCellValue(list.get(i).getJava());

                cell = row.createCell(6);
                cell.setCellValue(list.get(i).getSql());

                cell = row.createCell(7);
                cell.setCellValue(list.get(i).getAvg());
            }

            try ( FileOutputStream fis = new FileOutputStream(excelFilePath)) {
                workbook.write(fis);
            }

            JOptionPane.showMessageDialog(this, "Xuất file thành công!", "Thông báo", HEIGHT);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Xuất file không thành công!", "Thông báo", HEIGHT);
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnExportActionPerformed

    private void txtEnglishFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEnglishFocusLost
        if (txtEnglish.getText().equals("") || txtJava.getText().equals("") || txtSql.getText().equals("")) {
            return;
        }

        double english = Double.parseDouble(txtEnglish.getText());
        double java = Double.parseDouble(txtJava.getText());
        double sql = Double.parseDouble(txtSql.getText());

        double avg = (english + java + sql) / 3;
        String avgMarks = String.format("%.2f", avg);
        lblMarks.setText(avgMarks);
    }//GEN-LAST:event_txtEnglishFocusLost

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (checkForm()) {
            return;
        }

        Grade g = new Grade();
        g.setIdStudent((String) cbxId.getSelectedItem());
        g.setEnglish(Double.parseDouble(txtEnglish.getText()));
        g.setJava(Double.parseDouble(txtJava.getText()));
        g.setSql(Double.parseDouble(txtSql.getText()));

        try {
            GradeDao dao = new GradeDao();

            Grade grade = dao.findById((String) cbxId.getSelectedItem());

            if (grade == null) {
                if (dao.insert(g)) {
                    JOptionPane.showMessageDialog(this, "Thêm điểm sinh viên thành công!", "Thông báo", HEIGHT);
                    fillDataToTable();
                    btnNewActionPerformed(evt);
                } else {
                    JOptionPane.showMessageDialog(this, "Thêm điểm sinh viên thất bại!", "Thông báo", HEIGHT);
                }
            } else {
                btnUpdateActionPerformed(evt);
            }

            fillDataToTable();
            btnNewActionPerformed(evt);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private boolean checkForm() throws HeadlessException {

        if (cbxId.getSelectedItem().equals("Chọn mã sinh viên")
                || txtEnglish.getText().equals("")
                || txtJava.getText().equals("") || txtSql.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin", "Thông báo", HEIGHT);
            return true;
        }
        if (txtFullname.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Mã sinh viên bạn nhập không tồn tại!", "Thông báo", HEIGHT);
            return true;
        }
        try {
            double english = Double.parseDouble(txtEnglish.getText());
            double java = Double.parseDouble(txtJava.getText());
            double sql = Double.parseDouble(txtSql.getText());
            if (english < 0 || english > 10 || java < 0 || java > 10 || sql < 0 || sql > 10) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập điểm từ 0-->10!", TOOL_TIP_TEXT_KEY, HEIGHT);
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập điểm là số!", "Thông báo", HEIGHT);
            return true;
        }
        return false;
    }

    private void txtJavaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJavaFocusLost
        txtEnglishFocusLost(evt);
    }//GEN-LAST:event_txtJavaFocusLost

    private void txtSqlFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSqlFocusLost
        txtEnglishFocusLost(evt);
    }//GEN-LAST:event_txtSqlFocusLost

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        cbxId.setSelectedIndex(0);
        txtFullname.setText("");
        txtEnglish.setText("");
        txtJava.setText("");
        txtSql.setText("");
        lblMarks.setText("0.0");
        txtSearch.setText("");
        tblTopMarks.clearSelection();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (checkForm()) {
            return;
        }
        Grade g = new Grade();
        g.setIdStudent((String) cbxId.getSelectedItem());
        g.setEnglish(Double.parseDouble(txtEnglish.getText()));
        g.setJava(Double.parseDouble(txtJava.getText()));
        g.setSql(Double.parseDouble(txtSql.getText()));

        try {
            GradeDao dao = new GradeDao();
            if (dao.update(g)) {
                JOptionPane.showMessageDialog(this, "Cập nhật sinh viên thành công!", "Thông báo", HEIGHT);
                fillDataToTable();
                btnNewActionPerformed(evt);
            } else {
                JOptionPane.showMessageDialog(this, "Cập nhật thông tin sinh viên thất bại!", "Thông báo", HEIGHT);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        String id = txtSearch.getText();

        if (id.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã sinh viên vào ô input!", "Thông báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            Grade g = new Grade();
            GradeDao dao = new GradeDao();

            g = dao.findById(id);

            if (g != null) {
                JOptionPane.showMessageDialog(this, "Đã tìm thấy sinh viên!", "Thông báo", HEIGHT);
                showDetails(g);

            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy sinh viên có mã " + id + " !", "Thông báo", HEIGHT);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        GradeDao dao = new GradeDao();


        String idSV = (String) cbxId.getSelectedItem();

        try {
            Grade g = dao.findById(idSV);

            if (g != null) {
                int choose = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa sinh viên này không!", "Xác nhận", JOptionPane.YES_NO_CANCEL_OPTION);
                if (choose == JOptionPane.YES_OPTION) {
                    if (dao.delete(idSV)) {
                        JOptionPane.showMessageDialog(this, "Xóa sinh viên thành công!", "Thông báo", HEIGHT);
                        fillDataToTable();
                        btnNewActionPerformed(evt);
                        return;
                    } else {
                        JOptionPane.showMessageDialog(this, "Xóa sinh viên không thành công thành công!", "Lỗi", HEIGHT);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy sinh viên có mã " + idSV + " !", "Lỗi", HEIGHT);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void cbxIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxIdActionPerformed
        tblTopMarks.clearSelection();
        if (cbxId.getSelectedIndex() == 0) {
            tblTopMarks.clearSelection();
            txtFullname.setText("");
            txtEnglish.setText("");
            txtJava.setText("");
            txtSql.setText("");
            lblMarks.setText("0.0");
            return;
        }

        String id = (String) cbxId.getSelectedItem();
        try {
            StudentsDao dao = new StudentsDao();
            GradeDao gdao = new GradeDao();

            Student stu = dao.findById(id);
            Grade g = gdao.findById(id);

            if (stu != null && g != null) {
                txtFullname.setText(stu.getFullname());
                txtEnglish.setText(String.valueOf(g.getEnglish()));
                txtJava.setText(String.valueOf(g.getJava()));
                txtSql.setText(String.valueOf(g.getSql()));
                String avg = String.format("%.2f", g.getAvg());
                lblMarks.setText(avg);
            } else {
                tblTopMarks.clearSelection();
                txtFullname.setText(stu.getFullname());
                txtEnglish.setText("");
                txtJava.setText("");
                txtSql.setText("");
                lblMarks.setText("0.0");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_cbxIdActionPerformed

    private void tblTopMarksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTopMarksMouseClicked

    }//GEN-LAST:event_tblTopMarksMouseClicked

    private void showDetails(Grade g) {
        cbxId.setSelectedItem(g.getIdStudent());
        txtFullname.setText(g.getFullname());
        txtEnglish.setText(String.valueOf(g.getEnglish()));
        txtJava.setText(String.valueOf(g.getJava()));
        txtSql.setText(String.valueOf(g.getSql()));
        String avgMarks = String.format("%.2f", g.getAvg());
        lblMarks.setText(avgMarks);
    }

    private void btnFisrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFisrtActionPerformed
        if (list != null) {
            index = 0;
            Grade g = list.get(index);
            showDetails(g);

            tblTopMarks.setRowSelectionInterval(index, index);
        }
    }//GEN-LAST:event_btnFisrtActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        if (list != null) {
            if (index > 0) {
                --index;
            } else {
                index = list.size() - 1;
            }
            Grade g = list.get(index);
            showDetails(g);

            tblTopMarks.setRowSelectionInterval(index, index);
        }
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if (list != null) {
            if (index < list.size() - 1) {
                ++index;
            } else {
                index = 0;
            }
            Grade g = list.get(index);
            showDetails(g);

            tblTopMarks.setRowSelectionInterval(index, index);
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        if (list != null) {
            index = list.size() - 1;
            Grade g = list.get(index);
            showDetails(g);

            tblTopMarks.setRowSelectionInterval(index, index);
        }
    }//GEN-LAST:event_btnLastActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnFisrt;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMarks;
    private javax.swing.JTable tblTopMarks;
    private javax.swing.JTextField txtEnglish;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JTextField txtJava;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSql;
    // End of variables declaration//GEN-END:variables
}
