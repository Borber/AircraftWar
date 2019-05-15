package com.borber.globalConstant;

import com.borber.game.obj.*;
import com.borber.game.ui.gameFrame.GameFrameBeta;
import com.borber.game.ui.gameFrame.GameStopedFrame;
import com.borber.game.ui.registerFrame.RegisterFrame;
import com.borber.toolkits.GameUtil;

import java.awt.*;

import static com.borber.globalConstant.For_UI.GAME_HEIGHT;

public class For_Game {
    public final static Image PLANE_ONE = GameUtil.getImage("img/images/me1.png");
    public final static Image PLANE_TWO = GameUtil.getImage("img/images/me2.png");
    public final static Image BULLET_ONE = GameUtil.getImage("img/images/bullet1.png");
    public final static Image ENEMY_LEVEL1 = GameUtil.getImage("img/images/enemy1.png");
    public final static Image ENEMY_LEVEL2 = GameUtil.getImage("img/images/enemy2.png");
    public final static Image ENEMY_LEVEL3_ONE = GameUtil.getImage("img/images/enemy3_n1.png");
    public final static Image ENEMY_LEVEL3_TWO = GameUtil.getImage("img/images/enemy3_n2.png");
    public final static Image PLANE_LIFE = GameUtil.getImage("img/images/life.png");
    public static int SCORE = 100;
    public static int BG1_Y = 0;
    public static int BG2_Y = -GAME_HEIGHT;
    /**
     * 对象实例化 全局变量 放在最后
     */

    public static int userID = 0;
    public static String lastLoginTime = null;


    public static int TIME = 0;
    public static PlaneObj PLANE_OBJ = new PlaneObj();
    public static BackGroundObj BG_ONE = new BackGroundObj(BG1_Y);
    public static BackGroundObj BG_TWO = new BackGroundObj(BG2_Y);
    public static GameFrameBeta gameFrameBeta = null;
    public static GameStopedFrame gameStopedFrame = null;
    public static RegisterFrame registerFrame = null;

    public static int EnemyN = 6;
    public static boolean[] ENEMY_ONE_SGIN = new boolean[EnemyN];
    public static EnemyOne[] ENEMY_ONE_OBJ = new EnemyOne[EnemyN];
    public static boolean[] ENEMY_TWO_SGIN = new boolean[EnemyN];
    public static EnemyTwo[] ENEMY_TWO_OBJ = new EnemyTwo[EnemyN];
    public static boolean[] ENEMY_THREE_SGIN = new boolean[EnemyN];
    public static EnemyThree[] ENEMY_THREE_OBJ = new EnemyThree[EnemyN];

    public static int BULLETN = 30;
    public static int BULLETSPEED = 25;
    public static boolean[] BULLET_SIGN = new boolean[BULLETN];
    public static BulletObj[] BULLET_OBJ = new BulletObj[BULLETN];
}
