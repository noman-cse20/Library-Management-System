
package library_management_system;

import javax.swing.*;
import java.awt.*;

public class Books_Available extends JFrame {
    
    Books_Available(){
        
        setTitle("Library Management System");
        setLayout(null);
        
        JLabel addbook = new JLabel("Books Available");
        addbook.setFont(new Font("Osward",Font.BOLD,50));
        addbook.setBounds(230, 10, 400, 60);
        add(addbook);
        
        JLabel bookid = new JLabel("Book ID");
        bookid.setFont(new Font("Raleway",Font.BOLD,20));
        bookid.setBounds(170, 65, 200, 90);
        add(bookid);
        
        JTextField bookidTextField = new JTextField();
        bookidTextField.setBounds(340, 90, 300, 40);
        add(bookidTextField);
        
        JLabel title = new JLabel("Title");
        title.setFont(new Font("Raleway",Font.BOLD,20));
        title.setBounds(170, 120, 200, 90);
        add(title);
        
        JTextField titleTextField = new JTextField();
        titleTextField.setBounds(340, 150, 300, 40);
        add(titleTextField);
        
        JLabel author = new JLabel("Author");
        author.setFont(new Font("Raleway",Font.BOLD,20));
        author.setBounds(170, 209, 200, 40);
        add(author);
        
        JTextField authorTextField = new JTextField();
        authorTextField.setBounds(340, 210, 300, 40);
        add(authorTextField);
        
        JLabel edition = new JLabel("Edition");
        edition.setFont(new Font("Raleway",Font.BOLD,20));
        edition.setBounds(170, 270, 200, 40);
        add(edition);
        
        JTextField editionTextField = new JTextField();
        editionTextField.setBounds(340, 270, 300, 40);
        add(editionTextField);
        
        JLabel lang = new JLabel("Language");
        lang.setFont(new Font("Raleway",Font.BOLD,20));
        lang.setBounds(170, 330, 200, 40);
        add(lang);
        
        String booklang[] = {"English","Bangla"};
        JComboBox lng = new JComboBox(booklang);
        lng.setBackground(Color.WHITE);
        lng.setBounds(340, 330, 300, 40);
        add(lng);
        
        
        JLabel cate = new JLabel("Category");
        cate.setFont(new Font("Raleway",Font.BOLD,20));
        cate.setBounds(170, 390, 200, 40);
        add(cate);
        
        String category[] = {"Programming","Novel","Drama","History"};
        JComboBox ctg = new JComboBox(category);
        ctg.setBackground(Color.WHITE);
        ctg.setBounds(340, 390, 300, 40);
        add(ctg);
        
        
        JButton sub = new JButton("Search");
        sub.setBackground(Color.GREEN);
        sub.setForeground(Color.BLACK);
        sub.setBounds(330, 450, 100, 40);
        add(sub);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,550);
        setVisible(true);
        setLocation(300,110);
        
        
        }
    
    
    public static void main(String[] args) {
        new Books_Available ();
    }
    
    
    
}