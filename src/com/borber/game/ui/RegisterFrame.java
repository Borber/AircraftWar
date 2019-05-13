/*
 * Created by JFormDesigner on Mon May 13 08:04:11 CST 2019
 */

package com.borber.game.ui;

import com.borber.game.ui.startFrame.StartFrame;
import com.borber.globalConstant.For_UI;
import com.borber.toolkits.JTextFieldLimit;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;

/**
 * @author BORBER
 */
public class RegisterFrame extends JFrame {
    public RegisterFrame() {
        initComponents();
        backgroundImg.requestFocus();
    }

    private void exitButtonImgMouseClicked(MouseEvent e) {
        setVisible(false);
        new StartFrame();
    }

    private void nameTextFieldFocusGained(FocusEvent e) {
        if(nameTextField.getText().equals(For_UI.HINT_TEXT)){
            nameTextField.setText("");
            nameTextField.setForeground(Color.BLACK);

            nameTextField.setDocument(new JTextFieldLimit(12));
        }
    }

    private void nameTextFieldFocusLost(FocusEvent e) {
        if(nameTextField.getText().length() == 0){
            nameTextField.setText(For_UI.HINT_TEXT);
            nameTextField.setForeground(new Color(153, 153, 153));
        }
    }

    private void passwordFieldFocusGained(FocusEvent e) {
        if(new String(passwordField.getPassword()).equals(For_UI.HINT_PASSWORD_TEXT)){
            passwordField.setText("");
            passwordField.setForeground(Color.BLACK);
        }

        passwordField.setDocument(new JTextFieldLimit(16));
    }

    private void passwordFieldFocusLost(FocusEvent e) {
        if(new String(passwordField.getPassword()).length() == 0){
            passwordField.setText(For_UI.HINT_PASSWORD_TEXT);
            passwordField.setForeground(new Color(153, 153, 153));
        }
    }

    private void passwordRepeatFieldFocusGained(FocusEvent e) {
        if(new String(passwordRepeatField.getPassword()).equals(For_UI.HINT_PASSWORD_TEXT)){
            passwordRepeatField.setText("");
            passwordRepeatField.setForeground(Color.BLACK);
        }

        passwordRepeatField.setDocument(new JTextFieldLimit(16));
    }

    private void passwordRepeatFieldFocusLost(FocusEvent e) {
        // TODO 加入密码判断 在输入环节
        if(new String(passwordRepeatField.getPassword()).length() == 0){
            passwordRepeatField.setText(For_UI.HINT_PASSWORD_TEXT);
            passwordRepeatField.setForeground(new Color(153, 153, 153));
        }
        if(!Arrays.equals(passwordField.getPassword(), passwordRepeatField.getPassword())){
            JOptionPane.showMessageDialog(null,"两次密码不匹配");
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        nameTextField = new JFormattedTextField();
        passwordField = new JPasswordField();
        passwordRepeatField = new JPasswordField();
        emailTextField = new JFormattedTextField();
        emailSign = new JLabel();
        emailCombox = new JComboBox<>();
        conCombox = new JComboBox<>();
        label3 = new JLabel();
        telephoneNum1 = new JFormattedTextField();
        telephoneNum2 = new JFormattedTextField();
        telephoneNum3 = new JFormattedTextField();
        telephoneSign = new JLabel();
        telephoneSign2 = new JLabel();
        submitButtonImg = new JLabel();
        exitButtonImg = new JLabel();
        backgroundImg = new JLabel();

        //======== this ========
        setUndecorated(true);
        setVisible(true);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- nameTextField ----
        nameTextField.setBorder(null);
        nameTextField.setBackground(Color.white);
        nameTextField.setHorizontalAlignment(SwingConstants.CENTER);
        nameTextField.setForeground(new Color(153, 153, 153));
        nameTextField.setText("Username");
        nameTextField.setColumns(12);
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
        nameTextField.setBounds(115, 145, 250, 30);

        //---- passwordField ----
        passwordField.setBackground(Color.white);
        passwordField.setBorder(null);
        passwordField.setText("Password");
        passwordField.setHorizontalAlignment(SwingConstants.CENTER);
        passwordField.setForeground(new Color(153, 153, 153));
        passwordField.setColumns(16);
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
        passwordField.setBounds(115, 205, 250, 30);

        //---- passwordRepeatField ----
        passwordRepeatField.setBackground(Color.white);
        passwordRepeatField.setBorder(null);
        passwordRepeatField.setText("Password");
        passwordRepeatField.setHorizontalAlignment(SwingConstants.CENTER);
        passwordRepeatField.setForeground(new Color(153, 153, 153));
        passwordRepeatField.setColumns(16);
        passwordRepeatField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                passwordRepeatFieldFocusGained(e);
            }
            @Override
            public void focusLost(FocusEvent e) {
                passwordRepeatFieldFocusLost(e);
            }
        });
        contentPane.add(passwordRepeatField);
        passwordRepeatField.setBounds(115, 260, 250, 30);

        //---- emailTextField ----
        emailTextField.setBorder(null);
        emailTextField.setBackground(Color.white);
        emailTextField.setHorizontalAlignment(SwingConstants.CENTER);
        emailTextField.setForeground(new Color(153, 153, 153));
        contentPane.add(emailTextField);
        emailTextField.setBounds(115, 325, 135, 30);

        //---- emailSign ----
        emailSign.setText("@");
        emailSign.setFont(new Font("Fira Code Medium", Font.BOLD, 16));
        emailSign.setForeground(Color.black);
        contentPane.add(emailSign);
        emailSign.setBounds(new Rectangle(new Point(260, 330), emailSign.getPreferredSize()));

        //---- emailCombox ----
        emailCombox.setModel(new DefaultComboBoxModel<>(new String[] {
            "China",
            "USA",
            "UK"
        }));
        emailCombox.setBackground(Color.white);
        emailCombox.setBorder(null);
        emailCombox.setForeground(Color.black);
        contentPane.add(emailCombox);
        emailCombox.setBounds(185, 490, 115, 30);

        //---- conCombox ----
        conCombox.setModel(new DefaultComboBoxModel<>(new String[] {
            "gmail.com",
            "qq.com",
            "foxmail.com",
            "163.com"
        }));
        conCombox.setBackground(Color.white);
        conCombox.setBorder(null);
        conCombox.setForeground(Color.black);
        contentPane.add(conCombox);
        conCombox.setBounds(280, 325, 85, 30);

        //---- label3 ----
        label3.setText("+86");
        label3.setFont(new Font("Fira Code Medium", Font.BOLD, 16));
        label3.setBackground(Color.black);
        label3.setForeground(Color.black);
        contentPane.add(label3);
        label3.setBounds(new Rectangle(new Point(110, 405), label3.getPreferredSize()));

        //---- telephoneNum1 ----
        telephoneNum1.setBorder(null);
        telephoneNum1.setText("xxx");
        telephoneNum1.setHorizontalAlignment(SwingConstants.CENTER);
        telephoneNum1.setFont(new Font("Fira Code Medium", Font.BOLD, 14));
        telephoneNum1.setForeground(new Color(153, 153, 153));
        telephoneNum1.setBackground(Color.white);
        contentPane.add(telephoneNum1);
        telephoneNum1.setBounds(145, 400, 60, 30);

        //---- telephoneNum2 ----
        telephoneNum2.setBackground(Color.white);
        telephoneNum2.setBorder(null);
        telephoneNum2.setText("xxxx");
        telephoneNum2.setHorizontalAlignment(SwingConstants.CENTER);
        telephoneNum2.setFont(new Font("Fira Code Medium", Font.BOLD, 14));
        telephoneNum2.setForeground(new Color(153, 153, 153));
        telephoneNum2.setColumns(4);
        contentPane.add(telephoneNum2);
        telephoneNum2.setBounds(225, 400, 60, 30);

        //---- telephoneNum3 ----
        telephoneNum3.setBackground(Color.white);
        telephoneNum3.setBorder(null);
        telephoneNum3.setText("xxxx");
        telephoneNum3.setHorizontalAlignment(SwingConstants.CENTER);
        telephoneNum3.setFont(new Font("Fira Code Medium", Font.BOLD, 14));
        telephoneNum3.setForeground(new Color(153, 153, 153));
        telephoneNum3.setColumns(4);
        contentPane.add(telephoneNum3);
        telephoneNum3.setBounds(305, 400, 60, 30);

        //---- telephoneSign ----
        telephoneSign.setText("-");
        telephoneSign.setFont(new Font("Fira Code Medium", Font.BOLD, 14));
        telephoneSign.setForeground(new Color(51, 51, 51));
        contentPane.add(telephoneSign);
        telephoneSign.setBounds(new Rectangle(new Point(210, 405), telephoneSign.getPreferredSize()));

        //---- telephoneSign2 ----
        telephoneSign2.setText("-");
        telephoneSign2.setFont(new Font("Fira Code Medium", Font.BOLD, 14));
        telephoneSign2.setForeground(new Color(51, 51, 51));
        contentPane.add(telephoneSign2);
        telephoneSign2.setBounds(290, 405, 8, 18);

        //---- submitButtonImg ----
        submitButtonImg.setIcon(new ImageIcon(getClass().getResource("/img/button/submitImg.png")));
        contentPane.add(submitButtonImg);
        submitButtonImg.setBounds(new Rectangle(new Point(145, 605), submitButtonImg.getPreferredSize()));

        //---- exitButtonImg ----
        exitButtonImg.setIcon(new ImageIcon(getClass().getResource("/img/button/exitImg.png")));
        exitButtonImg.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                exitButtonImgMouseClicked(e);
            }
        });
        contentPane.add(exitButtonImg);
        exitButtonImg.setBounds(new Rectangle(new Point(145, 690), exitButtonImg.getPreferredSize()));

        //---- backgroundImg ----
        backgroundImg.setIcon(new ImageIcon(getClass().getResource("/img/bg.png")));
        backgroundImg.setFont(new Font("Fira Code Medium", Font.BOLD, 14));
        contentPane.add(backgroundImg);
        backgroundImg.setBounds(0, 0, 475, 835);

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
    private JFormattedTextField nameTextField;
    private JPasswordField passwordField;
    private JPasswordField passwordRepeatField;
    private JFormattedTextField emailTextField;
    private JLabel emailSign;
    private JComboBox<String> emailCombox;
    private JComboBox<String> conCombox;
    private JLabel label3;
    private JFormattedTextField telephoneNum1;
    private JFormattedTextField telephoneNum2;
    private JFormattedTextField telephoneNum3;
    private JLabel telephoneSign;
    private JLabel telephoneSign2;
    private JLabel submitButtonImg;
    private JLabel exitButtonImg;
    private JLabel backgroundImg;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
