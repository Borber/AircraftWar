package com.borber.game.obj;

import java.util.Random;

public class EnemyObj extends ObjFather{
    public EnemyObj(){
        x = new Random().nextInt();
    }
}
