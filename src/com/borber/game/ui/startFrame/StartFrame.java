/*
 * Created by JFormDesigner on Tue May 07 17:24:52 CST 2019
 */

package com.borber.game.ui.startFrame;

import com.borber.game.ui.RegisterFrame;
import com.borber.game.ui.gameFrame.GameFrameBeta;
import com.borber.globalConstant.For_UI;
import com.borber.toolkits.SQL_Command;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static com.borber.globalConstant.For_Game.gameFrameBeta;

/**
 * @author BORBER
 */
public class StartFrame extends JFrame {
    public StartFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        background.requestFocus();
    }

    private void startLabelMouseClicked(MouseEvent e) {
        boolean OK = false;
        OK = SQL_Command.SignIn(nameTextField.getText(),new String(passwordField.getPassword()));
        if(OK){
            gameFrameBeta.setVisible(true);
            setVisible(false);
        }else {
            System.out.println("登陆失败");
        }
    }

    private void exitLabelMouseClicked(MouseEvent e) {
        System.exit(0);
    }

    private void nameTextFieldFocusGained(FocusEvent e) {
        if(nameTextField.getText().equals(For_UI.HINT_TEXT)){
            nameTextField.setText("");
            nameTextField.setForeground(Color.BLACK);
        }
    }

    private void passwordFieldFocusGained(FocusEvent e) {
        if(new String(passwordField.getPassword()).equals(For_UI.HINT_PASSWORD_TEXT)){
            passwordField.setText("");
            passwordField.setForeground(Color.BLACK);
        }
    }

    private void nameTextFieldFocusLost(FocusEvent e) {
        if(nameTextField.getText().length() == 0){
            nameTextField.setText(For_UI.HINT_TEXT);
            nameTextField.setForeground(new Color(153, 153, 153));
        }
    }

    private void passwordFieldFocusLost(FocusEvent e) {
        if(new String(passwordField.getPassword()).length() == 0){
            passwordField.setText(For_UI.HINT_PASSWORD_TEXT);
            passwordField.setForeground(new Color(153, 153, 153));
        }
    }

    private void backgroundMouseClicked(MouseEvent e) {
        background.requestFocus();
    }

    private void registerButtonImgMouseClicked(MouseEvent e) {
        setVisible(false);
        new RegisterFrame();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        formattedTextField1 = new JFormattedTextField();
        startLabel = new JLabel();
        nameTextField = new JFormattedTextField();
        passwordField = new JPasswordField();
        nameTextFieldImg = new JLabel();
        registerButtonImg = new JLabel();
        passwordFieldImg = new JLabel();
        exitLabel = new JLabel();
        adminLoginImg = new JLabel();
        authorButton = new JLabel();
        background = new JLabel();

        //======== this ========
        setUndecorated(true);
        setVisible(true);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);
        contentPane.add(formattedTextField1);
        formattedTextField1.setBounds(225, 30, 0, 0);

        //---- startLabel ----
        startLabel.setIcon(new ImageIcon(getClass().getResource("/img/button/stratImg.png")));
        startLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                startLabelMouseClicked(e);
            }
        });
        contentPane.add(startLabel);
        startLabel.setBounds(new Rectangle(new Point(165, 485), startLabel.getPreferredSize()));

        //---- nameTextField ----
        nameTextField.setBorder(null);
        nameTextField.setHorizontalAlignment(SwingConstants.CENTER);
        nameTextField.setFont(new Font("Fira Code Medium", Font.BOLD, 14));
        nameTextField.setBackground(Color.white);
        nameTextField.setText("Username");
        nameTextField.setForeground(new Color(153, 153, 153));
        nameTextField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                nameTextFieldFocusGained(e);
            }
            @Override
            public void focusLost(FocusEvent e) {
                nameTextFieldFocusLost(e);
            }
        });
        contentPane.add(nameTextField);
        nameTextField.setBounds(125, 285, 265, 30);

        //---- passwordField ----
        passwordField.setBorder(null);
        passwordField.setHorizontalAlignment(SwingConstants.CENTER);
        passwordField.setFont(new Font("Fira Code Medium", Font.BOLD, 16));
        passwordField.setBackground(Color.white);
        passwordField.setText("Password");
        passwordField.setForeground(new Color(153, 153, 153));
        passwordField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                passwordFieldFocusGained(e);
            }
            @Override
            public void focusLost(FocusEvent e) {
                passwordFieldFocusLost(e);
            }
        });
        contentPane.add(passwordField);
        passwordField.setBounds(125, 380, 260, 30);

        //---- nameTextFieldImg ----
        nameTextFieldImg.setIcon(new ImageIcon(getClass().getResource("/img/button/blankImg.png")));
        contentPane.add(nameTextFieldImg);
        nameTextFieldImg.setBounds(new Rectangle(new Point(105, 280), nameTextFieldImg.getPreferredSize()));

        //---- registerButtonImg ----
        registerButtonImg.setIcon(new ImageIcon(getClass().getResource("/img/button/registerImg.png")));
        registerButtonImg.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                registerButtonImgMouseClicked(e);
            }
        });
        contentPane.add(registerButtonImg);
        registerButtonImg.setBounds(new Rectangle(new Point(165, 575), registerButtonImg.getPreferredSize()));

        //---- passwordFieldImg ----
        passwordFieldImg.setIcon(new ImageIcon(getClass().getResource("/img/button/blankImg.png")));
        contentPane.add(passwordFieldImg);
        passwordFieldImg.setBounds(new Rectangle(new Point(105, 375), passwordFieldImg.getPreferredSize()));

        //---- exitLabel ----
        exitLabel.setIcon(new ImageIcon(getClass().getResource("/img/button/exitImg.png")));
        exitLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                exitLabelMouseClicked(e);
            }
        });
        contentPane.add(exitLabel);
        exitLabel.setBounds(new Rectangle(new Point(165, 655), exitLabel.getPreferredSize()));

        //---- adminLoginImg ----
        adminLoginImg.setIcon(new ImageIcon(getClass().getResource("/img/button/admin.png")));
        contentPane.add(adminLoginImg);
        adminLoginImg.setBounds(new Rectangle(new Point(30, 770), adminLoginImg.getPreferredSize()));

        //---- authorButton ----
        authorButton.setIcon(new ImageIcon(getClass().getResource("/img/pre/author.png")));
        authorButton.setDisabledIcon(new ImageIcon(getClass().getResource("/img/pre/author.png")));
        contentPane.add(authorButton);
        authorButton.setBounds(new Rectangle(new Point(410, 775), authorButton.getPreferredSize()));

        //---- background ----
        background.setIcon(new ImageIcon(getClass().getResource("/img/bg.png")));
        background.setBackground(new Color(255, 255, 255, 0));
        background.setVerticalAlignment(SwingConstants.BOTTOM);
        background.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                backgroundMouseClicked(e);
            }
        });
        contentPane.add(background);
        background.setBounds(0, 0, background.getPreferredSize().width, 850);

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
    private JFormattedTextField formattedTextField1;
    private JLabel startLabel;
    private JFormattedTextField nameTextField;
    private JPasswordField passwordField;
    private JLabel nameTextFieldImg;
    private JLabel registerButtonImg;
    private JLabel passwordFieldImg;
    private JLabel exitLabel;
    private JLabel adminLoginImg;
    private JLabel authorButton;
    private JLabel background;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
