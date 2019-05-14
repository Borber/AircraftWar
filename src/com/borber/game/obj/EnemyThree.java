package com.borber.game.obj;

import java.awt.*;
import java.util.Random;

import static com.borber.globalConstant.For_Game.ENEMY_LEVEL3_ONE;
import static com.borber.globalConstant.For_Game.ENEMY_LEVEL3_TWO;
import static com.borber.globalConstant.For_UI.GAME_HEIGHT;
import static com.borber.globalConstant.For_UI.GAME_WIDTH;

public class EnemyThree extends ObjFather{
    public EnemyThree(){
        y = -100;
        speed = 2;
        width = 170;
        height = 250;
        life = 10;
        body = ENEMY_LEVEL3_ONE;
        x = new Random().nextInt(GAME_WIDTH - width);
    }

    @Override
    public void drawSelf(Graphics g) {
        super.drawSelf(g);
        if(body == ENEMY_LEVEL3_ONE){
            body = ENEMY_LEVEL3_TWO;
        }else {
            body = ENEMY_LEVEL3_ONE;
        }
        y += speed;
        if(y > GAME_HEIGHT){
            dieSelf();
        }
    }
}
