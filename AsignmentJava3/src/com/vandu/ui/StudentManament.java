/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.vandu.ui;

import com.vandu.service.ExportExcel;
import com.vandu.service.ImageHelper;
import com.vandu.dao.StudentsDao;
import com.vandu.model.Student;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import static java.awt.image.ImageObserver.HEIGHT;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
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
public class StudentManament extends javax.swing.JPanel {

    private MainForm mainForm;
    private DefaultTableModel model = new DefaultTableModel();
    private List<Student> list = null;
    private int index = -1;
    private byte[] personImg;

    /**
     * Creates new form StudentManament
     */
    public StudentManament() {
        initComponents();
//        tblStudents.getTableHeader().setOpaque(false);
//        tblStudents.getTableHeader().setBackground(Color.decode("#0099FF"));
//        tblStudents.getTableHeader().setForeground(Color.WHITE);
        addColums();
        fillDataToTable();
    }

    public void addColums() {
        String colums[] = {"ID", "HỌ TÊN", "EMAIL", "SỐ ĐT", "GIỚI TÍNH", "ĐỊA CHỈ"};
        model.setColumnIdentifiers(colums);
        tblStudents.setModel(model);
    }

    public void fillDataToTable() {
        try {
            StudentsDao dao = new StudentsDao();
            list = dao.getAllStudents();
            model.setRowCount(0);
            for (Student student : list) {
                model.addRow(new Object[]{student.getId(), student.getFullname(),
                    student.getEmail(), student.getPhone(),
                    student.getGender() == 1 ? "Nam" : "Nữ", student.getAddress()});
            }
            model.fireTableDataChanged();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblStudents = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtFullname = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        rdoMale = new javax.swing.JRadioButton();
        rdoFemale = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAdress = new javax.swing.JTextArea();
        btnUpLoad = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnExcel = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnFisrt = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(902, 180));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÍ SINH VIÊN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("MÃ SV");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("HỌ TÊN");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("EMAIL");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/images1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tblStudents.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblStudents.setModel(new javax.swing.table.DefaultTableModel(
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
        tblStudents.setRowHeight(18);
        tblStudents.setSelectionBackground(new java.awt.Color(102, 153, 255));
        tblStudents.getTableHeader().setReorderingAllowed(false);
        tblStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblStudents);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("SỐ ĐT");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("GIỚI TÍNH");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("ĐỊA CHỈ");

        txtId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtFullname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtPhone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        buttonGroup1.add(rdoMale);
        rdoMale.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdoMale.setText("NAM");

        buttonGroup1.add(rdoFemale);
        rdoFemale.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdoFemale.setText("NỮ");

        txtAdress.setColumns(20);
        txtAdress.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAdress.setRows(6);
        jScrollPane1.setViewportView(txtAdress);

        btnUpLoad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnUpLoad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/open-file-icon.png"))); // NOI18N
        btnUpLoad.setText("CHỌN ẢNH");
        btnUpLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpLoadActionPerformed(evt);
            }
        });

        btnExcel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/excel-xls-icon.png"))); // NOI18N
        btnExcel.setText("XUẤT");
        btnExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelActionPerformed(evt);
            }
        });

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

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save-icon.png"))); // NOI18N
        btnSave.setText("LƯU");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(29, Short.MAX_VALUE)))
        );

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnFisrt, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFisrt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId)
                    .addComponent(txtFullname)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdoMale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdoFemale))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail)
                    .addComponent(txtPhone))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpLoad)
                        .addGap(119, 119, 119)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(rdoMale)
                            .addComponent(rdoFemale))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (checkForm()) {
            return;
        }

        Student stu = new Student();
        stu.setId(txtId.getText());
        stu.setFullname(txtFullname.getText());
        stu.setPhone(txtPhone.getText());
        stu.setEmail(txtEmail.getText());
        stu.setGender(rdoMale.isSelected() ? 1 : 0);
        stu.setAddress(txtAdress.getText());
        if (personImg != null) {
            stu.setImage(personImg);
        }

        StudentsDao dao = new StudentsDao();
        try {
            Student student = dao.findById(stu.getId());
            if (student == null) {
                if (dao.insert(stu)) {
                    JOptionPane.showMessageDialog(this, "Lưu sinh viên thành công!", "Thông báo", HEIGHT);
                } else {
                    JOptionPane.showMessageDialog(this, "Lưu sinh viên thất bại!", "Lỗi", HEIGHT);
                }
            } else {
                btnUpdateActionPerformed(evt);
            }

            fillDataToTable();
            btnNewActionPerformed(evt);
        } catch (Exception ex) {
            Logger.getLogger(StudentManament.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpLoadActionPerformed
        JFileChooser choose = new JFileChooser();
        choose.setDialogTitle("Select an image");
        choose.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image file(*jpg,*png)", "png", "jpg");
        choose.addChoosableFileFilter(filter);

        if (choose.showOpenDialog(this) == JFileChooser.CANCEL_OPTION) {
            return;
        }

        String type = "";
        if (choose.getSelectedFile().getPath().endsWith("jpg")) {
            type = "jpg";
        } else {
            type = "png";
        }
        File file = choose.getSelectedFile();

        try {
            ImageIcon icon = new ImageIcon(file.getPath());
            Image img = ImageHelper.resize(icon.getImage(), 154, 173); //173, 154
            ImageIcon result = new ImageIcon(img);
            System.out.println(result);
            lblImage.setIcon(result);
            personImg = ImageHelper.ConvertImgaeToByte(img, type);

        } catch (Exception e) {
        }


    }//GEN-LAST:event_btnUpLoadActionPerformed

    private void btnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelActionPerformed
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
            Workbook workbook = ExportExcel.getWorkbook(file);
            Sheet sheet = workbook.createSheet("Student information");
            CellStyle cellstyle = ExportExcel.createStyleForHeader(sheet);

            Row row = null;
            Cell cell = null;

            row = sheet.createRow(3);
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("ID SINH VIÊN");
            cell.setCellStyle(cellstyle);

            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("HỌ TÊN");
            cell.setCellStyle(cellstyle);

            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("EMAIL");
            cell.setCellStyle(cellstyle);

            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue("SĐT");
            cell.setCellStyle(cellstyle);

            cell = row.createCell(5, CellType.STRING);
            cell.setCellValue("GIỚI TÍNH");
            cell.setCellStyle(cellstyle);

            cell = row.createCell(6, CellType.STRING);
            cell.setCellValue("ĐỊA CHỈ");
            cell.setCellStyle(cellstyle);

            StudentsDao dao = new StudentsDao();
//            List<Student> list = dao.getAllStudents();

            for (int i = 0; i < list.size(); i++) {
                row = sheet.createRow(4 + i);
                cell = row.createCell(1, CellType.STRING);
                cell.setCellValue(list.get(i).getId());

                cell = row.createCell(2, CellType.STRING);
                cell.setCellValue(list.get(i).getFullname());

                cell = row.createCell(3, CellType.STRING);
                cell.setCellValue(list.get(i).getEmail());

                cell = row.createCell(4, CellType.STRING);
                cell.setCellValue(list.get(i).getPhone());

                cell = row.createCell(5, CellType.STRING);
                cell.setCellValue(list.get(i).getGender() == 1 ? "Nam" : "Nữ");

                cell = row.createCell(6, CellType.STRING);
                cell.setCellValue(list.get(i).getAddress());

            }

            try ( FileOutputStream fis = new FileOutputStream(file)) {
                workbook.write(fis);
            }

            JOptionPane.showMessageDialog(this, "Xuất file thành công!", "Thông báo", HEIGHT);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Xuất file không thành công thành công!", "Thông báo", HEIGHT);
        }
    }//GEN-LAST:event_btnExcelActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        txtId.setText("");
        txtId.setEnabled(true);
        txtFullname.setText("");
        txtEmail.setText("");
        txtPhone.setText("");
        txtAdress.setText("");
        rdoMale.setSelected(true);
        tblStudents.clearSelection();
        ImageIcon icon = new ImageIcon(getClass().getResource("/icon/images1.png"));
        lblImage.setIcon(icon);
        personImg = null;

    }//GEN-LAST:event_btnNewActionPerformed

    private void tblStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentsMouseClicked
        int row = tblStudents.getSelectedRow();
        if (row >= 0) {
            String id = (String) tblStudents.getValueAt(row, 0);
            StudentsDao dao = new StudentsDao();
            try {
                Student stu = dao.findById(id);
                index = row;
                System.out.println(index);
                showDetails(stu);

            } catch (Exception ex) {
                Logger.getLogger(StudentManament.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_tblStudentsMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        StudentsDao dao = new StudentsDao();

        //người dùng chưa nhập vào ô mã sv
        if (txtId.getText().equals("")) {
            String idSV = JOptionPane.showInputDialog(this, "Nhập mssv bạn cần xóa");
            if (idSV == null || idSV.equals("")) {
                return;
            }
            try {
                Student stu = dao.findById(idSV);

                if (stu != null) {
                    int choose = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa sinh viên này không!", "Xác nhận", JOptionPane.YES_NO_CANCEL_OPTION);
                    if (choose == JOptionPane.YES_OPTION) {

                        if (dao.delete(idSV)) {
//                              
                            JOptionPane.showMessageDialog(this, "Xóa sinh viên thành công!", "Thông báo", HEIGHT);
                            fillDataToTable();
                            btnNewActionPerformed(evt);
                        } else {
                            JOptionPane.showMessageDialog(this, "Xóa sinh viên không thành công!", "Thông báo", HEIGHT);
                        }

                    }
                    return;
                } else {
                    JOptionPane.showMessageDialog(this, "Xóa sinh viên không thành công vì sinh viên đã tồn tại trong bản điểm!", "Thông báo", HEIGHT);
                    return;
                }

            } catch (Exception e) {
            }
        }

        //người dùng đã nhập vào ô mã sinh viên
        try {
            Student student = dao.findById(txtId.getText());
            if (student != null) {
                int choose = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa sinh viên này không!", "Xác nhận", JOptionPane.YES_NO_CANCEL_OPTION);
                if (choose == JOptionPane.YES_OPTION) {
                    if (dao.delete(txtId.getText())) {
                        JOptionPane.showMessageDialog(this, "Xóa sinh viên thành công!", "Thông báo", HEIGHT);
                        btnNewActionPerformed(evt);
                        fillDataToTable();
                    } else {
                        JOptionPane.showMessageDialog(this, "Xóa sinh viên không thành công!", "Thông báo", HEIGHT);
                    }

                }
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy sinh viên ! Vui lòng kiểm tra lại!", "Thông báo", HEIGHT);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Xóa sinh viên không thành công vì sinh viên đã tồn tại trong bản điểm!", "Thông báo", HEIGHT);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (checkForm()) {
            return;
        }

        try {
            Student stu = new Student();
            stu.setId(txtId.getText());
            stu.setFullname(txtFullname.getText());
            stu.setPhone(txtPhone.getText());
            stu.setEmail(txtEmail.getText());
            stu.setGender(rdoMale.isSelected() ? 1 : 0);
            stu.setAddress(txtAdress.getText());
            if (personImg != null) {
                stu.setImage(personImg);
            }

            StudentsDao dao = new StudentsDao();

            if (dao.update(stu)) {
                JOptionPane.showMessageDialog(this, "Cập nhật thông tin sinh viên thành công!", "Thông báo", HEIGHT);
                fillDataToTable();
                btnNewActionPerformed(evt);
            } else {
                JOptionPane.showMessageDialog(this, "Cập nhật thông tin sinh viên thất bại!", "Thông báo", HEIGHT);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if (list != null) {
            if (index < list.size() - 1) {
                ++index;
            } else {
                index = 0;
            }
            Student stu = list.get(index);
            showDetails(stu);

            tblStudents.setRowSelectionInterval(index, index);
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        if (list != null) {
            index = list.size() - 1;
            Student stu = list.get(index);
            showDetails(stu);

            tblStudents.setRowSelectionInterval(index, index);
        }
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnFisrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFisrtActionPerformed
        if (list != null) {
            index = 0;
            Student stu = list.get(index);
            showDetails(stu);

            tblStudents.setRowSelectionInterval(index, index);
        }
    }//GEN-LAST:event_btnFisrtActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        if (list != null) {
            if (index > 0) {
                --index;
            } else {
                index = list.size() - 1;
            }
            Student stu = list.get(index);
            showDetails(stu);

            tblStudents.setRowSelectionInterval(index, index);
        }
    }//GEN-LAST:event_btnPrevActionPerformed

    private boolean checkForm() throws HeadlessException {
        if (txtId.getText().equals("") || txtFullname.getText().equals("") || txtAdress.getText().equals("") || txtEmail.getText().equals("") || txtPhone.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ dữ liệu!", "Thông báo", HEIGHT);
            return true;
        }
        String reEmail = "\\w+@\\w+(\\.\\w+){1,2}";
        if (!txtEmail.getText().matches(reEmail)) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập email đúng định dạng !", "THÔNG BÁO", HEIGHT);
            return true;
        }
        String rePhone = "^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$";
        if (!txtPhone.getText().matches(rePhone)) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số điện thoại đúng định dạng !", "THÔNG BÁO", HEIGHT);
            return true;
        }
        if (!rdoMale.isSelected() & !rdoFemale.isSelected()) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn giới tính !", "THÔNG BÁO", HEIGHT);
            return true;
        }
        return false;
    }

    private void showDetails(Student stu) {
        try {
            txtId.setText(stu.getId());
            txtId.setEnabled(false);
            txtFullname.setText(stu.getFullname());
            txtEmail.setText(stu.getEmail());
            txtPhone.setText(stu.getPhone());
            txtAdress.setText(stu.getAddress());
            if (stu.getGender() == 1) {
                rdoMale.setSelected(true);
            } else {
                rdoFemale.setSelected(true);
            }

            if (stu.getImage() != null) {
//                    System.out.println(String.valueOf(stu.getImage()));
                Image img = ImageHelper.createImageFromByteArray(stu.getImage(), "jpg");
                lblImage.setIcon(new ImageIcon(img));
                personImg = stu.getImage();
            } else {
                ImageIcon icon = new ImageIcon(getClass().getResource("/icon/images1.png"));
//                Image reimg = ImageHelper.resize(bicon.getImage(), 154, 173);
                lblImage.setIcon(icon);
                personImg = stu.getImage();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExcel;
    private javax.swing.JButton btnFisrt;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpLoad;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblImage;
    private javax.swing.JRadioButton rdoFemale;
    private javax.swing.JRadioButton rdoMale;
    private javax.swing.JTable tblStudents;
    private javax.swing.JTextArea txtAdress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
