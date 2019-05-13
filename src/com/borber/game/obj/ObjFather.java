package com.borber.game.obj;

import java.awt.*;
import java.util.Random;

public class ObjFather {
    int x,y,speed,width,height,life,level;
    boolean die;
    Image body;
    public ObjFather(){

    }

    public void dieSelf(){
        x = 0;
        y = 0;
        speed = 0;
        width = 0;
        height = 0;
    }
    public void drawSelf(Graphics g){
        g.drawImage(body,x,y,null);
    }
    public Rectangle getRect(){
        return new Rectangle(x,y,width,height);
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
