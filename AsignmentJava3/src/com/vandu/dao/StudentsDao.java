/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vandu.dao;

import com.vandu.context.DBContext;
import com.vandu.model.Student;
import com.vandu.model.Users;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;
import javax.sql.rowset.serial.SerialBlob;

/**
 *
 * @author Văn Dự
 */
public class StudentsDao {

    public List<Student> getAllStudents() throws Exception {
        List<Student> list = new ArrayList<>();
        String query = "select * from Students";
        try ( Connection con = DBContext.getConnection();  Statement sta = con.createStatement();) {
            ResultSet rs = sta.executeQuery(query);

            while (rs.next()) {
                Student stu = new Student();
                stu.setId(rs.getString(1));
                stu.setFullname(rs.getString(2));
                stu.setEmail(rs.getString(3));
                stu.setPhone(rs.getString(4));
                stu.setGender(rs.getInt(5));
                stu.setAddress(rs.getString(6));
                Blob blob = rs.getBlob(7);
                if (blob != null) {
                    byte[] bdata = blob.getBytes(1, (int) blob.length());
                    stu.setImage(bdata);
                }

                list.add(stu);

            }

            rs.close();
            return list;

        }
    }

    public boolean insert(Student stu) throws Exception {

        String query = "insert into Students values\n"
                + "(?,?,?,?,?,?,?)";

        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setString(1, stu.getId());
            ps.setString(2, stu.getFullname());
            ps.setString(3, stu.getEmail());
            ps.setString(4, stu.getPhone());
            ps.setInt(5, stu.getGender());
            ps.setString(6, stu.getAddress());

            if (stu.getImage() != null) {
                Blob img = new SerialBlob(stu.getImage());
                ps.setBlob(7, img);
            } else {
                Blob img = null;
                ps.setBlob(7, img);
            }

            return ps.executeUpdate() > 0;
        }

    }

    public boolean update(Student stu) throws Exception {
        String query = "UPDATE [dbo].[Students]\n"
                + "   SET [fullname] = ?\n "
                + "      ,[email] = ?\n"
                + "      ,[phone] = ?\n"
                + "      ,[gender] = ?\n"
                + "      ,[address] = ?\n"
                + "      ,[image] =?\n"
                + " WHERE idStudents = ? ";

        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
//            ps.setString(1, stu.getId());
            ps.setString(1, stu.getFullname());
            ps.setString(2, stu.getEmail());
            ps.setString(3, stu.getPhone());
            ps.setInt(4, stu.getGender());
            ps.setString(5, stu.getAddress());

            if (stu.getImage() != null) {
                Blob img = new SerialBlob(stu.getImage());
                ps.setBlob(6, img);
            } else {
                Blob img = null;
                ps.setBlob(6, img);
            }
            ps.setString(7, stu.getId());

            return ps.executeUpdate() > 0;

        }

    }

    public boolean delete(String id) throws Exception {
        String query = "DELETE FROM [dbo].[Students]\n"
                + "      WHERE idStudents = ?";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setString(1, id);

            return ps.executeUpdate() > 0;
        }
    }

    public Student findById(String id) throws Exception {
        String query = "select  * from Students where idStudents=?";

        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setString(1, id);

            try ( ResultSet rs = ps.executeQuery();) {
                Student stu = new Student();
                if (rs.next()) {
                    stu.setId(rs.getString(1));
                    stu.setFullname(rs.getString(2));
                    stu.setEmail(rs.getString(3));
                    stu.setPhone(rs.getString(4));
                    stu.setGender(rs.getInt(5));
                    stu.setAddress(rs.getString(6));
                    Blob blob = rs.getBlob(7);
                    if (blob != null) {
                        stu.setImage(blob.getBytes(1, (int) blob.length()));
                    }
                    return stu;
                }
            }

        }

        return null;
    }
}
