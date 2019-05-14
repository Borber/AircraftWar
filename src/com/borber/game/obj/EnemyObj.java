package com.borber.game.obj;

import java.awt.*;
import java.util.Random;

import static com.borber.globalConstant.For_Game.*;
import static com.borber.globalConstant.For_UI.GAME_HEIGHT;
import static com.borber.globalConstant.For_UI.GAME_WIDTH;

public class EnemyObj extends ObjFather{
    public EnemyObj(int levelN){
        die = false;
        switch (levelN){
            case 1:
                y = -30;
                speed = 7;
                width = 40;
                height = 40;
                body = ENEMY_LEVEL1;
                break;
            case 2:
                y = -90;
                speed = 4;
                width = 70;
                height = 80;
                body = ENEMY_LEVEL2;
                break;
            case 3:
                y = -100;
                speed = 2;
                width = 170;
                height = 250;
                body = ENEMY_LEVEL3;
                break;
                default:
                    break;
        }
        x = new Random().nextInt(GAME_WIDTH - width);
    }

    @Override
    public void drawSelf(Graphics g) {
        super.drawSelf(g);
        y += speed;
        if(y > GAME_HEIGHT){
            dieSelf();
        }
    }
}
