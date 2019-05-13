package com.borber.globalConstant;

import com.borber.toolkits.connectSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class For_SQL {public final static String loginSQL = "select * from user where name = ? and password = ?;";
    public final static String mysqlName = "BORBER";
    public final static String mysqlPass = "907089";
    public final static String mysqlURL = "jdbc:mysql://107.172.140.183:3306/testJavaCon";
    public final static String mysqlClass = "com.mysql.cj.jdbc.Driver";
    public final static String GetLastID_SQL = "SELECT ID FROM user ORDER BY ID DESC LIMIT 1;";
    public final static String AddUser_SQL = "insert into user value (?,?,?,?,?,?);";
    public final static String SignIn_SQL = "select ID from user where name = ? and password = ?;";

    public static Connection CONN = null;
    public static PreparedStatement PST = null;
    public static ResultSet RS = null;

}
