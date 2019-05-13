/*
 * Created by JFormDesigner on Mon May 13 12:59:54 CST 2019
 */

package com.borber.game.ui.gameFrame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import static com.borber.globalConstant.For_Game.gameFrameBeta;

/**
 * @author BORBER
 */
public class GameStopedFrame extends JFrame {
    public GameStopedFrame() {
        initComponents();
    }

    private void restartButtonMouseClicked(MouseEvent e) {
        System.out.println("未完成");
    }

    private void continueButtonMouseClicked(MouseEvent e) {
        setVisible(false);
        gameFrameBeta.setVisible(true);
    }

    private void exitButtonMouseClicked(MouseEvent e) {
        System.exit(0);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        restartButton = new JLabel();
        continueButton = new JLabel();
        exitButton = new JLabel();
        exitImg = new JLabel();
        continueImg = new JLabel();
        restartImg = new JLabel();
        label1 = new JLabel();

        //======== this ========
        setUndecorated(true);
        setVisible(true);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- restartButton ----
        restartButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                restartButtonMouseClicked(e);
            }
        });
        contentPane.add(restartButton);
        restartButton.setBounds(195, 185, 90, 90);

        //---- continueButton ----
        continueButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                continueButtonMouseClicked(e);
            }
        });
        contentPane.add(continueButton);
        continueButton.setBounds(200, 410, 80, 80);

        //---- exitButton ----
        exitButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                exitButtonMouseClicked(e);
            }
        });
        contentPane.add(exitButton);
        exitButton.setBounds(195, 625, 80, 80);

        //---- exitImg ----
        exitImg.setIcon(new ImageIcon(getClass().getResource("/img/pre/exit.png")));
        contentPane.add(exitImg);
        exitImg.setBounds(new Rectangle(new Point(175, 595), exitImg.getPreferredSize()));

        //---- continueImg ----
        continueImg.setIcon(new ImageIcon(getClass().getResource("/img/pre/continue.png")));
        contentPane.add(continueImg);
        continueImg.setBounds(new Rectangle(new Point(185, 395), continueImg.getPreferredSize()));

        //---- restartImg ----
        restartImg.setIcon(new ImageIcon(getClass().getResource("/img/pre/restart.png")));
        contentPane.add(restartImg);
        restartImg.setBounds(new Rectangle(new Point(200, 185), restartImg.getPreferredSize()));

        //---- label1 ----
        label1.setIcon(new ImageIcon(getClass().getResource("/img/bg.png")));
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(0, 0), label1.getPreferredSize()));

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel restartButton;
    private JLabel continueButton;
    private JLabel exitButton;
    private JLabel exitImg;
    private JLabel continueImg;
    private JLabel restartImg;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
