package com.borber.game.obj;

import java.awt.*;

import static com.borber.globalConstant.For_Game.*;

public class BulletObj extends ObjFather{
    public BulletObj(){
        x = PLANE_OBJ.x + 50;
        y = PLANE_OBJ.y - 3;
        speed = 15;
        width = 5;
        height = 10;
        body = BULLET_ONE;
    }

    @Override
    public void drawSelf(Graphics g) {
        super.drawSelf(g);
        y -= speed;
        if(y < 0){
            dieSelf();
        }
    }
}
