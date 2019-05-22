package com.borber.toolkits;


import com.borber.globalConstant.For_Game;

import javax.swing.*;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.borber.globalConstant.For_Game.*;
import static com.borber.globalConstant.For_SQL.*;

public class SQL_Command {

    public static boolean userCheck(String name) {
        try {
            PST = CONN.prepareStatement(FindUser_SQL);
            PST.setString(1, name);
            RS = PST.executeQuery();
            if (RS.next()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean SignUp(String name, String password, String email, String telephone, String country) {
        int IDN = 0;
        try {
            PST = CONN.prepareStatement(GetLastID_SQL);
            RS = PST.executeQuery();
            if (RS.next()) {
                IDN = RS.getInt(1) + 1;
            }
            PST = CONN.prepareStatement(AddUser_SQL);
            PST.setInt(1, IDN);
            PST.setString(2, name);
            PST.setString(3, password);
            PST.setString(4, email);
            PST.setString(5, telephone);
            PST.setString(6, country);
            int n = PST.executeUpdate();
            if (n > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    private static void loginTime(String sql,int UID) {
        try {
            PST = CONN.prepareStatement(sql);
            PST.setInt(1, UID);
            Date d = new Date();
            SimpleDateFormat S = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String Time = S.format(d.getTime());
            PST.setString(2, Time);
            int n = PST.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static boolean SignIn(String name, String password, String sql) {
        try {
            PST = CONN.prepareStatement(sql);
            PST.setString(1, name);
            PST.setString(2, password);
            RS = PST.executeQuery();
            if (RS.next()) {
                For_Game.userID = RS.getInt(1);
                PST = CONN.prepareStatement(lastLoginTime_SQL);
                PST.setInt(1, For_Game.userID);
                RS = PST.executeQuery();
                if (RS.next()) {
                    lastLoginTime = RS.getString(1);
                }
                loginTime(loginTime_SQL,userID);
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean scoreUp() {
        try {
            PST = CONN.prepareStatement(scoreUpdate);
            PST.setInt(1, userID);
            PST.setInt(2, SCORE);
            int n = PST.executeUpdate();
            if (n > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean Global_Ranking() {
        try {
            PST = CONN.prepareStatement(GLOBAL_RANK);
            RS = PST.executeQuery();
            int i = 0;
            while (RS.next()) {
                SCORE_RANK[i++] = "" + RS.getInt(2) + "(" + RS.getString(1) + ")";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean Admin_SignIn(String name, String password, String sql) {
        try {
            PST = CONN.prepareStatement(sql);
            PST.setString(1, name);
            PST.setString(2, password);
            RS = PST.executeQuery();
            if (RS.next()) {
                For_Game.adminID = RS.getInt(1);
                PST = CONN.prepareStatement(AdminLastLoginTime_SQL);
                PST.setInt(1, adminID);
                RS = PST.executeQuery();
                if (RS.next()) {
                    adminLastLoginTime = RS.getString(1);
                }
                loginTime(AdminLogin_SQL,adminID);
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public static void deleteUser(int ID){
        try {
            PST = CONN.prepareStatement(DELETE_USER);
            PST.setInt(1,ID);
            PST.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
