/*
 * Created by JFormDesigner on Thu May 16 14:17:07 CST 2019
 */

package com.borber.game.ui.startFrame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author BORBER
 */
public class MembersIntroduction extends JFrame {
    public MembersIntroduction() {
        initComponents();
    }

    private void exitMouseClicked(MouseEvent e) {
        setVisible(false);
        new StartFrame();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        ljh = new JLabel();
        rzl = new JLabel();
        lzd = new JLabel();
        spr = new JLabel();
        Pete = new JLabel();
        David = new JLabel();
        BORBER = new JLabel();
        Spring = new JLabel();
        exit = new JLabel();
        bsckground = new JLabel();

        //======== this ========
        setVisible(true);
        setUndecorated(true);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- ljh ----
        ljh.setIcon(new ImageIcon(getClass().getResource("/img/us/Ljh.png")));
        contentPane.add(ljh);
        ljh.setBounds(new Rectangle(new Point(20, 15), ljh.getPreferredSize()));

        //---- rzl ----
        rzl.setIcon(new ImageIcon(getClass().getResource("/img/us/Rzl.png")));
        contentPane.add(rzl);
        rzl.setBounds(new Rectangle(new Point(230, 20), rzl.getPreferredSize()));

        //---- lzd ----
        lzd.setIcon(new ImageIcon(getClass().getResource("/img/us/Lzd.png")));
        contentPane.add(lzd);
        lzd.setBounds(new Rectangle(new Point(440, 25), lzd.getPreferredSize()));

        //---- spr ----
        spr.setIcon(new ImageIcon(getClass().getResource("/img/us/Spr.png")));
        contentPane.add(spr);
        spr.setBounds(new Rectangle(new Point(650, 30), spr.getPreferredSize()));

        //---- Pete ----
        Pete.setText("Pete");
        Pete.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
        Pete.setForeground(Color.black);
        contentPane.add(Pete);
        Pete.setBounds(new Rectangle(new Point(90, 380), Pete.getPreferredSize()));

        //---- David ----
        David.setText("David");
        David.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
        David.setForeground(new Color(153, 0, 153));
        contentPane.add(David);
        David.setBounds(new Rectangle(new Point(295, 375), David.getPreferredSize()));

        //---- BORBER ----
        BORBER.setText("BORBER");
        BORBER.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
        BORBER.setForeground(Color.cyan);
        contentPane.add(BORBER);
        BORBER.setBounds(new Rectangle(new Point(490, 375), BORBER.getPreferredSize()));

        //---- Spring ----
        Spring.setText("Spring");
        Spring.setForeground(new Color(255, 153, 51));
        Spring.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
        contentPane.add(Spring);
        Spring.setBounds(new Rectangle(new Point(710, 375), Spring.getPreferredSize()));

        //---- exit ----
        exit.setIcon(new ImageIcon(getClass().getResource("/img/button/exitImg.png")));
        exit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                exitMouseClicked(e);
            }
        });
        contentPane.add(exit);
        exit.setBounds(new Rectangle(new Point(340, 420), exit.getPreferredSize()));

        //---- bsckground ----
        bsckground.setIcon(new ImageIcon(getClass().getResource("/img/Admin.png")));
        contentPane.add(bsckground);
        bsckground.setBounds(new Rectangle(new Point(0, 0), bsckground.getPreferredSize()));

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
    private JLabel ljh;
    private JLabel rzl;
    private JLabel lzd;
    private JLabel spr;
    private JLabel Pete;
    private JLabel David;
    private JLabel BORBER;
    private JLabel Spring;
    private JLabel exit;
    private JLabel bsckground;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
