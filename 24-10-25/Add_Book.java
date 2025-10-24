package library_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Add_Book extends JFrame implements ActionListener {
    JLabel addbook,bookid, bookname,pub,edi,count,cate;
JTextField bookidTextField,booknameTextField,pubTextField,ediTextField,countTextField,cateTextField;
JButton sub;
    Add_Book(){
        
        setTitle("Library Management System");
        setLayout(null);
        
        addbook = new JLabel("Add Book");
        addbook.setFont(new Font("Osward",Font.BOLD,50));
        addbook.setBounds(230, 10, 400, 60);
        add(addbook);
        
        bookid = new JLabel("Book ID");
        bookid.setFont(new Font("Raleway",Font.BOLD,20));
        bookid.setBounds(100, 65, 200, 90);
        add(bookid);
        
        bookidTextField = new JTextField();
        bookidTextField.setBounds(370, 90, 300, 40);
        add(bookidTextField);
        
         bookname = new JLabel("Book Name");
        bookname.setFont(new Font("Raleway",Font.BOLD,20));
        bookname.setBounds(100, 120, 200, 90);
        add(bookname);
        
        booknameTextField = new JTextField();
        booknameTextField.setBounds(370, 150, 300, 40);
        add(booknameTextField);
        
         pub = new JLabel("Publisher");
        pub.setFont(new Font("Raleway",Font.BOLD,20));
        pub.setBounds(100, 209, 200, 40);
        add(pub);
        
        pubTextField = new JTextField();
        pubTextField.setBounds(370, 210, 300, 40);
        add(pubTextField);
        
        edi = new JLabel("Edition");
        edi.setFont(new Font("Raleway",Font.BOLD,20));
        edi.setBounds(100, 270, 200, 40);
        add(edi);
        
         ediTextField = new JTextField();
        ediTextField.setBounds(370, 270, 300, 40);
        add(ediTextField);
        
        count = new JLabel("Count");
        count.setFont(new Font("Raleway",Font.BOLD,20));
        count.setBounds(100, 330, 200, 40);
        add(count);
        
        countTextField = new JTextField();
        countTextField.setBounds(370, 330, 300, 40);
        add(countTextField);
        
        cate = new JLabel("Category");
        cate.setFont(new Font("Raleway",Font.BOLD,20));
        cate.setBounds(100, 390, 200, 40);
        add(cate);
        
        cateTextField = new JTextField();
        cateTextField.setBounds(370, 390, 300, 40);
        add(cateTextField);
        
        sub = new JButton("Submit");
        sub.setBackground(Color.GREEN);
        sub.setForeground(Color.BLACK);
        sub.setBounds(330, 450, 100, 40);
        sub.addActionListener(this);
        add(sub);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,550);
        setVisible(true);
        setLocation(300,110);
        
        
        }
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==sub){
                new Ho_me();
            }
        }
    
    
    public static void main(String[] args) {
        new Add_Book ();
    }
    
    
    
}