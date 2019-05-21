package com.borber.globalConstant;

import com.borber.toolkits.connectSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class For_SQL {
    public final static String loginSQL = "select * from user where name = ? and password = ?;";
    public final static String mysqlName = "BORBER";
    public final static String mysqlPass = "907089";
    public final static String mysqlURL = "jdbc:mysql://107.172.140.183:3306/testJavaCon";
    public final static String mysqlClass = "com.mysql.cj.jdbc.Driver";
    public final static String GetLastID_SQL = "SELECT ID FROM user ORDER BY ID DESC LIMIT 1;";
    public final static String AddUser_SQL = "insert into user value (?,?,?,?,?,?);";
    public final static String SignIn_SQL = "select ID from user where name = ? and password = ?;";
    public final static String FindUser_SQL = "select ID from user where name = ?;";
    public final static String lastLoginTime_SQL = ("select loginTime from loginTime where ID = ? order by loginTime desc limit 1;");
    public final static String AdminLastLoginTime_SQL = ("select LoginTime from adminLoginTime where ID = ? order by LoginTime desc limit 1;");
    public final static String loginTime_SQL = "INSERT INTO loginTime value (?,?);";
    public final static String AdminLogin_SQL = "INSERT INTO adminLoginTime value (?,?);";
    public final static String scoreUpdate = "INSERT INTO score value (?,?);";
    public final static String GLOBAL_RANK = "select u.name,s.score from user as u,score as s where u.ID = s.ID order by score desc limit 5;";
    public final static String SreachUser = "select * from user where name like ?;";
    public final static String SreachAll = "select * from user;";
    public final static String GetMaxScore = "select MAX(score) from score where ID = ?;";
    public final static String Admin_SignIn_SQL = "select ID from admin where name = ? and password = ?;";
    public final static String DELETE_USER = "delete from user where ID =?;";
    public static String[] SCORE_RANK = new String[5];

    public static Connection CONN = null;
    public static PreparedStatement PST = null;
    public static ResultSet RS = null;

}
