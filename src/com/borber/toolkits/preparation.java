package com.borber.toolkits;

import com.borber.game.ui.gameFrame.GameFrameBeta;
import com.borber.game.ui.gameFrame.GameStopedFrame;


import static com.borber.globalConstant.For_Game.*;
import static com.borber.globalConstant.For_SQL.CONN;

public class preparation {
    public static void PREPARATION(){

        //For SQL

        CONN = new connectSQL().conSql();

        gameStopedFrame = new GameStopedFrame();
    }
}
