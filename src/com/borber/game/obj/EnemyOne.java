package com.borber.game.obj;

import java.awt.*;
import java.util.Random;

import static com.borber.globalConstant.For_Game.ENEMY_LEVEL1;
import static com.borber.globalConstant.For_UI.GAME_HEIGHT;
import static com.borber.globalConstant.For_UI.GAME_WIDTH;

public class EnemyOne extends ObjFather{
    public EnemyOne(){
        die = false;
        y = -30;
        speed = 6;
        width = 50;
        height = 40;
        life = 2;
        body = ENEMY_LEVEL1;
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
