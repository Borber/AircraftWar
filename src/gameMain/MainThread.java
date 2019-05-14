package gameMain;

import com.borber.game.obj.EnemyObj;
import com.borber.game.ui.startFrame.StartFrame;
import com.borber.toolkits.preparation;

import static com.borber.globalConstant.For_Game.ENEMY_OBJ;
import static com.borber.globalConstant.For_Game.ENEMY_SGIN;

/**
 * @author BORBER
 */

public class MainThread {
    public static void main(String[] args) {
        preparation.PREPARATION();
        new StartFrame();
        ENEMY_OBJ[0] = new EnemyObj(3);
        ENEMY_SGIN[0] = true;

    }
}
