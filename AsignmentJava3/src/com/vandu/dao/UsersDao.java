/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vandu.dao;

import com.vandu.context.DBContext;
import com.vandu.model.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Văn Dự
 */
public class UsersDao {

    public static Users checkLogin(String username, String password) throws Exception {
        String query = "select * from Users where username=? and password=?";

        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setString(1, username);
            ps.setString(2, password);

            try ( ResultSet result = ps.executeQuery()) {
                Users user = new Users();
                if (result.next()) {
                    user.setUsername(username);
                    user.setRole(result.getString("role"));
                    return user;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

}
