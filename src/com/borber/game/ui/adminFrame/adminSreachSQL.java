package com.borber.game.ui.adminFrame;

import com.borber.toolkits.connectSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.borber.globalConstant.For_SQL.*;

public class adminSreachSQL {
    PreparedStatement PST = null;
    ResultSet RS = null;
    ResultSet RSS = null;
    String[][] Result = null;

    private void real() throws SQLException {
        RS = PST.executeQuery();
        int columns = 0;
        while (RS.next()){
            Result[columns][0] = String.valueOf(RS.getInt(1));
            for(int i = 1;i < 6;++i){
                Result[columns][i] = RS.getString(i+1);
            }
            PST = CONN.prepareStatement(GetMaxScore);
            PST.setInt(1,Integer.valueOf(Result[columns][0]));
            RSS = PST.executeQuery();
            if(RSS.next()){
                Result[columns][6] = String.valueOf(RSS.getInt(1));
            }
            ++columns;
        }
    }
    public String[][] sreach(){
        try {
            PST = CONN.prepareStatement(SreachAll);
            RS = PST.executeQuery();
            int row = 0;
            while (RS.next()){
                ++row;
            }
            Result = new  String[row][7];
            PST = CONN.prepareStatement(SreachAll);
            real();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Result;
    }
    public String[][] sreach(String Key){
        try {
            PST = CONN.prepareStatement(SreachUser);
            PST.setString(1,Key+"%");
            RS = PST.executeQuery();
            int row = 0;
            while (RS.next()){
                ++row;
            }
            Result = new  String[row][7];
            PST = CONN.prepareStatement(SreachUser);
            PST.setString(1,Key+"%");
            real();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Result;
    }
}
