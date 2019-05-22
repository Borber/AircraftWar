package com.borber.game.ui.gameFrame;

import com.borber.game.obj.BulletObj;
import com.borber.game.obj.EnemyOne;
import com.borber.game.obj.EnemyThree;
import com.borber.game.obj.EnemyTwo;
import com.borber.toolkits.GameUtil;
import com.borber.toolkits.PlayMusic;

import java.awt.*;

import static com.borber.globalConstant.For_Game.*;
import static com.borber.globalConstant.For_UI.*;

public class DrawItems {
    public static void drawLife(Graphics g){
        for(int i=1;i <= PLANE_OBJ.getLife();++i){
            g.drawImage(PLANE_LIFE,GAME_WIDTH - 50*i,15,null);
        }
    }

    public static void drawScore(Graphics g){
        int n = SCORE;
        Image num;
        if(n == 0){
            num = GameUtil.getImage("img/num/0.png");
            g.drawImage(num,50,15,null);
        }
        int m = 0;
        while (n > 0){
            ++m;
            n /= 10;
        }
        n = SCORE;
        for (int i=m;i > 0;--i){
            num = GameUtil.getImage("img/num/"+n%10+".png");
            g.drawImage(num,10+25*i,10,null);
            n /= 10;
        }

    }

    public static void drawBackGround(Graphics g){
        BG_ONE.drawSelf(g);
        BG_TWO.drawSelf(g);

        // 时间的处理

        ++TIME;
        if(TIME % BULLETSPEED == 0){
            for (int i = 0;i < BULLETN;++i){
                if(!BULLET_SIGN[i]){
                    BULLET_SIGN[i] = true;
                    BULLET_OBJ[i] = new BulletObj();
                    break;
                }
            }
        }
        if(TIME % 50 == 0){
            for(int i = 0;i < EnemyN;++i){
                if(!ENEMY_ONE_SGIN[i]){
                    ENEMY_ONE_SGIN[i] = true;
                    ENEMY_ONE_OBJ[i] = new EnemyOne();
                    break;
                }
            }
        }
        if(TIME % 250 == 0){
            for(int i=0;i < EnemyN;++i){
                if(!ENEMY_TWO_SGIN[i]){
                    ENEMY_TWO_SGIN[i] = true;
                    ENEMY_TWO_OBJ[i] = new EnemyTwo();
                    break;
                }
            }
        }
        if(TIME % 500 == 0){
            for (int i=0;i < EnemyN;++i){
                if(!ENEMY_THREE_SGIN[i]){
                    ENEMY_THREE_SGIN[i] = true;
                    ENEMY_THREE_OBJ[i] = new EnemyThree();
                    break;
                }
            }
        }
    }

    public static void drawEnemy(Graphics g){
        for(int i=0;i < EnemyN;++i){
            if(ENEMY_ONE_SGIN[i] && ENEMY_ONE_OBJ[i].die){
                ENEMY_ONE_SGIN[i] = false;
            }
            if(ENEMY_ONE_SGIN[i]){
                ENEMY_ONE_OBJ[i].drawSelf(g);
            }
            if(ENEMY_TWO_SGIN[i] && ENEMY_TWO_OBJ[i].die){
                ENEMY_TWO_SGIN[i] = false;
            }
            if(ENEMY_TWO_SGIN[i]){
                ENEMY_TWO_OBJ[i].drawSelf(g);
            }
            if(ENEMY_THREE_SGIN[i] && ENEMY_THREE_OBJ[i].die){
                ENEMY_THREE_SGIN[i] = false;
            }
            if(ENEMY_THREE_SGIN[i]){
                ENEMY_THREE_OBJ[i].drawSelf(g);
            }
        }
    }
    public static void drawBullet(Graphics g){
        for (int i = 0; i < BULLETN; ++i) {
            if(BULLET_SIGN[i] && BULLET_OBJ[i].die){
                BULLET_SIGN[i] =false;
            }
            if(BULLET_SIGN[i]){
                BULLET_OBJ[i].drawSelf(g);
            }
        }
    }
    public static void KILL(){
        for (int i = 0; i < EnemyN; ++i) {
            if(ENEMY_ONE_SGIN[i]){
                for (int j = 0; j < BULLETN; ++j) {
                    if(BULLET_SIGN[j] && ENEMY_ONE_OBJ[i].getRect().intersects(BULLET_OBJ[j].getRect())) {
                        ENEMY_ONE_OBJ[i].setLife(ENEMY_ONE_OBJ[i].getLife() - 1);
                        if(ENEMY_ONE_OBJ[i].getLife() == 0){
                            ENEMY_ONE_SGIN[i] = false;
                            ENEMY_ONE_OBJ[i].dieSelf();
                        }
                        BULLET_SIGN[j] = false;
                        BULLET_OBJ[j].dieSelf();
                        SCORE += 1;
                        break;
                    }
                }
                if(ENEMY_ONE_OBJ[i].getRect().intersects(PLANE_OBJ.getRect())){

                    ENEMY_ONE_SGIN[i] = false;
                    ENEMY_ONE_OBJ[i].dieSelf();
                    PLANE_OBJ.setLife(PLANE_OBJ.getLife() - 1);
                    SCORE += 1;
                }
            }
            if(ENEMY_TWO_SGIN[i]){
                for (int j = 0; j < BULLETN; ++j) {
                    if(BULLET_SIGN[j] && ENEMY_TWO_OBJ[i].getRect().intersects(BULLET_OBJ[j].getRect())) {
                        ENEMY_TWO_OBJ[i].setLife(ENEMY_TWO_OBJ[i].getLife() - 1);
                        if(ENEMY_TWO_OBJ[i].getLife() == 0){
                            ENEMY_TWO_SGIN[i] = false;
                            ENEMY_TWO_OBJ[i].dieSelf();
                        }
                        BULLET_SIGN[j] = false;
                        BULLET_OBJ[j].dieSelf();
                        SCORE += 2;
                        break;
                    }
                }
                if(ENEMY_TWO_OBJ[i].getRect().intersects(PLANE_OBJ.getRect())){
                    ENEMY_TWO_SGIN[i] = false;
                    ENEMY_TWO_OBJ[i].dieSelf();
                    PLANE_OBJ.setLife(PLANE_OBJ.getLife() - 1);
                    SCORE += 2;
                }
            }
            if(ENEMY_THREE_SGIN[i]){
                for (int j = 0; j < BULLETN; ++j) {
                    if(BULLET_SIGN[j] && ENEMY_THREE_OBJ[i].getRect().intersects(BULLET_OBJ[j].getRect())) {
                        ENEMY_THREE_OBJ[i].setLife(ENEMY_THREE_OBJ[i].getLife() - 1);
                        if(ENEMY_THREE_OBJ[i].getLife() == 0){
                            ENEMY_THREE_SGIN[i] = false;
                            ENEMY_THREE_OBJ[i].dieSelf();
                        }
                        BULLET_SIGN[j] = false;
                        BULLET_OBJ[j].dieSelf();
                        SCORE += 3;
                        break;
                    }
                    if(ENEMY_THREE_OBJ[i].getRect().intersects(PLANE_OBJ.getRect())){
                        ENEMY_THREE_SGIN[i] = false;
                        ENEMY_THREE_OBJ[i].dieSelf();
                        PLANE_OBJ.setLife(PLANE_OBJ.getLife() - 1);
                        SCORE += 3;
                    }
                }
            }

        }
    }
}
