//package library_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Registra_tion extends JFrame implements ActionListener {
    
    JLabel nam,userID,mail,cont;
    JTextField namTextField, userIDTextField,mailTextField,contTextField;
    JButton sub;
    
    Registra_tion(){
        
        setTitle("Library Management System");
        setLayout(null);
        
        JLabel regi = new JLabel("Registration");
        regi.setFont(new Font("Osward",Font.BOLD,50));
        regi.setBounds(230, 10, 400, 60);
        add(regi);
        
        nam = new JLabel("Name");
        nam.setFont(new Font("Raleway",Font.BOLD,30));
        nam.setBounds(140, 90, 200, 40);
        add(nam);
        
        namTextField = new JTextField();
        namTextField.setBounds(270, 90, 300, 40);
        add(namTextField);
        
        userID = new JLabel("User ID");
        userID.setFont(new Font("Raleway",Font.BOLD,30));
        userID.setBounds(140, 150, 200, 40);
        add(userID);
        
        userIDTextField = new JTextField();
        userIDTextField.setBounds(270, 150, 300, 40);
        add(userIDTextField);
        
        mail = new JLabel("Email ID");
        mail.setFont(new Font("Raleway",Font.BOLD,30));
        mail.setBounds(140, 210, 200, 40);
        add(mail);
        
        mailTextField = new JTextField();
        mailTextField.setBounds(270, 210, 300, 40);
        add(mailTextField);
        
        cont = new JLabel("Contact");
        cont.setFont(new Font("Raleway",Font.BOLD,30));
        cont.setBounds(140, 270, 200, 40);
        add(cont);
        
        contTextField = new JTextField();
        contTextField.setBounds(270, 270, 300, 40);
        add(contTextField);
        
        sub = new JButton("Submit");
        sub.setBackground(Color.GREEN);
        sub.setForeground(Color.BLACK);
        sub.setBounds(330, 340, 100, 40);
        sub.addActionListener(this);
        add(sub);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,500);
        setVisible(true);
        setLocation(300,110);
        
        
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == nam){
        }else if(ae.getSource() == userID){
            
        }else if(ae.getSource() == mail){
            
        }else if(ae.getSource() == cont){
            
        }else if(ae.getSource() == sub){
            new Log_in();
        }
         
    }
    
    
    public static void main(String[] args) {
        new Registra_tion ();
    }
    
}