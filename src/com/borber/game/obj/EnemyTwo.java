package com.borber.game.obj;

import java.awt.*;
import java.util.Random;

import static com.borber.globalConstant.For_Game.ENEMY_LEVEL2;
import static com.borber.globalConstant.For_UI.GAME_HEIGHT;
import static com.borber.globalConstant.For_UI.GAME_WIDTH;

public class EnemyTwo extends ObjFather{
    public EnemyTwo(){
        y = -90;
        speed = 4;
        width = 70;
        height = 80;
        life = 6;
        body = ENEMY_LEVEL2;
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
