/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vandu.dao;

import com.vandu.context.DBContext;
import com.vandu.model.Grade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Văn Dự
 */
public class GradeDao {

    public List<Grade> getTopStudents(int top) throws ClassNotFoundException, SQLException {
        String query = "SELECT TOP (" + top + ") [id]\n"
                + "      ,[idStudent]\n"
                + "	  ,fullname\n"
                + "      ,[english]\n"
                + "      ,[java]\n"
                + "      ,[sqlSever],\n"
                + "	  (english+java+sqlSever)/3 as DTB\n"
                + "  FROM [QLSV].[dbo].[Grade] a inner join Students b on a.idStudent=b.idStudents\n"
                + "  order by DTB desc";

        try ( Connection con = DBContext.getConnection();  Statement sta = con.createStatement();) {
            ResultSet rs = sta.executeQuery(query);
            List<Grade> list = new ArrayList<>();
            while (rs.next()) {
                Grade g = new Grade();
                g.setId(rs.getInt(1));
                g.setIdStudent(rs.getString(2));
                g.setFullname(rs.getString(3));
                g.setEnglish(rs.getDouble(4));
                g.setJava(rs.getDouble(5));
                g.setSql(rs.getDouble(6));
                g.setAvg(rs.getDouble(7));

                list.add(g);

            }
            rs.close();
            return list;
        }

    }

    public List<Grade> getAllGrade() throws ClassNotFoundException, SQLException {
        String query = "SELECT [id]\n"
                + "      ,[idStudent]\n"
                + "	  ,fullname\n"
                + "      ,[english]\n"
                + "      ,[java]\n"
                + "      ,[sqlSever],\n"
                + "	  (english+java+sqlSever)/3 as DTB\n"
                + "  FROM [QLSV].[dbo].[Grade] a inner join Students b on a.idStudent=b.idStudents\n";

        try ( Connection con = DBContext.getConnection();  Statement sta = con.createStatement();) {
            ResultSet rs = sta.executeQuery(query);
            List<Grade> list = new ArrayList<>();
            while (rs.next()) {
                Grade g = new Grade();
                g.setId(rs.getInt(1));
                g.setIdStudent(rs.getString(2));
                g.setFullname(rs.getString(3));
                g.setEnglish(rs.getDouble(4));
                g.setJava(rs.getDouble(5));
                g.setSql(rs.getDouble(6));
                g.setAvg(rs.getDouble(7));

                list.add(g);

            }
            rs.close();
            return list;

        }
    }

    public boolean insert(Grade g) throws ClassNotFoundException, SQLException {
        String query = "INSERT INTO [dbo].[Grade]\n"
                + "           ([idStudent]\n"
                + "           ,[english]\n"
                + "           ,[java]\n"
                + "           ,[sqlSever])\n"
                + "     VALUES(?,?,?,?)";

        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, g.getIdStudent());
            ps.setDouble(2, g.getEnglish());
            ps.setDouble(3, g.getJava());
            ps.setDouble(4, g.getSql());
            return ps.executeUpdate() > 0;
        }

    }

    public boolean update(Grade g) throws ClassNotFoundException, SQLException {
        String query = "UPDATE [dbo].[Grade]\n"
                + "      Set [english] = ?\n"
                + "      ,[java] = ?\n"
                + "      ,[sqlSever] = ?\n"
                + " WHERE [idStudent] =?";

        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setDouble(1, g.getEnglish());
            ps.setDouble(2, g.getJava());
            ps.setDouble(3, g.getSql());
            ps.setString(4, g.getIdStudent());

            return ps.executeUpdate() > 0;
        }
    }

    public boolean delete(String id) throws ClassNotFoundException, SQLException {
        String query = "DELETE FROM [dbo].[Grade]\n"
                + "      WHERE idStudent=?";

        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, id);

            return ps.executeUpdate() > 0;
        }
    }

    public Grade findById(String id) throws ClassNotFoundException, SQLException {
        String query = "select [idStudent],[english],[java],[sqlSever],fullname,(english+java+sqlSever)/3 from Grade a inner join Students b on a.idStudent=b.idStudents\n"
                + "where [idStudent] =  ?";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, id);

            try ( ResultSet rs = ps.executeQuery();) {
                Grade g = new Grade();

                if (rs.next()) {
                    g.setIdStudent(rs.getString(1));
                    g.setEnglish(rs.getDouble(2));
                    g.setJava(rs.getDouble(3));
                    g.setSql(rs.getDouble(4));
                    g.setFullname(rs.getString(5));
                    g.setAvg(rs.getDouble(6));
                    return g;
                }
            }

        }
        return null;
    }

    public Grade findByIdTopGradeTop(String id, int top) throws ClassNotFoundException, SQLException {
        String query = "SELECT TOP (" + top + ") [id]\n"
                + "      ,[idStudent]\n"
                + "	  ,fullname\n"
                + "      ,[english]\n"
                + "      ,[java]\n"
                + "      ,[sqlSever],\n"
                + "	  (english+java+sqlSever)/3 as DTB\n"
                + "  FROM [QLSV].[dbo].[Grade] a inner join Students b on a.idStudent=b.idStudents\n"
                + "  order by DTB desc"
                + "where [idStudent] =  ?";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, id);

            ResultSet rs = ps.executeQuery();

            Grade g = new Grade();

            if (rs.next()) {
                g.setIdStudent(rs.getString(1));
                g.setEnglish(rs.getDouble(2));
                g.setJava(rs.getDouble(3));
                g.setSql(rs.getDouble(4));
                g.setFullname(rs.getString(5));
                g.setAvg(rs.getDouble(6));
                return g;
            }
            rs.close();

        }
        return null;
    }

}
