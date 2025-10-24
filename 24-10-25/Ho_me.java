package library_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Ho_me  extends JFrame implements ActionListener{
    JLabel home;
    JButton stregi,bookavail,addbook,isubook,rtnbook,sub;
    Ho_me(){
        
        setTitle("Library Management System");
        setLayout(null);
        
         home = new JLabel("Home");
        home.setFont(new Font("Osward",Font.BOLD,50));
        home.setBounds(330, 10, 400, 60);
        add(home);
        
        stregi = new JButton("Student Registration");
        stregi.setBackground(Color.GREEN);
        stregi.setForeground(Color.BLACK);
        stregi.setBounds(240, 90, 300, 40);
        stregi.addActionListener(this);
        add(stregi);
        
        bookavail = new JButton("Books Available");
        bookavail.setBackground(Color.GREEN);
        bookavail.setForeground(Color.BLACK);
        bookavail.setBounds(240, 150, 300, 40);
        bookavail.addActionListener(this);
        add(bookavail);
        
        addbook = new JButton("Add Books");
        addbook.setBackground(Color.GREEN);
        addbook.setForeground(Color.BLACK);
        addbook.setBounds(240, 210, 300, 40);
        addbook.addActionListener(this);
        add(addbook);
        
        isubook = new JButton("Issue Books");
        isubook.setBackground(Color.GREEN);
        isubook.setForeground(Color.BLACK);
        isubook.setBounds(240, 270, 300, 40);
        isubook.addActionListener(this);
        add(isubook);
        
        rtnbook = new JButton("Return Books");
        rtnbook.setBackground(Color.GREEN);
        rtnbook.setForeground(Color.BLACK);
        rtnbook.setBounds(240, 330, 300, 40);
        rtnbook.addActionListener(this);
        add(rtnbook);
        
        sub = new JButton("Submit");
        sub.setBackground(Color.GREEN);
        sub.setForeground(Color.BLACK);
        sub.setBounds(340, 390, 100, 40);
        sub.addActionListener(this);
        add(sub);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,500);
        setVisible(true);
        setLocation(300,110);
        
        
        
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== stregi){
            new Student_Registration();
        }else if(ae.getSource() == bookavail){
            new Books_Available();
        }else if(ae.getSource()==addbook){
            new Add_Book();
        }else if(ae.getSource()==isubook){
            new Issue_Book();
        }else if(ae.getSource()==rtnbook){
            new Return_Book();
        }else{
            new Ho_me();
        }
    }
    
    
    
    public static void main(String[] args) {
        new Ho_me ();
    }
    
}