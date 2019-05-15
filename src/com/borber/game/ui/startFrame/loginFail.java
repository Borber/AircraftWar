/*
 * Created by JFormDesigner on Wed May 15 12:43:45 CST 2019
 */

package com.borber.game.ui.startFrame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author BORBER
 */
public class loginFail extends JFrame {
    public loginFail() {
        initComponents();
    }

    private void exitMouseClicked(MouseEvent e) {
        setVisible(false);
        new StartFrame();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        MASS = new JLabel();
        exit = new JLabel();
        background = new JLabel();

        //======== this ========
        setIconImage(new ImageIcon(getClass().getResource("/img/massg.png")).getImage());
        setUndecorated(true);
        setVisible(true);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- MASS ----
        MASS.setText("Please check your username and password !");
        MASS.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
        MASS.setForeground(new Color(255, 51, 51));
        contentPane.add(MASS);
        MASS.setBounds(new Rectangle(new Point(45, 95), MASS.getPreferredSize()));

        //---- exit ----
        exit.setIcon(new ImageIcon(getClass().getResource("/img/button/exitImg.png")));
        exit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                exitMouseClicked(e);
            }
        });
        contentPane.add(exit);
        exit.setBounds(new Rectangle(new Point(150, 180), exit.getPreferredSize()));

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
    private JLabel MASS;
    private JLabel exit;
    private JLabel background;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
