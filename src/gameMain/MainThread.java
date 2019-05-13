package gameMain;

import com.borber.game.ui.startFrame.StartFrame;
import com.borber.toolkits.preparation;

/**
 * @author BORBER
 */

public class MainThread {
    public static void main(String[] args) {
        preparation.PREPARATION();
        new StartFrame();
    }
}
