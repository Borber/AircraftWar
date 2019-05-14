package com.borber.game.ui.gameFrame;

import com.borber.game.obj.BulletObj;
import com.borber.toolkits.GameUtil;

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
        ++SCORE;
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
    }
    public static void drawEnemy(Graphics g){
        for(int i = 0;i < EnemyN;++i){
            if(ENEMY_SGIN[i] && ENEMY_OBJ[i].die){
                ENEMY_SGIN[i] = false;
            }
            if(ENEMY_SGIN[i]){
                ENEMY_OBJ[i].drawSelf(g);
            }
        }
    }

    public static void drawBullet(Graphics g){
        for (int i = 0; i < BULLETN; ++i) {
            if(BULLET_SIGN[i] && BULLET_OBJ[i].die){
                BULLET_SIGN[i] = false;
            }
            if(BULLET_SIGN[i]){
                BULLET_OBJ[i].drawSelf(g);
            }
        }
    }
}
