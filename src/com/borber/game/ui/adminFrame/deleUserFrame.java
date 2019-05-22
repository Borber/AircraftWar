/*
 * Created by JFormDesigner on Thu May 16 13:48:50 CST 2019
 */

package com.borber.game.ui.adminFrame;

import com.borber.toolkits.SQL_Command;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import static com.borber.globalConstant.For_Game.adminframe;

/**
 * @author BORBER
 */
public class deleUserFrame extends JFrame {
    public deleUserFrame() {
        initComponents();
    }

    private void deleButtonImgMouseClicked(MouseEvent e) {
        setVisible(false);
        SQL_Command.deleteUser(Integer.valueOf(deleID.getText()));
        adminframe.setVisible(true);
    }

    private void CancelMouseClicked(MouseEvent e) {
        setVisible(false);
        adminframe.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        ID = new JLabel();
        deleID = new JFormattedTextField();
        deleButtonImg = new JLabel();
        Cancel = new JLabel();
        background = new JLabel();

        //======== this ========
        setUndecorated(true);
        setVisible(true);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- ID ----
        ID.setText("ID:");
        ID.setForeground(Color.black);
        ID.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
        contentPane.add(ID);
        ID.setBounds(new Rectangle(new Point(130, 125), ID.getPreferredSize()));

        //---- deleID ----
        deleID.setHorizontalAlignment(SwingConstants.CENTER);
        deleID.setBorder(null);
        deleID.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
        contentPane.add(deleID);
        deleID.setBounds(165, 125, 180, deleID.getPreferredSize().height);

        //---- deleButtonImg ----
        deleButtonImg.setIcon(new ImageIcon(getClass().getResource("/img/button/Delete.png")));
        deleButtonImg.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                deleButtonImgMouseClicked(e);
            }
        });
        contentPane.add(deleButtonImg);
        deleButtonImg.setBounds(new Rectangle(new Point(30, 215), deleButtonImg.getPreferredSize()));

        //---- Cancel ----
        Cancel.setIcon(new ImageIcon(getClass().getResource("/img/button/cancelImg.png")));
        Cancel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CancelMouseClicked(e);
            }
        });
        contentPane.add(Cancel);
        Cancel.setBounds(new Rectangle(new Point(265, 210), Cancel.getPreferredSize()));

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
    private JLabel ID;
    private JFormattedTextField deleID;
    private JLabel deleButtonImg;
    private JLabel Cancel;
    private JLabel background;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
