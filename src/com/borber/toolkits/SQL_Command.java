package com.borber.toolkits;

import javax.swing.*;
import java.sql.SQLException;

import static com.borber.globalConstant.For_SQL.*;

public class SQL_Command {

    public static boolean userCheck(String name){
        try {
            PST = CONN.prepareStatement(FindUser_SQL);
            PST.setString(1,name);
            RS = PST.executeQuery();
            if(RS.next()){
               return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public static boolean SignUp(String name,String password,String email,String telephone,String country){
        int ID = 0;
        try {
            PST = CONN.prepareStatement(GetLastID_SQL);
            RS = PST.executeQuery();
            if(RS.next()){
                ID = RS.getInt(1) + 1;
            }
            PST = CONN.prepareStatement(AddUser_SQL);
            PST.setInt(1,ID);
            PST.setString(2,name);
            PST.setString(3,password);
            PST.setString(4,email);
            PST.setString(5,telephone);
            PST.setString(6,country);
            int n = PST.executeUpdate();
            if(n > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean SignIn(String name,String password){
        try {
            PST = CONN.prepareStatement(SignIn_SQL);
            PST.setString(1,name);
            PST.setString(2,password);
            RS = PST.executeQuery();
            if(RS.next()){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

}
