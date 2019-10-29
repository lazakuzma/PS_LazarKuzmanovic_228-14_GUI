/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.form;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Lazar-PC
 */
public class Flogin extends JFrame{
    
   private  JButton jbtnLogin;
   private  JButton jbtnCancel;
   
   private  JLabel jlabUsername;
   private  JLabel jlabPassword;
   
   private  JTextField jtxtUsername;
   private  JPasswordField jtxtPassword;
   
   private  JLabel jlabUsernameError;
   private  JLabel jlabPasswordError;
   private  JLabel jlabError;
   
   
   JPanel panel;

    public Flogin()  {
        setTitle("Username and password");
        
        setLocationRelativeTo(null);
        setSize(500, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        jbtnLogin = new JButton("Login");
        jbtnLogin.setBounds(350, 180, 100, 50);
       
        jbtnCancel = new JButton("Cancel");
        jbtnCancel.setBounds(30, 180, 100, 50);
        
        jlabUsername = new JLabel("Username:");
        jlabUsername.setBounds(30, 20, 100, 50);
       
        jlabPassword = new JLabel("Password:");
        jlabPassword.setBounds(30, 70, 100, 50);
        //jlabPassword.setForeground(Color.yellow);
        
        jtxtUsername = new JTextField("");
        jtxtUsername.setBounds(100, 37, 140, 20);
        
        jlabUsernameError = new JLabel("");
        jlabUsernameError.setBounds(100, 62, 200, 20);
        jlabUsernameError.setBackground(Color.red);
        
        jtxtPassword = new JPasswordField("");
        jtxtPassword.setBounds(100, 87, 140, 20);
        
        jlabPasswordError = new JLabel("");
        jlabPasswordError.setBounds(100, 112, 200, 20);
        jlabPasswordError.setBackground(Color.red);
        
        jlabError = new JLabel("");
        jlabError.setBounds(100, 134, 200, 20);
        jlabError.setBackground(Color.red);
        
        panel = new JPanel();
        panel.setBounds(WIDTH, WIDTH, 350, 160);
        panel.setLayout(null);
        panel.add(jlabUsername);
        panel.add(jlabPassword);
        panel.add(jtxtUsername);
        panel.add(jtxtPassword);
        panel.add(jlabUsernameError);
        panel.add(jlabPasswordError);
        panel.add(jlabError);
        
        add(panel);
            
        add(jbtnLogin);
        add(jbtnCancel);
        
        jbtnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                FMain fmain = new FMain();
            }
        });
        
        
        setVisible(true);
    }
   
   
    
    
}
