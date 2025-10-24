package library_management_system;

import javax.swing.*;
import java.awt.*;

public class Issue_Book extends JFrame {
    
    Issue_Book(){
        
        setTitle("Library Management System");
        setLayout(null);
        
        JLabel isubook = new JLabel("Issue Book");
        isubook.setFont(new Font("Osward",Font.BOLD,50));
        isubook.setBounds(230, 10, 400, 60);
        add(isubook);
        
        JLabel bokid = new JLabel("Book ID");
        bokid.setFont(new Font("Raleway",Font.BOLD,20));
        bokid.setBounds(100, 65, 200, 90);
        add(bokid);
        
        JTextField bokidTextField = new JTextField();
        bokidTextField.setBounds(370, 90, 300, 40);
        add(bokidTextField);
        
        JLabel stID = new JLabel("Student ID");
        stID.setFont(new Font("Raleway",Font.BOLD,20));
        stID.setBounds(100, 120, 200, 90);
        add(stID);
        
        JTextField stIDIDTextField = new JTextField();
        stIDIDTextField.setBounds(370, 150, 300, 40);
        add(stIDIDTextField);
        
        JLabel boknm = new JLabel("Book Name");
        boknm.setFont(new Font("Raleway",Font.BOLD,20));
        boknm.setBounds(100, 209, 200, 40);
        add(boknm);
        
        JTextField boknmTextField = new JTextField();
        boknmTextField.setBounds(370, 210, 300, 40);
        add(boknmTextField);
        
        JLabel isudat = new JLabel("Issue Date");
        isudat.setFont(new Font("Raleway",Font.BOLD,20));
        isudat.setBounds(100, 270, 200, 40);
        add(isudat);
        
        JTextField isudatTextField = new JTextField();
        isudatTextField.setBounds(370, 270, 300, 40);
        add(isudatTextField);
        
        JLabel duedat = new JLabel("Due Date");
        duedat.setFont(new Font("Raleway",Font.BOLD,20));
        duedat.setBounds(100, 330, 200, 40);
        add(duedat);
        
        JTextField duedatTextField = new JTextField();
        duedatTextField.setBounds(370, 330, 300, 40);
        add(duedatTextField);
        
       /* JLabel contt = new JLabel("Contact");
        contt.setFont(new Font("Raleway",Font.BOLD,20));
        contt.setBounds(100, 390, 200, 40);
        add(contt);
        
        JTextField conttTextField = new JTextField();
        conttTextField.setBounds(370, 390, 300, 40);
        add(conttTextField);*/
        
        JButton isu = new JButton("Issue");
        isu.setBackground(Color.GREEN);
        isu.setForeground(Color.BLACK);
        isu.setBounds(330, 400, 100, 40);
        add(isu);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,550);
        setVisible(true);
        setLocation(300,110);
        
        
        }
    public static void main(String[] args) {
        new Issue_Book ();
    }
    
    
    
}
