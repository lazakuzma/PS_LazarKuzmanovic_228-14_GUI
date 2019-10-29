/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.form;


import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Lazar-PC
 */
public class FMain extends JFrame{
    
   JMenuBar jMenuBar;
   
   JMenu jMenuProduct;
   JMenu jMenuAbout;
   
   JMenuItem jMenuItemProductNew;
   JMenuItem jMenuItemProductSearch;
   JMenuItem jMenuItemAboutSoftware;
   
   public FMain (){
       
       setTitle("Menu");
       setLocationRelativeTo(null);
       setSize(500, 300);
       setLayout(null);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       jMenuBar = new JMenuBar();
       
       
       jMenuProduct = new JMenu("Product");
       jMenuAbout = new JMenu("About");
       
       jMenuItemProductNew = new JMenuItem("New");
       jMenuItemProductSearch = new JMenuItem("Search");
       jMenuItemAboutSoftware = new JMenuItem("About software");
       
     //  jMenuBar.add(jMenuProduct);
     //  jMenuBar.add(jMenuAbout);
       
       setJMenuBar(jMenuBar);
       jMenuBar.add(jMenuProduct);
       jMenuBar.add(jMenuAbout);
       
       jMenuProduct.add(jMenuItemProductNew);
       jMenuProduct.add(jMenuItemProductSearch);
       jMenuAbout.add(jMenuItemAboutSoftware);
       
        setVisible(true);
        
       jMenuItemProductNew.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
               JDialog fproduct = new FProduct();
           }
       });
               
      
   }
    
    
    
}
