package com.borber.globalConstant;

public class For_SQL {public final static String loginSQL = "select * from user where name = ? and password = ?;";
    public final static String adminSQL = "select * from admin where name = ? and password = ?;";
    public final static String getIDSQL = "select MAX(ID) from user;";
    public final static String nameDiff = "select * from user where name = ?;";
    public final static String addUser = "insert into user value (?,?,?,?,?);";
    public final static String mariadbName = "root";
    public final static String mariadbPass = "907089";
    public final static String mariadbURL = "jdbc:mariadb://localhost:3306/testJavaConnection";
    public final static String mariadbClass = "org.mariadb.jdbc.Driver";
    public final static String mysqlName = "BORBER";
    public final static String mysqlPass = "907089";
    public final static String mysqlURL = "jdbc:mysql://107.172.140.183:3306/testJavaCon";
    public final static String mysqlClass = "com.mysql.jdbc.Driver";
    public final static String adminSeeAll = "select * from user;";
    public final static String adminSreach = "select * from user where name like ?;";
    public final static String getLastTimeSQL = "select * from loginTime where ID = ? order by loginTime desc limit 1;";
    public final static String addDate = "insert into loginTime value (?,?);";
}
