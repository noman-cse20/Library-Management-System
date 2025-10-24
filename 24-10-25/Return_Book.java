package library_management_system;

import javax.swing.*;
import java.awt.*;

public class Return_Book extends JFrame {
   
    Return_Book(){
        
        setTitle("Library Management System");
        setLayout(null);
        
        JLabel retbook = new JLabel("Return Book");
        retbook.setFont(new Font("Osward",Font.BOLD,50));
        retbook.setBounds(230, 10, 400, 60);
        add(retbook);
        
        JLabel stid = new JLabel("Student ID");
        stid.setFont(new Font("Raleway",Font.BOLD,20));
        stid.setBounds(100, 65, 200, 90);
        add(stid);
        
        JTextField stidTextField = new JTextField();
        stidTextField.setBounds(370, 90, 300, 40);
        add(stidTextField);
        
        JLabel bookid = new JLabel("Book ID");
        bookid.setFont(new Font("Raleway",Font.BOLD,20));
        bookid.setBounds(100, 120, 200, 90);
        add(bookid);
        
        JTextField bookidTextField = new JTextField();
        bookidTextField.setBounds(370, 150, 300, 40);
        add(bookidTextField);
        
        JLabel booknm = new JLabel("Book Name");
        booknm.setFont(new Font("Raleway",Font.BOLD,20));
        booknm.setBounds(100, 209, 200, 40);
        add(booknm);
        
        JTextField booknmTextField = new JTextField();
        booknmTextField.setBounds(370, 210, 300, 40);
        add(booknmTextField);
        
//        JLabel isudt = new JLabel("Issue Date");
//        isudt.setFont(new Font("Raleway",Font.BOLD,20));
//        isudt.setBounds(100, 270, 200, 40);
//        add(isudt);
//        
//        JTextField isudtTextField = new JTextField();
//        isudtTextField.setBounds(370, 270, 300, 40);
//        add(isudtTextField);
        
        JLabel duedt = new JLabel("Due Date");
        duedt.setFont(new Font("Raleway",Font.BOLD,20));
        duedt.setBounds(100, 270, 200, 40/*100, 330, 200, 40*/);
        add(duedt);
        
        JTextField duedtTextField = new JTextField();
        duedtTextField.setBounds(370, 270, 300, 40/*370, 330, 300, 40*/);
        add(duedtTextField);
        
        JLabel fine = new JLabel("Fine");
        fine.setFont(new Font("Raleway",Font.BOLD,20));
        fine.setBounds(100, 330, 200, 40/*100, 390, 200, 40*/);
        add(fine);
        
        JTextField fineTextField = new JTextField();
        fineTextField.setBounds(370, 330, 300, 40/*370, 390, 300, 40*/);
        add(fineTextField);
        
        JButton rtn = new JButton("Return");
        rtn.setBackground(Color.GREEN);
        rtn.setForeground(Color.BLACK);
        rtn.setBounds(330, 400/*450*/, 100, 40);
        add(rtn);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,550);
        setVisible(true);
        setLocation(300,110);
        
        
        }
    
    public static void main(String[] args) {
        new Return_Book ();
    }
    
}