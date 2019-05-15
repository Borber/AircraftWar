/*
 * Created by JFormDesigner on Wed May 15 12:23:29 CST 2019
 */

package com.borber.game.ui.registerFrame;

import com.borber.game.ui.startFrame.StartFrame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import static com.borber.globalConstant.For_Game.registerFrame;

/**
 * @author BORBER
 */
public class registrationSuccess extends JFrame {
    public registrationSuccess() {
        initComponents();
    }

    private void exitButtonImgMouseClicked(MouseEvent e) {
        setVisible(false);
        registerFrame = new RegisterFrame();
        new StartFrame();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        success = new JLabel();
        exitButtonImg = new JLabel();
        background = new JLabel();

        //======== this ========
        setUndecorated(true);
        setVisible(true);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- success ----
        success.setText("Registration Success");
        success.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
        success.setForeground(Color.white);
        contentPane.add(success);
        success.setBounds(new Rectangle(new Point(130, 110), success.getPreferredSize()));

        //---- exitButtonImg ----
        exitButtonImg.setIcon(new ImageIcon(getClass().getResource("/img/button/exitImg.png")));
        exitButtonImg.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                exitButtonImgMouseClicked(e);
            }
        });
        contentPane.add(exitButtonImg);
        exitButtonImg.setBounds(new Rectangle(new Point(145, 185), exitButtonImg.getPreferredSize()));

        //---- background ----
        background.setIcon(new ImageIcon(getClass().getResource("/img/massg.png")));
        contentPane.add(background);
        background.setBounds(new Rectangle(new Point(0, 0), background.getPreferredSize()));

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
    private JLabel success;
    private JLabel exitButtonImg;
    private JLabel background;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
