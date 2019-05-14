/*
 * Created by JFormDesigner on Mon May 13 13:30:13 CST 2019
 */

package com.borber.game.ui.gameFrame;

import com.borber.toolkits.SQL_Command;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import static com.borber.globalConstant.For_Game.SCORE;
import static com.borber.globalConstant.For_SQL.SCORE_RANK;

/**
 * @author BORBER
 */
public class GameOverFrame extends JFrame {
    public GameOverFrame() {
        initComponents();
        score.setText(""+SCORE);
        SQL_Command.scoreUp();
        SQL_Command.Global_Ranking();
        firstScore.setText(SCORE_RANK[0]);
        secondScore.setText(SCORE_RANK[1]);
        thirdSecond.setText(SCORE_RANK[2]);
        fourthSecore.setText(SCORE_RANK[3]);
        fifthSecore.setText(SCORE_RANK[4]);
    }

    private void exitButtonImgMouseClicked(MouseEvent e) {
        System.exit(0);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        scoreLabel = new JLabel();
        score = new JLabel();
        Global_Rank = new JLabel();
        First = new JLabel();
        firstScore = new JLabel();
        Second = new JLabel();
        secondScore = new JLabel();
        Third = new JLabel();
        thirdSecond = new JLabel();
        Fourth = new JLabel();
        fourthSecore = new JLabel();
        Fifth = new JLabel();
        fifthSecore = new JLabel();
        exitButtonImg = new JLabel();
        background = new JLabel();

        //======== this ========
        setUndecorated(true);
        setVisible(true);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- scoreLabel ----
        scoreLabel.setText("SCORE");
        scoreLabel.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 28));
        scoreLabel.setForeground(Color.white);
        contentPane.add(scoreLabel);
        scoreLabel.setBounds(new Rectangle(new Point(190, 155), scoreLabel.getPreferredSize()));

        //---- score ----
        score.setText("text");
        score.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 48));
        score.setForeground(Color.white);
        score.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(score);
        score.setBounds(140, 240, 191, score.getPreferredSize().height);

        //---- Global_Rank ----
        Global_Rank.setText("Global Rank");
        Global_Rank.setForeground(Color.white);
        Global_Rank.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
        contentPane.add(Global_Rank);
        Global_Rank.setBounds(new Rectangle(new Point(180, 345), Global_Rank.getPreferredSize()));

        //---- First ----
        First.setText("First");
        First.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
        First.setForeground(Color.white);
        contentPane.add(First);
        First.setBounds(new Rectangle(new Point(165, 395), First.getPreferredSize()));

        //---- firstScore ----
        firstScore.setText("text");
        firstScore.setForeground(Color.white);
        firstScore.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
        firstScore.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(firstScore);
        firstScore.setBounds(225, 395, 155, firstScore.getPreferredSize().height);

        //---- Second ----
        Second.setText("Second");
        Second.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
        Second.setForeground(Color.white);
        contentPane.add(Second);
        Second.setBounds(new Rectangle(new Point(145, 450), Second.getPreferredSize()));

        //---- secondScore ----
        secondScore.setText("text");
        secondScore.setForeground(Color.white);
        secondScore.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
        secondScore.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(secondScore);
        secondScore.setBounds(225, 445, 155, 27);

        //---- Third ----
        Third.setText("Third");
        Third.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
        Third.setForeground(Color.white);
        contentPane.add(Third);
        Third.setBounds(new Rectangle(new Point(165, 490), Third.getPreferredSize()));

        //---- thirdSecond ----
        thirdSecond.setText("text");
        thirdSecond.setForeground(Color.white);
        thirdSecond.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
        thirdSecond.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(thirdSecond);
        thirdSecond.setBounds(225, 485, 155, 27);

        //---- Fourth ----
        Fourth.setText("Fourth");
        Fourth.setForeground(Color.white);
        Fourth.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
        contentPane.add(Fourth);
        Fourth.setBounds(new Rectangle(new Point(160, 530), Fourth.getPreferredSize()));

        //---- fourthSecore ----
        fourthSecore.setText("text");
        fourthSecore.setForeground(Color.white);
        fourthSecore.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
        fourthSecore.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(fourthSecore);
        fourthSecore.setBounds(225, 525, 155, 27);

        //---- Fifth ----
        Fifth.setText("Fifth");
        Fifth.setForeground(Color.white);
        Fifth.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
        contentPane.add(Fifth);
        Fifth.setBounds(new Rectangle(new Point(175, 565), Fifth.getPreferredSize()));

        //---- fifthSecore ----
        fifthSecore.setText("text");
        fifthSecore.setForeground(Color.white);
        fifthSecore.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 10));
        fifthSecore.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(fifthSecore);
        fifthSecore.setBounds(225, 560, 155, 27);

        //---- exitButtonImg ----
        exitButtonImg.setIcon(new ImageIcon(getClass().getResource("/img/button/exitImg.png")));
        exitButtonImg.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                exitButtonImgMouseClicked(e);
            }
        });
        contentPane.add(exitButtonImg);
        exitButtonImg.setBounds(new Rectangle(new Point(145, 760), exitButtonImg.getPreferredSize()));

        //---- background ----
        background.setIcon(new ImageIcon(getClass().getResource("/img/bg.png")));
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
    private JLabel scoreLabel;
    private JLabel score;
    private JLabel Global_Rank;
    private JLabel First;
    private JLabel firstScore;
    private JLabel Second;
    private JLabel secondScore;
    private JLabel Third;
    private JLabel thirdSecond;
    private JLabel Fourth;
    private JLabel fourthSecore;
    private JLabel Fifth;
    private JLabel fifthSecore;
    private JLabel exitButtonImg;
    private JLabel background;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
