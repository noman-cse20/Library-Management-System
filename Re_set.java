//package library_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Re_set extends JFrame implements ActionListener{
    
    JLabel cp,np,cpm;
    JTextField cpTextField,npTextField,cpmTextField;
    JButton rsub;
    
    
    Re_set(){
        
        setTitle("Library Management System");
        setLayout(null);
        
        cp = new JLabel("Current Password");
        cp.setFont(new Font("Raleway",Font.BOLD,15));
        cp.setBounds(30,30, 200, 40);
        add(cp);
        
        cpTextField = new JTextField();
        cpTextField.setBounds(200, 30, 200, 40);
        add(cpTextField);
        
        np = new JLabel("New Password");
        np.setFont(new Font("Raleway",Font.BOLD,15));
        np.setBounds(30,90, 200, 40);
        add(np);
        
        npTextField = new JTextField();
        npTextField.setBounds(200, 90, 200, 40);
        add(npTextField);
        
        cpm = new JLabel("Confirm Password");
        cpm.setFont(new Font("Raleway",Font.BOLD,15));
        cpm.setBounds(30,150, 200, 40);
        add(cpm);
        
        cpmTextField = new JTextField();
        cpmTextField.setBounds(200, 150, 200, 40);
        add(cpmTextField);
        
        rsub = new JButton("Submit");
        rsub.setBackground(Color.GREEN);
        rsub.setForeground(Color.BLACK);
        rsub.setBounds(200, 210, 100, 40);
        rsub.addActionListener(this);
        add(rsub);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(500,320);
        setVisible(true);
        setLocation(300,110);  
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == rsub){
             new Log_in();
        }
    }
    
    public static void main(String[] args) {
        new Re_set ();
    }
    
    
}
