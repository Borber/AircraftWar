package com.borber.game.obj;

import java.awt.*;
import java.awt.event.KeyEvent;

import static com.borber.globalConstant.For_Game.*;

/**
 * @author BORBER
 */
public class PlaneObj extends ObjFather{
    private static int flash = 0;
    public PlaneObj(){
        super();
        x = 200;
        y = 600;
        body = PLANE_ONE;
        life = 3;
        level = 1;
    }

    @Override
    public void drawSelf(Graphics g) {
        super.drawSelf(g);
        flash ++;
        if(flash == 7){
            if(body == PLANE_ONE) {
                body = PLANE_TWO;
            }else {
                body = PLANE_ONE;
            }
            flash = 0;
        }
    }
}
