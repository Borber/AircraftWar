package com.borber.toolkits;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.borber.globalConstant.For_SQL.*;

/**
 * 链接到数据库 可以使用变量 更改链接的具体数据库
 */
public class connectSQL {
    private Connection SJ = null;
    public Connection conSql(){
        try {
            Class.forName(mysqlClass);
            SJ = DriverManager.getConnection(mysqlURL, mysqlName, mysqlPass);
            if(SJ != null){
                System.out.println("链接成功");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("类不存在");
        } catch (SQLException e) {
            System.out.println("连接错误");
        }
        return SJ;
    }
}
