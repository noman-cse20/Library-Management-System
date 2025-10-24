package library_management_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Log_in extends JFrame implements ActionListener{
    
    JButton login,regi,reset;
    JTextField userTextField,passTextField;
    JLabel user,pass;
    
    
    Log_in(){
        setTitle("Library Management System");
        setLayout(null);
        
        JLabel log = new JLabel("Login");
        log.setFont(new Font("Osward",Font.BOLD,50));
        log.setBounds(300, 50, 400, 60);
        add(log);
        
        user = new JLabel("Username ");
        user.setFont(new Font("Raleway",Font.BOLD,30));
        user.setBounds(130, 150, 200, 40);
        add(user);
        
        userTextField = new JTextField();
        userTextField.setBounds(350, 150, 300, 40);
        add(userTextField);
        
        pass = new JLabel("Password ");
        pass.setFont(new Font("Raleway",Font.BOLD,30));
        pass.setBounds(130, 210, 300, 40);
        add(pass);
        
        passTextField = new JPasswordField();
        passTextField.setBounds(350, 210, 300, 40);
        add(passTextField);
        
        login = new JButton("Login");
        login.setBackground(Color.BLUE);
        login.setForeground(Color.BLACK);
        login.setBounds(350, 270, 100, 40);
        login.addActionListener(this);
        add(login);
        
        reset = new JButton("Reset");
        reset.setBackground(Color.RED);
        reset.setForeground(Color.BLACK);
        reset.setBounds(480, 270, 100, 40);
        reset.addActionListener(this);
        add(reset);
        
        regi = new JButton("Registration");
        regi.setBackground(Color.GREEN);
        regi.setForeground(Color.BLACK);
        regi.setBounds(350, 330, 230, 40);
        regi.addActionListener(this);
        add(regi);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,500);
        setVisible(true);
        setLocation(300,110);
    }

   
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == reset){
             new Re_set ();
            userTextField.setText("");
            passTextField.setText("");
        }else if(ae.getSource() == login){
            new Ho_me();
        }else if(ae.getSource() == regi){
            new Registra_tion ();
        }
    }
       
    
    
    
    public static void main(String[] args) {
        new Log_in();
    }
}