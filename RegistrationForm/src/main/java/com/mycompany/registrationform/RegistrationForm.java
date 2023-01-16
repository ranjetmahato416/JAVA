/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.registrationform;

import java.awt.Container;
import java.awt.Font;
import javax.swing.*;

/**
 *
 * @author Dell
 */
public class RegistrationForm extends JFrame {

    JLabel message;
    JLabel nameLabel, genderLabel;
    JTextField nameField;
    JRadioButton genderMale, genderFemale;
    ButtonGroup genderGroup;

    JLabel passwordLabel;
    JPasswordField passwordField;

    JLabel semesterLabel;
    JComboBox<String> semesterList;

    JButton registerButton;
    
    JLabel CheckBoxLabel;
    JCheckBox checkBox;
    
    JTextArea TextArea;
    Container container;

    public RegistrationForm() {
        message = new JLabel("Register a new Student");
        message.setFont(new Font("Courier", Font.BOLD, 20));
        nameLabel = new JLabel("Name");
        nameField = new JTextField();

        genderLabel = new JLabel("Gender");
        genderMale = new JRadioButton("Male", true);
        genderFemale = new JRadioButton("Female");
        genderGroup = new ButtonGroup();
        genderGroup.add(genderMale);
        genderGroup.add(genderFemale);

        passwordLabel = new JLabel("Password");
        passwordField = new JPasswordField();


        semesterLabel = new JLabel("Semester");
        semesterList = new JComboBox<>();
        semesterList.addItem("First");
        semesterList.addItem("Second");
        semesterList.addItem("Third");
        semesterList.addItem("Four");
        semesterList.addItem("Five");
        semesterList.addItem("Six");
        semesterList.addItem("Seven");
        semesterList.addItem("Eight");
        
        CheckBoxLabel = new JLabel("Agree to Terms And Conditions.");
        checkBox =new JCheckBox();  
        
        TextArea = new JTextArea("Description");

        registerButton = new JButton("Register");
        container = getContentPane();
        container.setLayout(null);
        setBounds();
        addComponents();

    }

    public void setBounds() {
        message.setBounds(50, 10, 600, 30);
        nameLabel.setBounds(50, 60, 100, 30);
        nameField.setBounds(130, 60, 200, 30);        
        
        passwordLabel.setBounds(50, 110, 100, 30);
        passwordField.setBounds(130, 110, 200, 30);

        genderLabel.setBounds(50, 160, 100, 30);
        genderMale.setBounds(130, 160, 100, 30);
        genderFemale.setBounds(240, 160, 100, 30);
       
        semesterLabel.setBounds(50, 210, 100, 30);
        semesterList.setBounds(130, 210, 200, 30);
        
        TextArea.setBounds(130, 260, 200, 230);
        
        CheckBoxLabel.setBounds(120, 490, 250, 30);
        checkBox.setBounds(310, 495, 20, 20);
        
        

        registerButton.setBounds(130, 550, 200, 30);
    }

    public void addComponents() {
        container.add(message);
        container.add(nameLabel);
        container.add(nameField);
        container.add(genderLabel);
        container.add(genderMale);
        container.add(genderFemale);
        container.add(passwordLabel);
        container.add(passwordField);
        container.add(semesterLabel);
        container.add(semesterList);
        container.add(CheckBoxLabel);
        container.add(checkBox);
        container.add(TextArea);
        container.add(registerButton);
    }

    public static void main(String[] args) {
        RegistrationForm form = new RegistrationForm();
        form.setTitle("Student Register Form");
        form.setVisible(true);
        form.setBounds(500, 100, 500, 700);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setResizable(true);

    }
}
