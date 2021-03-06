package com.borber.toolkits;

import com.borber.game.ui.gameFrame.GameFrameBeta;
import com.borber.game.ui.gameFrame.GameOverFrame;
import com.borber.game.ui.gameFrame.GameStopedFrame;
import com.borber.game.ui.registerFrame.RegisterFrame;


import java.net.MalformedURLException;
import java.net.URL;

import static com.borber.globalConstant.For_Game.*;
import static com.borber.globalConstant.For_SQL.CONN;

public class preparation {
    public static void PREPARATION(){
        //For file
        try {
            hurt = new URL("file:BGM//hurt.wav").getPath();
            dieBGM = new URL("file:BGM//die.wav").getPath();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


        //For SQL

        CONN = new connectSQL().conSql();

        gameStopedFrame = new GameStopedFrame();
        registerFrame = new RegisterFrame();
    }
}
