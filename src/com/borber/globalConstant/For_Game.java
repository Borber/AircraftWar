package com.borber.globalConstant;

import com.borber.game.obj.BackGroundObj;
import com.borber.game.obj.PlaneObj;
import com.borber.game.ui.RegisterFrame;
import com.borber.game.ui.gameFrame.GameFrameBeta;
import com.borber.game.ui.gameFrame.GameStopedFrame;
import com.borber.game.ui.startFrame.StartFrame;
import com.borber.toolkits.GameUtil;

import java.awt.*;

import static com.borber.globalConstant.For_UI.GAME_HEIGHT;

public class For_Game {
    public final static Image PLANE_ONE = GameUtil.getImage("img/images/me1.png");
    public final static Image PLANE_TWO = GameUtil.getImage("img/images/me2.png");
    public final static Image ENEMY_LEVEL1 = GameUtil.getImage("img/images/enemy1.png");
    public final static Image PLANE_LIFE = GameUtil.getImage("img/images/life.png");

    public static int SCORE = 100;
    public static int BG1_Y = 0;
    public static int BG2_Y = -GAME_HEIGHT;
    /**
     * 对象实例化 全局变量 放在最后
     */
    public static PlaneObj PLANE_OBJ = new PlaneObj();
    public static BackGroundObj BG_ONE = new BackGroundObj(BG1_Y);
    public static BackGroundObj BG_TWO = new BackGroundObj(BG2_Y);
    public static GameFrameBeta gameFrameBeta = null;
//    public static EnemyObj[] ENEMY_OBJ = new EnemyObj[6];
}
