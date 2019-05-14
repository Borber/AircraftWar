package com.borber.game.ui.gameFrame;

import com.borber.game.obj.BulletObj;
import com.borber.game.obj.EnemyOne;
import com.borber.game.obj.EnemyThree;
import com.borber.game.obj.EnemyTwo;

import java.awt.*;
import java.awt.event.*;

import static com.borber.globalConstant.For_Game.*;
import static com.borber.globalConstant.For_UI.*;

/**
 *
 * @author BORBER
 */

public class GameFrameBeta extends Frame {

    public GameFrameBeta(){
        SCORE = 0;
        TIME = 0;
        PLANE_OBJ.setLife(3);
        ENEMY_ONE_SGIN = new boolean[EnemyN];
        ENEMY_ONE_OBJ = new EnemyOne[EnemyN];
        ENEMY_TWO_SGIN = new boolean[EnemyN];
        ENEMY_TWO_OBJ = new EnemyTwo[EnemyN];
        ENEMY_THREE_SGIN = new boolean[EnemyN];
        ENEMY_THREE_OBJ = new EnemyThree[EnemyN];
        BULLET_SIGN = new boolean[BULLETN];
        BULLET_OBJ = new BulletObj[BULLETN];
        initComponents();
    }

    @Override
    public void paint(Graphics g) {
        DrawItems.drawBackGround(g);
        PLANE_OBJ.drawSelf(g);
        DrawItems.drawLife(g);
        DrawItems.drawScore(g);
        DrawItems.drawEnemy(g);
        DrawItems.drawBullet(g);
        DrawItems.KILL();
    }
    class PrintThread extends Thread {
        @Override
        public void run() {
            while (PLANE_OBJ.getLife() > 0) {
                repaint();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            new GameOverFrame();
        }
    }

    private void initComponents(){
        setUndecorated(true);
        setVisible(false);
        setSize(GAME_WIDTH,GAME_HEIGHT);
        setLocationRelativeTo(getOwner());
        listeners();
        new PrintThread().start();

    }

    private void listeners(){
        this.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                PLANE_OBJ.setX(e.getX() - 50);
                PLANE_OBJ.setY(e.getY() - 50);
            }
    });
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getButton() == MouseEvent.BUTTON3){
                    setVisible(false);
                    gameStopedFrame.setVisible(true);
                }
            }
        });
    }

    private Image offScreenImage = null;

    @Override

    public void update (Graphics g){
        if (offScreenImage == null) {
            offScreenImage = this.createImage(GAME_WIDTH,GAME_HEIGHT);
        }
        Graphics gOff = offScreenImage.getGraphics();
        paint(gOff);
        g.drawImage(offScreenImage, 0, 0, null);
    }
}
