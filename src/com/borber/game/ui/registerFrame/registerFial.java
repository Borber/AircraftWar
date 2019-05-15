/*
 * Created by JFormDesigner on Wed May 15 12:32:20 CST 2019
 */

package com.borber.game.ui.registerFrame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import static com.borber.globalConstant.For_Game.registerFrame;

/**
 * @author BORBER
 */
public class registerFial extends JFrame {
    public registerFial(String S) {
        initComponents();
        fial.setText(S);
    }

    private void exitMouseClicked(MouseEvent e) {
        setVisible(false);
        registerFrame.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        fial = new JLabel();
        exit = new JLabel();
        background = new JLabel();

        //======== this ========
        setVisible(true);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- fial ----
        fial.setText("Register Fail");
        fial.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 24));
        fial.setForeground(Color.red);
        fial.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(fial);
        fial.setBounds(55, 85, 375, fial.getPreferredSize().height);

        //---- exit ----
        exit.setIcon(new ImageIcon(getClass().getResource("/img/button/exitImg.png")));
        exit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                exitMouseClicked(e);
            }
        });
        contentPane.add(exit);
        exit.setBounds(new Rectangle(new Point(145, 185), exit.getPreferredSize()));

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
    private JLabel fial;
    private JLabel exit;
    private JLabel background;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
