package com.borber.game.ui.adminFrame;


import com.borber.globalConstant.GlobalObject;

import javax.swing.*;

public class JTableOperation {

    public void reloadJTable(String key){
        String[][] rowData;
        if(key.length() == 0){
            rowData = new adminSreachSQL().sreach();
        }else {
            rowData = new adminSreachSQL().sreach(key);
        }
        JTable table=new JTable(rowData,JTableTitle);
        GlobalObject.setjTable(table);
        GlobalObject.getjScrollPane().setViewportView(table);
    }
    private String[] JTableTitle = {"ID","Username","Password","email","telephone","country","highestScore"};
}

