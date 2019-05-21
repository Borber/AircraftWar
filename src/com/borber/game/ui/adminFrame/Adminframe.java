/*
 * Created by JFormDesigner on Wed May 08 08:52:30 CST 2019
 */

package com.borber.game.ui.adminFrame;

import com.borber.game.ui.startFrame.StartFrame;
import com.borber.globalConstant.GlobalObject;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

import static com.borber.globalConstant.For_Game.adminLastLoginTime;
import static com.borber.globalConstant.For_Game.adminframe;

/**
 * @author BORBER
 */
public class Adminframe extends JFrame {
    public Adminframe() {
        initComponents();
        GlobalObject.setjTable(table1);
        GlobalObject.setjScrollPane(scrollPane1);
        time.setText(adminLastLoginTime);
        new JTableOperation().reloadJTable("");
    }


    private void sreachButtonMouseClicked(MouseEvent e) {
        new JTableOperation().reloadJTable(sreach.getText());
    }

    private void exitMouseClicked(MouseEvent e) {
        setVisible(false);
        new StartFrame();
    }

    private void deleteMouseClicked(MouseEvent e) {
        adminframe.setVisible(false);
        new deleUserFrame();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        searchLabel = new JLabel();
        sreach = new JFormattedTextField();
        last = new JLabel();
        sreachButton = new JLabel();
        exit = new JLabel();
        time = new JLabel();
        delete = new JLabel();
        background = new JLabel();

        //======== this ========
        setUndecorated(true);
        setVisible(true);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== scrollPane1 ========
        {

            //---- table1 ----
            table1.setBackground(new Color(204, 204, 204));
            table1.setForeground(Color.black);
            scrollPane1.setViewportView(table1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(90, 125, 690, 255);

        //---- searchLabel ----
        searchLabel.setText("Name");
        searchLabel.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
        searchLabel.setForeground(Color.black);
        contentPane.add(searchLabel);
        searchLabel.setBounds(new Rectangle(new Point(280, 70), searchLabel.getPreferredSize()));

        //---- sreach ----
        sreach.setHorizontalAlignment(SwingConstants.CENTER);
        sreach.setBorder(null);
        sreach.setForeground(Color.black);
        sreach.setBackground(Color.white);
        contentPane.add(sreach);
        sreach.setBounds(355, 65, 160, 30);

        //---- last ----
        last.setText("Last login:");
        last.setForeground(Color.black);
        last.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
        contentPane.add(last);
        last.setBounds(new Rectangle(new Point(10, 10), last.getPreferredSize()));

        //---- sreachButton ----
        sreachButton.setIcon(new ImageIcon(getClass().getResource("/img/button/submitImg.png")));
        sreachButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                sreachButtonMouseClicked(e);
            }
        });
        contentPane.add(sreachButton);
        sreachButton.setBounds(new Rectangle(new Point(580, 55), sreachButton.getPreferredSize()));

        //---- exit ----
        exit.setIcon(new ImageIcon(getClass().getResource("/img/button/exitImg.png")));
        exit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                exitMouseClicked(e);
            }
        });
        contentPane.add(exit);
        exit.setBounds(new Rectangle(new Point(455, 415), exit.getPreferredSize()));

        //---- time ----
        time.setText("test");
        time.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
        time.setHorizontalAlignment(SwingConstants.CENTER);
        time.setForeground(Color.black);
        contentPane.add(time);
        time.setBounds(90, 10, 205, time.getPreferredSize().height);

        //---- delete ----
        delete.setIcon(new ImageIcon(getClass().getResource("/img/button/Delete.png")));
        delete.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                deleteMouseClicked(e);
            }
        });
        contentPane.add(delete);
        delete.setBounds(new Rectangle(new Point(170, 420), delete.getPreferredSize()));

        //---- background ----
        background.setIcon(new ImageIcon(getClass().getResource("/img/Admin.png")));
        contentPane.add(background);
        background.setBounds(0, 0, 855, 480);

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
    private JScrollPane scrollPane1;
    private JTable table1;
    private JLabel searchLabel;
    private JFormattedTextField sreach;
    private JLabel last;
    private JLabel sreachButton;
    private JLabel exit;
    private JLabel time;
    private JLabel delete;
    private JLabel background;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
