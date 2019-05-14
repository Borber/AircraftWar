/*
 * Created by JFormDesigner on Mon May 13 08:04:11 CST 2019
 */

package com.borber.game.ui;

import com.borber.game.ui.startFrame.StartFrame;
import com.borber.globalConstant.For_UI;
import com.borber.toolkits.JTextFieldLimit;
import com.borber.toolkits.SQL_Command;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import sun.security.util.Password;

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
            nameTextField.setDocument(new JTextFieldLimit(12));
            nameTextField.setText("");
            nameTextField.setForeground(Color.BLACK);
        }
        userSign.setVisible(false);
        userSign2.setVisible(false);
    }

    private void nameTextFieldFocusLost(FocusEvent e) {
        if(nameTextField.getText().length() == 0){
            nameTextField.setText(For_UI.HINT_TEXT);
            nameTextField.setForeground(new Color(153, 153, 153));
        }
        userOK = SQL_Command.userCheck(nameTextField.getText());
        if(userOK){
            userSign.setVisible(true);
        }else {
            userSign2.setVisible(true);
        }
    }

    private void passwordFieldFocusGained(FocusEvent e) {
        if(new String(passwordField.getPassword()).equals(For_UI.HINT_PASSWORD_TEXT)){
            passwordField.setDocument(new JTextFieldLimit(20));
            passwordField.setText("");
            passwordField.setForeground(Color.BLACK);
        }

    }

    private void passwordFieldFocusLost(FocusEvent e) {
        if(new String(passwordField.getPassword()).length() == 0){
            passwordField.setText(For_UI.HINT_PASSWORD_TEXT);
            passwordField.setForeground(new Color(153, 153, 153));
        }
    }

    private void passwordRepeatFieldFocusGained(FocusEvent e) {
        if(new String(passwordRepeatField.getPassword()).equals(For_UI.HINT_PASSWORD_TEXT)){
            passwordRepeatField.setDocument(new JTextFieldLimit(20));
            passwordRepeatField.setText("");
            passwordRepeatField.setForeground(Color.BLACK);
        }
    }

    private void passwordRepeatFieldFocusLost(FocusEvent e) {
        // TODO 加入密码判断 在输入环节
        if(new String(passwordRepeatField.getPassword()).length() == 0){
            passwordRepeatField.setText(For_UI.HINT_PASSWORD_TEXT);
            passwordRepeatField.setForeground(new Color(153, 153, 153));
        }
    }

    private void telephoneNum1FocusGained(FocusEvent e) {
        if(telephoneNum1.getText().equals("xxx")){
            telephoneNum1.setDocument(new JTextFieldLimit(3));
            telephoneNum1.setText("");
            telephoneNum1.setForeground(Color.BLACK);
        }

    }

    private void telephoneNum1FocusLost(FocusEvent e) {
        if(telephoneNum1.getText().length() == 0){
            telephoneNum1.setText("xxx");
            telephoneNum1.setForeground(new Color(153, 153, 153));
        }
    }

    private void telephoneNum2FocusGained(FocusEvent e) {
        if(telephoneNum2.getText().equals("xxxx")){
            telephoneNum2.setDocument(new JTextFieldLimit(4));
            telephoneNum2.setText("");
            telephoneNum2.setForeground(Color.BLACK);
        }
    }

        private void telephoneNum2FocusLost(FocusEvent e) {
            if(telephoneNum2.getText().length() == 0){
                telephoneNum2.setText("xxxx");
                telephoneNum2.setForeground(new Color(153, 153, 153));
            }
    }

    private void telephoneNum3FocusGained(FocusEvent e) {
        if(telephoneNum3.getText().equals("xxxx")){
            telephoneNum3.setDocument(new JTextFieldLimit(4));
            telephoneNum3.setText("");
            telephoneNum3.setForeground(Color.BLACK);
        }

    }

    private void telephoneNum3FocusLost(FocusEvent e) {
        if(telephoneNum3.getText().length() == 0){
            telephoneNum3.setText("xxxx");
            telephoneNum3.setForeground(new Color(153, 153, 153));
        }
    }

    private void backgroundImgMouseClicked(MouseEvent e) {
        backgroundImg.requestFocus();
    }

    private void submitButtonImgMouseClicked(MouseEvent e) {

        boolean OK = SQL_Command.SignUp(
                nameTextField.getText(),
                new String(passwordField.getPassword()),
                emailTextField.getText() + "@" + emailCombox.getSelectedItem().toString(),
                telephoneNum1.getText() + telephoneNum2.getText() + telephoneNum3.getText(),
                conCombox.getSelectedItem().toString()
                );
        if(OK){
            System.out.println("注册成功");
        }else {
            System.out.println("注册失败");
        }
    }

    private void emailTextFieldMouseClicked(MouseEvent e) {
        if(emailTextField.getText().length() == 0){
            emailTextField.setDocument(new JTextFieldLimit(30));
        }
    }

    private void passwordCheck(){
        passOK = Arrays.equals(passwordField.getPassword(), passwordRepeatField.getPassword());
        if(! new String(passwordField.getPassword()).equals(For_UI.HINT_PASSWORD_TEXT) &&
                ! new String(passwordRepeatField.getPassword()).equals(For_UI.HINT_PASSWORD_TEXT)){
            if(passOK){
                passwordSign2.setVisible(true);
                passwordSign.setVisible(false);
            }else {
                passwordSign.setVisible(true);
                passwordSign2.setVisible(false);
            }
        }

    }

    private void passwordFieldKeyReleased(KeyEvent e) {
        passwordCheck();
    }

    private void passwordRepeatFieldKeyReleased(KeyEvent e) {
        passwordCheck();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        nameTextField = new JFormattedTextField();
        passwordField = new JPasswordField();
        passwordRepeatField = new JPasswordField();
        emailTextField = new JFormattedTextField();
        emailSign = new JLabel();
        conCombox = new JComboBox<>();
        emailCombox = new JComboBox<>();
        code = new JLabel();
        telephoneNum1 = new JFormattedTextField();
        telephoneNum2 = new JFormattedTextField();
        telephoneNum3 = new JFormattedTextField();
        userSign = new JLabel();
        userSign2 = new JLabel();
        passwordSign = new JLabel();
        passwordSign2 = new JLabel();
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
        nameTextField.setFont(new Font("Fira Code Medium", Font.BOLD, 12));
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
        passwordField.setFont(new Font("Fira Code Medium", Font.BOLD, 16));
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
        passwordField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                passwordFieldKeyReleased(e);
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
        passwordRepeatField.setFont(new Font("Fira Code Medium", Font.BOLD, 16));
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
        passwordRepeatField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                passwordRepeatFieldKeyReleased(e);
            }
        });
        contentPane.add(passwordRepeatField);
        passwordRepeatField.setBounds(115, 260, 250, 30);

        //---- emailTextField ----
        emailTextField.setBorder(null);
        emailTextField.setBackground(Color.white);
        emailTextField.setHorizontalAlignment(SwingConstants.CENTER);
        emailTextField.setForeground(Color.black);
        emailTextField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                emailTextFieldMouseClicked(e);
            }
        });
        contentPane.add(emailTextField);
        emailTextField.setBounds(115, 325, 135, 30);

        //---- emailSign ----
        emailSign.setText("@");
        emailSign.setFont(new Font("Fira Code Medium", Font.BOLD, 16));
        emailSign.setForeground(Color.black);
        contentPane.add(emailSign);
        emailSign.setBounds(new Rectangle(new Point(260, 330), emailSign.getPreferredSize()));

        //---- conCombox ----
        conCombox.setModel(new DefaultComboBoxModel<>(new String[] {
            "Angola ",
            "Afghanistan ",
            "Albania ",
            "Algeria ",
            "Andorra ",
            "Anguilla ",
            "Antigua and Barbuda ",
            "Argentina ",
            "Armenia ",
            "Ascension ",
            "Australia ",
            "Austria \t\t\t",
            "Azerbaijan  ",
            "Bahamas ",
            "Bahrain ",
            "Bangladesh ",
            "Barbados ",
            "Belarus  ",
            "Belgium  ",
            "Belize  ",
            "Benin  ",
            "Bermuda Is.  ",
            "Bolivia  ",
            "Botswana  ",
            "Brazil ",
            "Brunei ",
            "Bulgaria ",
            "Burkina-faso ",
            "Burma ",
            "Burundi  ",
            "Cameroon ",
            "Canada  ",
            "Cayman Is.",
            "Central African Republic ",
            "Chad ",
            "Chile ",
            "China ",
            "Colombia ",
            "Congo ",
            "Cook Is.",
            "Costa Rica ",
            "Cuba ",
            "Cyprus ",
            "Czech Republic ",
            "Denmark ",
            "Djibouti ",
            "Dominica Rep.  ",
            "Ecuador ",
            "Egypt ",
            "EI Salvador  ",
            "Estonia ",
            "Ethiopia ",
            "Fiji  ",
            "Finland ",
            "France ",
            "French Guiana ",
            "Gabon ",
            "Gambia ",
            "Georgia ",
            "Germany  ",
            "Ghana  ",
            "Gibraltar ",
            "Greece ",
            "Grenada ",
            "Guam  ",
            "Guatemala ",
            "Guinea ",
            "Guyana ",
            "Haiti ",
            "Honduras  ",
            "Hongkong ",
            "Hungary ",
            "Iceland ",
            "India ",
            "Indonesia  ",
            "Iran ",
            "Iraq ",
            "Ireland  ",
            "Israel ",
            "Italy ",
            "Ivory Coast ",
            "Jamaica ",
            "Japan ",
            "Jordan  ",
            "Cambodia  ",
            "Kazakstan  ",
            "Kenya  ",
            "Korea ",
            "Kuwait ",
            "Kyrgyzstan ",
            "Laos ",
            "Latvia ",
            "Lebanon ",
            "Lesotho ",
            "Liberia  ",
            "Libya ",
            "Liechtenstein ",
            "Lithuania ",
            "Luxembourg ",
            "Macao ",
            "Madagascar ",
            "Malawi ",
            "Malaysia ",
            "Maldives ",
            "Mali ",
            "Malta ",
            "Mariana Is ",
            "Martinique ",
            "Mauritius ",
            "Mexico ",
            "Moldova, Republic of ",
            "Monaco ",
            "Mongolia ",
            "Montserrat Is ",
            "Morocco ",
            "Mozambique ",
            "Namibia ",
            "Nauru ",
            "Nepal ",
            "Netheriands Antilles ",
            "Netherlands ",
            "New Zealand ",
            "Nicaragua ",
            "Niger  ",
            "Nigeria ",
            "North Korea ",
            "Norway ",
            "Oman ",
            "Pakistan  ",
            "Panama ",
            "Papua New Cuinea ",
            "Paraguay  ",
            "Peru ",
            "Philippines ",
            "Poland ",
            "French Polynesia ",
            "Portugal  ",
            "Puerto Rico ",
            "Qatar  ",
            "Reunion ",
            "Romania ",
            "Russia ",
            "Saint Lueia  ",
            "Saint Vincent  ",
            "Samoa Eastern  ",
            "Samoa Western  ",
            "San Marino  ",
            "Sao Tome and Principe ",
            "Saudi Arabia ",
            "Senegal ",
            "Seychelles ",
            "Sierra Leone  ",
            "Singapore  ",
            "Slovakia ",
            "Slovenia ",
            "Solomon Is ",
            "Somali ",
            "South Africa ",
            "Spain  ",
            "Sri Lanka  ",
            "St.Lucia  ",
            "St.Vincent ",
            "Sudan ",
            "Suriname ",
            "Swaziland ",
            "Sweden",
            "Switzerland ",
            "Syria  ",
            "Tajikstan ",
            "Tanzania ",
            "Thailand ",
            "Togo ",
            "Tonga ",
            "Trinidad and Tobago ",
            "Tunisia ",
            "Turkey ",
            "Turkmenistan ",
            "Uganda ",
            "Ukraine ",
            "United Arab Emirates ",
            "United Kiongdom ",
            "United States of America ",
            "Uruguay ",
            "Uzbekistan ",
            "Venezuela ",
            "Vietnam ",
            "Yemen ",
            "Yugoslavia  ",
            "Zimbabwe ",
            "Zaire ",
            "Zambia "
        }));
        conCombox.setBackground(Color.white);
        conCombox.setBorder(null);
        conCombox.setForeground(Color.black);
        contentPane.add(conCombox);
        conCombox.setBounds(185, 500, 115, 30);

        //---- emailCombox ----
        emailCombox.setModel(new DefaultComboBoxModel<>(new String[] {
            "gmail.com",
            "qq.com",
            "foxmail.com",
            "163.com"
        }));
        emailCombox.setBackground(Color.white);
        emailCombox.setBorder(null);
        emailCombox.setForeground(Color.black);
        contentPane.add(emailCombox);
        emailCombox.setBounds(280, 325, 85, 30);

        //---- code ----
        code.setText("+86");
        code.setFont(new Font("Fira Code Medium", Font.BOLD, 16));
        code.setBackground(Color.black);
        code.setForeground(Color.black);
        contentPane.add(code);
        code.setBounds(new Rectangle(new Point(110, 405), code.getPreferredSize()));

        //---- telephoneNum1 ----
        telephoneNum1.setBorder(null);
        telephoneNum1.setText("xxx");
        telephoneNum1.setHorizontalAlignment(SwingConstants.CENTER);
        telephoneNum1.setFont(new Font("Fira Code Medium", Font.BOLD, 14));
        telephoneNum1.setForeground(new Color(153, 153, 153));
        telephoneNum1.setBackground(Color.white);
        telephoneNum1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                telephoneNum1FocusGained(e);
            }
            @Override
            public void focusLost(FocusEvent e) {
                telephoneNum1FocusLost(e);
            }
        });
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
        telephoneNum2.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                telephoneNum2FocusGained(e);
            }
            @Override
            public void focusLost(FocusEvent e) {
                telephoneNum2FocusLost(e);
            }
        });
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
        telephoneNum3.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                telephoneNum3FocusGained(e);
            }
            @Override
            public void focusLost(FocusEvent e) {
                telephoneNum3FocusLost(e);
            }
        });
        contentPane.add(telephoneNum3);
        telephoneNum3.setBounds(305, 400, 60, 30);

        //---- userSign ----
        userSign.setIcon(new ImageIcon(getClass().getResource("/img/sign/red.png")));
        userSign.setVisible(false);
        contentPane.add(userSign);
        userSign.setBounds(new Rectangle(new Point(380, 147), userSign.getPreferredSize()));

        //---- userSign2 ----
        userSign2.setIcon(new ImageIcon(getClass().getResource("/img/sign/green.png")));
        userSign2.setVisible(false);
        contentPane.add(userSign2);
        userSign2.setBounds(new Rectangle(new Point(380, 148), userSign2.getPreferredSize()));

        //---- passwordSign ----
        passwordSign.setIcon(new ImageIcon(getClass().getResource("/img/sign/red.png")));
        passwordSign.setVisible(false);
        contentPane.add(passwordSign);
        passwordSign.setBounds(new Rectangle(new Point(380, 263), passwordSign.getPreferredSize()));

        //---- passwordSign2 ----
        passwordSign2.setIcon(new ImageIcon(getClass().getResource("/img/sign/green.png")));
        passwordSign2.setVisible(false);
        contentPane.add(passwordSign2);
        passwordSign2.setBounds(new Rectangle(new Point(380, 265), passwordSign2.getPreferredSize()));

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
        submitButtonImg.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                submitButtonImgMouseClicked(e);
            }
        });
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
        backgroundImg.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                backgroundImgMouseClicked(e);
            }
        });
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
    private JComboBox<String> conCombox;
    private JComboBox<String> emailCombox;
    private JLabel code;
    private JFormattedTextField telephoneNum1;
    private JFormattedTextField telephoneNum2;
    private JFormattedTextField telephoneNum3;
    private JLabel userSign;
    private JLabel userSign2;
    private JLabel passwordSign;
    private JLabel passwordSign2;
    private JLabel telephoneSign;
    private JLabel telephoneSign2;
    private JLabel submitButtonImg;
    private JLabel exitButtonImg;
    private JLabel backgroundImg;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    boolean userOK,passOK;
}
