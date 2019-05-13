package com.borber.game.obj;

import java.awt.*;

import static com.borber.globalConstant.For_UI.BACK_GROUND;
import static com.borber.globalConstant.For_UI.GAME_HEIGHT;

public class BackGroundObj extends ObjFather {
    public BackGroundObj(int y){
        body = BACK_GROUND;
        this.y = y;
    }

    @Override
    public void drawSelf(Graphics g) {
        super.drawSelf(g);
        if(++y > GAME_HEIGHT){
            y = -GAME_HEIGHT;
        }
    }
}
